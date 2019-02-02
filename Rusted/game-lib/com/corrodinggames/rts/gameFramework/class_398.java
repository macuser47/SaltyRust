package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.bb
public class class_398 {
   // $FF: renamed from: a boolean
   public boolean field_3257 = false;
   // $FF: renamed from: b java.lang.String
   String field_3258 = "rtsSave";
   // $FF: renamed from: c java.lang.String
   String field_3259 = "rtsSave.bak";
   // $FF: renamed from: d boolean
   public boolean field_3260 = false;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.bb
   static class_398 field_3261 = null;
   // $FF: renamed from: f java.util.HashMap
   HashMap field_3262 = new HashMap();

   // $FF: renamed from: a (android.content.Context) void
   public strictfp void method_2507(Context var1) {
      if (!class_236.field_1899) {
         if (!this.field_3257) {
            try {
               if (var1 == null) {
                  throw new IOException("context==null");
               }

               FileOutputStream var2;
               try {
                  var2 = var1.method_1860(this.field_3258, 0);
               } catch (NullPointerException var6) {
                  throw new IOException("openFileOutput NullPointerException", var6);
               }

               DataOutputStream var3 = new DataOutputStream(var2);
               this.method_2508(var3);
               var3.close();
               var2.close();
            } catch (FileNotFoundException var7) {
               Log.method_1713("RustedWarfare", "file save error:", var7);
            } catch (IOException var8) {
               Log.method_1713("RustedWarfare", "file save error:", var8);
            }

            if (this.field_3260) {
               try {
                  File var9 = new File(Environment.getExternalStorageDirectory() + "/" + this.field_3259);
                  FileOutputStream var10 = new FileOutputStream(var9);
                  DataOutputStream var4 = new DataOutputStream(var10);
                  this.method_2508(var4);
                  var4.close();
                  var10.close();
               } catch (IOException var5) {
                  Log.method_1713("RustedWarfare", "file read error:", var5);
               }
            }

         }
      }
   }

   // $FF: renamed from: a (java.io.DataOutputStream) boolean
   public strictfp boolean method_2508(DataOutputStream var1) {
      if (class_236.field_1899) {
         return false;
      } else {
         try {
            var1.writeInt(1);
            var1.writeInt(0);
            var1.writeInt(this.field_3262.size());
            Iterator var2 = this.field_3262.values().iterator();

            while(var2.hasNext()) {
               class_399 var3 = (class_399)var2.next();
               var1.writeInt(0);
               var1.writeInt(var3.field_3263);
               var1.writeUTF(var3.field_3264);
               var1.writeInt(var3.field_3265);
               var1.writeBoolean(var3.field_3266);
               var1.writeBoolean(var3.field_3267);
               var1.writeBoolean(var3.field_3268);
               var1.writeLong(var3.field_3269);
               var1.writeInt(var3.field_3270);
            }

            var1.flush();
            return true;
         } catch (IOException var4) {
            Log.method_1713("RustedWarfare", "file save error:", var4);
            return false;
         }
      }
   }

   // $FF: renamed from: b (android.content.Context) void
   public strictfp void method_2509(Context var1) {
      if (!this.field_3257) {
         boolean var2 = false;
         Log.method_1712("RustedWarfare", "Trying to load from internal memory");

         try {
            FileInputStream var3 = var1.method_1859(this.field_3258);
            DataInputStream var4 = new DataInputStream(var3);
            var2 = this.method_2510(var4);
            if (var2) {
               Log.method_1712("RustedWarfare", "loaded from internal memory");
            }

            var3.close();
         } catch (IOException var7) {
            Log.method_1713("RustedWarfare", "file read error:", var7);
         }

         if (this.field_3260 && !var2) {
            Log.method_1712("RustedWarfare", "Trying to load from SD");

            try {
               File var8 = new File(Environment.getExternalStorageDirectory() + "/" + this.field_3259);
               FileInputStream var9 = new FileInputStream(var8);
               DataInputStream var5 = new DataInputStream(var9);
               var2 = this.method_2510(var5);
               if (var2) {
                  Log.method_1712("RustedWarfare", "loaded from SD");
               }

               var5.close();
               var9.close();
            } catch (IOException var6) {
               Log.method_1713("RustedWarfare", "file read error:", var6);
            }
         }

      }
   }

   // $FF: renamed from: a (java.io.DataInputStream) boolean
   public strictfp boolean method_2510(DataInputStream var1) {
      try {
         int var2 = var1.readInt();
         if (var2 > 1) {
            Log.method_1712("RustedWarfare", "Warning file is at version:" + var2);
            return false;
         } else {
            var1.readInt();
            int var3 = var1.readInt();
            this.field_3262.clear();

            for(int var4 = 0; var4 < var3; ++var4) {
               class_399 var5 = new class_399(this);
               var1.readInt();
               var5.field_3263 = var1.readInt();
               String var6 = var1.readUTF();
               if (var6.equals("maps/challenge/l030;Level 5.tmx")) {
                  Log.method_1712("RustedWarfare", "converting:" + var6);
                  var6 = "maps/challenge/l090;Level 7.tmx";
               }

               var5.field_3264 = var6;
               var5.field_3265 = var1.readInt();
               var5.field_3266 = var1.readBoolean();
               var5.field_3267 = var1.readBoolean();
               var5.field_3268 = var1.readBoolean();
               var5.field_3269 = var1.readLong();
               var5.field_3270 = var1.readInt();
               this.field_3262.put(this.method_2512(var5.field_3264), var5);
            }

            return true;
         }
      } catch (IOException var7) {
         Log.method_1713("RustedWarfare", "file read error:", var7);
         return false;
      }
   }

   // $FF: renamed from: c (android.content.Context) com.corrodinggames.rts.gameFramework.bb
   public static strictfp class_398 method_2511(Context var0) {
      if (field_3261 == null) {
         field_3261 = new class_398(var0);
         if (!class_236.field_1899) {
            field_3261.method_2509(var0);
         }
      }

      return field_3261;
   }

   private strictfp class_398(Context var1) {
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public strictfp String method_2512(String var1) {
      Integer var2 = class_236.method_1641(var1);
      return var2 != null ? class_236.method_1639(var1) + "/l" + var2 : var1;
   }

   // $FF: renamed from: b (java.lang.String) com.corrodinggames.rts.gameFramework.bc
   public strictfp class_399 method_2513(String var1) {
      String var2 = this.method_2512(var1);
      class_399 var3 = (class_399)this.field_3262.get(var2);
      Log.method_1712("RustedWarfare", "StateEngine: get(" + var1 + ")=" + var3 + "  (key=" + var2 + ")");
      if (var3 == null) {
         var3 = new class_399(this);
         var3.field_3263 = 1;
         var3.field_3264 = var1;
         this.field_3262.put(var2, var3);
      }

      return var3;
   }
}
