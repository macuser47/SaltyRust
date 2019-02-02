package com.corrodinggames.rts.java;

import org.newdawn.slick.Font;

// $FF: renamed from: com.corrodinggames.rts.java.e
class class_340 {
   // $FF: renamed from: a int
   int field_2728;
   // $FF: renamed from: b boolean
   boolean field_2729;
   // $FF: renamed from: c boolean
   boolean field_2730;
   // $FF: renamed from: d org.newdawn.slick.Font
   Font field_2731;
   // $FF: renamed from: e int
   int field_2732;
   // $FF: renamed from: f java.lang.String[]
   String[] field_2733;
   // $FF: renamed from: g com.corrodinggames.rts.java.d
   // $FF: synthetic field
   final class_339 field_2734;

   class_340(class_339 var1) {
      this.field_2734 = var1;
      this.field_2733 = new String[30];
   }

   // $FF: renamed from: a () com.corrodinggames.rts.java.e
   public class_340 method_2266() {
      class_340 var1 = new class_340(this.field_2734);
      var1.field_2728 = this.field_2728;
      var1.field_2729 = this.field_2729;
      var1.field_2730 = this.field_2730;
      return var1;
   }

   public String toString() {
      return "FontKey:(size:" + this.field_2728 + ",  bold:" + this.field_2729 + " fallback:" + this.field_2730 + ")";
   }

   // $FF: renamed from: a (java.lang.String) boolean
   boolean method_2267(String var1) {
      if (var1 == null) {
         return true;
      } else {
         boolean var2 = class_339.method_2246(var1);
         if (!var2) {
            return true;
         } else {
            for(int var3 = 0; var3 < this.field_2733.length; ++var3) {
               String var4 = this.field_2733[var3];
               if (var4 != null && var4.equals(var1)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   // $FF: renamed from: b (java.lang.String) void
   void method_2268(String var1) {
      this.field_2733[this.field_2732] = var1;
      ++this.field_2732;
      if (this.field_2732 >= this.field_2733.length) {
         this.field_2732 = 0;
      }

   }

   // $FF: synthetic method
   public Object clone() {
      return this.method_2266();
   }
}
