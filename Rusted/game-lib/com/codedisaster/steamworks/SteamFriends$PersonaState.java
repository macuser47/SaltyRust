package com.codedisaster.steamworks;

public enum SteamFriends$PersonaState {
   Offline,
   Online,
   Busy,
   Away,
   Snooze,
   LookingToTrade,
   LookingToPlay;

   private static final SteamFriends$PersonaState[] values = values();

   static SteamFriends$PersonaState byOrdinal(int var0) {
      return values[var0];
   }
}
