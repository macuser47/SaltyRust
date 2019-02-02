package com.corrodinggames.rts.gameFramework.f;

import android.graphics.PointF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.utility.class_193;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.LinkedList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.h
public class class_463 {
   // $FF: renamed from: a java.io.ByteArrayInputStream
   ByteArrayInputStream field_3983;
   // $FF: renamed from: d java.io.DataInputStream
   private DataInputStream field_3984;
   // $FF: renamed from: e java.io.DataInputStream
   private DataInputStream field_3985;
   // $FF: renamed from: f java.util.LinkedList
   private LinkedList field_3986 = new LinkedList();
   // $FF: renamed from: b int
   int field_3987 = 999999;
   // $FF: renamed from: c int
   int field_3988 = 999999;

   // $FF: renamed from: a () void
   strictfp void method_3004() {
      this.field_3985 = this.field_3984;
   }

   strictfp class_463(class_413 var1) {
      this.field_3983 = new ByteArrayInputStream(var1.field_3412);
      this.field_3984 = new DataInputStream(this.field_3983);
      this.method_3004();
   }

   public strictfp class_463(DataInputStream var1) {
      this.field_3984 = var1;
      this.method_3004();
   }

   public strictfp class_463(String var1) {
      this.field_3983 = new ByteArrayInputStream(var1.getBytes());
      this.field_3984 = new DataInputStream(this.field_3983);
      this.method_3004();
   }

