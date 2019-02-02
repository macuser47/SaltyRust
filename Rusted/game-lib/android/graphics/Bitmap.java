package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import java.io.OutputStream;

public final class Bitmap implements Parcelable {
   // $FF: renamed from: a int
   public final int field_4727;
   // $FF: renamed from: d boolean
   private final boolean field_4728;
   // $FF: renamed from: e boolean
   private boolean field_4729;
   // $FF: renamed from: f int
   private int field_4730;
   // $FF: renamed from: g int
   private int field_4731;
   // $FF: renamed from: h boolean
   private boolean field_4732;
   // $FF: renamed from: b int
   int field_4733;
   // $FF: renamed from: i int
   private static volatile int field_4734 = -1;
   // $FF: renamed from: c android.os.Parcelable.Creator
   public static final Creator field_4735 = new Bitmap$1();

   // $FF: renamed from: a (int) void
   public void method_3297(int var1) {
      this.field_4733 = var1;
   }

   // $FF: renamed from: a (java.lang.String) void
   private void method_3298(String var1) {
      if (this.field_4732) {
         throw new IllegalStateException(var1);
      }
   }

   // $FF: renamed from: b (int, int) void
   private static void method_3299(int var0, int var1) {
      if (var0 < 0) {
         throw new IllegalArgumentException("x must be >= 0");
      } else if (var1 < 0) {
         throw new IllegalArgumentException("y must be >= 0");
      }
   }

   // $FF: renamed from: a (android.graphics.Bitmap$Config, boolean) android.graphics.Bitmap
   public Bitmap method_3300(Bitmap$Config var1, boolean var2) {
      this.method_3298("Can't copy a recycled bitmap");
      Bitmap var3 = nativeCopy(this.field_4727, var1.field_3076, var2);
      if (var3 != null) {
         var3.field_4729 = this.field_4729;
         var3.field_4733 = this.field_4733;
      }

      return var3;
   }

   // $FF: renamed from: a (int, int, android.graphics.Bitmap$Config) android.graphics.Bitmap
   public static Bitmap method_3301(int var0, int var1, Bitmap$Config var2) {
      return method_3302(var0, var1, var2, true);
   }

   // $FF: renamed from: a (int, int, android.graphics.Bitmap$Config, boolean) android.graphics.Bitmap
   private static Bitmap method_3302(int var0, int var1, Bitmap$Config var2, boolean var3) {
      return method_3303((DisplayMetrics)null, var0, var1, var2, var3);
   }

   // $FF: renamed from: a (android.util.DisplayMetrics, int, int, android.graphics.Bitmap$Config, boolean) android.graphics.Bitmap
   private static Bitmap method_3303(DisplayMetrics var0, int var1, int var2, Bitmap$Config var3, boolean var4) {
      if (var1 > 0 && var2 > 0) {
         Bitmap var5 = nativeCreate((int[])null, 0, var1, var1, var2, var3.field_3076, true);
         if (var0 != null) {
            var5.field_4733 = var0.densityDpi;
         }

         if (var3 == Bitmap$Config.field_3075 && !var4) {
            nativeErase(var5.field_4727, -16777216);
            nativeSetHasAlpha(var5.field_4727, var4);
         }

         return var5;
      } else {
         throw new IllegalArgumentException("width and height must be > 0");
      }
   }

   // $FF: renamed from: a (android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream) boolean
   public boolean method_3304(Bitmap$CompressFormat var1, int var2, OutputStream var3) {
      this.method_3298("Can't compress a recycled bitmap");
      if (var3 == null) {
         throw new NullPointerException();
      } else if (var2 >= 0 && var2 <= 100) {
         return nativeCompress(this.field_4727, var1.field_3277, var2, var3, new byte[4096]);
      } else {
         throw new IllegalArgumentException("quality must be 0..100");
      }
   }

   // $FF: renamed from: a () boolean
   public final boolean method_3305() {
      return this.field_4728;
   }

   // $FF: renamed from: b () int
   public final int method_3306() {
      return this.field_4730;
   }

   // $FF: renamed from: c () int
   public final int method_3307() {
      return this.field_4731;
   }

   // $FF: renamed from: d () android.graphics.Bitmap$Config
   public final Bitmap$Config method_3308() {
      return Bitmap$Config.method_2436(nativeConfig(this.field_4727));
   }

