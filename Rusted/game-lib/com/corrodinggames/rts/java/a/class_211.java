package com.corrodinggames.rts.java.a;

import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamResult;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCDetails;
import com.codedisaster.steamworks.SteamUGCQuery;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.e.class_215;

// $FF: renamed from: com.corrodinggames.rts.java.a.h
public class class_211 implements SteamUGCCallback {
   // $FF: renamed from: a com.corrodinggames.rts.java.a.g
   // $FF: synthetic field
   final class_221 field_1725;

   public class_211(class_221 var1) {
      this.field_1725 = var1;
   }

   public void onUGCQueryCompleted(SteamUGCQuery var1, int var2, int var3, boolean var4, SteamResult var5) {
      this.method_1420("onUGCQueryCompleted", var5);
   }

   public void onSubscribeItem(SteamPublishedFileID var1, SteamResult var2) {
      this.method_1420("onSubscribeItem", var2);
      class_236 var3 = class_236.method_1549();
      var3.field_1946.method_1446();
   }

   public void onUnsubscribeItem(SteamPublishedFileID var1, SteamResult var2) {
      this.method_1420("onUnsubscribeItem", var2);
      class_236 var3 = class_236.method_1549();
      var3.field_1946.method_1446();
   }

   public void onRequestUGCDetails(SteamUGCDetails var1, SteamResult var2) {
      this.method_1420("onRequestUGCDetails", var2);
   }

   public void onCreateItem(SteamPublishedFileID var1, boolean var2, SteamResult var3) {
      this.method_1420("onCreateItem", var3);
      if (this.field_1725.field_1769 == null) {
         this.field_1725.method_1453((class_215)null, "Error no mod pending creation!", false);
      } else if (this.field_1725.field_1769.field_1740 != 0L) {
         this.field_1725.method_1453(this.field_1725.field_1769, "This mod has already been published", true);
      } else {
         this.field_1725.field_1769.method_1434(SteamNativeHandle.getNativeHandle(var1));
         this.field_1725.method_1456(this.field_1725.field_1769, true, "Created.");
         this.field_1725.field_1769 = null;
         class_236 var4 = class_236.method_1549();
         var4.field_1946.method_1446();
      }
   }

   public void onSubmitItemUpdate(boolean var1, SteamResult var2) {
      this.method_1420("onSubmitItemUpdate", var2);
      String var3 = "";
      if (var2 == SteamResult.field_4709) {
         var3 = "Workshop item updated.";
      } else {
         var3 = "Workshop returned: " + var2;
      }

      if (var1) {
         var3 = var3 + "WLA agreement needs to be accepted on the workshop site.";
      }

      class_236.method_1549().method_1607(var3);
      class_236 var4 = class_236.method_1549();
      var4.field_1946.method_1446();
   }

   public void onDownloadItemResult(int var1, SteamPublishedFileID var2, SteamResult var3) {
      this.method_1420("onDownloadItemResult", var3);
      class_236 var4 = class_236.method_1549();
      var4.field_1946.method_1446();
   }

   public void onUserFavoriteItemsListChanged(SteamPublishedFileID var1, boolean var2, SteamResult var3) {
      this.method_1420("onUserFavoriteItemsListChanged", var3);
   }

   public void onSetUserItemVote(SteamPublishedFileID var1, boolean var2, SteamResult var3) {
      this.method_1420("onSetUserItemVote", var3);
   }

   public void onGetUserItemVote(SteamPublishedFileID var1, boolean var2, boolean var3, boolean var4, SteamResult var5) {
      this.method_1420("onGetUserItemVote", var5);
   }

   public void onStartPlaytimeTracking(SteamResult var1) {
      this.method_1420("onStartPlaytimeTracking", var1);
   }

   public void onStopPlaytimeTracking(SteamResult var1) {
      this.method_1420("onStopPlaytimeTracking", var1);
   }

   public void onStopPlaytimeTrackingForAllItems(SteamResult var1) {
      this.method_1420("onStopPlaytimeTrackingForAllItems", var1);
   }

   // $FF: renamed from: a (java.lang.String, com.codedisaster.steamworks.SteamResult) void
   public void method_1420(String var1, SteamResult var2) {
      class_236.method_1591("Got workshop callback: " + var1 + " (" + var2 + ")");
   }
}
