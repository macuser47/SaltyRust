package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_236;
import java.io.BufferedReader;
import java.util.List;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.r
class class_447 implements Runnable {
   // $FF: renamed from: a int
   int field_3765;
   // $FF: renamed from: b java.util.List
   List field_3766;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.f.p
   class_230 field_3767;
   // $FF: renamed from: d java.lang.String
   String field_3768;

   public class_447(List var1, class_230 var2, String var3, int var4) {
      this.field_3765 = var4;
      this.field_3766 = var1;
      this.field_3767 = var2;
      this.field_3768 = var3;
   }

   public void run() {
      class_236 var1 = class_236.method_1549();

      try {
         class_236.method_1592("LoadFromMasterServer", this.field_3765 + ": Started doSingleRequest");
         BufferedReader var2 = class_444.method_2829(this.field_3766, this.field_3768).field_3763;
         class_236.method_1592("LoadFromMasterServer", this.field_3765 + ": Ended doSingleRequest");
         this.field_3767.method_1488(var2, this.field_3765, this.field_3768);
      } catch (Exception var4) {
         var4.printStackTrace();
         String var3 = "Error getting game list from server #" + this.field_3765;
         class_236.method_1591(var3);
         var1.method_1608("Error getting game list from server #" + this.field_3765, 1);
      }

   }
}
