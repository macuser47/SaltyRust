package com.corrodinggames.rts.java.a;

import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamRemoteStorage$PublishedFileVisibility;
import com.codedisaster.steamworks.SteamRemoteStorage$WorkshopFileType;
import com.codedisaster.steamworks.SteamUGC;
import com.codedisaster.steamworks.SteamUGC$ItemInstallInfo;
import com.codedisaster.steamworks.SteamUGC$ItemState;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCUpdateHandle;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.e.class_215;
import java.util.Collection;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.java.a.g
public class class_221 {
   // $FF: renamed from: a com.corrodinggames.rts.java.a.b
   class_224 field_1766;
   // $FF: renamed from: b com.codedisaster.steamworks.SteamUGCCallback
   SteamUGCCallback field_1767;
   // $FF: renamed from: c com.codedisaster.steamworks.SteamUGC
   SteamUGC field_1768;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.e.b
   class_215 field_1769;

   public class_221(class_224 var1) {
      this.field_1766 = var1;
      this.field_1767 = new class_211(this);
   }

   // $FF: renamed from: a (com.codedisaster.steamworks.SteamUGC) void
   public void method_1451(SteamUGC var1) {
      this.field_1768 = var1;
   }

   // $FF: renamed from: a () com.codedisaster.steamworks.SteamUGCCallback
   public SteamUGCCallback method_1452() {
      return this.field_1767;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.e.b, java.lang.String, boolean) void
   public void method_1453(class_215 var1, String var2, boolean var3) {
      class_236.method_1591("workshop: " + var2);
      if (var3) {
         class_236.method_1549().method_1607(var2);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.e.b) boolean
   public boolean method_1454(class_215 var1) {
      if (var1.field_1744 == null) {
         this.method_1453(var1, "A title is required in the file 'mod-info.txt'", true);
         return false;
      } else {
         return true;
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.e.b) void
   public void method_1455(class_215 var1) {
      if (this.field_1769 != null) {
         this.method_1453(var1, "A mod is already pending publishing", false);
      } else if (var1.field_1740 != 0L) {
         this.method_1453(var1, "This mod has already been published", false);
      } else if (this.method_1454(var1)) {
         if (!var1.method_1434(0L)) {
            this.method_1453(var1, "Failed to write metadata to mod, check file permissions", true);
         } else {
            this.field_1769 = var1;
            int var2 = this.field_1766.field_1785.getAppID();
            this.field_1768.createItem(var2, SteamRemoteStorage$WorkshopFileType.Community);
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.e.b, boolean, java.lang.String) void
   public void method_1456(class_215 var1, boolean var2, String var3) {
      if (this.method_1454(var1)) {
         int var4 = this.field_1766.field_1785.getAppID();
         SteamPublishedFileID var5 = new SteamPublishedFileID(var1.field_1740);
         SteamUGCUpdateHandle var6 = this.field_1768.startItemUpdate(var4, var5);
         if (var2) {
            if (var1.field_1744 != null) {
               this.field_1768.setItemTitle(var6, var1.field_1744);
            }

            if (var1.field_1745 != null) {
               this.field_1768.setItemDescription(var6, var1.field_1745);
            }
         }

         if (var2) {
            this.field_1768.setItemVisibility(var6, SteamRemoteStorage$PublishedFileVisibility.Public);
         }

         String var7 = var1.method_1430();
         if (var7 != null) {
            this.field_1768.setItemPreview(var6, var7);
         }

         String var8 = var1.method_1431("tags");
         if (var8 != null) {
            String[] var9 = var8.split(",");

            for(int var10 = 0; var10 < var9.length; ++var10) {
               var9[var10] = var9[var10].trim();
               class_236.method_1591("Adding tag:" + var9[var10]);
            }

            this.field_1768.setItemTags(var6, var9);
         }

         String var11 = var1.method_1425();
         class_236.method_1591("convertedAbsolutePath:" + var11);
         this.field_1768.setItemContent(var6, var11);
         var1.field_1755 = "Uploading to workshop";
         this.field_1768.submitItemUpdate(var6, var3);
         class_236.method_1591("submitted item update for:" + var1.field_1740);
      }
   }

   // $FF: renamed from: b () void
   public void method_1457() {
      int var1 = this.field_1766.field_1785.getAppID();
      this.field_1766.field_1778.activateGameOverlayToWebPage("http://steamcommunity.com/workshop/browse/?appid=" + var1);
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.e.b) void
   public void method_1458(class_215 var1) {
      this.field_1766.field_1778.activateGameOverlayToWebPage("steam://url/CommunityFilePage/" + var1.field_1740);
   }

   // $FF: renamed from: a (com.codedisaster.steamworks.SteamPublishedFileID) long
   public long method_1459(SteamPublishedFileID var1) {
      return SteamNativeHandle.getNativeHandle(var1);
   }

   // $FF: renamed from: c () void
   public void method_1460() {
      class_236 var1 = class_236.method_1549();
      class_236.method_1591("--------------");
      class_236.method_1591("Steam: loadWorkshopMods");
      int var2 = this.field_1768.getNumSubscribedItems();
      SteamPublishedFileID[] var3 = new SteamPublishedFileID[var2];
      this.field_1768.getSubscribedItems(var3);
      SteamPublishedFileID[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         SteamPublishedFileID var7 = var4[var6];
         Collection var8 = this.field_1768.getItemState(var7);
         long var9 = this.method_1459(var7);
         class_236.method_1591("Found workshop item " + var9);
         boolean var11 = false;
         boolean var12 = false;
         boolean var13 = false;
         boolean var14 = false;
         Iterator var15 = var8.iterator();

         while(var15.hasNext()) {
            SteamUGC$ItemState var16 = (SteamUGC$ItemState)var15.next();
            class_236.method_1591("itemState: " + var16);
            if (var16 == SteamUGC$ItemState.Downloading || var16 == SteamUGC$ItemState.DownloadPending) {
               var12 = true;
            }

            if (var16 == SteamUGC$ItemState.Installed) {
               var11 = true;
            }

            if (var16 == SteamUGC$ItemState.NeedsUpdate) {
               var13 = true;
            }

            if (var16 == SteamUGC$ItemState.Subscribed) {
               var14 = true;
            }
         }

         String var23 = "sw" + var9;
         String var17 = null;
         String var18 = null;
         if (!var14) {
            class_236.method_1591("Skipping: " + var9 + " as it is not subscribed");
         } else {
            if (var11) {
               SteamUGC$ItemInstallInfo var19 = new SteamUGC$ItemInstallInfo();
               this.field_1768.getItemInstallInfo(var7, var19);
               var17 = var19.getFolder();
               class_236.method_1591("Installed at:" + var17);
            } else {
               var18 = "Not installed";
               if (var13) {
                  var18 = "Update needed";
               }

               if (var12) {
                  var18 = "Downloading files";
               }
            }

            boolean var24 = true;
            boolean var20 = true;
            boolean var21 = false;
            class_215 var22 = var1.field_1946.method_1441(var23, var17, var23, var24, var20, var21);
            if (var22.field_1754 == null) {
               var22.field_1754 = var18;
            }

            if ((!var11 || var13) && !var12) {
               class_236.method_1591("Queuing download");
               this.field_1768.downloadItem(var7, false);
            }
         }
      }

   }
}
