package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.class_236;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.z
public class class_210 {
   // $FF: renamed from: e java.util.regex.Pattern
   private Pattern field_1714 = Pattern.compile("\\s*\\[([^]]*)\\]\\s*");
   // $FF: renamed from: f java.util.regex.Pattern
   private Pattern field_1715 = Pattern.compile("\\s*([^=:]*)(?:=|:)(.*)");
   // $FF: renamed from: g java.util.LinkedHashMap
   private LinkedHashMap field_1716 = new LinkedHashMap();
   // $FF: renamed from: a java.lang.String
   String field_1717 = "ini";
   // $FF: renamed from: b boolean
   boolean field_1718 = true;
   // $FF: renamed from: c java.util.LinkedHashSet
   LinkedHashSet field_1719 = new LinkedHashSet();
   // $FF: renamed from: d java.util.LinkedHashSet
   static LinkedHashSet field_1720 = new LinkedHashSet();

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public void method_1383(String var1, String var2) {
      this.method_1384(var1, var2, "Unknown");
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) void
   public void method_1384(String var1, String var2, String var3) {
      if (this.field_1718) {
         this.field_1719.add(var1 + ":" + var2);
         field_1720.add(var1 + ":" + var2 + ":" + var3);
      }

   }

   // $FF: renamed from: a () void
   public void method_1385() {
      if (!this.field_1718) {
         throw new RuntimeException("Not tracking reads");
      } else {
         Iterator var1 = this.field_1716.keySet().iterator();

         while(var1.hasNext()) {
            String var2 = (String)var1.next();
            Map var3 = (Map)this.field_1716.get(var2);
            Iterator var4 = var3.keySet().iterator();

            while(var4.hasNext()) {
               String var5 = (String)var4.next();
               String var6 = var2 + ":" + var5;
               if (!this.field_1719.contains(var6)) {
                  throw new RuntimeException(this.field_1717 + ": Key in conf was not used:" + var5 + " in section: " + var2);
               }
            }
         }

      }
   }

