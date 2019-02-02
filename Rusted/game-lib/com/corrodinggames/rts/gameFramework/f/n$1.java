package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_236;
import java.io.BufferedReader;
import java.net.Socket;

class n$1 extends class_230 {
   // $FF: renamed from: a int
   // $FF: synthetic field
   final int field_1812;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.f.n
   // $FF: synthetic field
   final class_443 field_1813;

   n$1(class_443 var1, int var2) {
      this.field_1813 = var1;
      this.field_1812 = var2;
   }

   // $FF: renamed from: a (java.io.BufferedReader, int, java.lang.String) void
   void method_1488(BufferedReader var1, int var2, String var3) {
      class_236 var4 = class_236.method_1549();
      String var5 = var1.readLine();
      if (var5 != null && var5.contains("CORRODINGGAMES")) {
         class_236.method_1592("LoadFromMasterServer", var2 + ": Starting load");
         int var38 = 0;

         while(true) {
            String var7;
            while((var7 = var1.readLine()) != null) {
               String[] var8 = var7.split(",", -1);
               if (var8.length <= 18) {
                  class_236.method_1592("LoadFromMasterServer", var2 + ": columns.length too short at:" + var8.length);
                  class_236.method_1592("LoadFromMasterServer", var2 + ": short line is:" + var7);
               } else {
                  String var9 = var8[0];
                  String var10 = var8[1];
                  String var11 = var8[2];
                  String var12 = var8[3];
                  String var13 = var8[4];
                  String var14 = var8[5];
                  String var15 = var8[6];
                  String var16 = var8[7];
                  String var17 = var8[8];
                  String var18 = var8[9];
                  String var19 = var8[10];
                  String var20 = var8[11];
                  String var21 = var8[12];
                  String var22 = var8[13];
                  String var23 = var8[15];
                  String var24 = var8[16];
                  String var25 = var8[17];
                  String var26 = var8[18];
                  if (var26 == null || var26.trim().length() == 0) {
                     var26 = var9;
                  }

                  try {
                     String var27 = var26;
                     synchronized(class_444.field_3757) {
                        class_462 var29 = class_444.method_2832(var27);
                        var29.field_3963 = var12;
                        var29.field_3964 = var13;
                        var29.field_3965 = Integer.valueOf(var14);
                        var29.field_3966 = Boolean.parseBoolean(var15);
                        var29.field_3970 = Boolean.parseBoolean(var17);
                        var29.field_3968 = var11;
                        var29.field_3971 = var16;
                        var29.field_3974 = var18;
                        var29.field_3975 = var19;
                        var29.field_3976 = var20;
                        var29.field_3969 = var21;
                        var29.field_3961 = Boolean.parseBoolean(var22);
                        var29.field_3977 = var23;
                        var29.field_3978 = var24;

                        try {
                           var29.field_3979 = Integer.parseInt(var29.field_3977);
                        } catch (NumberFormatException var35) {
                           class_236.method_1588("game_player_count_int:" + var35.getMessage());
                        }

                        try {
                           var29.field_3980 = Integer.parseInt(var29.field_3978);
                        } catch (NumberFormatException var34) {
                           class_236.method_1588("game_max_player_count_int:" + var34.getMessage());
                        }

                        var29.field_3981 = Boolean.parseBoolean(var25);
                        var29.field_3982 = false;
                        Socket var30 = var4.field_1944.field_3898;
                        if (!var29.field_3961 && var30 != null && var30.getInetAddress() != null && var30.getInetAddress().getHostAddress().equals(var29.field_3963) && var30.getPort() == var29.field_3965) {
                           var29.field_3982 = true;
                        }

                        if (var29.field_3973 < this.field_1812) {
                           var29.field_3973 = this.field_1812;
                        }

                        if (class_444.method_2831(var29.field_3962) == null) {
                           var4.field_1944.field_3888.add(var29);
                        }

                        ++var38;
                     }
                  } catch (NumberFormatException var37) {
                     class_236.method_1592("LoadFromMasterServer", var2 + ": failed to load server");
                     var37.printStackTrace();
                  }
               }
            }

            class_236.method_1592("LoadFromMasterServer", "[" + var2 + "]: Found " + var38 + " servers");
            if (var38 == 0) {
               try {
                  Thread.sleep(2000L);
               } catch (InterruptedException var33) {
                  var33.printStackTrace();
               }
            }

            this.field_1813.field_3753.run();

            try {
               Thread.sleep(2000L);
            } catch (InterruptedException var32) {
               var32.printStackTrace();
            }

            class_444.method_2834(this.field_1812, var2);
            class_236.method_1592("LoadFromMasterServer", var2 + ": Completed load from master server without error");
            return;
         }
      } else {
         class_236.method_1592("LoadFromMasterServer", var2 + ": Error bad header returned from the master server: " + var5);
         if (!class_236.field_1886) {
            String var6 = "";

            while((var6 = var1.readLine()) != null) {
               class_236.method_1592("LoadFromMasterServer", "line:" + var6);
            }
         }

      }
   }
}
