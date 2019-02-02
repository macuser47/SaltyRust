package com.corrodinggames.rts.gameFramework.f;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Timer;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.y
final class class_452 implements Runnable {
   // $FF: renamed from: a boolean
   boolean field_3771;                                                                    //loop condition for runnable (controlled externally?)
   // $FF: renamed from: b java.net.DatagramSocket
   DatagramSocket field_3772;                                                             //outgoing UDP socket
   // $FF: renamed from: c java.util.Timer
   Timer field_3773;                                                                      //Timer used for executing run() at a fixed rate
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.f.x
   // $FF: synthetic field
   final class_454 field_3774;                                                            //Class used to write debug info to stdout, contains port number, server flag -- global state class?

   public strictfp void run() {
      try {
         this.field_3774.method_2885("starting socket for broadcast..");
         this.field_3772 = new DatagramSocket((SocketAddress)null);                       //create unbound socket
         this.field_3772.setReuseAddress(true);                                           //Enable multiple sockets to be bound to address 
         this.field_3772.bind(new InetSocketAddress(this.field_3774.field_3800));         //bind to wildcard IP with port 5005 
         this.field_3774.method_2885("reading..");
         byte[] var1 = new byte[1500];
         DatagramPacket var2 = new DatagramPacket(var1, var1.length);
         y$1 var3 = new y$1(this);                                                        //register this object with TimerTask for execution
         this.field_3773 = new Timer();
         this.field_3773.scheduleAtFixedRate(var3, 20L, 5000L);                           //schedule this runnable to run every 5s starting in 20ms

         while(this.field_3771) {
            this.field_3772.receive(var2);                                                         //wait until packet recv'd
            String var4 = new String(var2.getData(), var2.getOffset(), var2.getLength());          //decode packet into String -- docs say charset is "default" for platform
            this.field_3774.method_2885("accepted udp socket..");
            class_463 var5 = new class_463(var4);                                                  //maybe a parser? takes the string and turns into a DataInputStream
            if (!var5.method_3015().equals("com.corrodinggames.rts")) {                            //reads packet header as unicode and fails if packet doesn't equal com.corrodinggames.rts
               this.field_3774.method_2885("ignoring udp packet: MAGIC_GAME_ID doesn't match");
            } else {
               int var6 = var5.method_3011();                                                      //reads int from packet
               var5.method_3011();                                                                 //reads another int from the packet, discards
               String var7 = var5.method_3015();                                                   //reads string from packet
               if (var7.equals("ping")) {                                                          //checks if string is "ping"
                  this.field_3774.method_2885("got ping");
                  if (this.field_3774.field_3810) {                                                //this flag is true if we are server, false else
                     class_404 var8 = new class_404();                                             //packet constructor?
                     var8.method_2545("com.corrodinggames.rts");                                   //build response packet -
                     var8.method_2541(this.field_3774.field_3788);                                 //header
                     var8.method_2541(0);                                                          //int - use unclear
                     var8.method_2545("pong");                                                     //pong -- ping response
                     var8.method_2541(this.field_3774.field_3795);                                 //unclear value -- maybe a TCP port number?
                     String var9 = var8.method_2537();
                     DatagramPacket var10 = new DatagramPacket(var9.getBytes(), var9.length(), var2.getAddress(), this.field_3774.field_3800);
                     this.field_3772.send(var10);                                                  //send packet
                  } else {
                     this.field_3774.method_2885("not server");
                  }
               } else if (!var7.equals("pong")) {                                                  //checks if read string is not "pong" -- is the ! a decompiler bug?
                  this.field_3774.method_2885("got pong");
                  class_462 var13 = new class_462();                                               //
                  var13.field_3961 = true;
                  var13.field_3965 = var5.method_3011();
                  var13.field_3963 = var2.getAddress().toString();
                  var13.field_3968 = "" + var6;
                  this.field_3774.method_2867(var13);
               } else {
                  this.field_3774.method_2885("ignoring udp packet: unknown mode:" + var7);
               }
            }
         }
      } catch (SocketException var11) {
         if (this.field_3771) {
            throw new RuntimeException(var11);
         }

         var11.printStackTrace();
      } catch (IOException var12) {
         throw new RuntimeException(var12);
      }

   }

   // $FF: renamed from: a () void
   public strictfp void method_2842() {
      this.field_3774.method_2885("sending ping");
      if (this.field_3772 == null) {
         this.field_3774.method_2885("failed to send a broadcast ping: datagramSocket is null");
      } else {
         InetAddress var1 = this.field_3774.method_2952();
         if (var1 == null) {
            this.field_3774.method_2885("failed to send a broadcast ping: could not get a broadcast address");
         } else {
            try {
               class_404 var2 = new class_404();
               var2.method_2545("com.corrodinggames.rts");
               var2.method_2541(this.field_3774.field_3788);
               var2.method_2541(0);
               var2.method_2545("ping");
               String var3 = var2.method_2537();
               this.field_3774.method_2885("sending ping on :" + var1.toString());
               DatagramPacket var4 = new DatagramPacket(var3.getBytes(), var3.length(), var1, this.field_3774.field_3800);
               this.field_3772.send(var4);
            } catch (IOException var5) {
               var5.printStackTrace();
               this.field_3774.method_2885("failed to send a broadcast ping, IOException");
            }
         }
      }
   }

   // $FF: renamed from: b () void
   public strictfp void method_2843() { //Cancel function. Sets runnable while condition to false, cancels TimerTask, and closes socket.
      this.field_3771 = false;
      if (this.field_3772 != null) {
         this.field_3772.close();
      }

      if (this.field_3773 != null) {
         this.field_3773.cancel();
      }

   }
}
