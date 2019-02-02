package com.corrodinggames.rts.java.a;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.f.class_458;
import com.corrodinggames.rts.gameFramework.j.class_223;
import java.io.IOException;
import java.util.Iterator;

class b$1 implements Runnable {
   // $FF: renamed from: a com.codedisaster.steamworks.SteamID
   // $FF: synthetic field
   final SteamID field_3056;
   // $FF: renamed from: b com.corrodinggames.rts.java.a.b
   // $FF: synthetic field
   final class_224 field_3057;

   b$1(class_224 var1, SteamID var2) {
      this.field_3057 = var1;
      this.field_3056 = var2;
   }

   public void run() {
      class_236 var1 = class_236.method_1549();

      String var3;
      try {
         this.field_3057.method_1475("connectTo runnable start");
         Root var2 = ScriptEngine.getInstance().getRoot();
         var1.field_1944.method_2873("starting new");
         this.field_3057.field_1789 = this.field_3056;
         this.field_3057.field_1791 = this.field_3057.field_1779.getLobbyOwner(this.field_3057.field_1789);
         var3 = var1.field_1937.lastNetworkPlayerName;
         String var4 = class_223.method_1462().method_1465();
         if (var4 != null && var3 == null) {
            var3 = var4;
         }

         var1.field_1944.field_3804 = var3;
         class_212 var5 = new class_212(this.field_3057, this.field_3057.field_1791);
         this.field_3057.field_1787.put(this.field_3057.field_1791, var5);
         var1.field_1944.method_2916(var5);

         class_458 var7;
         for(Iterator var6 = var1.field_1944.field_3877.iterator(); var6.hasNext(); var7.field_3931 = true) {
            var7 = (class_458)var6.next();
         }

         this.field_3057.method_1475("connected");
         var2.showBattleroom();
         this.field_3057.method_1475("connectTo runnable end");
      } catch (IOException var8) {
         var3 = var8.getMessage();
         var1.method_1609(var3, "Connection failed");
         var8.printStackTrace();
      }

   }
}
