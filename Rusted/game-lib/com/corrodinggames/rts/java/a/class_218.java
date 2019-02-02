package com.corrodinggames.rts.java.a;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamMatchmaking$ChatEntryType;
import com.codedisaster.steamworks.SteamMatchmaking$ChatMemberStateChange;
import com.codedisaster.steamworks.SteamMatchmaking$ChatRoomEnterResponse;
import com.codedisaster.steamworks.SteamMatchmakingCallback;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.java.a.e
public class class_218 implements SteamMatchmakingCallback {
   // $FF: renamed from: a com.corrodinggames.rts.java.a.b
   class_224 field_1761;

   public class_218(class_224 var1) {
      this.field_1761 = var1;
   }

   public void onFavoritesListChanged(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      class_236.method_1591("onFavoritesListChanged");
   }

   public void onLobbyInvite(SteamID var1, SteamID var2, long var3) {
      class_236.method_1591("onLobbyInvite");
      class_222 var5 = new class_222(this.field_1761, var1, var2, var3);
      var5.method_1461();
   }

   public void onLobbyEnter(SteamID var1, int var2, boolean var3, SteamMatchmaking$ChatRoomEnterResponse var4) {
      class_236.method_1591("onLobbyEnter");
      if (var3) {
         class_236.method_1591("onLobbyEnter blocked: " + var4);
      }

      this.field_1761.method_1479(var1);
   }

   public void onLobbyDataUpdate(SteamID var1, SteamID var2, boolean var3) {
      class_236.method_1591("onLobbyDataUpdate success: " + var3);
   }

   public void onLobbyChatUpdate(SteamID var1, SteamID var2, SteamID var3, SteamMatchmaking$ChatMemberStateChange var4) {
      class_236.method_1591("onLobbyChatUpdate steamIDUserChanged: " + var2 + " stateChange:" + var4);
   }

   public void onLobbyChatMessage(SteamID var1, SteamID var2, SteamMatchmaking$ChatEntryType var3, int var4) {
      class_236.method_1591("onLobbyChatMessage");
   }

   public void onLobbyGameCreated(SteamID var1, SteamID var2, int var3, short var4) {
      class_236.method_1591("onLobbyGameCreated");
      this.field_1761.method_1477(var1);
   }

   public void onLobbyMatchList(int var1) {
      class_236.method_1591("onLobbyMatchList");
   }

   public void onLobbyKicked(SteamID var1, SteamID var2, boolean var3) {
      class_236.method_1591("onLobbyKicked");
   }

   public void onLobbyCreated(SteamResult var1, SteamID var2) {
      class_236.method_1591("onLobbyCreated");
      this.field_1761.method_1477(var2);
   }

   public void onFavoritesListAccountsUpdated(SteamResult var1) {
      class_236.method_1591("onFavoritesListAccountsUpdated");
   }
}
