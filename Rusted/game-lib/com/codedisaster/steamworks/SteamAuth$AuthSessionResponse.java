package com.codedisaster.steamworks;

public enum SteamAuth$AuthSessionResponse {
   // $FF: renamed from: OK com.codedisaster.steamworks.SteamAuth$AuthSessionResponse
   field_4718,
   UserNotConnectedToSteam,
   NoLicenseOrExpired,
   VACBanned,
   LoggedInElseWhere,
   VACCheckTimedOut,
   AuthTicketCanceled,
   AuthTicketInvalidAlreadyUsed,
   AuthTicketInvalid,
   PublisherIssuedBan;

   private static final SteamAuth$AuthSessionResponse[] values = values();

   static SteamAuth$AuthSessionResponse byOrdinal(int var0) {
      return values[var0];
   }
}
