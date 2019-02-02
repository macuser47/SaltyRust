package com.corrodinggames.rts.game;

import android.graphics.Bitmap;
import android.graphics.Bitmap$CompressFormat;
import java.io.File;
import java.io.FileOutputStream;

// $FF: renamed from: com.corrodinggames.rts.game.h
class class_241 implements Runnable {
   // $FF: renamed from: a android.graphics.Bitmap
   public Bitmap field_2139;
   // $FF: renamed from: b int
   public int field_2140;
   // $FF: renamed from: c boolean
   public boolean field_2141;
   // $FF: renamed from: d java.lang.Thread
   public Thread field_2142;
   // $FF: renamed from: e com.corrodinggames.rts.game.g
   // $FF: synthetic field
   final class_237 field_2143;

   strictfp class_241(class_237 var1) {
      this.field_2143 = var1;
      this.field_2141 = true;
   }

   // $FF: renamed from: a () void
   public strictfp synchronized void method_1734() {
   }

   public strictfp void run() {
      synchronized(this) {
         try {
            File var2 = new File(this.field_2143.field_2045 + "image_" + String.format("%07d", this.field_2140) + ".jpg");
            FileOutputStream var3 = new FileOutputStream(var2);
            this.field_2139.method_3304(Bitmap$CompressFormat.field_3274, 85, var3);
            var3.close();
         } catch (Exception var5) {
            var5.printStackTrace();
            this.field_2143.aJ = false;
            this.field_2143.a("Error saving jpg, recording has stopped. Is there free space remaining on the SD card?", 1);
         }

      }
   }
}
