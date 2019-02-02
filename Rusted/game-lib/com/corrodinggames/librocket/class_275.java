package com.corrodinggames.librocket;

import com.LibRocket$TextureHolder;
import com.corrodinggames.rts.game.units.class_24;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.PNGImageData;

// $FF: renamed from: com.corrodinggames.librocket.c
public class class_275 extends LibRocket$TextureHolder {
   // $FF: renamed from: a java.lang.String
   String field_2344;
   // $FF: renamed from: b org.newdawn.slick.Image
   Image field_2345;
   // $FF: renamed from: c org.newdawn.slick.ImageBuffer
   ImageBuffer field_2346;
   // $FF: renamed from: d boolean
   boolean field_2347;
   // $FF: renamed from: e boolean
   boolean field_2348;
   // $FF: renamed from: f float
   float field_2349;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.ap
   class_24 field_2350;
   // $FF: renamed from: h com.corrodinggames.librocket.a
   // $FF: synthetic field
   final class_264 field_2351;

   public class_275(class_264 var1) {
      super(var1);
      this.field_2351 = var1;
      this.field_2349 = 1.0F;
   }

   // $FF: renamed from: a () boolean
   boolean method_1902() {
      try {
         FileInputStream var1;
         try {
            var1 = new FileInputStream(this.field_2344);
         } catch (IOException var4) {
            var4.printStackTrace();
            return false;
         }

         BufferedInputStream var2 = new BufferedInputStream(var1);
         PNGImageData var3 = new PNGImageData();
         var3.loadImage(var2);
         var2.close();
         this.field_2345 = new Image(var3);
         this.width = this.field_2345.getWidth();
         this.height = this.field_2345.getHeight();
         return true;
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }
   }

   public void remove() {
      if (this.field_2345 != null) {
         try {
            this.field_2345.destroy();
         } catch (SlickException var2) {
            var2.printStackTrace();
         }
      }

      this.field_2344 = null;
      this.field_2346 = null;
      this.field_2345 = null;
   }
}
