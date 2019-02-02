package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ServerContext extends Context {
   // $FF: renamed from: a android.content.res.AssetManager
   AssetManager field_2324 = new AssetManager();

   // $FF: renamed from: d () android.content.res.AssetManager
   public AssetManager method_1853() {
      return this.field_2324;
   }

   // $FF: renamed from: e () android.content.res.Resources
   public Resources method_1854() {
      return null;
   }

   // $FF: renamed from: f () android.content.pm.PackageManager
   public PackageManager method_1855() {
      return null;
   }

   // $FF: renamed from: g () android.content.Context
   public Context method_1856() {
      return this;
   }

   // $FF: renamed from: h () java.lang.String
   public String method_1857() {
      return null;
   }

   // $FF: renamed from: a (java.lang.String, int) android.content.SharedPreferences
   public SharedPreferences method_1858(String var1, int var2) {
      return null;
   }

   // $FF: renamed from: a (java.lang.String) java.io.FileInputStream
   public FileInputStream method_1859(String var1) {
      return null;
   }

   // $FF: renamed from: b (java.lang.String, int) java.io.FileOutputStream
   public FileOutputStream method_1860(String var1, int var2) {
      return null;
   }

   // $FF: renamed from: a (android.content.Intent) void
   public void method_1861(Intent var1) {
   }

   // $FF: renamed from: b (java.lang.String) java.lang.Object
   public Object method_1862(String var1) {
      return null;
   }
}
