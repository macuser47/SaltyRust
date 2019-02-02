package com.corrodinggames.rts.gameFramework.e;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.utility.class_196;
import com.corrodinggames.rts.gameFramework.utility.class_210;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.e.b
public class class_215 {
   // $FF: renamed from: a java.lang.String
   public String field_1737;
   // $FF: renamed from: b java.lang.String
   public String field_1738;
   // $FF: renamed from: c boolean
   public boolean field_1739;
   // $FF: renamed from: d long
   public long field_1740;
   // $FF: renamed from: e boolean
   boolean field_1741;
   // $FF: renamed from: f java.lang.String
   public String field_1742;
   // $FF: renamed from: g boolean
   public boolean field_1743;
   // $FF: renamed from: h java.lang.String
   public String field_1744;
   // $FF: renamed from: i java.lang.String
   public String field_1745;
   // $FF: renamed from: j boolean
   public boolean field_1746;
   // $FF: renamed from: k boolean
   public boolean field_1747;
   // $FF: renamed from: l boolean
   public boolean field_1748 = false;
   // $FF: renamed from: m boolean
   public boolean field_1749 = true;
   // $FF: renamed from: n boolean
   public boolean field_1750;
   // $FF: renamed from: o int
   public int field_1751;
   // $FF: renamed from: p int
   public int field_1752;
   // $FF: renamed from: q int
   public int field_1753;
   // $FF: renamed from: r java.lang.String
   public String field_1754;
   // $FF: renamed from: s java.lang.String
   public String field_1755;

   // $FF: renamed from: a () java.lang.String
   public String method_1422() {
      return this.field_1744 != null ? this.field_1744 : this.field_1737;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1423() {
      String var1 = "";
      if (this.field_1745 != null) {
         var1 = var1 + this.field_1745;
      }

      var1 = var1 + " (RAM:" + this.method_1435() + ")";
      return var1;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1424() {
      return this.field_1746 ? this.field_1742 : class_236.method_1637(this.field_1742);
   }

   // $FF: renamed from: d () java.lang.String
   public String method_1425() {
      File var1 = new File(this.method_1424());
      return var1.getAbsolutePath();
   }

   // $FF: renamed from: e () java.lang.String
   public String method_1426() {
      File var1 = new File(this.method_1424());
      return var1.getCanonicalPath();
   }

   // $FF: renamed from: f () java.lang.String
   public String method_1427() {
      String var1 = this.field_1755;
      if (!this.field_1750 && var1 == null) {
         if (var1 == null) {
            var1 = "";
         }

         var1 = var1 + "Not yet loaded, refresh needed";
      }

      return var1;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1428() {
      return !this.field_1739 && this.field_1754 == null;
   }

   // $FF: renamed from: h () com.corrodinggames.rts.gameFramework.utility.z
   public class_210 method_1429() {
      if (this.field_1742 == null) {
         class_236.method_1591("No source yet for mod: " + this.field_1737);
         return null;
      } else {
         String var1 = this.field_1742 + "/mod-info.txt";
         class_196 var2 = class_296.method_2080(var1);
         if (var2 == null) {
            class_236.method_1591("No mod info for: " + this.field_1737 + " at " + var1);
            return null;
         } else {
            try {
               class_210 var3 = new class_210(var2, var1);
               return var3;
            } catch (IOException var5) {
               throw new RuntimeException(var5);
            }
         }
      }
   }

   // $FF: renamed from: i () java.lang.String
   public String method_1430() {
      String var1 = this.method_1431("thumbnail");
      if (var1 != null) {
         var1 = this.method_1425() + "/" + var1;
         return var1;
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public String method_1431(String var1) {
      String var2 = "mod";
      class_210 var3 = this.method_1429();
      return var3.method_1393(var2, var1, (String)null);
   }

   // $FF: renamed from: j () void
   public void method_1432() {
      class_210 var1 = this.method_1429();
      if (var1 != null) {
         String var2 = "mod";
         this.field_1744 = var1.method_1393(var2, "title", (String)null);
         this.field_1745 = var1.method_1393(var2, "description", (String)null);
         this.field_1743 = true;
         String var3 = this.method_1433();
         File var4 = new File(var3);
         if (var4.exists() && !var4.isDirectory()) {
            class_210 var5;
            try {
               var5 = new class_210(var3);
            } catch (IOException var7) {
               throw new RuntimeException(var7);
            }

            String var6 = "steam";
            this.field_1740 = var5.method_1406(var6, "id", 0L);
         }

      }
   }

   // $FF: renamed from: l () java.lang.String
   private String method_1433() {
      return this.method_1424() + "/steam.dat";
   }

   // $FF: renamed from: a (long) boolean
   public boolean method_1434(long var1) {
      this.field_1740 = var1;
      String var3 = this.method_1433();

      try {
         PrintWriter var4 = new PrintWriter(var3);
         var4.println("[steam]");
         var4.println("id: " + var1);
         var4.close();
         return true;
      } catch (FileNotFoundException var6) {
         var6.printStackTrace();
         class_236.method_1549().method_1607("IO error: Failed to save workshop id for mod at: " + var3);
         return false;
      }
   }

   // $FF: renamed from: k () java.lang.String
   public String method_1435() {
      String var1 = "";
      var1 = var1 + String.format("%.2f", (float)((double)this.field_1753 / 1000.0D / 1000.0D)) + " mb";
      return var1;
   }
}
