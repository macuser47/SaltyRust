package com.corrodinggames.rts.gameFramework.g;

import android.util.Log;
import com.corrodinggames.rts.gameFramework.utility.class_193;
import java.util.Iterator;
import java.util.PriorityQueue;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.g.a
public final class class_235 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.g.f[]
   class_245[] field_1868 = new class_245[75];
   // $FF: renamed from: b java.util.PriorityQueue
   PriorityQueue field_1869 = new PriorityQueue();
   // $FF: renamed from: c int
   int field_1870;
   // $FF: renamed from: d int
   int field_1871;
   // $FF: renamed from: e int
   int field_1872;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.utility.k
   class_193 field_1873 = new class_193(300);
   // $FF: renamed from: g int
   int field_1874;
   // $FF: renamed from: h int
   int field_1875;
   // $FF: renamed from: i int
   int field_1876;
   // $FF: renamed from: j int
   int field_1877;
   // $FF: renamed from: k int
   int field_1878;

   // $FF: renamed from: d () void
   private strictfp void method_1538() {
      this.field_1874 = -1;
      this.field_1875 = Integer.MAX_VALUE;
      this.field_1876 = -1;
      this.field_1877 = Integer.MIN_VALUE;

      for(int var1 = 0; var1 < this.field_1868.length; ++var1) {
         class_245 var2 = this.field_1868[var1];
         if (var2 != null) {
            int var3 = var2.field_2177;
            if (this.field_1875 > var3) {
               this.field_1874 = var1;
               this.field_1875 = var3;
            }

            if (this.field_1877 < var3) {
               this.field_1876 = var1;
               this.field_1877 = var3;
            }
         }
      }

   }

   // $FF: renamed from: e () void
   private strictfp void method_1539() {
      this.field_1878 = Integer.MAX_VALUE;
      class_245 var1 = (class_245)this.field_1869.peek();
      if (var1 != null) {
         this.field_1878 = var1.field_2177;
      }

   }

   public strictfp class_235() {
      this.method_1546();
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.g.f) void
   private strictfp void method_1540(class_245 var1) {
      for(int var2 = 0; var2 < this.field_1868.length; ++var2) {
         if (this.field_1868[var2] == null) {
            this.field_1868[var2] = var1;
            break;
         }
      }

      this.method_1538();
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.g.f) void
   private strictfp void method_1541(class_245 var1) {
      this.field_1870 += var1.field_2177;
      ++this.field_1871;
      if (this.field_1871 > 200) {
         int var2 = this.field_1870 / this.field_1871;
         this.field_1870 = 0;
         this.field_1871 = 0;
         if (this.field_1872 == -1 || var2 < this.field_1872) {
            this.field_1872 = var2;
         }
      }

      if (this.field_1872 != -1 && var1.field_2177 > this.field_1872) {
         this.field_1873.add(var1);
      } else {
         this.field_1869.offer(var1);
         if (var1.field_2177 < this.field_1878) {
            this.field_1878 = var1.field_2177;
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.f) void
   public strictfp void method_1542(class_245 var1) {
      boolean var2 = false;

      for(int var3 = 0; var3 < this.field_1868.length; ++var3) {
         if (this.field_1868[var3] == null) {
            var2 = true;
            break;
         }
      }

      if (var2) {
         if (var1.field_2177 <= this.field_1878) {
            this.method_1540(var1);
         } else {
            this.method_1541(var1);
         }
      } else if (var1.field_2177 < this.field_1877) {
         class_245 var4 = this.field_1868[this.field_1876];
         this.field_1868[this.field_1876] = var1;
         this.method_1541(var4);
         this.method_1538();
      } else {
         this.method_1541(var1);
      }
   }

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.g.f
   public strictfp class_245 method_1543() {
      class_245 var1;
      if (this.field_1874 != -1) {
         var1 = this.field_1868[this.field_1874];
         this.field_1868[this.field_1874] = null;
         this.method_1538();
         return var1;
      } else {
         if (this.field_1872 != -1 && this.field_1878 > this.field_1872 || this.field_1869.isEmpty()) {
            this.method_1544();
         }

         var1 = (class_245)this.field_1869.poll();
         this.method_1539();
         return var1;
      }
   }

   // $FF: renamed from: b () void
   public strictfp void method_1544() {
      if (class_238.field_2094) {
         Log.method_1712("RustedWarfare", "emptyUpperBuffer with:" + this.field_1873.size() + " nodes, mainQueue size:" + this.field_1869.size());
      }

      this.field_1870 = 0;
      this.field_1871 = 0;
      this.field_1872 = -1;
      Iterator var1 = this.field_1873.iterator();

      while(var1.hasNext()) {
         class_245 var2 = (class_245)var1.next();
         if (var2 != null) {
            this.field_1869.offer(var2);
         }
      }

      this.method_1539();
      this.field_1873.clear();
   }

   // $FF: renamed from: c () void
   public strictfp void method_1545() {
      this.field_1873.clear();
      this.field_1870 = 0;
      this.field_1871 = 0;
      this.field_1872 = -1;

      for(int var1 = 0; var1 < this.field_1868.length; ++var1) {
         if (this.field_1868[var1] != null) {
            this.field_1868[var1] = null;
         }
      }

      this.field_1869.clear();
      this.method_1546();
   }

   // $FF: renamed from: f () void
   private strictfp void method_1546() {
      this.field_1874 = -1;
      this.field_1875 = Integer.MAX_VALUE;
      this.field_1876 = -1;
      this.field_1877 = Integer.MIN_VALUE;
      this.field_1878 = Integer.MAX_VALUE;
   }
}
