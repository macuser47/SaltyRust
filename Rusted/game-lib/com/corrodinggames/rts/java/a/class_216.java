package com.corrodinggames.rts.java.a;

import com.codedisaster.steamworks.SteamFriends$PersonaChange;
import com.codedisaster.steamworks.SteamFriendsCallback;
import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.java.a.d
public class class_216 implements SteamFriendsCallback {
   // $FF: renamed from: a com.corrodinggames.rts.java.a.b
   class_224 field_1756;

   public class_216(class_224 var1) {
      this.field_1756 = var1;
   }

   public void onSetPersonaNameResponse(boolean var1, boolean var2, SteamResult var3) {
   }

   public void onPersonaStateChange(SteamID var1, SteamFriends$PersonaChange var2) {
   }

   public void onGameOverlayActivated(boolean var1) {
      class_236.method_1591("onGameOverlayActivated");
   }

   public void onGameLobbyJoinRequested(SteamID var1, SteamID var2) {
   }

   public void onAvatarImageLoaded(SteamID var1, int var2, int var3, int var4) {
   }

   public void onFriendRichPresenceUpdate(SteamID var1, int var2) {
   }

   public void onGameRichPresenceJoinRequested(SteamID var1, String var2) {
   }
}
