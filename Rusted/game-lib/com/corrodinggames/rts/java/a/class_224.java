package com.corrodinggames.rts.java.a;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamFriends;
import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamMatchmaking;
import com.codedisaster.steamworks.SteamMatchmaking$LobbyType;
import com.codedisaster.steamworks.SteamNetworking;
import com.codedisaster.steamworks.SteamNetworking$API;
import com.codedisaster.steamworks.SteamUGC;
import com.codedisaster.steamworks.SteamUtils;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.f.class_458;
import com.corrodinggames.rts.gameFramework.j.class_223;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.java.a.b
public class class_224 extends class_223 {
   // $FF: renamed from: b com.corrodinggames.rts.java.a.d
   class_216 field_1777;
   // $FF: renamed from: c com.codedisaster.steamworks.SteamFriends
   SteamFriends field_1778;
   // $FF: renamed from: d com.codedisaster.steamworks.SteamMatchmaking
   SteamMatchmaking field_1779;
   // $FF: renamed from: e com.corrodinggames.rts.java.a.e
   class_218 field_1780;
   // $FF: renamed from: f com.corrodinggames.rts.java.a.f
   class_219 field_1781;
   // $FF: renamed from: g com.corrodinggames.rts.java.a.g
   class_221 field_1782;
   // $FF: renamed from: h com.codedisaster.steamworks.SteamNetworking
   SteamNetworking field_1783;
   // $FF: renamed from: i com.corrodinggames.rts.java.a.c
   class_225 field_1784;
   // $FF: renamed from: j com.codedisaster.steamworks.SteamUtils
   SteamUtils field_1785;
   // $FF: renamed from: k boolean
   boolean field_1786 = false;
   // $FF: renamed from: l java.util.HashMap
   HashMap field_1787 = new HashMap();
   // $FF: renamed from: m java.nio.ByteBuffer
   ByteBuffer field_1788;
   // $FF: renamed from: n com.codedisaster.steamworks.SteamID
   SteamID field_1789;
   // $FF: renamed from: o boolean
   boolean field_1790;
   // $FF: renamed from: p com.codedisaster.steamworks.SteamID
   SteamID field_1791;

   // $FF: renamed from: l () com.corrodinggames.rts.java.a.g
   public class_221 method_1474() {
      return this.field_1782;
   }

   // $FF: renamed from: b () void
   public void method_1463() {
      if (this.field_1786) {
         class_236.method_1591("SteamEngine - init already called");
      } else {
         this.field_1786 = true;
         class_236.method_1591("SteamEngine - java steamEngine init()");

         try {
            if (!SteamAPI.init()) {
               class_236.method_1588("steamAPI init failed");
               this.method_1466();
               return;
            }

            this.field_1788 = ByteBuffer.allocateDirect(100000);
            this.field_1777 = new class_216(this);
            this.field_1778 = new SteamFriends(this.field_1777);
            this.field_1780 = new class_218(this);
            this.field_1779 = new SteamMatchmaking(this.field_1780);
            this.field_1781 = new class_219(this);
            this.field_1783 = new SteamNetworking(this.field_1781, SteamNetworking$API.Client);
            this.field_1782 = new class_221(this);

            SteamUGC var1;
            try {
               var1 = new SteamUGC(this.field_1782.method_1452());
            } catch (RuntimeException var3) {
               var3.printStackTrace();
               throw new SteamException("Failed to create workshop");
            }

            this.field_1782.method_1451(var1);
            this.field_1784 = new class_225(this);
            this.field_1785 = new SteamUtils(this.field_1784);
         } catch (SteamException var4) {
            var4.printStackTrace();
            this.method_1466();
         }

      }
   }

   // $FF: renamed from: a (float) void
   public void method_1464(float var1) {
      SteamAPI.runCallbacks();
      if (this.field_1783 != null) {
         if (class_236.field_1896 != null) {
            class_236.method_1591("Joining game from commandline invite:" + class_236.field_1896);
            long var2 = Long.parseLong(class_236.field_1896);
            class_236.field_1896 = null;
            SteamID var4 = SteamID.createFromNativeHandle(var2);
            this.field_1779.joinLobby(var4);
         }

         while(true) {
            int var9 = this.field_1783.isP2PPacketAvailable(0);
            if (var9 == 0) {
               break;
            }

            if (var9 > this.field_1788.capacity()) {
               class_236.method_1588("nextPacketSize:" + var9 + " larger then byteBuffer:" + this.field_1788.capacity() + " resizing");
               this.field_1788 = ByteBuffer.allocateDirect(var9);
            }

            SteamID var3 = new SteamID();

            try {
               this.field_1788.clear();
               int var10 = this.field_1783.readP2PPacket(var3, this.field_1788, 0);
               if (var10 == 0) {
                  class_236.method_1588("readP2PPacket with rtn==" + var10);
               }

               class_212 var5 = (class_212)this.field_1787.get(var3);
               if (var5 != null && var5.isClosed()) {
                  class_236.method_1588("Removing stale steam socket");
                  this.field_1787.remove(var3);
                  var5 = null;
               }

               if (var5 == null) {
                  this.method_1478(var3);
                  var5 = (class_212)this.field_1787.get(var3);
               }

               if (var5 == null) {
                  class_236.method_1591("Could not find remote ID steamSocket: " + var3);
               } else {
                  int var6 = this.field_1788.limit();
                  byte[] var7 = new byte[var6];
                  this.field_1788.get(var7);
                  var5.field_1728.method_1421(var7);
               }
            } catch (SteamException var8) {
               var8.printStackTrace();
            }
         }
      }

   }