   // $FF: renamed from: b () int
   public int method_1386() {
      try {
         MessageDigest var1 = MessageDigest.getInstance("MD5");
         Iterator var2 = this.field_1716.keySet().iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            Map var4 = (Map)this.field_1716.get(var3);
            Iterator var5 = var4.keySet().iterator();

            while(var5.hasNext()) {
               String var6 = (String)var5.next();
               String var7 = var3 + ":" + var6 + ":" + (String)var4.get(var6);
               byte[] var8 = var7.getBytes("UTF-8");
               var1.update(var8);
            }
         }

         byte[] var11 = var1.digest();
         BigInteger var12 = new BigInteger(1, var11);
         return var12.intValue();
      } catch (UnsupportedEncodingException var9) {
         throw new RuntimeException(var9);
      } catch (NoSuchAlgorithmException var10) {
         throw new RuntimeException(var10);
      }
   }

   public class_210(String var1) {
      this.field_1717 = var1;
      this.method_1387(var1);
   }

   public class_210(InputStream var1, String var2) {
      this.field_1717 = var2;
      this.method_1388(var1);
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_1387(String var1) {
      BufferedReader var2 = new BufferedReader(new FileReader(var1));
      this.method_1389(var2);
   }

   // $FF: renamed from: a (java.io.InputStream) void
   public void method_1388(InputStream var1) {
      BufferedReader var2 = new BufferedReader(new InputStreamReader(var1, "UTF-8"));
      this.method_1389(var2);
   }

   // $FF: renamed from: a (java.io.BufferedReader) void
   public void method_1389(BufferedReader var1) {
      try {
         String var3 = null;

         String var2;
         while((var2 = var1.readLine()) != null) {
            if (!var2.trim().startsWith("#") && var2.trim().length() != 0) {
               Matcher var4 = this.field_1714.matcher(var2);
               if (var4.matches()) {
                  var3 = var4.group(1).trim();
               } else if (var3 != null) {
                  var4 = this.field_1715.matcher(var2);
                  if (var4.matches()) {
                     String var5 = var4.group(1).trim();
                     String var6 = var4.group(2).trim();
                     LinkedHashMap var7 = (LinkedHashMap)this.field_1716.get(var3);
                     if (var7 == null) {
                        this.field_1716.put(var3, var7 = new LinkedHashMap());
                     }

                     var7.put(var5, var6);
                  } else {
                     class_236.method_1591("Unexpect format:'" + var2 + "' in ini file");
                  }
               } else {
                  class_236.method_1591("IniFile: Skipping:'" + var2);
               }
            }
         }
      } finally {
         var1.close();
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.Boolean) java.lang.Boolean
   public Boolean method_1390(String var1, String var2, Boolean var3) {
      String var4 = this.method_1393(var1, var2, (String)null);
      if (var4 == null) {
         return var3;
      } else if (var4.equalsIgnoreCase("true")) {
         return true;
      } else if (var4.equalsIgnoreCase("false")) {
         return false;
      } else if (var4.equalsIgnoreCase("1")) {
         return true;
      } else if (var4.equalsIgnoreCase("0")) {
         return false;
      } else {
         throw new RuntimeException(var2 + ": unexpected boolean value:'" + var4 + "' in section:" + var1);
      }
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) boolean
   public boolean method_1391(String var1, String var2) {
      Boolean var3 = this.method_1390(var1, var2, (Boolean)null);
      if (var3 == null) {
         throw new RuntimeException("Could not find " + var2 + " in configuration file in section:" + var1);
      } else {
         return var3;
      }
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String) java.lang.String
   public String method_1392(String var1, String var2) {
      String var3 = this.method_1393(var1, var2, (String)null);
      if (var3 == null) {
         throw new RuntimeException("Could not find " + var2 + " in configuration file under:" + var1);
      } else {
         return var3;
      }
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String, java.lang.String) java.lang.String
   public String method_1393(String var1, String var2, String var3) {
      this.method_1383(var1, var2);
      Map var4 = (Map)this.field_1716.get(var1);
      if (var4 == null) {
         return var3;
      } else {
         String var5 = (String)var4.get(var2);
         return var5 == null ? var3 : var5;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.Integer) java.lang.Integer
   public Integer method_1394(String var1, String var2, Integer var3) {
      String var4 = this.method_1393(var1, var2, (String)null);
      return var4 == null ? var3 : Color.method_3078(var4);
   }

   // $FF: renamed from: d (java.lang.String, java.lang.String) int
   public int method_1395(String var1, String var2) {
      this.method_1383(var1, var2);
      Map var3 = (Map)this.field_1716.get(var1);
      if (var3 == null) {
         throw new RuntimeException("Could not find section:" + var1 + " in configuration file ");
      } else {
         String var4 = (String)var3.get(var2);
         if (var4 == null) {
            throw new RuntimeException("Could not find section:" + var2 + " in configuration file ");
         } else {
            try {
               return Integer.parseInt(var4);
            } catch (NumberFormatException var6) {
               throw new RuntimeException("Failed to read int:" + var4 + " in key:" + var2 + " section:" + var1);
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.Short) java.lang.Short
   public Short method_1396(String var1, String var2, Short var3) {
      this.method_1383(var1, var2);
      Map var4 = (Map)this.field_1716.get(var1);
      if (var4 == null) {
         return var3;
      } else {
         String var5 = (String)var4.get(var2);
         if (var5 == null) {
            return var3;
         } else {
            try {
               return Short.parseShort(var5);
            } catch (NumberFormatException var7) {
               throw new RuntimeException("getShort: " + var5 + " is not a number, key:" + var2);
            }
         }
      }
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String, java.lang.Integer) java.lang.Integer
   public Integer method_1397(String var1, String var2, Integer var3) {
      this.method_1384(var1, var2, "int");
      Map var4 = (Map)this.field_1716.get(var1);
      if (var4 == null) {
         return var3;
      } else {
         String var5 = (String)var4.get(var2);
         if (var5 == null) {
            return var3;
         } else {
            try {
               return Integer.parseInt(var5);
            } catch (NumberFormatException var7) {
               throw new RuntimeException("getInt: " + var5 + " is not a number, key:" + var2);
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.Float) java.lang.Float
   public Float method_1398(String var1, String var2, Float var3) {
      this.method_1384(var1, var2, "float");
      Map var4 = (Map)this.field_1716.get(var1);
      if (var4 == null) {
         return var3;
      } else {
         String var5 = (String)var4.get(var2);
         if (var5 == null) {
            return var3;
         } else {
            try {
               return Float.parseFloat(var5);
            } catch (NumberFormatException var7) {
               throw new RuntimeException("Failed to read float:" + var5 + " in key:" + var2 + " section:" + var1);
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, android.graphics.PointF) android.graphics.PointF
   public PointF method_1399(String var1, String var2, PointF var3) {
      this.method_1384(var1, var2, "point");
      Map var4 = (Map)this.field_1716.get(var1);
      if (var4 == null) {
         return var3;
      } else {
         String var5 = (String)var4.get(var2);
         if (var5 == null) {
            return var3;
         } else if (var5.equalsIgnoreCase("NONE")) {
            return null;
         } else {
            try {
               String[] var6 = var5.split(",");
               if (var6.length != 2) {
                  throw new NumberFormatException("Got:" + var6.length + " elements expected 2");
               } else {
                  PointF var7 = new PointF();
                  var7.field_2406 = Float.parseFloat(var6[0]);
                  var7.field_2407 = Float.parseFloat(var6[1]);
                  return var7;
               }
            } catch (NumberFormatException var8) {
               throw new RuntimeException("Failed to read point:" + var5 + " in key:" + var2 + " section:" + var1 + " expected format: x,y");
            }
         }
      }
   }

   // $FF: renamed from: e (java.lang.String, java.lang.String) java.lang.Float
   public Float method_1400(String var1, String var2) {
      Float var3 = this.method_1401(var1, var2, (Float)null);
      if (var3 == null) {
         throw new RuntimeException("Could not find key:" + var2 + " in section:" + var1);
      } else {
         return var3;
      }
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String, java.lang.Float) java.lang.Float
   public Float method_1401(String var1, String var2, Float var3) {
      return this.method_1402(var1, var2, var3, false);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.Float, boolean) java.lang.Float
   public Float method_1402(String var1, String var2, Float var3, boolean var4) {
      this.method_1384(var1, var2, "time");
      Map var5 = (Map)this.field_1716.get(var1);
      if (var5 == null) {
         return var3;
      } else {
         String var6 = (String)var5.get(var2);
         if (var6 == null) {
            return var3;
         } else {
            try {
               return this.method_1404(var6, var4);
            } catch (NumberFormatException var8) {
               throw new RuntimeException("Failed to read time:" + var6 + " in key:" + var2 + " section:" + var1 + " expected a float with optional 's' or 'ms' postfix");
            }
         }
      }
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String, java.lang.Float) java.lang.Float
   public Float method_1403(String var1, String var2, Float var3) {
      return this.method_1402(var1, var2, var3, true);
   }

   // $FF: renamed from: a (java.lang.String, boolean) float
   public float method_1404(String var1, boolean var2) {
      float var3 = 1.0F;
      boolean var4 = false;
      if (var1.endsWith("s")) {
         var1 = var1.substring(0, var1.length() - 1);
         var3 = 60.0F;
         var4 = true;
      } else {
         var3 = 1.0F;
      }

      float var5;
      try {
         var5 = Float.parseFloat(var1) * var3;
      } catch (NumberFormatException var7) {
         throw new RuntimeException("Failed to read time:" + var1 + " expected a float with optional 's' postfix");
      }

      if (var2) {
         return var4 ? 1.0F / var5 : var5;
      } else {
         return var5;
      }
   }

   // $FF: renamed from: f (java.lang.String, java.lang.String) float
   public float method_1405(String var1, String var2) {
      this.method_1384(var1, var2, "float");
      Map var3 = (Map)this.field_1716.get(var1);
      if (var3 == null) {
         throw new RuntimeException("Could not find section:" + var1 + " in configuration file required for:" + var2);
      } else {
         String var4 = (String)var3.get(var2);
         if (var4 == null) {
            throw new RuntimeException("Could not find key:" + var2 + " in configuration file in section:" + var1);
         } else {
            return Float.parseFloat(var4);
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, long) long
   public long method_1406(String var1, String var2, long var3) {
      this.method_1384(var1, var2, "long");
      Map var5 = (Map)this.field_1716.get(var1);
      return var5 == null ? var3 : Long.parseLong((String)var5.get(var2));
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.z) void
   public void method_1407(class_210 var1) {
      Iterator var2 = var1.field_1716.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         LinkedHashMap var4 = (LinkedHashMap)var1.field_1716.get(var3);
         LinkedHashMap var5 = (LinkedHashMap)this.field_1716.get(var3);
         if (var5 == null) {
            var5 = new LinkedHashMap();
            this.field_1716.put(var3, var5);
         }

         Iterator var6 = var4.keySet().iterator();

         while(var6.hasNext()) {
            String var7 = (String)var6.next();
            if (var5.get(var7) == null) {
               var5.put(var7, var4.get(var7));
            }
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, android.graphics.Rect) android.graphics.Rect
   public Rect method_1408(String var1, String var2, Rect var3) {
      String var4 = this.method_1393(var1, var2, (String)null);
      if (var4 == null) {
         return var3;
      } else {
         String[] var5 = var4.split(",");
         if (var5.length != 4) {
            throw new RuntimeException("getRect: expected 4 ints, not:" + var5.length);
         } else {
            try {
               return new Rect(Integer.valueOf(var5[0].trim()), Integer.valueOf(var5[1].trim()), Integer.valueOf(var5[2].trim()), Integer.valueOf(var5[3].trim()));
            } catch (NumberFormatException var7) {
               throw new RuntimeException("getRect expected ints got: " + var4);
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.Enum, java.lang.Class) java.lang.Enum
   public Enum method_1409(String var1, String var2, Enum var3, Class var4) {
      String var5 = this.method_1393(var1, var2, (String)null);
      if (var5 == null) {
         return var3;
      } else {
         Object[] var6 = var4.getEnumConstants();
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            Object var9 = var6[var8];
            Enum var10 = (Enum)var9;
            if (var10.name().equalsIgnoreCase(var5)) {
               return var10;
            }
         }

         throw new RuntimeException("Could not find match for:" + var5);
      }
   }

   // $FF: renamed from: g (java.lang.String, java.lang.String) java.util.ArrayList
   public ArrayList method_1410(String var1, String var2) {
      ArrayList var3 = new ArrayList();
      Map var4 = (Map)this.field_1716.get(var1);
      if (var4 != null) {
         Iterator var5 = var4.keySet().iterator();

         while(var5.hasNext()) {
            String var6 = (String)var5.next();
            if (var6.startsWith(var2)) {
               var3.add(var6);
            }
         }
      }

      return var3;
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String, java.lang.String) java.util.ArrayList
   public ArrayList method_1411(String var1, String var2, String var3) {
      ArrayList var4 = new ArrayList();
      Map var5 = (Map)this.field_1716.get(var1);
      if (var5 != null) {
         Iterator var6 = var5.keySet().iterator();

         while(true) {
            String var7;
            do {
               if (!var6.hasNext()) {
                  return var4;
               }

               var7 = (String)var6.next();
            } while(!var7.startsWith(var2) && !var7.startsWith(var3));

            var4.add(var7);
         }
      } else {
         return var4;
      }
   }

   // $FF: renamed from: b (java.lang.String) java.util.ArrayList
   public ArrayList method_1412(String var1) {
      ArrayList var2 = new ArrayList();
      Set var3 = this.field_1716.keySet();
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         if (var5.startsWith(var1)) {
            var2.add(var5);
         }
      }

      return var2;
   }
}
