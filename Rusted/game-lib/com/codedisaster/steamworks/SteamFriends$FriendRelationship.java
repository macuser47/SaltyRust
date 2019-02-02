package com.codedisaster.steamworks;

public enum SteamFriends$FriendRelationship {
   None,
   Blocked,
   Recipient,
   Friend,
   RequestInitiator,
   Ignored,
   IgnoredFriend,
   Suggested_DEPRECATED,
   Max;

   private static final SteamFriends$FriendRelationship[] values = values();

   static SteamFriends$FriendRelationship byOrdinal(int var0) {
      return values[var0];
   }
}
