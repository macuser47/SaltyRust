package com.corrodinggames.rts.gameFramework.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.opengl.GLUtils;
import android.opengl.GLSurfaceView.Renderer;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.class_236;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.h.a
public class class_472 implements Renderer {
   // $FF: renamed from: t int[]
   private int[] field_4100;
   // $FF: renamed from: u int[]
   private int[] field_4101;
   // $FF: renamed from: v android.graphics.BitmapFactory.Options
   private static Options field_4102 = new Options();
   // $FF: renamed from: a boolean
   public boolean field_4103;
   // $FF: renamed from: b javax.microedition.khronos.opengles.GL10
   GL10 field_4104;
   // $FF: renamed from: c android.content.Context
   Context field_4105;
   // $FF: renamed from: d float
   float field_4106;
   // $FF: renamed from: e float
   float field_4107;
   // $FF: renamed from: f int
   int field_4108;
   // $FF: renamed from: g int
   int field_4109;
   // $FF: renamed from: h int
   int field_4110;
   // $FF: renamed from: i com.corrodinggames.rts.gameFramework.h.c
   class_470 field_4111;
   // $FF: renamed from: j com.corrodinggames.rts.gameFramework.h.c[]
   class_470[] field_4112;
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.h.o
   class_466 field_4113;
   // $FF: renamed from: l int
   int field_4114;
   // $FF: renamed from: m int
   int field_4115;
   // $FF: renamed from: n int
   int field_4116;
   // $FF: renamed from: o int
   int field_4117;
   // $FF: renamed from: p int
   int field_4118;
   // $FF: renamed from: q int
   int field_4119;
   // $FF: renamed from: r java.lang.String
   String field_4120;
   // $FF: renamed from: s long
   long field_4121;

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.h.b
   public class_473 method_3064() {
      class_473 var1 = this.field_4111.field_4095[this.field_4111.field_4096];
      ++this.field_4111.field_4096;
      return var1;
   }

   // $FF: renamed from: a (int) int
   public int method_3065(int var1) {
      if (var1 == -1) {
         return 0;
      } else if (var1 == 0) {
         return 1;
      } else if (var1 == 1) {
         return 2;
      } else if (var1 == 2) {
         return 0;
      } else {
         throw new RuntimeException("getOtherBuffer 1 didn't return for:" + var1);
      }
   }

   // $FF: renamed from: a (int, int) int
   public int method_3066(int var1, int var2) {
      if (var1 == -1) {
         return this.method_3065(var2);
      } else if (var2 == -1) {
         return this.method_3065(var1);
      } else if (var1 == 0 && var2 == 0) {
         return 2;
      } else if (var1 == 1 && var2 == 0) {
         return 2;
      } else if (var1 == 2 && var2 == 0) {
         return 1;
      } else if (var1 == 0 && var2 == 1) {
         return 2;
      } else if (var1 == 1 && var2 == 1) {
         return 2;
      } else if (var1 == 2 && var2 == 1) {
         return 0;
      } else if (var1 == 0 && var2 == 2) {
         return 1;
      } else if (var1 == 1 && var2 == 2) {
         return 0;
      } else if (var1 == 2 && var2 == 2) {
         return 1;
      } else {
         throw new RuntimeException("getOtherBuffer 2 didn't return for:" + var1 + "," + var2);
      }
   }

   // $FF: renamed from: b () void
   public void method_3067() {
      int var1 = this.field_4110;
      this.field_4108 = var1;
      this.field_4110 = this.method_3066(this.field_4109, var1);
      this.field_4111 = this.field_4112[this.field_4110];
      this.field_4111.field_4096 = 0;
   }

