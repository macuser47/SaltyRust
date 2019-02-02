package com.codedisaster.steamworks;

public enum SteamGameServer$DenyReason {
   Invalid,
   InvalidVersion,
   Generic,
   NotLoggedOn,
   NoLicense,
   Cheater,
   LoggedInElseWhere,
   UnknownText,
   IncompatibleAnticheat,
   MemoryCorruption,
   IncompatibleSoftware,
   SteamConnectionLost,
   SteamConnectionError,
   SteamResponseTimedOut,
   SteamValidationStalled,
   SteamOwnerLeftGuestUser;

   private static final SteamGameServer$DenyReason[] values = values();

   static SteamGameServer$DenyReason byOrdinal(int var0) {
      return values[var0];
   }
}
