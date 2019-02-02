package com.corrodinggames.rts.gameFramework;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import java.io.IOException;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.am
public class class_321 extends class_320 {
   // $FF: renamed from: a android.media.MediaPlayer
   MediaPlayer field_2585;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.al
   class_316 field_2586;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.ak
   class_311 field_2587;

   public class_321(class_311 var1) {
      this.field_2587 = var1;
      MediaPlayer var2 = null;
      if (var1.field_2561.size() == 0) {
         throw new RuntimeException("Music player pool empty");
      } else {
         var2 = (MediaPlayer)var1.field_2561.remove(0);
         var1.field_2562.add(this);
         this.field_2585 = var2;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.ao) void
   public void method_2165(class_315 var1) {
      this.field_2586 = (class_316)var1;
   }

   // $FF: renamed from: a (boolean) void
   public void method_2168(boolean var1) {
      AssetFileDescriptor var2;
      try {
         var2 = this.field_2587.e.field_3699.method_1853().method_3281(this.field_2586.b);
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }

      try {
         MediaPlayer var3 = this.field_2585;
         var3.reset();
         var3.setDataSource(var2.getFileDescriptor(), var2.getStartOffset(), var2.getLength());
         if (var1) {
            var3.setLooping(true);
         }

         var3.setVolume(0.0F, 0.0F);
         var3.setOnInfoListener(new am$1(this));
         var3.setOnPreparedListener(new am$2(this));
         var3.prepareAsync();
         var2.close();
      } catch (Exception var4) {
         throw new RuntimeException(var4);
      }
   }

   // $FF: renamed from: a () void
   public void method_2170() {
      this.field_2585.pause();
   }

   // $FF: renamed from: b () void
   public void method_2171() {
      this.field_2585.start();
   }

   // $FF: renamed from: c () boolean
   public boolean method_2172() {
      return this.field_2585.isPlaying();
   }

   // $FF: renamed from: d () void
   public void method_2169() {
      if (this.field_2585 != null) {
         this.field_2585.stop();
      }

   }

   // $FF: renamed from: e () void
   public void method_2173() {
      if (this.field_2585 != null) {
         this.field_2585.stop();
      }

      this.field_2585 = null;
      this.field_2587.field_2562.remove(this);
      this.field_2587.field_2561.add(this.field_2585);
   }

   // $FF: renamed from: a (float) void
   public void method_2167(float var1) {
      this.field_2585.setVolume(var1, var1);
   }
}
