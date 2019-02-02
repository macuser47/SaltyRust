package com.codedisaster.steamworks;

public enum SteamAuth$BeginAuthSessionResult {
   // $FF: renamed from: OK com.codedisaster.steamworks.SteamAuth$BeginAuthSessionResult
   field_3070,
   InvalidTicket,
   DuplicateRequest,
   InvalidVersion,
   GameMismatch,
   ExpiredTicket;

   private static final SteamAuth$BeginAuthSessionResult[] values = values();

   static SteamAuth$BeginAuthSessionResult byOrdinal(int var0) {
      return values[var0];
   }
}
