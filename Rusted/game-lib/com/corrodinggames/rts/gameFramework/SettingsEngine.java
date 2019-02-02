package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.utility.class_210;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class SettingsEngine {
   public boolean enableSounds;
   public boolean enableMouseCapture;
   public String slick2dResolution;
   public String slick2dFullScreenResolution;
   public boolean slick2dFullScreen;
   public float masterVolume;
   public float gameVolume;
   public float musicVolume;
   public float scrollSpeed;
   public float edgeScrollSpeed;
   public boolean hasPlayedGameOrSeenHelp;
   public boolean onscreenControls;
   public boolean trackpad;
   public boolean dpad;
   public boolean batterySaving;
   public boolean renderBackground;
   public boolean renderExtraLayers;
   public boolean immersiveFullScreen;
   public boolean renderDoubleScale;
   public float renderDensity = 1.0F;
   public float uiRenderScale = 1.0F;
   public boolean renderExtraShadows = true;
   public boolean renderFancyWater = false;
   public boolean renderClouds = false;
   public boolean showActionInfoHoverNearMouse = true;
   public boolean disableModLazyLoad = false;
   public boolean showUnitGroups;
   public boolean allowGameRecording;
   public boolean renderAntiAlias = true;
   public boolean renderControls;
   public boolean showHp;
   public boolean showUnitIcons;
   public boolean gestureZoom;
   public boolean showSelectedUnitsList = true;
   public boolean useCircleSelect;
   public boolean showZoomButton;
   public boolean showFps;
   public boolean showUnitWaypoints;
   public boolean useMinimapAllyColors;
   public boolean showWarLogOnScreen;
   public boolean quickRally;
   public boolean sendReports;
   public boolean shownAudioWarning;
   public boolean mouseSupport;
   public boolean keyboardSupport;
   public boolean forceEnglish;
   public boolean saveMultiplayerReplays;
   public boolean replaysShowRecordedChat;
   public int nextBackgroundMap;
   public String lastNetworkPlayerName;
   public String lastNetworkIP;
   public boolean landscapeOrientation;
   public int aiDifficulty;
   public int locationAction;
   public int locationDpad;
   public int keyAction;
   public int keyJump;
   public int keyLeft;
   public int keyRight;
   public int keyDown;
   public String uuid;
   public String networkClientId;
   public String networkServerId;
   public int lastSeenMessageId;
   public String lastSeenMessageIds;
   public int networkPort;
   public boolean udpInMultiplayer;
   public int numberOfWins;
   public boolean rateGameShown;
   public boolean highGraphics = true;
   public int mouseOrders;
   public int mousePlacement;
   public boolean liveReloading;
   public boolean renderVsync;
   public boolean renderSmoothDelta;
   public int teamUnitCapSinglePlayer = 1000;
   public int teamUnitCapHostedGame = 250;
   public String modSettings;
   public boolean smartSelection_v2;
   SharedPreferences prefs;
   static SettingsEngine settingsEngine = null;
   HashMap settingFields = new HashMap();

   public static SettingsEngine getInstance(Context var0) {
      if (settingsEngine == null) {
         settingsEngine = new SettingsEngine(var0);
      }

      return settingsEngine;
   }

   public boolean getBooleanPref(String var1, boolean var2) {
      return class_236.field_1899 ? var2 : this.prefs.getBoolean(var1, var2);
   }

   public int getIntPref(String var1, int var2) {
      return class_236.field_1899 ? var2 : this.prefs.getInt(var1, var2);
   }

   public float getFloatPref(String var1, float var2) {
      return class_236.field_1899 ? var2 : this.prefs.getFloat(var1, var2);
   }

   public String getStringPref(String var1, String var2) {
      return class_236.field_1899 ? var2 : this.prefs.getString(var1, var2);
   }

   public String getValueDynamic(String var1) {
      Object var2;
      try {
         Field var3 = (Field)this.settingFields.get(var1);
         if (var3 == null) {
            throw new RuntimeException("Could not find: " + var1);
         }

         var2 = var3.get(this);
      } catch (IllegalArgumentException var4) {
         throw new RuntimeException(var4);
      } catch (IllegalAccessException var5) {
         throw new RuntimeException(var5);
      }

      return var2 == null ? null : var2.toString();
   }

   public boolean setValueDynamic(String var1, String var2) {
      try {
         Field var3 = (Field)this.settingFields.get(var1);
         Object var4 = var2;
         if (var3.getType().equals(Boolean.TYPE)) {
            if (var2 == null) {
               throw new RuntimeException("value==null");
            }

            var4 = Boolean.parseBoolean(var2);
         }

         if (var3.getType().equals(Float.TYPE)) {
            var4 = Float.parseFloat(var2);
         }

         if (var3.getType().equals(Integer.TYPE)) {
            var4 = Integer.parseInt(var2);
         }

         var3.set(this, var4);
         return true;
      } catch (IllegalAccessException var5) {
         throw new RuntimeException(var5);
      }
   }

   public String getPreferencesPath() {
      String var1 = "/SD/rustedWarfare/preferences.ini";
      String var2 = class_236.method_1637(var1);
      return var2;
   }

   public void saveToFileSystem() {
      class_236 var1 = class_236.method_1549();
      File var2 = new File(this.getPreferencesPath());

      try {
         PrintWriter var3 = new PrintWriter(var2);
         var3.println("[settings]");
         Iterator var4 = this.settingFields.entrySet().iterator();

         String var6;
         String var7;
         while(var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            var6 = (String)var5.getKey();
            var7 = this.getValueDynamic(var6);
            if (var7 == null) {
               class_236.method_1591("saveToFileSystem: " + var6 + " is null");
               var7 = "";
            }

            var7 = var7.replace("\\", "\\\\");
            var7 = var7.replace("\n", "\\n");
            var3.println(var6 + ":" + var7);
         }

         var3.println("[keys]");
         var4 = var1.field_1940.field_3631.iterator();

         while(var4.hasNext()) {
            class_427 var9 = (class_427)var4.next();
            if (var9.field_3636 && !var9.method_2725()) {
               var6 = "";
               var6 = var6 + var9.method_2726();
               var7 = var1.field_1940.method_2711(var9);
               var3.println(var6 + ":" + var7);
            }
         }

         var3.close();
      } catch (IOException var8) {
         var8.printStackTrace();
         class_236.method_1549().method_1608("Failed to save preferences, IO error", 1);
      }

   }

   public void loadFromFileSystem() {
      class_236 var1 = class_236.method_1549();
      String var2 = this.getPreferencesPath();
      File var3 = new File(var2);
      if (!var3.exists()) {
         class_236.method_1591("preferences not found, not loading (" + var2 + ")");
      } else {
         class_236.method_1591("loadFromFileSystem filepath:" + var3.getAbsolutePath());
         String var4 = "settings";

         try {
            class_210 var5 = new class_210(var2);
            Iterator var6 = this.settingFields.entrySet().iterator();

            String var8;
            String var9;
            while(var6.hasNext()) {
               Entry var7 = (Entry)var6.next();
               var8 = (String)var7.getKey();
               var9 = var5.method_1393(var4, var8, (String)null);
               if (var9 != null && !"".equals(var9)) {
                  if (var8.startsWith("key.")) {
                     var8 = var8.replace("key.", "");
                     class_236.method_1591("loading keybind:" + var8);
                     var1.field_1940.method_2710(var8, var9);
                  } else {
                     this.setValueDynamic(var8, var9);
                  }
               }
            }

            var6 = var1.field_1940.field_3631.iterator();

            while(var6.hasNext()) {
               class_427 var11 = (class_427)var6.next();
               if (var11.field_3636 && !var11.method_2725()) {
                  var8 = var11.method_2726();
                  var9 = var5.method_1393("keys", var8, (String)null);
                  if (var9 != null && !"".equals(var9)) {
                     var1.field_1940.method_2710(var8, var9);
                  }
               }
            }
         } catch (IOException var10) {
            var10.printStackTrace();
            class_236.method_1549().method_1608("Failed to load preferences, IO error", 1);
         }

      }
   }

   private SettingsEngine(Context var1) {
      Field[] var2 = this.getClass().getFields();
      Field[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Field var6 = var3[var5];
         String var7 = var6.getName();
         if (this.settingFields.get(var7) != null) {
            class_236.method_1591("SettingsEngine: fields: " + var7 + " already exists");
         }

         this.settingFields.put(var7, var6);
      }

      if (!class_236.field_1899) {
         this.prefs = var1.method_1858("rts_settings", 0);
      }

      int var10 = this.getIntPref("settingVersion", 1);
      this.slick2dResolution = this.getStringPref("slick2dResolution", "native");
      this.slick2dFullScreenResolution = this.getStringPref("slick2dFullScreenResolution", "native");
      this.slick2dFullScreen = this.getBooleanPref("slick2dFullScreen", false);
      this.hasPlayedGameOrSeenHelp = this.getBooleanPref("hasPlayedGameOrSeenHelp", false);
      this.enableSounds = this.getBooleanPref("enableSounds", true);
      this.enableMouseCapture = this.getBooleanPref("enableMouseCapture", false);
      this.musicVolume = this.getFloatPref("musicVolume", 0.25F);
      float var11 = 1.0F;
      if (class_236.method_1654()) {
         var11 = 0.5F;
      }

      this.masterVolume = this.getFloatPref("masterVolume", var11);
      this.gameVolume = this.getFloatPref("gameVolume", 1.0F);
      this.scrollSpeed = this.getFloatPref("scrollSpeed", 1.0F);
      this.edgeScrollSpeed = this.getFloatPref("edgeScrollSpeed", 1.0F);
      this.onscreenControls = this.getBooleanPref("onscreenControls", true);
      this.trackpad = this.getBooleanPref("trackpad", true);
      this.dpad = this.getBooleanPref("dpad", true);
      this.batterySaving = this.getBooleanPref("batterySaving", false);
      this.renderBackground = this.getBooleanPref("renderBackground", true);
      this.renderExtraLayers = this.getBooleanPref("renderExtraLayers", true);
      this.renderControls = this.getBooleanPref("renderControls", true);
      this.immersiveFullScreen = this.getBooleanPref("immersiveFullScreen", true);
      this.renderDoubleScale = this.getBooleanPref("renderDoubleScale", false);
      this.showUnitGroups = this.getBooleanPref("showUnitGroups", true);
      boolean var12 = false;
      if (class_236.method_1654()) {
         var12 = true;
      }

      this.renderClouds = this.getBooleanPref("renderClouds", var12);
      this.showUnitWaypoints = this.getBooleanPref("showUnitWaypoints", true);
      this.useMinimapAllyColors = this.getBooleanPref("useMinimapAllyColors", true);
      boolean var13 = false;
      if (class_236.method_1654()) {
         var13 = true;
      }

      this.showWarLogOnScreen = this.getBooleanPref("showWarLogOnScreen", var13);
      boolean var14 = false;
      if (class_236.method_1654()) {
         var14 = true;
      }

      this.quickRally = this.getBooleanPref("quickRally", var14);
      if (var10 <= 1 && !class_236.method_1654()) {
         this.quickRally = var14;
      }

      this.allowGameRecording = false;
      this.showHp = this.getBooleanPref("showHp", true);
      this.showUnitIcons = this.getBooleanPref("showUnitIcons", true);
      this.gestureZoom = this.getBooleanPref("gestureZoom", true);
      this.useCircleSelect = this.getBooleanPref("useCircleSelect", false);
      this.showZoomButton = this.getBooleanPref("showZoomButton", true);
      this.showFps = this.getBooleanPref("showFps", false);
      this.sendReports = this.getBooleanPref("sendReports", true);
      this.shownAudioWarning = this.getBooleanPref("shownAudioWarning", false);
      this.mouseSupport = this.getBooleanPref("mouseSupport", !class_236.method_1583(var1));
      this.keyboardSupport = this.getBooleanPref("keyboardSupport", true);
      boolean var8 = false;
      this.forceEnglish = this.getBooleanPref("forceEnglish", var8);
      boolean var9 = false;
      if (class_236.method_1654()) {
         var9 = true;
      }

      this.saveMultiplayerReplays = this.getBooleanPref("saveMultiplayerReplays", var9);
      if (var10 <= 1) {
         this.saveMultiplayerReplays = var9;
      }

      this.replaysShowRecordedChat = this.getBooleanPref("replaysShowRecordedChat", true);
      this.lastNetworkPlayerName = this.getStringPref("lastNetworkPlayerName", (String)null);
      this.lastNetworkIP = this.getStringPref("lastNetworkIP", (String)null);
      this.aiDifficulty = this.getIntPref("aiDifficulty", 0);
      this.locationDpad = this.getIntPref("locationDpad", 0);
      this.locationAction = this.getIntPref("locationAction", 3);
      this.keyAction = this.getIntPref("keyAction", 23);
      this.keyJump = this.getIntPref("keyJump", 19);
      this.keyLeft = this.getIntPref("keyLeft", 21);
      this.keyRight = this.getIntPref("keyRight", 22);
      this.keyDown = this.getIntPref("keyDown", 20);
      this.landscapeOrientation = this.getBooleanPref("landscapeOrientation", true);
      this.networkPort = this.getIntPref("networkPort", 5123);
      if (this.networkPort < 1024 || this.networkPort > 65535) {
         this.networkPort = 5123;
      }

      this.udpInMultiplayer = this.getBooleanPref("udpInMultiplayer", false);
      this.numberOfWins = this.getIntPref("numberOfWins", 0);
      this.rateGameShown = this.getBooleanPref("rateGameShown", false);
      this.uuid = this.getStringPref("uuid", (String)null);
      this.networkClientId = this.getStringPref("networkClientId", (String)null);
      this.networkServerId = this.getStringPref("networkServerId", (String)null);
      this.lastSeenMessageId = this.getIntPref("lastSeenMessageId", -1);
      this.lastSeenMessageIds = this.getStringPref("lastSeenMessageIds", "");
      this.nextBackgroundMap = this.getIntPref("nextBackgroundMap", 1);
      this.modSettings = this.getStringPref("modSettings", "");
      this.smartSelection_v2 = this.getBooleanPref("smartSelection_v2", true);
      this.mouseOrders = this.getIntPref("mouseOrders", 1);
      this.mousePlacement = this.getIntPref("mousePlacement", 1);
      if (class_236.field_1900) {
         this.loadFromFileSystem();
      }

   }

   public synchronized void save() {
      if (class_236.field_1899) {
         if (class_236.field_1900) {
            this.saveToFileSystem();
         }

      } else {
         Editor var1 = this.prefs.edit();
         var1.putInt("settingVersion", 2);
         var1.putBoolean("hasPlayedGameOrSeenHelp", this.hasPlayedGameOrSeenHelp);
         var1.putString("slick2dResolution", this.slick2dResolution);
         var1.putString("slick2dFullScreenResolution", this.slick2dFullScreenResolution);
         var1.putBoolean("slick2dFullScreen", this.slick2dFullScreen);
         var1.putBoolean("enableSounds", this.enableSounds);
         var1.putBoolean("enableMouseCapture", this.enableMouseCapture);
         Log.method_1712("RustedWarfare", "put mv:" + this.musicVolume);
         var1.putFloat("musicVolume", this.musicVolume);
         var1.putFloat("masterVolume", this.masterVolume);
         var1.putFloat("gameVolume", this.gameVolume);
         var1.putFloat("scrollSpeed", this.scrollSpeed);
         var1.putFloat("edgeScrollSpeed", this.edgeScrollSpeed);
         var1.putBoolean("onscreenControls", this.onscreenControls);
         var1.putBoolean("trackpad", this.trackpad);
         var1.putBoolean("dpad", this.dpad);
         var1.putBoolean("batterySaving", this.batterySaving);
         var1.putBoolean("renderBackground", this.renderBackground);
         var1.putBoolean("renderExtraLayers", this.renderExtraLayers);
         var1.putBoolean("renderControls", this.renderControls);
         var1.putBoolean("immersiveFullScreen", this.immersiveFullScreen);
         var1.putBoolean("renderDoubleScale", this.renderDoubleScale);
         var1.putBoolean("showUnitGroups", this.showUnitGroups);
         var1.putBoolean("renderClouds", this.renderClouds);
         var1.putBoolean("showUnitWaypoints", this.showUnitWaypoints);
         var1.putBoolean("useMinimapAllyColors", this.useMinimapAllyColors);
         var1.putBoolean("showWarLogOnScreen", this.showWarLogOnScreen);
         var1.putBoolean("quickRally", this.quickRally);
         var1.putBoolean("allowGameRecording", this.allowGameRecording);
         var1.putBoolean("showHp", this.showHp);
         var1.putBoolean("showUnitIcons", this.showUnitIcons);
         var1.putBoolean("gestureZoom", this.gestureZoom);
         var1.putBoolean("useCircleSelect", this.useCircleSelect);
         var1.putBoolean("showZoomButton", this.showZoomButton);
         var1.putBoolean("showFps", this.showFps);
         var1.putBoolean("sendReports", this.sendReports);
         var1.putBoolean("shownAudioWarning", this.shownAudioWarning);
         var1.putBoolean("mouseSupport", this.mouseSupport);
         var1.putBoolean("keyboardSupport", this.keyboardSupport);
         var1.putBoolean("forceEnglish", this.forceEnglish);
         var1.putBoolean("saveMultiplayerReplays", this.saveMultiplayerReplays);
         var1.putBoolean("replaysShowRecordedChat", this.replaysShowRecordedChat);
         var1.putString("lastNetworkPlayerName", this.lastNetworkPlayerName);
         var1.putString("lastNetworkIP", this.lastNetworkIP);
         var1.putInt("aiDifficulty", this.aiDifficulty);
         var1.putInt("locationDpad", this.locationDpad);
         var1.putInt("locationAction", this.locationAction);
         var1.putInt("keyAction", this.keyAction);
         var1.putInt("keyJump", this.keyJump);
         var1.putInt("keyLeft", this.keyLeft);
         var1.putInt("keyRight", this.keyRight);
         var1.putInt("keyDown", this.keyDown);
         var1.putBoolean("landscapeOrientation", this.landscapeOrientation);
         var1.putInt("networkPort", this.networkPort);
         var1.putBoolean("udpInMultiplayer", this.udpInMultiplayer);
         var1.putInt("numberOfWins", this.numberOfWins);
         var1.putBoolean("rateGameShown", this.rateGameShown);
         var1.putString("uuid", this.uuid);
         var1.putString("networkClientId", this.networkClientId);
         var1.putString("networkServerId", this.networkServerId);
         var1.putInt("lastSeenMessageId", this.lastSeenMessageId);
         var1.putString("lastSeenMessageIds", this.lastSeenMessageIds);
         var1.putInt("nextBackgroundMap", this.nextBackgroundMap);
         var1.putString("modSettings", this.modSettings);
         var1.putBoolean("smartSelection_v2", this.smartSelection_v2);
         var1.putInt("mouseOrders", this.mouseOrders);
         var1.putInt("mousePlacement", this.mousePlacement);
         var1.commit();
      }
   }
}
