package com.corrodinggames.rts.gameFramework.f;

import android.graphics.PointF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_34;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.ListIterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.aj
public class class_406 extends class_404 {
   // $FF: renamed from: a java.io.ByteArrayOutputStream
   ByteArrayOutputStream field_3311;
   // $FF: renamed from: e java.io.PrintStream
   PrintStream field_3312;
   // $FF: renamed from: f java.io.PrintStream
   private PrintStream field_3313;
   // $FF: renamed from: g java.util.LinkedList
   private LinkedList field_3314 = new LinkedList();

   // $FF: renamed from: a () void
   public strictfp void method_2533() {
      ListIterator var1 = this.field_3314.listIterator(this.field_3314.size());

      while(var1.hasPrevious()) {
         class_407 var2 = (class_407)var1.previous();
         var2.method_2569();
      }

      this.field_3312.flush();
      if (this.field_3311 != null) {
         this.field_3311.flush();
      }

   }

   // $FF: renamed from: b () void
   strictfp void method_2534() {
      this.field_3313 = this.field_3312;
   }

   public strictfp class_406() {
      this.field_3311 = new ByteArrayOutputStream();
      this.field_3312 = new PrintStream(this.field_3311);
      this.method_2534();
   }

   public strictfp class_406(PrintStream var1) {
      this.field_3312 = var1;
      this.method_2534();
   }

   // $FF: renamed from: b (int) com.corrodinggames.rts.gameFramework.f.ah
   public strictfp class_413 method_2535(int var1) {
      return this.method_2536(var1, -1);
   }

   // $FF: renamed from: a (int, int) com.corrodinggames.rts.gameFramework.f.ah
   public strictfp class_413 method_2536(int var1, int var2) {
      try {
         this.method_2533();
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }

      class_413 var3 = new class_413(var1);
      var3.field_3412 = this.field_3311.toByteArray();
      var3.field_3413 = var2;
      return var3;
   }

   // $FF: renamed from: c () java.lang.String
   public strictfp String method_2537() {
      try {
         this.method_2533();
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }

      return this.field_3311.toString();
   }

   // $FF: renamed from: d () byte[]
   public strictfp byte[] method_2538() {
      try {
         this.method_2533();
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }

      return this.field_3311.toByteArray();
   }

   // $FF: renamed from: c (int) void
   public strictfp void method_2539(int var1) {
      this.field_3313.println(var1);
   }

