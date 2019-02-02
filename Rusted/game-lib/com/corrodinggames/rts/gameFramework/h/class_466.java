package com.corrodinggames.rts.gameFramework.h;

import java.nio.Buffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.h.o
class class_466 {
   // $FF: renamed from: b java.nio.FloatBuffer
   private FloatBuffer field_4012;
   // $FF: renamed from: c java.nio.FloatBuffer
   private FloatBuffer field_4013;
   // $FF: renamed from: d java.nio.FloatBuffer
   private FloatBuffer field_4014;
   // $FF: renamed from: e java.nio.IntBuffer
   private IntBuffer field_4015;
   // $FF: renamed from: f java.nio.IntBuffer
   private IntBuffer field_4016;
   // $FF: renamed from: g java.nio.IntBuffer
   private IntBuffer field_4017;
   // $FF: renamed from: h java.nio.CharBuffer
   private CharBuffer field_4018;
   // $FF: renamed from: i java.nio.Buffer
   private Buffer field_4019;
   // $FF: renamed from: j java.nio.Buffer
   private Buffer field_4020;
   // $FF: renamed from: k java.nio.Buffer
   private Buffer field_4021;
   // $FF: renamed from: l int
   private int field_4022;
   // $FF: renamed from: m int
   private int field_4023;
   // $FF: renamed from: n int
   private int field_4024;
   // $FF: renamed from: o int
   private int field_4025;
   // $FF: renamed from: p boolean
   private boolean field_4026;
   // $FF: renamed from: q int
   private int field_4027;
   // $FF: renamed from: r int
   private int field_4028;
   // $FF: renamed from: s int
   private int field_4029;
   // $FF: renamed from: t int
   private int field_4030;
   // $FF: renamed from: a boolean
   // $FF: synthetic field
   static final boolean field_4031 = !o.class.desiredAssertionStatus();

   // $FF: renamed from: a (int, int, float, float) void
   void method_3043(int var1, int var2, float var3, float var4) {
      if (var1 >= 0 && var1 < this.field_4023) {
         if (var2 >= 0 && var2 < this.field_4024) {
            int var5 = this.field_4023 * var2 + var1;
            int var6 = var5 * 2;
            if (this.field_4022 == 5126) {
               this.field_4013.put(var6, var3);
               this.field_4013.put(var6 + 1, var4);
            } else {
               this.field_4016.put(var6, (int)(var3 * 65536.0F));
               this.field_4016.put(var6 + 1, (int)(var4 * 65536.0F));
            }

         } else {
            throw new IllegalArgumentException("j");
         }
      } else {
         throw new IllegalArgumentException("i");
      }
   }

   // $FF: renamed from: a (int, int, float, float, float, float, float, float[]) void
   void method_3044(int var1, int var2, float var3, float var4, float var5, float var6, float var7, float[] var8) {
      if (var1 >= 0 && var1 < this.field_4023) {
         if (var2 >= 0 && var2 < this.field_4024) {
            int var9 = this.field_4023 * var2 + var1;
            int var10 = var9 * 3;
            int var11 = var9 * 2;
            int var12 = var9 * 4;
            if (this.field_4022 == 5126) {
               this.field_4012.put(var10, var3);
               this.field_4012.put(var10 + 1, var4);
               this.field_4012.put(var10 + 2, var5);
               this.field_4013.put(var11, var6);
               this.field_4013.put(var11 + 1, var7);
               if (var8 != null) {
                  this.field_4014.put(var12, var8[0]);
                  this.field_4014.put(var12 + 1, var8[1]);
                  this.field_4014.put(var12 + 2, var8[2]);
                  this.field_4014.put(var12 + 3, var8[3]);
               }
            } else {
               this.field_4015.put(var10, (int)(var3 * 65536.0F));
               this.field_4015.put(var10 + 1, (int)(var4 * 65536.0F));
               this.field_4015.put(var10 + 2, (int)(var5 * 65536.0F));
               this.field_4016.put(var11, (int)(var6 * 65536.0F));
               this.field_4016.put(var11 + 1, (int)(var7 * 65536.0F));
               if (var8 != null) {
                  this.field_4017.put(var12, (int)(var8[0] * 65536.0F));
                  this.field_4017.put(var12 + 1, (int)(var8[1] * 65536.0F));
                  this.field_4017.put(var12 + 2, (int)(var8[2] * 65536.0F));
                  this.field_4017.put(var12 + 3, (int)(var8[3] * 65536.0F));
               }
            }

         } else {
            throw new IllegalArgumentException("j");
         }
      } else {
         throw new IllegalArgumentException("i");
      }
   }

   // $FF: renamed from: a (javax.microedition.khronos.opengles.GL10, boolean, boolean) void
   public static void method_3045(GL10 var0, boolean var1, boolean var2) {
      var0.glEnableClientState(32884);
      if (var1) {
         var0.glEnableClientState(32888);
         var0.glEnable(3553);
      } else {
         var0.glDisableClientState(32888);
         var0.glDisable(3553);
      }

      if (var2) {
         var0.glEnableClientState(32886);
      } else {
         var0.glDisableClientState(32886);
      }

   }

   // $FF: renamed from: b (javax.microedition.khronos.opengles.GL10, boolean, boolean) void
   public void method_3046(GL10 var1, boolean var2, boolean var3) {
      if (!this.field_4026) {
         var1.glVertexPointer(3, this.field_4022, 0, this.field_4019);
         if (var2) {
            var1.glTexCoordPointer(2, this.field_4022, 0, this.field_4020);
         }

         if (var3) {
            var1.glColorPointer(4, this.field_4022, 0, this.field_4021);
         }

         var1.glDrawElements(4, this.field_4025, 5123, this.field_4018);
      } else {
         GL11 var4 = (GL11)var1;
         var4.glBindBuffer(34962, this.field_4027);
         var4.glVertexPointer(3, this.field_4022, 0, 0);
         if (var2) {
            var4.glBindBuffer(34962, this.field_4029);
            var4.glTexCoordPointer(2, this.field_4022, 0, 0);
         }

         if (var3) {
            var4.glBindBuffer(34962, this.field_4030);
            var4.glColorPointer(4, this.field_4022, 0, 0);
         }

         var4.glBindBuffer(34963, this.field_4028);
         var4.glDrawElements(4, this.field_4025, 5123, 0);
         var4.glBindBuffer(34962, 0);
         var4.glBindBuffer(34963, 0);
      }

   }

   // $FF: renamed from: a (javax.microedition.khronos.opengles.GL10) void
   public static void method_3047(GL10 var0) {
      var0.glDisableClientState(32884);
   }
}
