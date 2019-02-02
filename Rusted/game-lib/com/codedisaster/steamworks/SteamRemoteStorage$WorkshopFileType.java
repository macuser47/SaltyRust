package com.codedisaster.steamworks;

public enum SteamRemoteStorage$WorkshopFileType {
   Community,
   Microtransaction,
   Collection,
   Art,
   Video,
   Screenshot,
   Game,
   Software,
   Concept,
   WebGuide,
   IntegratedGuide,
   Merch,
   ControllerBinding,
   SteamworksAccessInvite,
   SteamVideo,
   GameManagedItem;

   private static final SteamRemoteStorage$WorkshopFileType[] values = values();

   static SteamRemoteStorage$WorkshopFileType byOrdinal(int var0) {
      return values[var0];
   }
}
