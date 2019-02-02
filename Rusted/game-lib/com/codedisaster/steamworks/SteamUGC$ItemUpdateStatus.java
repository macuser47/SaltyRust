package com.codedisaster.steamworks;

public enum SteamUGC$ItemUpdateStatus {
   Invalid,
   PreparingConfig,
   PreparingContent,
   UploadingContent,
   UploadingPreviewFile,
   CommittingChanges;

   private static final SteamUGC$ItemUpdateStatus[] values = values();

   static SteamUGC$ItemUpdateStatus byOrdinal(int var0) {
      return values[var0];
   }
}
