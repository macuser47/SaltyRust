package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public abstract class Context {
   // $FF: renamed from: d () android.content.res.AssetManager
   public abstract AssetManager method_1853();

   // $FF: renamed from: e () android.content.res.Resources
   public abstract Resources method_1854();

   // $FF: renamed from: f () android.content.pm.PackageManager
   public abstract PackageManager method_1855();

   // $FF: renamed from: g () android.content.Context
   public abstract Context method_1856();

   // $FF: renamed from: h () java.lang.String
   public abstract String method_1857();

   // $FF: renamed from: a (java.lang.String, int) android.content.SharedPreferences
   public abstract SharedPreferences method_1858(String var1, int var2);

   // $FF: renamed from: a (java.lang.String) java.io.FileInputStream
   public abstract FileInputStream method_1859(String var1);

   // $FF: renamed from: b (java.lang.String, int) java.io.FileOutputStream
   public abstract FileOutputStream method_1860(String var1, int var2);

   // $FF: renamed from: a (android.content.Intent) void
   public abstract void method_1861(Intent var1);

   // $FF: renamed from: b (java.lang.String) java.lang.Object
   public abstract Object method_1862(String var1);
}
