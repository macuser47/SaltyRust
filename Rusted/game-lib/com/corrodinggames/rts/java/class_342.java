package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_236;
import java.awt.Toolkit;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.SlickException;

// $FF: renamed from: com.corrodinggames.rts.java.k
class class_342 implements Runnable {
   // $FF: renamed from: a com.corrodinggames.rts.java.Main
   // $FF: synthetic field
   final Main field_2738;

   class_342(Main var1) {
      this.field_2738 = var1;
   }

   public void run() {
      class_236.method_1649();

      try {
         this.field_2738.field_1839.start();
      } catch (SlickException var5) {
         if (!"Failed to initialise the LWJGL display".equals(var5.getMessage())) {
            throw new RuntimeException(var5);
         }

         class_236.method_1589("Error starting display", var5);
         String var2 = "\nFailed to get opengl version";

         try {
            System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
            Display.setDisplayMode(new DisplayMode(100, 100));
            Display.create();
            String var3 = GL11.glGetString(7938);
            Display.destroy();
            class_236.method_1591("OpenGL version: " + var3);
            var2 = "\n";
            var2 = var2 + "OpenGL version detected: " + var3;
            if (var3.startsWith("1.0") || var3.startsWith("1.1")) {
               var2 = var2 + "\n---\nOpenGL 1.1 is over 20 years old you might be using a fallback microsoft driver. Try updating your graphics drivers from the manufacturer.";
            }
         } catch (Exception var4) {
            class_236.method_1589("Failed to get opengl info", var4);
         }

         Toolkit.getDefaultToolkit();
         Sys.alert("Error", "Failed to create display." + var2);
         System.exit(1);
      }

      class_236.method_1591("Game stopped running shutting down");
      class_236 var1 = class_236.method_1549();
      var1.field_1947.method_1988("lastgame");
      this.field_2738.method_1517(true);
   }
}
