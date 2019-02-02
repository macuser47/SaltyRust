package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ContextWrapper extends Context {
   // $FF: renamed from: a android.content.Context
   Context field_2325;

   public ContextWrapper(Context var1) {
      this.field_2325 = var1;
   }

   // $FF: renamed from: i () android.content.Context
   public Context method_1863() {
      return this.field_2325;
   }

   // $FF: renamed from: d () android.content.res.AssetManager
   public AssetManager method_1853() {
      return this.field_2325.method_1853();
   }

   // $FF: renamed from: e () android.content.res.Resources
   public Resources method_1854() {
      return this.field_2325.method_1854();
   }

   // $FF: renamed from: f () android.content.pm.PackageManager
   public PackageManager method_1855() {
      return this.field_2325.method_1855();
   }

   // $FF: renamed from: g () android.content.Context
   public Context method_1856() {
      return this.field_2325.method_1856();
   }

   // $FF: renamed from: h () java.lang.String
   public String method_1857() {
      return this.field_2325.method_1857();
   }

   // $FF: renamed from: a (java.lang.String, int) android.content.SharedPreferences
   public SharedPreferences method_1858(String var1, int var2) {
      return this.field_2325.method_1858(var1, var2);
   }

   // $FF: renamed from: a (java.lang.String) java.io.FileInputStream
   public FileInputStream method_1859(String var1) {
      return this.field_2325.method_1859(var1);
   }

   // $FF: renamed from: b (java.lang.String, int) java.io.FileOutputStream
   public FileOutputStream method_1860(String var1, int var2) {
      return this.field_2325.method_1860(var1, var2);
   }

   // $FF: renamed from: a (android.content.Intent) void
   public void method_1861(Intent var1) {
      this.field_2325.method_1861(var1);
   }

   // $FF: renamed from: b (java.lang.String) java.lang.Object
   public Object method_1862(String var1) {
      return this.field_2325.method_1862(var1);
   }
}
