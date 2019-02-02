package com.codedisaster.steamworks;

public enum SteamFriends$OverlayDialog {
   Friends("Friends"),
   Community("Community"),
   Players("Players"),
   Settings("Settings"),
   OfficialGameGroup("OfficialGameGroup"),
   Stats("Stats"),
   Achievements("Achievements");

   // $FF: renamed from: id java.lang.String
   private final String field_4720;

   private SteamFriends$OverlayDialog(String var3) {
      this.field_4720 = var3;
   }

   // $FF: synthetic method
   static String access$100(SteamFriends$OverlayDialog var0) {
      return var0.field_4720;
   }
}
