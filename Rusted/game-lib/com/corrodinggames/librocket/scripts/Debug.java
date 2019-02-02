package com.corrodinggames.librocket.scripts;

import com.corrodinggames.rts.b.a.class_522;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.d.class_8;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_287;
import com.corrodinggames.rts.gameFramework.class_324;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.f.class_396;
import com.corrodinggames.rts.gameFramework.f.class_453;
import com.corrodinggames.rts.gameFramework.f.class_463;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class Debug extends ScriptContext {
   Root root;

   Debug(Root var1) {
      this.root = var1;
   }

   public void lookAt(float var1, float var2) {
      class_236 var3 = class_236.method_1549();
      var3.method_1582(var1, var2);
   }

   public void createManyUnits(String var1, float var2, float var3, int var4, boolean var5, int var6) {
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < var6; ++var9) {
         var7 += 9;
         if (var7 > 400) {
            var7 = 0;
            var8 += 9;
         }

         this.createUnit(var1, var2 + (float)var7, var3 + (float)var8, var4, var9 == 0 ? var5 : false);
      }

   }

   public Long createUnit(String var1, float var2, float var3, int var4, boolean var5) {
      class_236 var6 = class_236.method_1549();
      class_24 var7 = class_469.method_3052(var1);
      if (var7 == null) {
         this.root.logWarn("Could not find type:" + var1);
         return null;
      } else {
         class_39 var8 = var7.method_128();
         var8.dh = var2;
         var8.di = var3;
         var8.method_259(var4);
         var8.field_179 = true;
         if (var5) {
            var6.method_1582(var2, var3);
         }

         return var8.da;
      }
   }

   public void removeAllUnits() {
      Iterator var1 = class_34.method_189().iterator();

      while(var1.hasNext()) {
         class_34 var2 = (class_34)var1.next();
         var2.method_184();
      }

   }

   public void killAllUnits() {
      Iterator var1 = class_34.method_189().iterator();

      while(var1.hasNext()) {
         class_34 var2 = (class_34)var1.next();
         if (var2 instanceof class_39) {
            class_39 var3 = (class_39)var2;
            var3.field_167 = -1.0F;
         }
      }

   }

   public boolean setTeamCredits(int var1, int var2) {
      class_107 var3 = class_107.method_954(var1);
      if (var3 == null) {
         this.root.logWarn("Could not find team:" + var1);
         return false;
      } else {
         var3.field_1229 = var2;
         return true;
      }
   }

   public boolean setTeamAllyGroup(int var1, int var2) {
      class_107 var3 = class_107.method_954(var1);
      if (var3 == null) {
         this.root.logWarn("Could not find team:" + var1);
         return false;
      } else {
         var3.field_1231 = var2;
         return true;
      }
   }

   public void giveUpgradeToAllUnits() {
      Iterator var1 = class_34.method_189().iterator();

      while(var1.hasNext()) {
         class_34 var2 = (class_34)var1.next();
         if (var2 instanceof class_44) {
            class_44 var3 = (class_44)var2;
            String var4 = var3.by();
            class_121 var5 = var3.b(var4);
            if (var5 != null) {
               var3.a(var5, false);
            }
         }
      }

   }

   public void giveAllActionsToAllUnits() {
      Iterator var1 = class_34.method_189().iterator();

      while(true) {
         class_34 var2;
         do {
            if (!var1.hasNext()) {
               return;
            }

            var2 = (class_34)var1.next();
         } while(!(var2 instanceof class_44));

         class_44 var3 = (class_44)var2;
         Iterator var4 = var3.E().iterator();

         while(var4.hasNext()) {
            class_121 var5 = (class_121)var4.next();
            var3.a(var5, false);
         }
      }
   }

   public void completeAllUnitsQueues() {
      Iterator var1 = class_34.method_189().iterator();

      while(var1.hasNext()) {
         class_34 var2 = (class_34)var1.next();
         if (var2 instanceof class_8) {
            class_8 var3 = (class_8)var2;
            var3.method_16();
         }
      }

   }

   public boolean moveAllUnitsOnTeam(int var1, float var2, float var3) {
      class_107 var4 = class_107.method_954(var1);
      if (var4 == null) {
         this.root.logWarn("Could not find team:" + var1);
         return false;
      } else {
         class_236 var5 = class_236.method_1549();
         class_324 var6 = var5.field_1952.method_2159(var4);
         Iterator var7 = class_34.method_189().iterator();

         while(var7.hasNext()) {
            class_34 var8 = (class_34)var7.next();
            if (var8 instanceof class_44) {
               class_44 var9 = (class_44)var8;
               if (var9.bk == var4) {
                  var6.method_2184(var9);
               }
            }
         }

         var6.method_2186(var2, var3);
         return true;
      }
   }

   public void showMessage(String var1) {
      class_236 var2 = class_236.method_1549();
      if (var1 != null && !var1.trim().equals("")) {
         var2.field_1944.method_2938(var1);
      }
   }

   public void setZoom(float var1) {
      class_236 var2 = class_236.method_1549();
      var2.field_1986 = var1;
   }

   public boolean isNetworkGameActive() {
      class_236 var1 = class_236.method_1549();
      return var1.method_1578();
   }

   public int getLocalPlayerId() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1944.field_3806.field_1227;
   }

   public int numberOfHumanPlayers() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1944.method_2957();
   }

   public int numberOfPlayersPlusAI() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1944.method_2958();
   }

   public boolean enableFastSync() {
      class_236 var1 = class_236.method_1549();
      var1.field_1944.field_3835 = 10;
      return true;
   }

   public boolean enablePauseOnDesync() {
      class_236 var1 = class_236.method_1549();
      var1.field_1944.field_3836 = true;
      return true;
   }

   public boolean networkPause() {
      class_236 var1 = class_236.method_1549();
      var1.field_1944.field_3836 = true;
      var1.field_1944.field_3837 = true;
      return true;
   }

   public boolean plainTextDebugSave(boolean var1) {
      class_236 var2 = class_236.method_1549();
      class_287.field_2440 = var1;
      return true;
   }

   public boolean checkDesync(int var1) {
      class_236 var2 = class_236.method_1549();
      if (var2.field_1944.field_3857 != 0) {
         throw new RuntimeException("numberOfDesyncErrors==" + var2.field_1944.field_3857);
      } else if (var2.field_1944.field_3858 < var1) {
         throw new RuntimeException("game.network.numberOfDesyncPasses:" + var2.field_1944.field_3858 + "<" + var1);
      } else {
         this.root.logDebug("numberOfDesyncPasses:" + var2.field_1944.field_3858);
         return true;
      }
   }

   public int getNumberOfDesyncErrors() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1944.field_3857;
   }

   public int getNumberOfDesyncPasses() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1944.field_3858;
   }

   public boolean setMultiplayerMap(int var1, String var2) {
      class_236 var3 = class_236.method_1549();
      class_453 var4 = var3.field_1944.field_3863;
      var4.field_3775 = class_396.values()[var1];
      var4.field_3776 = var2;
      return true;
   }

   public void generateNewClientId() {
      class_236 var1 = class_236.method_1549();
      var1.field_1944.method_2926();
   }

   public void disableFog() {
      class_236 var1 = class_236.method_1549();
   }

   public void overrideDeltaSpeed(float var1) {
      class_236 var2 = class_236.method_1549();
      var2.field_1917 = var1;
   }

   public void setGameSetting(String var1, String var2) {
      class_236 var3 = class_236.method_1549();
      var3.field_1937.setValueDynamic(var1, var2);
   }

   public void setNetworkaiDifficulty(int var1) {
      class_236 var2 = class_236.method_1549();
      class_453 var3 = var2.field_1944.method_2850();
      var3.field_3780 = var1;
      var2.field_1944.method_2852(var3);
   }

   public void setNetworkStartingUnits(int var1) {
      class_236 var2 = class_236.method_1549();
      class_453 var3 = var2.field_1944.method_2850();
      var3.field_3781 = var1;
      var2.field_1944.method_2852(var3);
   }

   public void startRandomUnitDesyncTest() {
      class_236 var1 = class_236.method_1549();
      class_324 var2 = var1.field_1952.method_2158();
      var2.field_2601 = class_107.field_1224;
      var2.field_2611 = true;
      var2.field_2614 = 1;
      var1.field_1944.method_2892(var2);
   }

   public void runAllUnitTests() {
      this.root.logWarn("Running unit tests..");
      class_522 var1 = new class_522();
      var1.method_3295();
   }

   public boolean loadSaveFromSystemPath(String var1) {
      class_236 var2 = class_236.method_1549();

      try {
         File var3 = new File(var1);
         FileInputStream var4 = new FileInputStream(var3);
         BufferedInputStream var5 = new BufferedInputStream(var4);
         DataInputStream var6 = new DataInputStream(var5);
         class_463 var7 = new class_463(var6);

         boolean var8;
         try {
            var8 = var2.field_1947.method_1993(var7, false, false, false);
         } finally {
            var6.close();
            var5.close();
            var4.close();
         }

         return var8;
      } catch (IOException var13) {
         throw new RuntimeException(var13);
      }
   }
}