   // $FF: renamed from: a (int, int) int
   public int method_3309(int var1, int var2) {
      this.method_3298("Can't call getPixel() on a recycled bitmap");
      this.method_3311(var1, var2);
      return nativeGetPixel(this.field_4727, var1, var2, this.field_4729);
   }

   // $FF: renamed from: a (int[], int, int, int, int, int, int) void
   public void method_3310(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method_3298("Can't call getPixels() on a recycled bitmap");
      if (var6 != 0 && var7 != 0) {
         this.method_3312(var4, var5, var6, var7, var2, var3, var1);
         nativeGetPixels(this.field_4727, var1, var2, var3, var4, var5, var6, var7, this.field_4729);
      }
   }

   // $FF: renamed from: c (int, int) void
   private void method_3311(int var1, int var2) {
      method_3299(var1, var2);
      if (var1 >= this.method_3306()) {
         throw new IllegalArgumentException("x must be < bitmap.width()");
      } else if (var2 >= this.method_3307()) {
         throw new IllegalArgumentException("y must be < bitmap.height()");
      }
   }

   // $FF: renamed from: a (int, int, int, int, int, int, int[]) void
   private void method_3312(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      method_3299(var1, var2);
      if (var3 < 0) {
         throw new IllegalArgumentException("width must be >= 0");
      } else if (var4 < 0) {
         throw new IllegalArgumentException("height must be >= 0");
      } else if (var1 + var3 > this.method_3306()) {
         throw new IllegalArgumentException("x + width must be <= bitmap.width()");
      } else if (var2 + var4 > this.method_3307()) {
         throw new IllegalArgumentException("y + height must be <= bitmap.height()");
      } else if (Math.abs(var6) < var3) {
         throw new IllegalArgumentException("abs(stride) must be >= width");
      } else {
         int var8 = var5 + (var4 - 1) * var6;
         int var9 = var7.length;
         if (var5 < 0 || var5 + var3 > var9 || var8 < 0 || var8 + var3 > var9) {
            throw new ArrayIndexOutOfBoundsException();
         }
      }
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_3313(int var1, int var2, int var3) {
      this.method_3298("Can't call setPixel() on a recycled bitmap");
      if (!this.method_3305()) {
         throw new IllegalStateException();
      } else {
         this.method_3311(var1, var2);
         nativeSetPixel(this.field_4727, var1, var2, var3, this.field_4729);
      }
   }

   // $FF: renamed from: b (int[], int, int, int, int, int, int) void
   public void method_3314(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method_3298("Can't call setPixels() on a recycled bitmap");
      if (!this.method_3305()) {
         throw new IllegalStateException();
      } else if (var6 != 0 && var7 != 0) {
         this.method_3312(var4, var5, var6, var7, var2, var3, var1);
         nativeSetPixels(this.field_4727, var1, var2, var3, var4, var5, var6, var7, this.field_4729);
      }
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      this.method_3298("Can't parcel a recycled bitmap");
      if (!nativeWriteToParcel(this.field_4727, this.field_4728, this.field_4733, var1)) {
         throw new RuntimeException("native writeToParcel failed");
      }
   }

   // $FF: renamed from: e () void
   public void method_3315() {
      nativePrepareToDraw(this.field_4727);
   }

   private static native Bitmap nativeCreate(int[] var0, int var1, int var2, int var3, int var4, int var5, boolean var6);

   private static native Bitmap nativeCopy(int var0, int var1, boolean var2);

   private static native boolean nativeCompress(int var0, int var1, int var2, OutputStream var3, byte[] var4);

   private static native void nativeErase(int var0, int var1);

   private static native int nativeConfig(int var0);

   private static native int nativeGetPixel(int var0, int var1, int var2, boolean var3);

   private static native void nativeGetPixels(int var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8);

   private static native void nativeSetPixel(int var0, int var1, int var2, int var3, boolean var4);

   private static native void nativeSetPixels(int var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8);

   private static native Bitmap nativeCreateFromParcel(Parcel var0);

   private static native boolean nativeWriteToParcel(int var0, boolean var1, int var2, Parcel var3);

   private static native void nativePrepareToDraw(int var0);

   private static native void nativeSetHasAlpha(int var0, boolean var1);

   // $FF: renamed from: a (android.os.Parcel) android.graphics.Bitmap
   // $FF: synthetic method
   static Bitmap method_3316(Parcel var0) {
      return nativeCreateFromParcel(var0);
   }
}
