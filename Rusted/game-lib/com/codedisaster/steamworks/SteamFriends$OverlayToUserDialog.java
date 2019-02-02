package com.codedisaster.steamworks;

public enum SteamFriends$OverlayToUserDialog {
   SteamID("steamid"),
   Chat("chat"),
   JoinTrade("jointrade"),
   Stats("stats"),
   Achievements("achievements"),
   FriendAdd("friendadd"),
   FriendRemove("friendremove"),
   FriendRequestAccept("friendrequestaccept"),
   FriendRequestIgnore("friendrequestignore");

   // $FF: renamed from: id java.lang.String
   private final String field_1345;

   private SteamFriends$OverlayToUserDialog(String var3) {
      this.field_1345 = var3;
   }

   // $FF: synthetic method
   static String access$200(SteamFriends$OverlayToUserDialog var0) {
      return var0.field_1345;
   }
}