   public strictfp class_463(byte[] var1) {
      this.field_3983 = new ByteArrayInputStream(var1);
      this.field_3984 = new DataInputStream(this.field_3983);
      this.method_3004();
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_3005(int var1) {
      this.field_3987 = var1;
   }

   // $FF: renamed from: b () int
   public strictfp int method_3006() {
      return this.field_3987;
   }

   // $FF: renamed from: b (int) void
   public strictfp void method_3007(int var1) {
      this.field_3988 = var1;
   }

   // $FF: renamed from: c () int
   public strictfp int method_3008() {
      return this.field_3988;
   }

   // $FF: renamed from: d () byte
   public strictfp byte method_3009() {
      return this.field_3985.readByte();
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_3010() {
      return this.field_3985.readBoolean();
   }

   // $FF: renamed from: f () int
   public strictfp int method_3011() {
      return this.field_3985.readInt();
   }

   // $FF: renamed from: g () float
   public strictfp float method_3012() {
      return this.field_3985.readFloat();
   }

   // $FF: renamed from: h () long
   public strictfp long method_3013() {
      return this.field_3985.readLong();
   }

   // $FF: renamed from: i () java.lang.String
   public strictfp String method_3014() {
      return !this.field_3985.readBoolean() ? null : this.method_3015();
   }

   // $FF: renamed from: j () java.lang.String
   public strictfp String method_3015() {
      return this.field_3985.readUTF();
   }

   // $FF: renamed from: k () long
   public strictfp long method_3016() {
      long var1 = this.field_3985.readLong();
      return var1;
   }

   // $FF: renamed from: a (java.lang.Class) com.corrodinggames.rts.gameFramework.u
   public strictfp class_34 method_3017(Class var1) {
      long var2 = this.field_3985.readLong();
      return class_34.method_185(var2, var1, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.k, java.lang.Class) void
   public strictfp void method_3018(class_193 var1, Class var2) {
      int var3 = this.method_3011();

      for(int var4 = 0; var4 < var3; ++var4) {
         class_34 var5 = this.method_3017(var2);
         if (var5 != null) {
            var1.add(var5);
         }
      }

   }

   // $FF: renamed from: l () com.corrodinggames.rts.game.units.aa
   public strictfp class_39 method_3019() {
      return this.method_3020(class_461.field_3959);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.j) com.corrodinggames.rts.game.units.aa
   public strictfp class_39 method_3020(class_461 var1) {
      long var2 = this.field_3985.readLong();
      boolean var4 = var1 == class_461.field_3958;
      return class_34.method_186(var2, var4);
   }

   // $FF: renamed from: m () com.corrodinggames.rts.game.units.p
   public strictfp class_44 method_3021() {
      long var1 = this.field_3985.readLong();
      return class_34.method_187(var1, false);
   }

   // $FF: renamed from: b (java.lang.Class) java.lang.Enum
   public strictfp Enum method_3022(Class var1) {
      int var2 = this.field_3985.readInt();
      if (var2 == -1) {
         return null;
      } else {
         Object[] var3 = var1.getEnumConstants();
         if (var2 >= 0 && var2 < var3.length) {
            return (Enum)var3[var2];
         } else {
            class_454.method_2887("readEnum:" + var2 + " is out of range for " + var1.toString());
            return null;
         }
      }
   }

   // $FF: renamed from: n () com.corrodinggames.rts.game.units.ap
   public strictfp class_24 method_3023() {
      int var1 = this.field_3985.readInt();
      if (var1 == -1) {
         return null;
      } else if (var1 == -2) {
         String var5 = this.method_3015();
         class_479 var3 = class_479.method_3171(var5);
         if (var3 == null) {
            class_454.method_2887("readUnitType: Could not find customUnitMetadata:" + var5);
         }

         class_24 var4 = class_479.method_3170(var3);
         if (var4 != null) {
            if (var4 instanceof class_479) {
               var3 = (class_479)var4;
            } else {
               class_236.method_1588("replacement not a custom unit:" + var4.method_141());
            }
         }

         return var3;
      } else {
         Object[] var2 = ao.class.getEnumConstants();
         if (var1 >= 0 && var1 < var2.length) {
            return (class_469)var2[var1];
         } else {
            class_454.method_2887("readUnitType:" + var1 + " is out of range for UnitType");
            return null;
         }
      }
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.k
   public strictfp class_107 method_3024() {
      byte var1 = this.field_3985.readByte();
      return class_107.method_954(var1);
   }

   // $FF: renamed from: p () byte[]
   public strictfp byte[] method_3025() {
      int var1 = 0;
      int var2 = this.method_3011();

      byte[] var3;
      int var4;
      for(var3 = new byte[var2]; var1 < var2; var1 += var4) {
         var4 = this.field_3985.read(var3, var1, var2 - var1);
         if (var4 == -1) {
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: q () com.corrodinggames.rts.gameFramework.f.h
   public strictfp class_463 method_3026() {
      byte[] var1 = this.method_3025();
      return new class_463(var1);
   }

   // $FF: renamed from: r () short
   public strictfp short method_3027() {
      return this.field_3985.readShort();
   }

   // $FF: renamed from: a (java.lang.String) void
   public strictfp void method_3028(String var1) {
      short var2 = this.method_3027();
      if (var2 != 12345) {
         class_454.method_2887("Mark wasn't read for:" + var1);
      }

   }

   // $FF: renamed from: s () java.io.InputStream
   public strictfp InputStream method_3029() {
      return this.field_3985;
   }

   // $FF: renamed from: b (java.lang.String) void
   public strictfp void method_3030(String var1) {
      this.method_3032(var1, false);
   }

   // $FF: renamed from: t () java.lang.String
   public strictfp String method_3031() {
      return this.method_3035(false, false);
   }

   // $FF: renamed from: a (java.lang.String, boolean) void
   public strictfp void method_3032(String var1, boolean var2) {
      this.method_3033(var1, var2, false);
   }

   // $FF: renamed from: a (java.lang.String, boolean, boolean) void
   public strictfp void method_3033(String var1, boolean var2, boolean var3) {
      if (this.field_3987 < 11) {
         class_236.method_1591("Skipping start block:" + var1);
      } else {
         String var4 = this.method_3035(var2, var3);
         if (!var4.equalsIgnoreCase(var1)) {
            class_236.method_1592("InputNetStream:endBlock", "Name does not match: expected:" + var1 + " , got:" + var4);
         }

      }
   }

   // $FF: renamed from: c (java.lang.String) byte[]
   public strictfp byte[] method_3034(String var1) {
      String var2 = this.field_3985.readUTF();
      if (!var2.equalsIgnoreCase(var1)) {
         class_236.method_1592("getBlockRaw", "Name does not match: expected:" + var1 + " , got:" + var2);
      }

      byte[] var3 = this.method_3025();
      return var3;
   }

   // $FF: renamed from: a (boolean, boolean) java.lang.String
   public strictfp String method_3035(boolean var1, boolean var2) {
      if (this.field_3987 < 11) {
         class_236.method_1591("Skipping start block: startBlockAndGetName()");
         return "<skipped>";
      } else {
         String var3 = this.field_3985.readUTF();
         byte[] var4 = this.method_3025();
         class_460 var5 = new class_460(var4, var1, var2);
         var5.field_3955 = var3;
         this.field_3986.add(var5);
         this.field_3985 = ((class_460)this.field_3986.getLast()).field_3957;
         return var3;
      }
   }

   // $FF: renamed from: d (java.lang.String) void
   public strictfp void method_3036(String var1) {
      if (this.field_3987 < 11) {
         class_236.method_1591("Skipping end block:" + var1);
      } else {
         class_460 var2 = (class_460)this.field_3986.removeLast();
         if (!var2.field_3955.equalsIgnoreCase(var1)) {
            class_236.method_1592("InputNetStream:endBlock", "Name does not match: expected" + var1 + " ," + var2.field_3955);
         }

         if (this.field_3986.isEmpty()) {
            this.field_3985 = this.field_3984;
         } else {
            this.field_3985 = ((class_460)this.field_3986.getLast()).field_3957;
         }

      }
   }

   // $FF: renamed from: u () android.graphics.PointF
   public strictfp PointF method_3037() {
      if (!this.field_3985.readBoolean()) {
         return null;
      } else {
         PointF var1 = new PointF();
         var1.field_2406 = this.method_3012();
         var1.field_2407 = this.method_3012();
         return var1;
      }
   }
}
