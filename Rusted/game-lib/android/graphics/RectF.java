package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class RectF implements Parcelable {
   // $FF: renamed from: a float
   public float field_2416;
   // $FF: renamed from: b float
   public float field_2417;
   // $FF: renamed from: c float
   public float field_2418;
   // $FF: renamed from: d float
   public float field_2419;
   // $FF: renamed from: e android.os.Parcelable.Creator
   public static final Creator field_2420 = new RectF$1();

   public RectF() {
   }

   public RectF(float var1, float var2, float var3, float var4) {
      this.field_2416 = var1;
      this.field_2417 = var2;
      this.field_2418 = var3;
      this.field_2419 = var4;
   }

   public RectF(RectF var1) {
      this.field_2416 = var1.field_2416;
      this.field_2417 = var1.field_2417;
      this.field_2418 = var1.field_2418;
      this.field_2419 = var1.field_2419;
   }

   public String toString() {
      return "RectF(" + this.field_2416 + ", " + this.field_2417 + ", " + this.field_2418 + ", " + this.field_2419 + ")";
   }

   // $FF: renamed from: a () boolean
   public final boolean method_1963() {
      return this.field_2416 >= this.field_2418 || this.field_2417 >= this.field_2419;
   }

   // $FF: renamed from: b () float
   public final float method_1964() {
      return this.field_2418 - this.field_2416;
   }

   // $FF: renamed from: c () float
   public final float method_1965() {
      return this.field_2419 - this.field_2417;
   }

   // $FF: renamed from: d () float
   public final float method_1966() {
      return (this.field_2416 + this.field_2418) * 0.5F;
   }

   // $FF: renamed from: e () float
   public final float method_1967() {
      return (this.field_2417 + this.field_2419) * 0.5F;
   }

   // $FF: renamed from: f () void
   public void method_1968() {
      this.field_2416 = this.field_2418 = this.field_2417 = this.field_2419 = 0.0F;
   }

   // $FF: renamed from: a (float, float, float, float) void
   public void method_1969(float var1, float var2, float var3, float var4) {
      this.field_2416 = var1;
      this.field_2417 = var2;
      this.field_2418 = var3;
      this.field_2419 = var4;
   }

   // $FF: renamed from: a (android.graphics.RectF) void
   public void method_1970(RectF var1) {
      this.field_2416 = var1.field_2416;
      this.field_2417 = var1.field_2417;
      this.field_2418 = var1.field_2418;
      this.field_2419 = var1.field_2419;
   }

   // $FF: renamed from: a (android.graphics.Rect) void
   public void method_1971(Rect var1) {
      this.field_2416 = (float)var1.field_2352;
      this.field_2417 = (float)var1.field_2353;
      this.field_2418 = (float)var1.field_2354;
      this.field_2419 = (float)var1.field_2355;
   }

   // $FF: renamed from: a (float, float) void
   public void method_1972(float var1, float var2) {
      this.field_2416 += var1;
      this.field_2417 += var2;
      this.field_2418 += var1;
      this.field_2419 += var2;
   }

   // $FF: renamed from: b (float, float) boolean
   public boolean method_1973(float var1, float var2) {
      return this.field_2416 < this.field_2418 && this.field_2417 < this.field_2419 && var1 >= this.field_2416 && var1 < this.field_2418 && var2 >= this.field_2417 && var2 < this.field_2419;
   }

   // $FF: renamed from: b (float, float, float, float) boolean
   public boolean method_1974(float var1, float var2, float var3, float var4) {
      if (this.field_2416 < var3 && var1 < this.field_2418 && this.field_2417 < var4 && var2 < this.field_2419) {
         if (this.field_2416 < var1) {
            this.field_2416 = var1;
         }

         if (this.field_2417 < var2) {
            this.field_2417 = var2;
         }

         if (this.field_2418 > var3) {
            this.field_2418 = var3;
         }

         if (this.field_2419 > var4) {
            this.field_2419 = var4;
         }

         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: b (android.graphics.RectF) boolean
   public boolean method_1975(RectF var1) {
      return this.method_1974(var1.field_2416, var1.field_2417, var1.field_2418, var1.field_2419);
   }

   // $FF: renamed from: a (android.graphics.RectF, android.graphics.RectF) boolean
   public static boolean method_1976(RectF var0, RectF var1) {
      return var0.field_2416 < var1.field_2418 && var1.field_2416 < var0.field_2418 && var0.field_2417 < var1.field_2419 && var1.field_2417 < var0.field_2419;
   }

   // $FF: renamed from: c (float, float) void
   public void method_1977(float var1, float var2) {
      if (var1 < this.field_2416) {
         this.field_2416 = var1;
      } else if (var1 > this.field_2418) {
         this.field_2418 = var1;
      }

      if (var2 < this.field_2417) {
         this.field_2417 = var2;
      } else if (var2 > this.field_2419) {
         this.field_2419 = var2;
      }

   }

   // $FF: renamed from: g () void
   public void method_1978() {
      float var1;
      if (this.field_2416 > this.field_2418) {
         var1 = this.field_2416;
         this.field_2416 = this.field_2418;
         this.field_2418 = var1;
      }

      if (this.field_2417 > this.field_2419) {
         var1 = this.field_2417;
         this.field_2417 = this.field_2419;
         this.field_2419 = var1;
      }

   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeFloat(this.field_2416);
      var1.writeFloat(this.field_2417);
      var1.writeFloat(this.field_2418);
      var1.writeFloat(this.field_2419);
   }

   // $FF: renamed from: a (android.os.Parcel) void
   public void method_1979(Parcel var1) {
      this.field_2416 = var1.readFloat();
      this.field_2417 = var1.readFloat();
      this.field_2418 = var1.readFloat();
      this.field_2419 = var1.readFloat();
   }
}
