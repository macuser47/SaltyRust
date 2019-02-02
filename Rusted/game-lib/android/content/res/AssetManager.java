package android.content.res;

import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class AssetManager {
   // $FF: renamed from: b java.lang.Object
   private static final Object field_4711 = new Object();
   // $FF: renamed from: a android.content.res.AssetManager
   static AssetManager field_4712 = null;
   // $FF: renamed from: c long[]
   private final long[] field_4713 = new long[2];
   // $FF: renamed from: d int
   private int field_4714 = 1;
   // $FF: renamed from: e boolean
   private boolean field_4715 = true;

   // $FF: renamed from: a (java.lang.String) java.io.InputStream
   public final InputStream method_3279(String var1) {
      return this.method_3280(var1, 2);
   }

   // $FF: renamed from: a (java.lang.String, int) java.io.InputStream
   public final InputStream method_3280(String var1, int var2) {
      synchronized(this) {
         if (!this.field_4715) {
            throw new RuntimeException("Assetmanager has been closed");
         } else {
            return new FileInputStream("assets/" + var1);
         }
      }
   }

   // $FF: renamed from: b (java.lang.String) android.content.res.AssetFileDescriptor
   public final AssetFileDescriptor method_3281(String var1) {
      synchronized(this) {
         if (!this.field_4715) {
            throw new RuntimeException("Assetmanager has been closed");
         }

         ParcelFileDescriptor var3 = this.openAssetFd(var1, this.field_4713);
         if (var3 != null) {
            return new AssetFileDescriptor(var3, this.field_4713[0], this.field_4713[1]);
         }
      }

      throw new FileNotFoundException("Asset file: " + var1);
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String[]
   public final String[] method_3282(String var1) {
      return new String[0];
   }

   protected void finalize() {
      try {
         this.method_3283();
      } finally {
         super.finalize();
      }

   }

   private final native ParcelFileDescriptor openAssetFd(String var1, long[] var2);

   private final native void destroyAsset(int var1);

   private final native int readAssetChar(int var1);

   private final native int readAsset(int var1, byte[] var2, int var3, int var4);

   private final native long seekAsset(int var1, long var2, int var4);

   private final native long getAssetRemainingLength(int var1);

   // $FF: renamed from: a () void
   private final void method_3283() {
   }

   // $FF: renamed from: a (int) void
   private final void method_3284(int var1) {
      --this.field_4714;
      if (this.field_4714 == 0) {
         this.method_3283();
      }

   }

   // $FF: renamed from: a (android.content.res.AssetManager, int) int
   // $FF: synthetic method
   static int method_3285(AssetManager var0, int var1) {
      return var0.readAssetChar(var1);
   }

   // $FF: renamed from: b (android.content.res.AssetManager, int) long
   // $FF: synthetic method
   static long method_3286(AssetManager var0, int var1) {
      return var0.getAssetRemainingLength(var1);
   }

   // $FF: renamed from: c (android.content.res.AssetManager, int) void
   // $FF: synthetic method
   static void method_3287(AssetManager var0, int var1) {
      var0.destroyAsset(var1);
   }

   // $FF: renamed from: d (android.content.res.AssetManager, int) void
   // $FF: synthetic method
   static void method_3288(AssetManager var0, int var1) {
      var0.method_3284(var1);
   }

   // $FF: renamed from: a (android.content.res.AssetManager, int, long, int) long
   // $FF: synthetic method
   static long method_3289(AssetManager var0, int var1, long var2, int var4) {
      return var0.seekAsset(var1, var2, var4);
   }

   // $FF: renamed from: a (android.content.res.AssetManager, int, byte[], int, int) int
   // $FF: synthetic method
   static int method_3290(AssetManager var0, int var1, byte[] var2, int var3, int var4) {
      return var0.readAsset(var1, var2, var3, var4);
   }
}