   public void onDrawFrame(GL10 var1) {
      if (this.field_4108 == -1) {
         Log.method_1712("RustedWarfare", "---- render: no buffer is ready!");
      } else {
         long var2 = System.currentTimeMillis();
         int var4 = (int)(var2 - this.field_4121);
         this.field_4121 = var2;
         this.field_4117 += var4;
         ++this.field_4118;
         if (this.field_4118 == 10) {
            this.field_4119 = 10000 / this.field_4117;
            this.field_4117 = 0;
            this.field_4118 = 0;
            this.field_4120 = this.field_4119 + "fps";
            Log.method_1712("RustedWarfare", "render:" + this.field_4120 + ", this renders has " + this.field_4112[this.field_4108].field_4096 + " draws");
         }

         this.field_4109 = this.field_4108;
         var1.glClear(16640);
         var1.glMatrixMode(5888);
         class_466.method_3045(var1, true, false);
         class_470 var5 = this.field_4112[this.field_4109];
         this.field_4114 = -1;
         this.field_4115 = -1;
         this.field_4116 = -1;

         for(int var6 = 0; var6 < var5.field_4096; ++var6) {
            class_473 var7 = var5.field_4095[var6];
            var7.method_3071(var1);
         }

         class_466.method_3047(var1);
         this.field_4109 = -1;
      }
   }

   public void onSurfaceChanged(GL10 var1, int var2, int var3) {
      Log.method_1712("RustedWarfare", "2d gl onSurfaceChanged:" + var2 + "," + var3);
      this.field_4104 = var1;
      this.field_4106 = (float)var3;
      this.field_4107 = (float)var2;
      var1.glViewport(0, 0, var2, var3);
      var1.glMatrixMode(5889);
      var1.glLoadIdentity();
      var1.glOrthof(0.0F, (float)var2, 0.0F, (float)var3, 0.0F, 1.0F);
      var1.glShadeModel(7424);
      var1.glEnable(3042);
      var1.glBlendFunc(770, 771);
      var1.glColor4x(65536, 65536, 65536, 65536);
      var1.glEnable(3553);
   }

   public void onSurfaceCreated(GL10 var1, EGLConfig var2) {
      Log.method_1712("RustedWarfare", "2d gl onSurfaceCreated");
      this.field_4104 = var1;
      var1.glHint(3152, 4353);
      var1.glClearColor(0.3F, 0.3F, 0.5F, 1.0F);
      var1.glShadeModel(7424);
      var1.glDisable(2929);
      var1.glEnable(3553);
      var1.glDisable(3024);
      var1.glDisable(2896);
      var1.glClear(16640);
      class_236 var3 = class_236.method_1549();
      if (var3 != null) {
      }

      this.field_4103 = true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e) void
   public void method_3068(class_306 var1) {
      this.method_3069(var1, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, boolean) void
   public void method_3069(class_306 var1, boolean var2) {
      if (!var2) {
         if (!this.field_4103) {
            return;
         }

         if (var1.field_2527 != null) {
            return;
         }
      }

      Log.method_1712("RustedWarfare", "Loading image: " + var1.field_2526);
      if (var1.field_2529 == null) {
         Log.method_1712("RustedWarfare", "bitmap is null");
      }

      var1.field_2527 = this.method_3070(this.field_4105, var1.field_2529);
      if (var1.field_2527 == null || var1.field_2527 == -1) {
         Log.method_1712("RustedWarfare", "texture did not load:" + var1.field_2526);
      }

   }

   // $FF: renamed from: a (android.content.Context, android.graphics.Bitmap) int
   protected int method_3070(Context var1, Bitmap var2) {
      int var3 = -1;
      if (var1 != null && this.field_4104 != null) {
         this.field_4104.glGenTextures(1, this.field_4100, 0);
         var3 = this.field_4100[0];
         this.field_4104.glBindTexture(3553, var3);
         this.field_4104.glTexParameterf(3553, 10241, 9728.0F);
         this.field_4104.glTexParameterf(3553, 10240, 9728.0F);
         this.field_4104.glTexParameterf(3553, 10242, 33071.0F);
         this.field_4104.glTexParameterf(3553, 10243, 33071.0F);
         this.field_4104.glTexEnvf(8960, 8704, 7681.0F);
         GLUtils.texImage2D(3553, 0, var2, 0);
         this.field_4101[0] = 0;
         this.field_4101[1] = var2.method_3307();
         this.field_4101[2] = var2.method_3306();
         this.field_4101[3] = -var2.method_3307();
         ((GL11)this.field_4104).glTexParameteriv(3553, 35741, this.field_4101, 0);
         int var4 = this.field_4104.glGetError();
         if (var4 != 0) {
            Log.method_1712("RustedWarfare", "Texture Load GLError: " + var4);
         }
      }

      return var3;
   }
}
