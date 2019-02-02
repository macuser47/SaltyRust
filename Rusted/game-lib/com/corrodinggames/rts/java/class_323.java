package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_315;
import com.corrodinggames.rts.gameFramework.class_320;
import com.corrodinggames.rts.java.audio.Music;

// $FF: renamed from: com.corrodinggames.rts.java.p
public class class_323 extends class_320 {
   // $FF: renamed from: a com.corrodinggames.rts.java.o
   class_318 field_2590;
   // $FF: renamed from: b com.corrodinggames.rts.java.n
   class_313 field_2591;
   // $FF: renamed from: c com.corrodinggames.rts.java.audio.Music
   Music field_2592;
   // $FF: renamed from: d boolean
   boolean field_2593 = false;
   // $FF: renamed from: e boolean
   boolean field_2594 = false;
   // $FF: renamed from: f boolean
   boolean field_2595 = false;

   public class_323(class_313 var1) {
      this.field_2591 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.ao) void
   public void method_2165(class_315 var1) {
      this.field_2590 = (class_318)var1;
   }

   // $FF: renamed from: a (boolean) void
   public void method_2168(boolean var1) {
      synchronized(this.field_2591.method_2156()) {
         this.field_2593 = true;
         this.field_2594 = var1;
         this.field_2595 = false;
         class_236.method_1591("Queued:" + this.field_2590.b);
         if (this.field_2592 != null) {
            class_236.method_1591("startPlaying: Stopping old music");
            this.field_2592.stop();
         }

         this.field_2592 = this.field_2590.field_2576;
      }
   }

   // $FF: renamed from: f () void
   public void method_2174() {
      if (!this.field_2595) {
         synchronized(this.field_2591.method_2156()) {
            if (this.field_2592 != null) {
               class_236.method_1591("Now playing:" + this.field_2590.b);
               if (this.field_2594) {
                  this.field_2592.setVolume(this.field_2592.getVolume());
                  this.field_2592.setLooping(true);
                  this.field_2592.play();
               } else {
                  this.field_2592.setVolume(this.field_2592.getVolume());
                  this.field_2592.play();
               }

               this.field_2595 = true;
            } else {
               class_236.method_1591("realPlay: playingMusic==null");
            }

         }
      }
   }

   // $FF: renamed from: a () void
   public void method_2170() {
      synchronized(this.field_2591.method_2156()) {
         if (this.field_2592 != null) {
            class_236.method_1591("music pause: " + this.field_2590.b);
            this.field_2592.pause();
         }

      }
   }

   // $FF: renamed from: b () void
   public void method_2171() {
      synchronized(this.field_2591.method_2156()) {
         if (this.field_2592 != null && !this.field_2592.isPlaying()) {
            this.field_2592.play();
         }

      }
   }

   // $FF: renamed from: d () void
   public void method_2169() {
      synchronized(this.field_2591.method_2156()) {
         if (this.field_2592 != null) {
            class_236.method_1591("music stop: " + this.field_2590.b);
            this.field_2592.stop();
            this.field_2595 = false;
            this.field_2593 = false;
            this.field_2592 = null;
         }

      }
   }

   // $FF: renamed from: e () void
   public void method_2173() {
      synchronized(this.field_2591.method_2156()) {
         if (this.field_2592 != null) {
            this.field_2592.stop();
         }

      }
   }

   // $FF: renamed from: c () boolean
   public boolean method_2172() {
      synchronized(this.field_2591.method_2156()) {
         return this.field_2595 && this.field_2592 != null ? this.field_2592.isPlaying() : false;
      }
   }

   // $FF: renamed from: a (float) void
   public void method_2167(float var1) {
      synchronized(this.field_2591.method_2156()) {
         if (this.field_2592 != null) {
            if (var1 > 0.05F && !this.field_2595 && this.field_2593) {
               this.method_2174();
            }

            this.field_2592.setVolume(var1);
         } else {
            class_236.method_1591("setVolume: playingMusic==null");
         }

      }
   }
}