   // $FF: renamed from: a (boolean) void
   public strictfp void method_2540(boolean var1) {
      this.field_3313.println(var1);
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_2541(int var1) {
      this.field_3313.println("#int:");
      this.field_3313.println(var1);
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_2542(float var1) {
      this.field_3313.println("#writeFloat");
      this.field_3313.println(var1);
   }

   // $FF: renamed from: a (long) void
   public strictfp void method_2543(long var1) {
      this.field_3313.println("#writeLong");
      this.field_3313.println(var1);
   }

   // $FF: renamed from: b (java.lang.String) void
   public strictfp void method_2544(String var1) {
      this.method_2540(var1 != null);
      if (var1 != null) {
         this.method_2545(var1);
      }

   }

   // $FF: renamed from: c (java.lang.String) void
   public strictfp void method_2545(String var1) {
      this.field_3313.println(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.u) void
   public strictfp void method_2546(class_34 var1) {
      this.field_3313.println("#writeGameObject:");
      if (var1 == null) {
         this.field_3313.println(-1);
      } else {
         this.field_3313.println(var1.field_67);
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.u) void
   public strictfp void method_2547(class_34 var1) {
      this.field_3313.println("#writeExistingGameObject:");
      if (var1 != null && !var1.field_69) {
         this.field_3313.println(var1.field_67);
      } else {
         this.field_3313.println(-1);
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_2549(class_39 var1) {
      if (var1 != null && !var1.dc && !var1.field_141) {
         this.method_2546(var1);
      } else {
         this.method_2546((class_34)null);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_2550(class_39 var1) {
      if (var1 != null && !var1.dc) {
         this.method_2546(var1);
      } else {
         this.method_2546((class_34)null);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) void
   public strictfp void method_2551(class_44 var1) {
      if (var1 != null && !var1.dc) {
         this.method_2546(var1);
      } else {
         this.method_2546((class_34)null);
      }
   }

   // $FF: renamed from: a (android.graphics.PointF) void
   public strictfp void method_2552(PointF var1) {
      this.field_3313.println("#PointF:");
      this.method_2540(var1 != null);
      if (var1 != null) {
         this.method_2542(var1.field_2406);
         this.method_2542(var1.field_2407);
      }

   }

   // $FF: renamed from: a (java.lang.Enum) void
   public strictfp void method_2553(Enum var1) {
      if (var1 == null) {
         this.field_3313.println("#Enum: null");
         this.field_3313.println(-1);
      } else {
         this.field_3313.println("#Enum:" + var1.getClass().getSimpleName() + " : " + var1.toString());
         this.field_3313.println(var1.ordinal());
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) void
   public strictfp void method_2554(class_24 var1) {
      this.field_3313.println("#unitType:");
      if (var1 == null) {
         this.field_3313.println(-1);
      } else if (var1 instanceof class_479) {
         this.field_3313.println(-2);
         this.method_2545(((class_479)var1).field_4204);
      } else {
         this.field_3313.println(((class_469)var1).ordinal());
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c) void
   public strictfp void method_2555(class_458 var1) {
      if (var1 == null) {
         this.field_3313.println(0);
      } else {
         this.field_3313.println(var1.field_3925);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k) void
   public strictfp void method_2556(class_107 var1) {
      this.field_3313.println("#team:");
      this.field_3313.println(var1.field_1227);
   }

   // $FF: renamed from: a (java.io.File) void
   public strictfp void method_2557(File var1) {
      FileInputStream var2 = new FileInputStream(var1);

      try {
         this.method_2558(var2, (int)var1.length());
      } finally {
         var2.close();
      }

   }

   // $FF: renamed from: a (java.io.InputStream, int) void
   public strictfp void method_2558(InputStream var1, int var2) {
      int var3 = 0;
      this.method_2541(var2);

      int var4;
      for(byte[] var5 = new byte[16384]; (var4 = var1.read(var5, 0, var5.length)) != -1; var3 += var4) {
         if (var3 + var4 > var2) {
            int var6 = var2 - var3;
            if (var6 < 0) {
               class_454.method_2887("writeStream: bytesTillFull is " + var6);
               return;
            }

            this.field_3313.write(var5, 0, var6);
            return;
         }

         this.field_3313.write(var5, 0, var4);
      }

   }

   // $FF: renamed from: a (java.io.ByteArrayOutputStream) void
   public strictfp void method_2559(ByteArrayOutputStream var1) {
      this.method_2541(var1.size());
      var1.writeTo(this.field_3313);
   }

   // $FF: renamed from: a (byte[]) void
   public strictfp void method_2560(byte[] var1) {
      this.method_2541(var1.length);
      this.field_3313.write(var1);
   }

   // $FF: renamed from: a (short) void
   public strictfp void method_2561(short var1) {
      this.field_3313.println("#writeShort");
      this.field_3313.println(var1);
   }

   // $FF: renamed from: e () void
   public strictfp void method_2562() {
      this.field_3313.println("#writeMark:");
      this.method_2561((short)12345);
   }

   // $FF: renamed from: d (java.lang.String) void
   public strictfp void method_2563(String var1) {
      this.field_3313.println("#writeIfDebugOnly: " + var1);
   }

   // $FF: renamed from: f () boolean
   public strictfp boolean method_2564() {
      return true;
   }

   // $FF: renamed from: e (java.lang.String) void
   public strictfp void method_2565(String var1) {
      this.method_2566(var1, false);
   }

   // $FF: renamed from: a (java.lang.String, boolean) void
   public strictfp void method_2566(String var1, boolean var2) {
      class_407 var3 = new class_407(var2);
      var3.field_3316 = var1;
      this.field_3314.add(var3);
      this.field_3313 = ((class_407)this.field_3314.getLast()).field_3318;
   }

   // $FF: renamed from: a (java.lang.String) void
   public strictfp void method_2567(String var1) {
      class_407 var2 = (class_407)this.field_3314.removeLast();
      if (!var2.field_3316.equalsIgnoreCase(var1)) {
         class_236.method_1592("OutputNetStream:endBlock", "Name does not match: expected" + var1 + " , got:" + var2.field_3316);
      }

      var2.method_2569();
      if (this.field_3314.isEmpty()) {
         this.field_3313 = this.field_3312;
      } else {
         this.field_3313 = ((class_407)this.field_3314.getLast()).field_3318;
      }

      String var3 = "";
      String var4 = "";

      for(int var5 = 0; var5 < this.field_3314.size(); ++var5) {
         var3 = var3 + ">";
         var4 = var4 + "<";
      }

      this.field_3313.println(var3 + ">>>> Start of block: " + var2.field_3316);
      this.method_2559(var2.field_3317);
      this.field_3313.println(var4 + "<<<< End of block: " + var2.field_3316);
      var2.method_2570();
   }
}
