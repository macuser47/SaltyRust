package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.a
public class class_249 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.b
   public class_309 field_2231 = this.method_1802((byte)1);
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.b
   public class_309 field_2232 = this.method_1802((byte)2);
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.b
   public class_309 field_2233 = this.method_1802((byte)3);
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.b
   public class_309 field_2234 = this.method_1802((byte)4);
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.b
   public class_309 field_2235 = this.method_1802((byte)10);
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.b
   public class_309 field_2236 = this.method_1802((byte)11);
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.b
   public class_309 field_2237 = this.method_1802((byte)13);
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.b
   public class_309 field_2238 = this.method_1802((byte)21);
   // $FF: renamed from: i com.corrodinggames.rts.gameFramework.b
   public class_309 field_2239 = this.method_1802((byte)35);
   // $FF: renamed from: j com.corrodinggames.rts.gameFramework.b
   public class_309 field_2240 = this.method_1802((byte)40);
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.b
   public class_309 field_2241 = this.method_1802((byte)45);
   // $FF: renamed from: l com.corrodinggames.rts.gameFramework.b
   public class_309 field_2242 = this.method_1802((byte)52);
   // $FF: renamed from: m com.corrodinggames.rts.gameFramework.b
   public class_309 field_2243 = this.method_1802((byte)60);
   // $FF: renamed from: n java.util.ArrayList
   ArrayList field_2244 = new ArrayList();

   public strictfp class_249() {
      class_309 var1 = null;
      var1 = this.field_2231;
      var1.method_2146(var1);
      var1.method_2146(this.method_1802((byte)3));
      var1.method_2146(this.method_1802((byte)4));
      var1.method_2146(this.method_1802((byte)10));
      var1.method_2146(this.method_1802((byte)11));
      var1.method_2146(this.method_1802((byte)13));
      var1.method_2146(this.method_1802((byte)21));
      var1 = this.field_2241;
      var1.method_2146(this.method_1802((byte)52));
      var1 = this.field_2243;
      var1.method_2146(var1);
      var1.method_2146(this.method_1802((byte)3));
      var1.method_2146(this.method_1802((byte)4));
      var1.method_2146(this.method_1802((byte)10));
      var1.method_2146(this.method_1802((byte)11));
      var1.method_2146(this.method_1802((byte)13));
      var1.method_2146(this.method_1802((byte)21));
      var1 = this.method_1802((byte)10);
      var1.method_2146(this.method_1802((byte)3));
      var1.method_2146(this.method_1802((byte)4));
      var1.method_2146(this.method_1802((byte)10));
      var1.method_2146(this.method_1802((byte)13));
      var1.method_2146(this.method_1802((byte)40));
      var1 = this.method_1802((byte)11);
      var1.method_2146(this.method_1802((byte)3));
      var1.method_2146(this.method_1802((byte)10));
      var1.method_2146(this.method_1802((byte)13));
      var1.method_2146(this.method_1802((byte)40));
      var1 = this.method_1802((byte)3);
      var1.method_2146(this.method_1802((byte)3));
      var1.method_2146(this.method_1802((byte)4));
      var1.method_2146(this.method_1802((byte)10));
      var1.method_2146(this.method_1802((byte)13));
      var1 = this.method_1802((byte)4);
      var1.method_2146(this.method_1802((byte)3));
      var1.method_2146(this.method_1802((byte)4));
      var1.method_2146(this.method_1802((byte)10));
      var1.method_2146(this.method_1802((byte)13));
      var1 = this.method_1802((byte)13);
      var1.method_2146(this.method_1802((byte)3));
      var1.method_2146(this.method_1802((byte)4));
      var1.method_2146(this.method_1802((byte)10));
      var1.method_2146(this.method_1802((byte)13));
      var1 = this.method_1802((byte)21);
      var1.method_2146(this.method_1802((byte)3));
      var1.method_2146(this.method_1802((byte)4));
      var1.method_2146(this.method_1802((byte)10));
      var1.method_2146(this.method_1802((byte)13));
      var1 = this.field_2239;
      var1.method_2146(this.method_1802((byte)10));
      var1.method_2146(this.method_1802((byte)13));
   }

   // $FF: renamed from: a (byte) com.corrodinggames.rts.gameFramework.b
   public strictfp class_309 method_1802(byte var1) {
      Iterator var2 = this.field_2244.iterator();

      class_309 var3;
      do {
         if (!var2.hasNext()) {
            class_309 var4 = new class_309();
            var4.field_2557 = var1;
            this.field_2244.add(var4);
            return var4;
         }

         var3 = (class_309)var2.next();
      } while(var3.field_2557 != var1);

      return var3;
   }
}
