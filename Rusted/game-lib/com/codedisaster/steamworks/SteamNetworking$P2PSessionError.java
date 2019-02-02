package com.codedisaster.steamworks;

public enum SteamNetworking$P2PSessionError {
   None,
   NotRunningApp,
   NoRightsToApp,
   DestinationNotLoggedIn,
   Timeout;

   private static final SteamNetworking$P2PSessionError[] values = values();

   public static SteamNetworking$P2PSessionError byOrdinal(int var0) {
      return values[var0];
   }
}
