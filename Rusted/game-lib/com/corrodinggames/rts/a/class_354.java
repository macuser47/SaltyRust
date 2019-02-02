package com.corrodinggames.rts.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $FF: renamed from: com.corrodinggames.rts.a.o
class class_354 implements Comparator {
   // $FF: renamed from: a java.util.regex.Pattern
   Pattern field_2789 = Pattern.compile(".*\\((.*)\\).*");

   // $FF: renamed from: a (java.lang.String, java.lang.String) int
   public int method_2301(String var1, String var2) {
      Date var3 = this.method_2302(var1);
      Date var4 = this.method_2302(var2);
      if (var3 == null && var4 == null) {
         return var1.compareTo(var2);
      } else if (var3 != null && var4 != null) {
         return var4.compareTo(var3);
      } else if (var3 == null && var4 != null) {
         return -1;
      } else {
         return var3 != null && var4 == null ? 1 : 0;
      }
   }

   // $FF: renamed from: a (java.lang.String) java.util.Date
   public Date method_2302(String var1) {
      Matcher var2 = this.field_2789.matcher(var1);
      if (var2.matches()) {
         String var3 = var2.group(1);

         try {
            return (new SimpleDateFormat("d MMM yyyy HH.mm.ss", Locale.ENGLISH)).parse(var3);
         } catch (ParseException var8) {
            try {
               return (new SimpleDateFormat("d MMM yyyy HH:mm:ss", Locale.ENGLISH)).parse(var3);
            } catch (ParseException var7) {
               try {
                  return (new SimpleDateFormat("d MMM yyyy HH_mm_ss", Locale.ENGLISH)).parse(var3);
               } catch (ParseException var6) {
                  try {
                     return (new SimpleDateFormat("d MMM yyyy HH-mm-ss", Locale.ENGLISH)).parse(var3);
                  } catch (ParseException var5) {
                  }
               }
            }
         }
      }

      return null;
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_2301((String)var1, (String)var2);
   }
}
