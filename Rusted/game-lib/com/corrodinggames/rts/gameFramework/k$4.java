package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.f.class_444;
import com.corrodinggames.rts.gameFramework.utility.class_0;
import com.corrodinggames.rts.gameFramework.utility.class_228;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

final class k$4 implements class_0 {
   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.a) void
   public strictfp void method_0(class_228 var1) {
      if (class_236.field_2038) {
         class_236.method_1588("activeANRWatchDog: ANR already detected");
      }

      class_236.field_2038 = true;
      class_236.method_1588("activeANRWatchDog: ANR detected");
      String var2 = class_236.method_1646(var1);
      class_444.method_2841("detectedANR", var2);

      try {
         Thread.sleep(400L);
      } catch (InterruptedException var7) {
         var7.printStackTrace();
      }

      try {
         File var3 = class_287.method_1986("lastFreeze", "", true);
         FileOutputStream var4 = new FileOutputStream(var3);
         PrintStream var5 = new PrintStream(var4);
         var5.print(var2);
         var5.close();
         var4.close();
      } catch (IOException var6) {
         throw new RuntimeException(var6);
      }
   }
}
