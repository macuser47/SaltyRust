package android.content.res;

import java.io.InputStream;

public final class AssetManager$AssetInputStream extends InputStream {
   // $FF: renamed from: b int
   private int field_1856;
   // $FF: renamed from: c long
   private long field_1857;
   // $FF: renamed from: d long
   private long field_1858;
   // $FF: renamed from: a android.content.res.AssetManager
   // $FF: synthetic field
   final AssetManager field_1859;

   public final int read() {
      return AssetManager.method_3285(this.field_1859, this.field_1856);
   }

   public final boolean markSupported() {
      return true;
   }

   public final int available() {
      long var1 = AssetManager.method_3286(this.field_1859, this.field_1856);
      return var1 > 2147483647L ? Integer.MAX_VALUE : (int)var1;
   }

   public final void close() {
      synchronized(this.field_1859) {
         if (this.field_1856 != 0) {
            AssetManager.method_3287(this.field_1859, this.field_1856);
            this.field_1856 = 0;
            AssetManager.method_3288(this.field_1859, this.hashCode());
         }

      }
   }

   public final void mark(int var1) {
      this.field_1858 = AssetManager.method_3289(this.field_1859, this.field_1856, 0L, 0);
   }

   public final void reset() {
      AssetManager.method_3289(this.field_1859, this.field_1856, this.field_1858, -1);
   }

   public final int read(byte[] var1) {
      return AssetManager.method_3290(this.field_1859, this.field_1856, var1, 0, var1.length);
   }

   public final int read(byte[] var1, int var2, int var3) {
      return AssetManager.method_3290(this.field_1859, this.field_1856, var1, var2, var3);
   }

   public final long skip(long var1) {
      long var3 = AssetManager.method_3289(this.field_1859, this.field_1856, 0L, 0);
      if (var3 + var1 > this.field_1857) {
         var1 = this.field_1857 - var3;
      }

      if (var1 > 0L) {
         AssetManager.method_3289(this.field_1859, this.field_1856, var1, 0);
      }

      return var1;
   }

   protected void finalize() {
      this.close();
   }
}