   // $FF: renamed from: d () void
   public void method_1466() {
      class_236.method_1588("JavaSteamEngine: disableSteam");
      class_236 var1 = class_236.method_1549();
      if (var1 != null) {
         var1.method_1607("Steam connection failed.");
      } else {
         class_236.method_1591("cannot show alert game has not been created");
      }

      class_223.field_1776 = new class_223();
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1465() {
      return this.field_1778.getPersonaName();
   }

   // $FF: renamed from: f () boolean
   public boolean method_1468() {
      return false;
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_1475(String var1) {
      class_236.method_1591("Steam: " + var1);
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_1476(String var1) {
      class_236.method_1588("Steam: " + var1);
   }

   // $FF: renamed from: i () void
   public void method_1471() {
      this.method_1475("createLobby");
      if (this.field_1789 != null) {
         this.method_1476("createLobby: activeLobby!=null");
      }

      this.field_1779.createLobby(SteamMatchmaking$LobbyType.FriendsOnly, 10);
   }

   // $FF: renamed from: a (com.codedisaster.steamworks.SteamID) void
   public synchronized void method_1477(SteamID var1) {
      class_236 var2 = class_236.method_1549();
      this.field_1789 = var1;
   }

   // $FF: renamed from: b (com.codedisaster.steamworks.SteamID) com.corrodinggames.rts.gameFramework.f.c
   public class_458 method_1478(SteamID var1) {
      class_236.method_1591("addPeer: " + var1);
      class_236 var2 = class_236.method_1549();
      class_212 var3 = (class_212)this.field_1787.get(var1);
      if (var3 != null) {
         if (var3.isClosed()) {
            this.field_1787.remove(var1);
         } else {
            this.method_1476("addPeer, user already exists");

            try {
               var3.close();
            } catch (IOException var8) {
               var8.printStackTrace();
            }
         }
      }

      class_212 var4 = new class_212(this, var1);
      class_458 var5 = new class_458(var2.field_1944, var4);

      try {
         var5.field_3931 = true;
         var5.method_2986();
         var2.field_1944.field_3877.add(var5);
         this.field_1787.put(var1, var4);
         var2.field_1944.method_2909();
         return var5;
      } catch (IOException var7) {
         var7.printStackTrace();
         var5.method_2989("crash");
         return null;
      }
   }

   // $FF: renamed from: c (com.codedisaster.steamworks.SteamID) void
   public void method_1479(SteamID var1) {
      class_236.method_1591("connectTo: " + var1);
      class_212 var2 = (class_212)this.field_1787.get(var1);
      if (var2 != null) {
         if (var2.isClosed()) {
            this.field_1787.remove(var1);
         } else {
            this.method_1476("connectTo, user already exists");

            try {
               var2.close();
            } catch (IOException var6) {
               var6.printStackTrace();
            }
         }
      }

      class_236 var3 = class_236.method_1549();
      if (!this.field_1790) {
         b$1 var5 = new b$1(this, var1);
         ScriptEngine.getInstance().addRunnableToQueue(var5);
      } else {
         this.method_1475("connectTo as server?");
         this.method_1478(var1);
      }

   }

   // $FF: renamed from: j () void
   public void method_1472() {
      this.method_1475("stopLobby");
      if (this.field_1789 == null) {
         this.method_1476("stopLobby: activeLobby==null");
      } else {
         this.field_1779.leaveLobby(this.field_1789);
      }

      this.method_1475("stopLobby: activeSteamSockets:" + this.field_1787.size());
      Iterator var1 = this.field_1787.values().iterator();

      while(var1.hasNext()) {
         class_212 var2 = (class_212)var1.next();

         try {
            var2.close();
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }

      this.field_1787.clear();
      this.field_1789 = null;
      this.field_1791 = null;
   }

   // $FF: renamed from: g () void
   public void method_1469() {
      if (this.field_1789 == null) {
      }

      if (this.field_1789 == null) {
         class_236.method_1549().method_1607("Error: No steam lobby has been started");
      } else {
         this.field_1778.activateGameOverlayInviteDialog(this.field_1789);
      }
   }

   // $FF: renamed from: k () void
   public void method_1473() {
      this.field_1782.method_1460();
   }
}
