package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes$MissingKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.ab
public class class_427 {
   // $FF: renamed from: a java.lang.String
   public String field_3635;
   // $FF: renamed from: b boolean
   public boolean field_3636 = false;
   // $FF: renamed from: c java.util.ArrayList
   public ArrayList field_3637 = new ArrayList();
   // $FF: renamed from: d java.util.ArrayList
   public ArrayList field_3638 = new ArrayList();

   // $FF: renamed from: a () boolean
   public boolean method_2715() {
      Iterator var1 = this.field_3637.iterator();

      class_429 var2;
      do {
         if (!var1.hasNext()) {
            return false;
         }

         var2 = (class_429)var1.next();
      } while(var2.field_3639 != -1 || !var2.method_2727());

      return true;
   }

   // $FF: renamed from: b () boolean
   public boolean method_2716() {
      Iterator var1 = this.field_3637.iterator();

      class_429 var2;
      do {
         if (!var1.hasNext()) {
            return false;
         }

         var2 = (class_429)var1.next();
      } while(var2.field_3639 != -1 || !var2.method_2728());

      return true;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_2717() {
      Iterator var1 = this.field_3637.iterator();

      class_429 var2;
      do {
         if (!var1.hasNext()) {
            return "";
         }

         var2 = (class_429)var1.next();
      } while(var2 == null);

      return var2.method_2729().toUpperCase();
   }

   // $FF: renamed from: a (int) java.lang.String
   public String method_2718(int var1) {
      if (this.field_3637.size() > var1) {
         class_429 var2 = (class_429)this.field_3637.get(var1);
         return var2 == null ? "<null>" : var2.method_2729().toUpperCase();
      } else {
         return "";
      }
   }

   // $FF: renamed from: b (int) com.corrodinggames.rts.gameFramework.ab
   public class_427 method_2719(int var1) {
      byte var2 = 0;
      return this.method_2720(var1, 0, var2, false);
   }

   // $FF: renamed from: a (int, int, int, boolean) com.corrodinggames.rts.gameFramework.ab
   public class_427 method_2720(int var1, int var2, int var3, boolean var4) {
      class_431 var5 = new class_431();
      var5.field_3649 = var1;
      var5.a = -1;
      var5.b = var3;
      if (var4) {
         var5.d = true;
      }

      if (this.field_3637.size() <= var2) {
         this.field_3637.add((Object)null);
      }

      if (this.field_3637.size() <= var2) {
         this.field_3637.add((Object)null);
      }

      this.field_3637.set(var2, var5);
      return this;
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.ab
   public class_427 method_2721(String var1) {
      return this.method_2722(var1, -1);
   }

   // $FF: renamed from: a (java.lang.String, int) com.corrodinggames.rts.gameFramework.ab
   public class_427 method_2722(String var1, int var2) {
      if (var1 == null) {
         throw new RuntimeException("key==null");
      } else {
         return this.method_2723(-1, var1, var2);
      }
   }

   // $FF: renamed from: a (int, java.lang.String, int) com.corrodinggames.rts.gameFramework.ab
   public class_427 method_2723(int var1, String var2, int var3) {
      if (var2 == null) {
         throw new RuntimeException("key==null");
      } else {
         class_431 var4 = new class_431();
         var4.a = var1;
         var4.b = 0;
         var2 = var2.toLowerCase(Locale.ENGLISH);
         if (var2.contains("alt+")) {
            var2 = var2.replace("alt+", "");
            var4.b += 4;
         }

         if (var2.contains("ctrl+")) {
            var2 = var2.replace("ctrl+", "");
            ++var4.b;
         }

         if (var2.contains("shift+")) {
            var2 = var2.replace("shift+", "");
            var4.b += 2;
         }

         try {
            var4.field_3649 = class_426.method_2714(var2);
            if (var3 == -1) {
               this.field_3637.add(var4);
            } else {
               if (this.field_3637.size() <= var3) {
                  this.field_3637.add((Object)null);
               }

               if (this.field_3637.size() <= var3) {
                  this.field_3637.add((Object)null);
               }

               this.field_3637.set(var3, var4);
            }
         } catch (SlickToAndroidKeycodes$MissingKey var7) {
            var7.printStackTrace();
            class_236 var6 = class_236.method_1549();
            if (var6 != null) {
               var6.method_1608(var7.getMessage(), 1);
            }
         }

         return this;
      }
   }

   // $FF: renamed from: b (int, int, int, boolean) com.corrodinggames.rts.gameFramework.ab
   public class_427 method_2724(int var1, int var2, int var3, boolean var4) {
      class_430 var5 = new class_430();
      var5.a = var1;
      var5.field_3643 = var2;
      var5.field_3644 = var3;
      var5.field_3645 = var4;

      try {
         var5.field_3647 = var5.method_2732(true);
      } catch (IndexOutOfBoundsException var7) {
         class_236.method_1588("Failed to bind Axis:" + var3 + " on joystick:" + var2);
         return this;
      }

      this.field_3637.add(var5);
      return this;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2725() {
      return false;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_2726() {
      return this.field_3635.replace("-", "").replace("  ", " ").replace("  ", " ").replace(" ", "_").toLowerCase(Locale.ENGLISH);
   }
}
