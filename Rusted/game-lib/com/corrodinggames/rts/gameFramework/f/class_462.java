package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.a.class_271;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.g
public class class_462 {
   // $FF: renamed from: a boolean
   public boolean field_3961;
   // $FF: renamed from: b java.lang.String
   public String field_3962;
   // $FF: renamed from: c java.lang.String
   public String field_3963;
   // $FF: renamed from: d java.lang.String
   public String field_3964;
   // $FF: renamed from: e int
   public int field_3965;
   // $FF: renamed from: f boolean
   public boolean field_3966;
   // $FF: renamed from: g long
   public long field_3967 = -1L;
   // $FF: renamed from: h java.lang.String
   public String field_3968;
   // $FF: renamed from: i java.lang.String
   public String field_3969;
   // $FF: renamed from: j boolean
   public boolean field_3970;
   // $FF: renamed from: k java.lang.String
   public String field_3971;
   // $FF: renamed from: l long
   public long field_3972;
   // $FF: renamed from: m int
   public int field_3973;
   // $FF: renamed from: n java.lang.String
   public String field_3974;
   // $FF: renamed from: o java.lang.String
   public String field_3975;
   // $FF: renamed from: p java.lang.String
   public String field_3976;
   // $FF: renamed from: q java.lang.String
   public String field_3977;
   // $FF: renamed from: r java.lang.String
   public String field_3978;
   // $FF: renamed from: s int
   public int field_3979 = -1;
   // $FF: renamed from: t int
   public int field_3980 = 8;
   // $FF: renamed from: u boolean
   public boolean field_3981;
   // $FF: renamed from: v boolean
   public boolean field_3982;

   // $FF: renamed from: a () java.lang.String
   public String method_3003() {
      String var1 = "";
      var1 = var1 + "Address: " + this.field_3963 + ":" + this.field_3965 + "\n";
      if (this.field_3961) {
         var1 = var1 + "Lan: " + this.field_3964 + ":" + this.field_3965 + "\n";
      }

      var1 = var1 + "User: " + this.field_3971 + "\n";
      String var2 = class_271.method_1887(this.field_3974);
      var1 = var1 + "Map: " + var2 + "\n";
      if (this.field_3970) {
         var1 = var1 + "Password Required\n";
      }

      if (!this.field_3966 && !this.field_3961) {
         var1 = var1 + "Port: not open (Connecting over the internet may fail)\n";
      }

      return var1;
   }
}
