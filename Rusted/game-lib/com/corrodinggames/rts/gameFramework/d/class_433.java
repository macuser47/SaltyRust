package com.corrodinggames.rts.gameFramework.d;

import com.corrodinggames.rts.gameFramework.class_236;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Vector;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.d.b
class class_433 extends ResourceBundle {
   // $FF: renamed from: a java.util.ResourceBundle
   ResourceBundle field_3654;
   // $FF: renamed from: b java.util.ResourceBundle
   ResourceBundle field_3655;

   public strictfp class_433(ResourceBundle var1, ResourceBundle var2) {
      this.field_3654 = var1;
      this.field_3655 = var2;
   }

   public strictfp Enumeration getKeys() {
      class_236.method_1591("MultipleResourceBundle: Slow get keys");
      Vector var1 = new Vector();
      var1.addAll(Collections.list(this.field_3654.getKeys()));
      if (this.field_3655 != null) {
         Iterator var2 = Collections.list(this.field_3655.getKeys()).iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            if (!var1.contains(var3)) {
               var1.add(var3);
            }
         }
      }

      return var1.elements();
   }

   protected strictfp Object handleGetObject(String var1) {
      Object var2;
      try {
         var2 = this.field_3654.getObject(var1);
      } catch (MissingResourceException var5) {
         var2 = null;
      }

      if (var2 == null && this.field_3655 != null) {
         try {
            var2 = this.field_3655.getObject(var1);
         } catch (MissingResourceException var4) {
            var2 = null;
         }
      }

      return var2;
   }
}
