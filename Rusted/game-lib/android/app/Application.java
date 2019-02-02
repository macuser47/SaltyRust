package android.app;

import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import java.util.ArrayList;

public class Application extends ContextWrapper implements ComponentCallbacks2 {
   // $FF: renamed from: b java.util.ArrayList
   private ArrayList field_2326 = new ArrayList();
   // $FF: renamed from: c java.util.ArrayList
   private ArrayList field_2327 = new ArrayList();
   // $FF: renamed from: d java.util.ArrayList
   private ArrayList field_2328 = null;

   public Application() {
      super((Context)null);
   }

   public void onConfigurationChanged(Configuration var1) {
      Object[] var2 = this.method_1864();
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            ((ComponentCallbacks)var2[var3]).onConfigurationChanged(var1);
         }
      }

   }

   public void onLowMemory() {
      Object[] var1 = this.method_1864();
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            ((ComponentCallbacks)var1[var2]).onLowMemory();
         }
      }

   }

   public void onTrimMemory(int var1) {
      Object[] var2 = this.method_1864();
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            Object var4 = var2[var3];
            if (var4 instanceof ComponentCallbacks2) {
               ((ComponentCallbacks2)var4).onTrimMemory(var1);
            }
         }
      }

   }

   // $FF: renamed from: a () java.lang.Object[]
   private Object[] method_1864() {
      Object[] var1 = null;
      synchronized(this.field_2326) {
         if (this.field_2326.size() > 0) {
            var1 = this.field_2326.toArray();
         }

         return var1;
      }
   }
}
