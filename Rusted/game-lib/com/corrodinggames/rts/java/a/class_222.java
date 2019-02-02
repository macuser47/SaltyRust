package com.corrodinggames.rts.java.a;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.java.a.a
public class class_222 implements Runnable {
   // $FF: renamed from: a com.corrodinggames.rts.java.a.b
   class_224 field_1770;
   // $FF: renamed from: b java.lang.String
   String field_1771;
   // $FF: renamed from: c com.codedisaster.steamworks.SteamID
   SteamID field_1772;
   // $FF: renamed from: d com.codedisaster.steamworks.SteamID
   SteamID field_1773;
   // $FF: renamed from: e long
   long field_1774;
   // $FF: renamed from: f java.lang.Thread
   Thread field_1775;

   public class_222(class_224 var1, SteamID var2, SteamID var3, long var4) {
      this.field_1770 = var1;
      this.field_1772 = var2;
      this.field_1773 = var3;
      this.field_1774 = var4;
      this.field_1771 = var1.field_1778.getFriendPersonaName(var2);
   }

   // $FF: renamed from: a () void
   public void method_1461() {
      if (this.field_1775 != null) {
         throw new RuntimeException("already started");
      } else {
         a$1 var1 = new a$1(this);
         ScriptEngine.getInstance().addRunnableToQueue(var1);
      }
   }

   public void run() {
      class_236.method_1591("Join clicked");
      Root var1 = ScriptEngine.getInstance().getRoot();
      var1.closePopup();
      class_236 var2 = class_236.method_1549();
      this.field_1770.field_1779.joinLobby(this.field_1773);
   }
}
