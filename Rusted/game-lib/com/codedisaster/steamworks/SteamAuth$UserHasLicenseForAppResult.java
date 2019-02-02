package com.codedisaster.steamworks;

public enum SteamAuth$UserHasLicenseForAppResult {
   HasLicense,
   DoesNotHaveLicense,
   NoAuth;

   private static final SteamAuth$UserHasLicenseForAppResult[] values = values();

   static SteamAuth$UserHasLicenseForAppResult byOrdinal(int var0) {
      return values[var0];
   }
}
