package com.corrodinggames.rts.gameFramework.d;

import android.os.Build.VERSION;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.utility.class_196;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.d.a
public final class class_432 {
   // $FF: renamed from: a java.util.ResourceBundle
   static ResourceBundle field_3650;
   // $FF: renamed from: b boolean
   static boolean field_3651;
   // $FF: renamed from: c int
   public static int field_3652 = 0;
   // $FF: renamed from: d java.util.regex.Pattern
   static Pattern field_3653 = Pattern.compile("(.*)(\\(.*\\))");

   // $FF: renamed from: a () void
   public static strictfp void method_2733() {
      method_2740();
   }

   // $FF: renamed from: b () java.util.ResourceBundle
   static strictfp ResourceBundle method_2734() {
      if (field_3650 == null) {
         method_2740();
      }

      return field_3650;
   }

   // $FF: renamed from: a (java.lang.String) java.util.PropertyResourceBundle
   static strictfp PropertyResourceBundle method_2735(String var0) {
      class_196 var1 = class_296.method_2080("translations/" + var0);
      if (var1 == null) {
         return null;
      } else {
         PropertyResourceBundle var2 = null;

         try {
            var2 = new PropertyResourceBundle(new InputStreamReader(var1, "UTF-8"));
         } catch (UnsupportedEncodingException var4) {
            var4.printStackTrace();
         } catch (IOException var5) {
            var5.printStackTrace();
         }

         return var2;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.util.Locale, boolean, boolean) java.lang.String
   public static strictfp String method_2736(String var0, Locale var1, boolean var2, boolean var3) {
      if (var1 == Locale.ROOT) {
         return var0;
      } else {
         String var4 = var1.getLanguage();
         String var5;
         if (var2) {
            var5 = var1.getCountry();
         } else {
            var5 = "";
         }

         String var6;
         if (var3) {
            var6 = var1.getVariant();
         } else {
            var6 = "";
         }

         if (var4.equals("") && var5.equals("") && var6.equals("")) {
            return var0;
         } else {
            StringBuilder var7 = new StringBuilder(var0);
            var7.append('_');
            if (!var6.equals("")) {
               var7.append(var4).append('_').append(var5.toLowerCase(Locale.ROOT)).append('_').append(var6.toLowerCase(Locale.ROOT));
            } else if (!var5.equals("")) {
               var7.append(var4).append('_').append(var5.toLowerCase(Locale.ROOT));
            } else {
               var7.append(var4);
            }

            return var7.toString();
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, java.util.Locale) java.util.ResourceBundle
   static strictfp ResourceBundle method_2737(String var0, Locale var1) {
      String var2 = method_2736(var0, Locale.ROOT, false, false) + ".properties";
      PropertyResourceBundle var3 = method_2735(var2);
      if (var3 == null) {
         throw new RuntimeException("Root locate file:" + var2 + " is missing, it is required");
      } else {
         boolean var4 = Locale.ROOT.equals(var1);
         if (var4) {
            class_236.method_1591("Locale: Using " + var2 + " as locale");
            return var3;
         } else {
            String var5 = method_2736(var0, var1, true, true) + ".properties";
            PropertyResourceBundle var6 = method_2735(var5);
            if (var6 == null) {
               class_236.method_1591("Locale: No locale for " + var5 + " checking locale without variant ");
               var5 = method_2736(var0, var1, true, false) + ".properties";
               var6 = method_2735(var5);
               if (var6 == null) {
                  class_236.method_1591("Locale: No locale for " + var5 + " checking locale without variant or country");
                  var5 = method_2736(var0, var1, false, false) + ".properties";
                  var6 = method_2735(var5);
                  if (var6 == null) {
                     class_236.method_1591("Locale: No locale for " + var5 + " using base locale");
                     return var3;
                  }
               }
            }

            class_236.method_1591("Locale: Using " + var5 + " as locale");
            return new class_433(var6, var3);
         }
      }
   }

   // $FF: renamed from: c () java.lang.String
   public static strictfp String method_2738() {
      return method_2739().getLanguage();
   }

   // $FF: renamed from: d () java.util.Locale
   public static strictfp Locale method_2739() {
      class_236 var0 = class_236.method_1549();
      SettingsEngine var1 = null;
      if (var0 != null) {
         var1 = var0.field_1937;
      }

      boolean var2 = false;
      if (var1 != null && var1.forceEnglish) {
         var2 = true;
      }

      return var2 ? Locale.ROOT : Locale.getDefault();
   }

   // $FF: renamed from: e () void
   public static strictfp synchronized void method_2740() {
      ++field_3652;
      class_236 var0 = class_236.method_1549();
      SettingsEngine var1 = null;
      if (var0 != null) {
         var1 = var0.field_1937;
      }

      boolean var2 = false;
      if (var1 != null && var1.forceEnglish) {
         var2 = true;
      }

      if (field_3650 != null && field_3651 == var2) {
         class_236.method_1591("Locale.reload: skipping reload");
      }

      if (VERSION.SDK_INT >= 9) {
         ResourceBundle.clearCache();
      }

      if (var2) {
         field_3650 = method_2737("Strings", Locale.ROOT);
      } else {
         field_3650 = method_2737("Strings", Locale.getDefault());
      }

      field_3651 = var2;
      boolean var3 = false;
      if (var3) {
      }

   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   private static final strictfp String method_2741(String var0) {
      String var1 = method_2734().getString(var0);
      var1 = var1.replace("[[", "{{");
      var1 = var1.replace("]]", "}}");
      var1 = var1.replace("[", "{{");
      var1 = var1.replace("]", "}}");
      var1 = var1.replace("}}  {{", "}}{{");
      var1 = var1.replace("}} {{", "}}{{");
      var1 = var1.replace("}}{{", "\n-");
      var1 = var1.replace("{{", "-");
      var1 = var1.replace("}}", "");
      return var1;
   }

   // $FF: renamed from: d (java.lang.String) boolean
   private static final strictfp boolean method_2742(String var0) {
      try {
         method_2734().getString(var0);
         return true;
      } catch (MissingResourceException var2) {
         return false;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.Object[]) java.lang.String
   public static final strictfp String method_2743(String var0, String var1, Object... var2) {
      try {
         return method_2744(var0, var2);
      } catch (MissingResourceException var4) {
         return var1;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Object[]) java.lang.String
   public static final strictfp String method_2744(String var0, Object... var1) {
      String var2 = method_2741(var0);
      if (var1.length == 0) {
         return var2;
      } else {
         String var3 = (new MessageFormat(var2)).format(var1, new StringBuffer(), (FieldPosition)null).toString();
         return var3;
      }
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static final strictfp String method_2745(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String var1 = var0;
         String var2 = null;
         Matcher var3 = field_3653.matcher(var0);
         if (var3.matches()) {
            var1 = var3.group(1);
            var2 = var3.group(2);
         }

         var1 = var1.trim();
         var1 = var1.replace(" ", "_");
         var1 = var1.replace(".tmx", "");
         var1 = var1.toLowerCase(Locale.ENGLISH);
         String var4 = "maps.name." + var1;
         if (method_2742(var4)) {
            String var5 = method_2744(var4);
            if (var2 != null) {
               var5 = var5 + var2;
            }

            class_236.method_1591("translated:" + var5);
            if (var5 != null) {
               var5 = var5.replace("_", " ");
            }

            return var5;
         } else {
            return var0;
         }
      }
   }
}
