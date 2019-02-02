package com.corrodinggames.librocket.scripts;

import android.graphics.Color;
import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.class_263;
import com.corrodinggames.rts.a.class_268;
import com.corrodinggames.rts.a.class_269;
import com.corrodinggames.rts.a.class_271;
import com.corrodinggames.rts.a.class_272;
import com.corrodinggames.rts.a.class_353;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_298;
import com.corrodinggames.rts.gameFramework.class_303;
import com.corrodinggames.rts.gameFramework.class_305;
import com.corrodinggames.rts.gameFramework.class_427;
import com.corrodinggames.rts.gameFramework.d.class_432;
import com.corrodinggames.rts.gameFramework.f.class_396;
import com.corrodinggames.rts.gameFramework.f.class_437;
import com.corrodinggames.rts.gameFramework.f.class_444;
import com.corrodinggames.rts.gameFramework.f.class_453;
import com.corrodinggames.rts.gameFramework.f.class_456;
import com.corrodinggames.rts.gameFramework.f.class_458;
import com.corrodinggames.rts.gameFramework.f.class_462;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.java.class_346;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Root extends ScriptContext {
   class_437 threadedGameConnector;
   ArrayList lastSortedDiscoveredServers;

   public void logDebug(String var1) {
      class_236.method_1591("ui[debug]: " + var1);
   }

   public void logWarn(String var1) {
      class_236.method_1591("ui[warn]: " + var1);
   }

   public void back() {
      this.libRocket.backToLastDocument();
      if (this.libRocket.getActiveDocument() == null) {
         class_236.method_1588("back: libRocket.getActiveDocument()==null");
         class_236 var1 = class_236.method_1549();
         if (var1 != null && var1.field_1914) {
            class_236.method_1588("back: resuming game");
            this.main.method_1512(false);
         } else {
            class_236.method_1588("back: showing main menu!");
            this.showMainMenu();
         }
      }

   }

   public void backOrClose() {
      if (!this.closePopup()) {
         this.libRocket.backToLastDocument();
      }
   }

   public String fullVersionOnlyStyle() {
      return class_236.method_1549().field_1885 ? "notInDemo" : "";
   }

   public void openIfNotDemo(String var1, Object var2, String var3) {
      if (class_236.method_1549().field_1885) {
         this.alert(var3);
      } else {
         this.open(var1, var2);
      }
   }

   public String getVersionName() {
      class_236 var1 = class_236.method_1549();
      return var1.method_1563() ? "RAW - " + var1.method_1566() : var1.method_1566();
   }

   public void open(String var1, Object var2) {
      HashMap var3 = null;
      if (var2 != null) {
         var3 = new HashMap();
         var3.put("mode", var2);
      }

      this.libRocket.setDocument(var1, var3);
      this.onShowNewScreen();
   }

   public void onShowNewScreen() {
      this.main.method_1512(true);
   }

   public void resume() {
      this.libRocket.closeActiveDocument();
      this.libRocket.clearHistory();
      this.main.method_1513();
   }

   public void resumeNonMenu() {
      this.libRocket.closeActiveDocument();
      this.libRocket.clearHistory();
      this.main.method_1512(false);
   }

   public void startNew(String var1) {
      this.main.method_1511(var1);
      this.libRocket.closeActiveDocument();
      this.libRocket.clearHistory();
   }

   public void showRangeValue(String var1, String var2, boolean var3) {
      Element var4 = this.libRocket.getActiveElementById(var1);
      if (var4 == null) {
         this.logWarn("Could not find:" + var1);
      } else {
         String var5 = var4.getAttribute("value");
         if (var3) {
            var5 = (new Float(var5)).toString();
         } else {
            var5 = Integer.toString((int)Float.parseFloat(var5));
         }

         Element var6 = this.libRocket.getActiveElementById(var2);
         if (var6 == null) {
            this.logWarn("Could not find:" + var2);
         } else {
            var6.setText(var5);
         }
      }
   }

   public String getValueById(String var1) {
      Element var2 = this.libRocket.getActiveElementById(var1);
      if (var2 == null) {
         this.logWarn("Could not find:" + var1);
         return null;
      } else {
         String var3 = var2.getAttribute("value");
         return var3;
      }
   }

   public void setValueById(String var1, String var2) {
      Element var3 = this.libRocket.getActiveElementById(var1);
      if (var3 == null) {
         this.logWarn("Could not find:" + var1);
      } else {
         var3.setAttribute("value", var2);
      }
   }

   public Element getElementById(String var1) {
      Element var2 = this.libRocket.getActiveElementById(var1);
      if (var2 == null) {
         this.logWarn("Could not find:" + var1);
         return null;
      } else {
         return var2;
      }
   }

   public boolean clickElement(Element var1) {
      if (var1 == null) {
         this.logWarn("element is null");
         return false;
      } else {
         var1.click();
         return true;
      }
   }

   public void directJoinPopup() {
      class_236 var1 = class_236.method_1549();
      String var2 = "Direct Join";
      String var3 = "Enter IP address or host name";
      String var4 = "";
      if (var1.field_1937.lastNetworkIP != null) {
         var4 = var1.field_1937.lastNetworkIP;
      }

      this.showInputPopup(var2, var3, var4, "[onenter]Join:joinServerFromPopup(getPopupText())", (String)null);
   }

   public void joinServerFromPopup(String var1) {
      this.closePopup();
      if (var1 == null) {
         this.logDebug("joinAddress==null");
      } else {
         var1 = var1.trim();
         class_236 var2 = class_236.method_1549();
         var2.field_1937.lastNetworkIP = var1;
         var2.field_1937.save();
         this.joinServer(var1);
      }
   }

   public void joinServer(String var1) {
      this.logDebug("joinAddress=" + var1);
      Root$1 var2 = new Root$1(this);
      this.threadedGameConnector = this.main.field_1825.method_2914(var1, false, var2);
      this.createAndShowPopup("multiplayerLobby_connecting.rml", (Object)null, "Please wait");
   }

   public void joinServerCallback() {
      class_236 var1 = class_236.method_1549();
      if (this.threadedGameConnector == null) {
         this.logDebug("threadedGameConnector==null");
      } else {
         this.closePopup();
         String var3;
         if (this.threadedGameConnector.field_3664 != null) {
            this.logWarn("Server join failed");
            boolean var2 = true;
            var3 = "Connection failed";
            this.showPopup(var3, this.threadedGameConnector.field_3664, var2, (String)null, (String)null);
         } else {
            try {
               this.main.field_1825.method_2873("starting new");
               this.main.field_1825.method_2916(this.threadedGameConnector.field_3666);
               this.logDebug("connected");
               this.showBattleroom();
            } catch (IOException var4) {
               var3 = var4.getMessage();
               var1.method_1609(var3, "Connection failed");
               var4.printStackTrace();
            }
         }

         this.threadedGameConnector = null;
      }
   }

   public void cancelJoinServer() {
      if (this.threadedGameConnector != null) {
         if (this.threadedGameConnector.method_2746()) {
            this.closePopup();
         }
      } else {
         this.closePopup();
      }

   }

   public void alert(String var1) {
      this.showAlert(var1);
   }

   public void showAlert(String var1) {
      this.logDebug("alert:" + var1);
      if (var1 == null) {
         var1 = "null";
      }

      this.libRocket.method_1839(var1);
   }

   public void showPopupWithButtons(String var1, String var2, boolean var3, class_263 var4, class_263 var5) {
      this.logDebug("showPopup:" + var2);
      if (var2 == null) {
         var2 = "null";
      }

      Object var6 = null;
      this.libRocket.method_1842(var1, var2, (String)var6, var4, var5);
   }

   public void showPopup(String var1, String var2, boolean var3, String var4, String var5) {
      this.logDebug("showPopup:" + var2);
      if (var2 == null) {
         var2 = "null";
      }

      Object var6 = null;
      this.libRocket.method_1841(var1, var2, (String)var6, var4, var5);
   }

   public void showInputPopup(String var1, String var2, String var3, String var4, String var5) {
      this.logDebug("showInputPopup:" + var2);
      if (var2 == null) {
         var2 = "null";
      }

      String var6 = var3;
      if (var3 == null) {
         var6 = "";
      }

      this.libRocket.method_1841(var1, var2, var6, var4, var5);
   }

   public void showInputPopupNonClose(String var1, String var2, String var3, String var4, String var5) {
      this.logDebug("showInputPopup:" + var2);
      if (var2 == null) {
         var2 = "null";
      }

      String var6 = var3;
      if (var3 == null) {
         var6 = "";
      }

      this.libRocket.method_1844(var1, var2, var6, var4, var5, true, false);
   }

   public ElementDocument getPopup() {
      return this.libRocket.method_1834();
   }

   public ElementDocument getAlertOrPopup() {
      return this.libRocket.method_1836();
   }

   public boolean closePopup() {
      return this.libRocket.method_1850();
   }

   public String getPopupText() {
      return this.libRocket.method_1851();
   }

   public void showHostOptions() {
      this.libRocket.method_1841("Host game", class_432.method_2744("menus.hostgame.info_pc"), (String)null, "Host Private:closePopup();hostStart(false);", "Host Public:closePopup();hostStart(true);");
   }

   public void hostStartFromPopup(boolean var1) {
      ElementDocument var2 = this.libRocket.method_1838();
      Element var3 = var2.getElementById("password");
      String var4 = null;
      if (var3 == null) {
         this.logWarn("hostStartFromPopup: password==null");
      } else {
         String var5 = var3.getValue();
         if (var5 != null && !var5.trim().equals("")) {
            var4 = var5;
         }
      }

      Element var7 = var2.getElementById("useMods");
      boolean var6 = var7.getCheckbox();
      this.closePopup();
      this.hostStartWithPasswordAndMods(var1, var4, var6);
   }

   public void hostStart(boolean var1) {
      class_236.method_1588("old version of hostStart");
      this.hostStartWithPassword(var1, (String)null);
   }

   public void hostStartWithPassword(boolean var1, String var2) {
      class_236.method_1588("old version of hostStartWithPassword");
      this.hostStartWithPasswordAndMods(var1, var2, true);
   }

   public void hostStartWithPasswordAndMods(boolean var1, String var2, boolean var3) {
      class_236 var4 = class_236.method_1549();
      this.main.field_1825.method_2873("starting new");
      var4.field_1944.field_3796 = var2;
      var4.field_1944.field_3797 = var3;
      var4.field_1944.field_3799 = var1;
      if (this.main.field_1825.method_2912(false)) {
         this.logDebug("hosting");
         String var5 = this.main.field_1825.method_2970();
         if (var5 != null && !class_236.method_1634(var5)) {
            class_236.method_1588("hostStart: map does not exist: " + var5 + " reseting");
            var5 = null;
         }

         if (var5 == null) {
            byte var6 = 0;
            this.main.field_1825.field_3863.field_3775 = class_396.values()[var6];
            this.main.field_1825.field_3864 = "maps/skirmish/[p8]Many Islands (8p).tmx";
            this.main.field_1825.field_3863.field_3776 = "[p8]Many Islands (8p).tmx";
         }

         this.libRocket.setDocument("battleroom.rml", (HashMap)null);
      } else {
         this.logWarn("hosting failed");
      }

   }

   public void exit() {
      this.scriptEngine.addRunnableToQueue(new Root$2(this));
   }

   public String getMapDetails(String var1) {
      return "hello 123";
   }

   public String getMapNameFromPath(String var1) {
      File var2 = new File(var1);
      return this.convertMapName(var2.getName());
   }

   public String convertMapName(String var1) {
      String var2 = this.convertMapNameWithoutTranslation(var1);
      var2 = class_432.method_2745(var2);
      return var2;
   }

   public String convertMapNameWithoutTranslation(String var1) {
      String var2 = class_271.method_1887(var1);
      return var2;
   }

   public String getMapThumbnail(String var1) {
      return var1.startsWith("saves/") ? "drawable:icon_save.png" : "assets:" + class_353.method_2292(var1);
   }

   public boolean isMapSkirmish(String var1) {
      return var1.contains("skirmish/");
   }

   public void showLevelOptions() {
      class_236 var1 = class_236.method_1549();
      String var2 = (String)this.libRocket.method_1833("mode");
      if (var2 == null) {
         class_236.method_1595("levelPath==null");
      } else {
         boolean var3 = true;
         if (!this.isMapSkirmish(var2)) {
            var3 = false;
         }

         ElementDocument var4 = this.libRocket.getActiveDocument();
         Iterator var5 = var4.findElementsByClassName("skirmishOnly").iterator();

         while(var5.hasNext()) {
            Element var6 = (Element)var5.next();
            var6.show(var3);
         }

         Element var7 = var4.getElementById("aiDifficulty");
         var7.setValue("" + var1.field_1937.aiDifficulty);
      }
   }

   public void loadConfigAndStartSwitchToAdvanced(String var1) {
      boolean var2 = true;
      class_236 var3 = class_236.method_1549();
      var3.field_1918 = false;
      this.loadConfigCommon(var1, var2);
      this.main.field_1825.method_2873("starting singleplayer");
      this.main.field_1825.field_3804 = "You";
      var3.field_1944.field_3797 = true;
      if (this.main.field_1825.method_2911()) {
         this.logDebug("started startSinglePlayerServer");
         class_453 var4 = var3.field_1944.method_2850();
         if (var4 != null) {
            var4.field_3780 = var3.field_1937.aiDifficulty;
            var3.field_1944.method_2852(var4);
         }

         this.libRocket.setDocument("battleroom.rml", (HashMap)null);
      } else {
         this.logWarn("failed startSinglePlayerServer");
      }

   }

   public void loadConfigAndStartNewSandbox(String var1) {
      boolean var2 = false;
      if (var1.startsWith("saves/")) {
         class_236.method_1591("Starting sandbox from save: " + var1);
         this.loadGame(var1.substring("saves/".length()));
      } else {
         class_236.method_1591("Starting sandbox from map: " + var1);
         this.loadConfigCommon(var1, var2);
      }

      class_236 var3 = class_236.method_1549();
      var3.field_1932.field_3344 = false;
      var3.field_1939.method_762();
      var3.field_1918 = true;
      this.main.method_1513();
      this.libRocket.closeActiveDocument();
      this.libRocket.clearHistory();
   }

   public void loadConfigAndStartNew(String var1) {
      class_236 var2 = class_236.method_1549();
      var2.field_1918 = false;
      boolean var3 = false;
      this.loadConfigCommon(var1, var3);
      this.main.method_1513();
      this.libRocket.closeActiveDocument();
      this.libRocket.clearHistory();
   }

   public void loadConfigCommon(String var1, boolean var2) {
      class_236 var3 = class_236.method_1549();
      ElementDocument var4 = this.libRocket.getActiveDocument();
      Element var5 = var4.getElementById("aiDifficulty");
      var3.field_1937.aiDifficulty = var5.getValueAsInt(0);
      var3.field_1937.save();
      this.main.method_1518(true);
      this.main.field_1836 = false;
      boolean var7 = this.isMapSkirmish(var1);
      int var8 = var4.getElementById("numberOfAIs").getValueAsInt(4);
      boolean var9 = true;
      int var10 = var4.getElementById("aiTeams").getValueAsInt(1);
      int var11 = var10 - 1;
      if (var10 == 5) {
         var11 = 0;
         var9 = false;
      }

      class_271.method_1888(var1, var7, var8, var11, var9, var2);
   }

   public void showMapPopup(String var1, String var2) {
      boolean var3 = false;
      ElementDocument var4 = this.libRocket.method_1847("levelSelect.rml", var1, "Map Select", var3);
      if (var4 != null) {
         var4.setMetadata("mapClickFunction", var2);
         Iterator var5 = var4.findElementsByClassName("noStyleInPopup").iterator();

         while(var5.hasNext()) {
            Element var6 = (Element)var5.next();
            var6.setAttribute("class", "");
         }

         if (this.showMapsWithDoc(var4)) {
            class_236.method_1591("showMapsWithDoc passed");
            this.libRocket.method_1850();
            this.libRocket.method_1846(var4);
         }
      }

   }

   public boolean showMaps() {
      ElementDocument var1 = this.libRocket.method_1837();
      return this.showMapsWithDoc(var1);
   }

   public boolean showMapsWithDoc(ElementDocument var1) {
      class_236 var2 = class_236.method_1549();
      class_236.method_1591("showMaps");
      if (var1 == null) {
         class_236.method_1591("showMaps: elementDocument==null");
         return false;
      } else {
         Element var3 = var1.getElementById("mapTemplateHolder");
         Element var4 = var1.getElementById("mapHolder");
         String var5 = var3.getInnerRML();
         String var6 = "";
         String var7 = (String)var1.getMetadata("mode");
         String var8 = (String)var1.getMetadata("mapClickFunction");
         boolean var9 = var7.equals("saves");
         boolean var10 = var7.equals("replays");
         String[] var11;
         if (var9) {
            var11 = class_272.method_1889();
            if (var11 == null) {
               var2.method_1608("No saves", 1);
               return false;
            }
         } else if (var10) {
            var11 = class_269.method_1877();
            if (!var2.field_1937.saveMultiplayerReplays) {
               this.alert("Note: Multiplayer replay recordings are not turned on. You can enable them in the settings.");
            }

            if (var11 == null) {
               if (var2.field_1937.saveMultiplayerReplays) {
                  var2.method_1608("No replays yet", 1);
               }

               return false;
            }
         } else {
            var11 = class_236.method_1638(var7, true);
            var11 = var2.field_1946.method_1447(var11, var7);
            if (var11 == null) {
               var2.method_1608("Could not find folder: " + class_236.method_1637(var7), 1);
               return false;
            }
         }

         String var12 = var7 + "/";
         int var13 = 0;
         String[] var14 = var11;
         int var15 = var11.length;

         for(int var16 = 0; var16 < var15; ++var16) {
            String var17 = var14[var16];
            String var19 = this.convertMapName(var17);
            boolean var20 = class_271.method_1886(var17, var12 + var17);
            String var21 = var19 + "";
            if (var2.field_1885 && !var20) {
               var21 = "[LOCKED] " + var21;
            }

            String var18 = var5.replace("_NAME_", var21);
            String var22;
            if (var9) {
               var22 = "loadGame(" + this.escapedString(var17) + ")";
            } else if (var10) {
               var22 = "loadReplay(" + this.escapedString(var17) + ")";
            } else {
               var22 = "open('levelOptions.rml', " + this.escapedString(var12 + var17) + ")";
            }

            if (var8 != null) {
               var22 = var8 + "(" + this.escapedString(var12 + var17) + ")";
            }

            var18 = var18.replace("_ONCLICK_", var22);
            String var23 = "assets:";
            if (var13 > 18) {
               var23 = "lazy:" + var23;
            }

            String var24 = class_353.method_2292(var12 + var17);
            String var25 = var23 + var24;
            if (!class_236.method_1634(var24)) {
               var25 = "drawable:button_subtract.png";
            }

            if (var9 || var10) {
               var25 = "";
            }

            var18 = var18.replace("_IMG_", var25);
            ++var13;
            var6 = var6 + var18;
         }

         var4.setInnerRML(var6);
         var4.loadCharsetIfNeeded(var6);
         if (var9 || var10) {
            var4.addClass("savesOnly");
         }

         return true;
      }
   }

   public void convertTextOnPage() {
      class_236 var1 = class_236.method_1549();
      this.logDebug("convertTextOnPage");
      ElementDocument var2 = this.libRocket.getActiveDocument();
      ArrayList var3 = var2.getAllNestedChildren();
      Iterator var4 = var3.iterator();

      while(true) {
         Element var5;
         String var11;
         do {
            do {
               if (!var4.hasNext()) {
                  return;
               }

               var5 = (Element)var4.next();
               int var6 = var5.getNumAttributes();

               for(int var7 = 0; var7 < var6; ++var7) {
                  String var8 = var5.getAttributeKey(var7);
                  String var9 = var5.getAttributeValue(var7);
                  if (var8 != null) {
                     Element var13;
                     if (var8.equals("nestedclone") && !var9.equalsIgnoreCase("false")) {
                        class_236.method_1591("nested clone:" + var5.getId());
                        var5.setAttribute(var8, "false");
                        var13 = var5.clone();
                        var5.prependChild(var13);
                        var13.removeReference();
                     } else if (var8.equals("childclone") && !var9.equalsIgnoreCase("false")) {
                        var5.setAttribute(var8, "false");
                        if (var5.getNumChildren() < 1) {
                           class_236.method_1591("child clone failed no children:" + var5.getId());
                        }

                        var13 = var5.getChild(0).clone();
                        var13.addClass("clone");
                        var5.prependChild(var13);
                        var13.removeReference();
                     } else {
                        String var10 = this.libRocket.method_1852(var9);
                        if (var10 != null) {
                           class_236.method_1591("convertTextOnPage:" + var8 + ": '" + var9 + "' to '" + var10 + "'");
                           if (var8.equals("_html")) {
                              class_236.method_1591("setting html:" + var8);
                              var5.setInnerRML(var10);
                           } else {
                              if (var8.startsWith("_")) {
                                 var8 = var8.substring("_".length());
                                 class_236.method_1591("converted key to:" + var8);
                              }

                              var5.setAttribute(var8, var10);
                           }
                        }
                     }
                  }
               }
            } while(!var2.translatedToUnicode);

            var11 = var5.getTagName();
         } while(!var11.equals("p") && !var11.startsWith("h") && !var11.startsWith("label") && !var11.startsWith("button") && !var11.startsWith("select"));

         boolean var12 = var5.loadCharsetIfNeededWithCurrentText();
      }
   }

   public void keyBindingPopup_apply(boolean var1) {
      class_236 var2 = class_236.method_1549();
      ElementDocument var3 = this.libRocket.method_1834();
      if (var3 == null) {
         this.logWarn("showKeyBindingActionPopup: popup==null");
      } else {
         String var4 = (String)var3.getMetadata("mode");
         String[] var5 = var4.split(":");
         int var6 = Integer.parseInt(var5[0]);
         int var7 = Integer.parseInt(var5[1]);
         ArrayList var8 = var2.field_1940.field_3631;
         class_427 var9 = (class_427)var8.get(var6);
         if (!var1) {
            Object var10 = var3.getMetadata("lastKeyPressed");
            if (var10 == null) {
               this.logWarn("keyBindingPopup_apply: no last key entered");
               return;
            }

            int var11 = (Integer)var10;
            int var12 = 0;
            Object var13 = var3.getMetadata("lastKeyModifiersPressed");
            if (var13 != null) {
               var12 = (Integer)var13;
            }

            var9.method_2720(var11, var7, var12, true);
         } else {
            byte var14 = 0;
            var9.method_2720(0, var7, var14, true);
         }

         this.showKeyBinding();
         this.closePopup();
      }
   }

   public void keyBindingPopup_onKeydown(int var1) {
      class_236 var2 = class_236.method_1549();
      ElementDocument var3 = this.libRocket.method_1834();
      if (var3 == null) {
         this.logWarn("showKeyBindingActionPopup: popup==null");
      } else {
         Element var4 = var3.getElementById("keyBindMessage");
         if (var4 == null) {
            this.logWarn("showKeyBindingActionPopup: keyBindMessage==null");
         } else {
            String var5 = "";
            int var6 = this.main.field_1838.method_2226();
            var5 = var5 + class_236.method_1626(var6);
            if (var1 == 111) {
            }

            if (var1 == 0) {
               this.logWarn("keyBindingPopup_onKeydown: skipping keycode 0");
            } else if (!var2.method_1625(var1)) {
               var3.setMetadata("lastKeyPressed", var1);
               var3.setMetadata("lastKeyModifiersPressed", var6);
               (new StringBuilder()).append(var5).append(SlickToAndroidKeycodes.method_1417(var1)).toString();
               this.keyBindingPopup_apply(false);
            } else {
               String var7 = "Key: " + var5;
               var4.setText(var7);
            }
         }
      }
   }

   public void showKeyBindingPopup() {
      class_236 var1 = class_236.method_1549();
      ElementDocument var2 = this.libRocket.method_1834();
      if (var2 == null) {
         this.logWarn("showKeyBindingActionPopup: popup==null");
      } else {
         Element var3 = var2.getElementById("keyBindMessage");
         if (var3 == null) {
            this.logWarn("showKeyBindingActionPopup: keyBindMessage==null");
         } else {
            String var4 = (String)var2.getMetadata("mode");
            String[] var5 = var4.split(":");
            int var6 = Integer.parseInt(var5[0]);
            int var7 = Integer.parseInt(var5[1]);
            ArrayList var8 = var1.field_1940.field_3631;
            class_427 var9 = (class_427)var8.get(var6);
            String var10 = "Press a key..";
            var3.setText(var10);
         }
      }
   }

   public String getKeyBindingAction(int var1, class_427 var2, int var3) {
      String var4 = var1 + ":" + var3;
      return "createAndShowPopup('settingsKeyBindingSet.rml', " + this.escapedString(var4) + ", " + this.escapedString(var2.field_3635) + "); showKeyBindingPopup();";
   }

   public void showKeyBinding() {
      class_236 var1 = class_236.method_1549();
      ElementDocument var2 = this.libRocket.getActiveDocument();
      var2.setMetadata("event_onkeydown", "keyBindingPopup_onKeydown");
      ArrayList var3 = new ArrayList();
      ArrayList var4 = var1.field_1940.field_3631;

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         class_427 var6 = (class_427)var4.get(var5);
         if (var6.field_3636) {
            Root$TableRow var7 = new Root$TableRow();
            var7.addCell(var6.field_3635);
            if (var6.method_2725()) {
               var7.addClass("rowHeader");
            } else {
               var7.addCell(var6.method_2718(0)).setLibrocketOnClick(this.getKeyBindingAction(var5, var6, 0));
               var7.addCell(var6.method_2718(1)).setLibrocketOnClick(this.getKeyBindingAction(var5, var6, 1));
            }

            var3.add(var7);
         }
      }

      this.refreshTable("keysDiv", var3);
   }

   public void loadSettings() {
      class_236 var1 = class_236.method_1549();
      this.logDebug("loadSettings");
      Element var2 = this.libRocket.getActiveElementById("body");
      ArrayList var3 = var2.getAllNestedChildren();
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         Element var5 = (Element)var4.next();
         String var6 = var5.getAttribute("data-settings");
         if (var6 != null) {
            String var7 = var5.getId();
            String var8 = var5.getAttribute("type", "unknown");
            class_236.method_1591("loadSettings: Found:" + var7 + ", " + var5.getTagName());
            String var9 = var1.field_1937.getValueDynamic(var7);
            class_236.method_1591("value:" + var9);
            if (var8.equals("checkbox")) {
               if (Boolean.parseBoolean(var9)) {
                  var5.setAttribute("checked", "");
               } else {
                  var5.setAttribute("checked", (String)null);
               }
            } else {
               var5.setAttribute("value", var9);
            }
         }
      }

   }

   public void applyResolution() {
      this.main.method_1527();
   }

   public void saveSettings() {
      class_236 var1 = class_236.method_1549();
      this.logDebug("saveSettings");
      Element var2 = this.libRocket.getActiveElementById("body");
      ArrayList var3 = var2.getAllNestedChildren();
      Iterator var4 = var3.iterator();

      while(true) {
         Element var5;
         String var6;
         do {
            if (!var4.hasNext()) {
               this.main.method_1527();
               class_305.method_2109();
               class_432.method_2740();
               this.main.field_1853 = true;
               return;
            }

            var5 = (Element)var4.next();
            var6 = var5.getAttribute("data-settings");
         } while(var6 == null);

         String var7 = var5.getId();
         String var8 = var5.getAttribute("type", "unknown");
         this.logDebug("saveSettings: Found:" + var7 + ", " + var5.getTagName());
         String var9 = null;
         if (var8.equals("checkbox")) {
            String var10 = var5.getAttribute("checked");
            if (var10 != null && !"false".equals(var10)) {
               var9 = "true";
            } else {
               var9 = "false";
            }
         } else {
            var9 = var5.getAttribute("value");
         }

         this.logDebug("read value:" + var9);

         try {
            var1.field_1937.setValueDynamic(var7, var9);
         } catch (NumberFormatException var11) {
            this.alert("Error:" + var11.getMessage());
         }
      }
   }

   public String hideStyle(boolean var1) {
      return var1 ? "" : "display:none;";
   }

   public String hideClass(boolean var1) {
      return var1 ? "" : "hide";
   }

   public boolean canResume() {
      class_236 var1 = class_236.method_1549();
      return var1 != null && var1.field_1928 && !var1.field_1929;
   }

   String restrictedString(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.replace("'", ".");
         var1 = var1.replace("\"", ".");
         var1 = var1.replace("(", ".");
         var1 = var1.replace(")", ".");
         var1 = var1.replace(",", ".");
         var1 = var1.replace("<", ".");
         var1 = var1.replace(">", ".");
         return "'" + var1 + "'";
      }
   }

   String escapedString(String var1) {
      var1 = var1.replace("'", "\\'");
      var1 = var1.replace("\"", "\"");
      return "'" + var1 + "'";
   }

   String htmlString(String var1) {
      var1 = var1.replace("&", "&amp;");
      var1 = var1.replace("<", "&lt;");
      var1 = var1.replace(">", "&gt;");
      var1 = var1.replace("${", "$ {");
      return "" + var1 + "";
   }

   public void refreshServerList(String var1, String var2, String var3) {
      if (var3 != null) {
         Element var4 = this.libRocket.getActiveElementById(var3);
         var4.setText("Refreshing");
      }

      Root$3 var5 = new Root$3(this, var1, var2, var3);
      class_444.method_2833(var5);
   }

   public void displayServerList(String var1, String var2, String var3) {
      class_236 var4 = class_236.method_1549();
      Element var5 = this.libRocket.getActiveElementById(var1);
      Element var6 = this.libRocket.getActiveElementById(var2);
      if (var5 == null) {
         class_236.method_1588("serverListData is null, we may have changed page");
      } else {
         Element var7 = var5;
         ArrayList var8 = class_268.method_1876();
         this.lastSortedDiscoveredServers = var8;
         String var9 = class_432.method_2744("menus.lobby.gameState.battleroom");
         String var10 = class_432.method_2744("menus.lobby.gameState.ingame");
         String var11 = class_432.method_2744("menus.lobby.gameState.chat");
         int var12;
         if (var5.getNumChildren() > var8.size()) {
            for(var12 = var5.getNumChildren() - 1; var12 >= var8.size(); --var12) {
               class_236.method_1591("removing rowIndex:" + var12);
               var7.removeChild(var7.getChild(var12));
            }

            if (var7.getNumChildren() != var8.size()) {
               class_236.method_1588("-- Non matching size after clean up:" + var7.getNumChildren() + " vs " + var8.size());
            }
         }

         var12 = 0;

         for(Iterator var13 = var8.iterator(); var13.hasNext(); ++var12) {
            class_462 var14 = (class_462)var13.next();
            Element var15 = null;
            if (var12 < var7.getNumChildren()) {
               var15 = var7.getChild(var12);
            }

            if (var15 != null && var15.hasClassName("serverRowMessage")) {
               class_236.method_1591("removing non rowIndex:" + var12);
               var7.removeChild(var15);
               var15 = null;
            }

            if (var15 == null) {
               var15 = var6.clone();
               var7.appendChild(var15);
               var15.removeReference();
               var15.setAttribute("onclick", "clickedServerRow(" + var12 + ")");
            }

            String var16 = var14.field_3976;
            if (var16 != null) {
               var16 = var16.replace("battleroom", var9);
               var16 = var16.replace("ingame", var10);
               var16 = var16.replace("chat", var11);
            }

            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = false;
            if (var14 != null && var14.field_3981) {
               var17 = true;
               if ("chat".equalsIgnoreCase(var14.field_3976)) {
                  var18 = true;
               }
            }

            int var20 = Color.method_3077(255, 255, 255, 255);
            String var21 = "serverRow serverRowData realServerRow ";
            boolean var22 = false;
            if (var14 != null) {
               if (var17) {
                  var22 = true;
                  if (var18) {
                     var20 = Color.method_3077(255, 152, 236, 249);
                     var21 = var21 + "chatRow ";
                  }
               } else {
                  if (var14.field_3966) {
                     var20 = Color.method_3077(255, 240, 240, 240);
                     var21 = var21 + "openRow ";
                  }

                  if (var14.field_3961) {
                     var20 = Color.method_3077(255, 229, 149, 35);
                     var21 = var21 + "lanRow ";
                  }
               }

               if (var14.field_3982) {
                  var21 = var21 + "lastConnectedRow ";
               }

               if (!var18 && !("" + var4.method_1561(true)).equals(var14.field_3968)) {
                  var19 = true;
               }
            }

            String var23 = "";
            var23 = var23 + "color:" + class_296.method_2076(var20) + ";";
            if (var22) {
               var23 = var23 + "font-weight: bold;";
               var21 = var21 + "boldRow ";
            }

            var15.compareAndSetClassNames(var21);
            var15.findByClassName("rState").compareAndSetText(var16);
            String var24 = class_296.method_2060(var14.field_3971, 15);
            var15.findByClassName("rHost").compareAndSetText(var24);
            String var25;
            if (var14.field_3977 == "?") {
               var25 = "?";
            } else {
               var25 = var14.field_3977 + "\\" + var14.field_3978;
            }

            var15.findByClassName("rPlayers").compareAndSetText(class_296.method_2060(var25, 15));
            String var26 = class_296.method_2060(class_271.method_1887(var14.field_3974), 40);
            if (var26 == null) {
               var26 = "";
            }

            var15.findByClassName("rMap").compareAndSetText(var26);
            String var27;
            if ("ANY".equalsIgnoreCase(var14.field_3969)) {
               var27 = var14.field_3969;
            } else {
               var27 = "v" + class_296.method_2060(var14.field_3969, 8);
            }

            Element var28 = var15.findByClassName("rVersion");
            var28.compareAndSetText(var27);
            String var29 = "";
            String var30 = "cell rVersion ";
            if (var19) {
               var29 = "color:" + class_296.method_2076(Color.method_3077(255, 155, 147, 147)) + ";";
               var30 = var30 + "nonMatchingRow ";
            } else {
               var29 = "color:" + class_296.method_2076(var20) + ";";
            }

            var28.compareAndSetClassNames(var30);
            String var31 = "";
            if (var14.field_3966) {
               var31 = "Y";
            } else {
               var31 = "N";
            }

            if (var14.field_3961) {
               var31 = "L";
            }

            Element var32 = var15.findByClassName("rOpen");
            var32.compareAndSetText(var31);
            String var33 = "";
            String var34 = "cell rOpen ";
            if (!var14.field_3966 && !var14.field_3961) {
               var33 = "color:" + class_296.method_2076(Color.method_3077(255, 155, 147, 147)) + ";";
               var34 = var34 + "notOpenRow ";
            } else {
               var33 = "color:" + class_296.method_2076(var20) + ";";
            }

            var32.compareAndSetClassNames(var34);
         }

         if (var3 != null) {
            Element var35 = this.libRocket.getActiveElementById(var3);
            var35.setText("Refresh");
         }

         class_236.method_1588("DONE");
      }
   }

   public void clickedServerRow(int var1) {
      class_462 var2 = (class_462)this.lastSortedDiscoveredServers.get(var1);
      this.clickedServer(var2.field_3962);
   }

   public void clickedServer(String var1) {
      if (this.getAlertOrPopup() != null) {
         this.logWarn("clickedServer: getAlertOrPopup!=null");
      } else {
         class_462 var2;
         try {
            var2 = class_444.method_2831(var1);
         } catch (IOException var7) {
            throw new RuntimeException(var7);
         }

         if (var2 == null) {
            this.logWarn("clickedServer: server==null");
            this.alert("That server no longer exists");
         } else {
            String var3 = var2.method_3003();
            String var4 = "Join Server?";
            String var5;
            if (!var2.field_3961) {
               var5 = "Join:";
               var5 = var5 + "closePopup(); joinServer(" + this.restrictedString(var2.field_3963 + ":" + var2.field_3965) + ");";
            } else {
               var5 = "Join over LAN:";
               var5 = var5 + "closePopup(); joinServer(" + this.restrictedString(var2.field_3964 + ":" + var2.field_3965) + ");";
            }

            boolean var6 = true;
            this.showPopup((String)null, var3, var6, var5, (String)null);
         }
      }
   }

   public void saveGame(String var1) {
      this.closePopup();
      var1 = var1.replace(".", "_");
      var1 = var1.replace("/", "_");
      var1 = var1.replace("\\", "_");
      class_236 var2 = class_236.method_1549();
      var2.field_1947.method_1988(var1);
   }

   public void exportMap(String var1) {
      this.closePopup();
      class_236 var2 = class_236.method_1549();
      var1 = var1.replace(".", "_");
      var1 = var1.replace("/", "_");
      var1 = var1.replace("\\", "_");

      try {
         var2.field_1932.method_2595(var2.field_2001, "/SD/rusted_warfare_maps/" + var1 + ".tmx");
      } catch (IOException var4) {
         this.showAlert("Failed to export map. IO error: " + var4.getMessage());
         return;
      }

      this.showAlert("Map exported");
   }

   public void loadGame(String var1) {
      class_236 var2 = class_236.method_1549();
      var2.field_1918 = false;
      if (var2.field_1947.method_1991(var1, false)) {
         this.resumeNonMenu();
      }

   }

   public void loadReplay(String var1) {
      class_236 var2 = class_236.method_1549();
      var2.field_1918 = false;
      if (var2.field_1948.method_2651(var1)) {
         this.resumeNonMenu();
      }

   }

   public void makeSaveGamePopup(String var1) {
      class_236 var2 = class_236.method_1549();
      String var3 = "Save Game";
      String var4 = "Enter a name to save the game under";
      String var5;
      if (var1 == null) {
         var5 = var2.method_1644() + " (" + class_296.method_2017("d MMM yyyy HH-mm-ss") + ")";
         var5 = var5.replace("  ", " ");
      } else {
         var5 = var1;
      }

      this.showInputPopup(var3, var4, var5, "[onenter]Save:saveGame(getPopupText())", (String)null);
   }

   public void makeExportMapGamePopup(String var1) {
      class_236 var2 = class_236.method_1549();
      String var3 = "Export Map";
      String var4 = "Enter a name to export the map as";
      String var5;
      if (var1 == null) {
         var5 = "New " + var2.method_1644() + " - " + class_296.method_2017("d MMM yyyy");
         var5 = var5.replace("  ", " ");
      } else {
         var5 = var1;
      }

      this.showInputPopup(var3, var4, var5, "[onenter]Export:exportMap(getPopupText())", (String)null);
   }

   public void makeSendMessagePopup() {
      class_236 var1 = class_236.method_1549();
      String var2 = "Send Message";
      String var3 = "";
      this.showInputPopup(var2, var3, "", "[onenter]Send:sendChatMessage(getPopupText()); closePopup();", (String)null);
   }

   public void makeSendTeamMessagePopup() {
      class_236 var1 = class_236.method_1549();
      String var2 = "Send Team Message";
      String var3 = "";
      this.showInputPopup(var2, var3, "", "[onenter]Send Team:sendTeamChatMessage(getPopupText()); closePopup();", (String)null);
   }

   public void sendChatMessage(String var1) {
      class_236 var2 = class_236.method_1549();
      if (var1 != null && !var1.trim().equals("")) {
         var2.field_1944.method_2938(var1);
         var2.field_1939.field_955 = false;
      }
   }

   public void sendTeamChatMessage(String var1) {
      class_236 var2 = class_236.method_1549();
      if (var1 != null && !var1.trim().equals("")) {
         var2.field_1944.method_2938("-t " + var1);
      }
   }

   public void receiveChatMessage(int var1, String var2, String var3, class_458 var4) {
      this.refreshChat();
   }

   public void refreshChat() {
      class_236 var1 = class_236.method_1549();
      Element var2 = this.libRocket.getActiveElementById("chatLogHistory");
      if (var2 != null) {
         if (var1.field_1944.field_3811) {
            Element var3 = this.libRocket.getActiveElementById("chatBox");
            if (var3 != null) {
               var3.hide();
            }
         }

         var2.setInnerRML("");
         ConcurrentLinkedQueue var8 = var1.field_1944.field_3867.method_2977();
         StringBuffer var4 = new StringBuffer();
         Iterator var5 = var8.iterator();

         while(var5.hasNext()) {
            class_456 var6 = (class_456)var5.next();
            var4.append("<div>" + var6.method_2980() + "</div>");
         }

         var4.append("<div id='chatLastRowSpacer'></div>");
         var2.setInnerRML(var4.toString());
         var2.loadCharsetIfNeededWithCurrentText();
         Element var7 = this.libRocket.getActiveElementById("chatLastRowSpacer");
         if (var7 != null) {
            var7.scrollIntoView(false);
         }

      }
   }

   public void trace(String var1) {
      class_236.method_1591("Trace:" + var1);
   }

   public void refreshTable(String var1, ArrayList var2) {
      Element var3 = this.libRocket.getActiveElementById(var1);
      if (var3 == null) {
         class_236.method_1588("tableElement:" + var1 + " is null, we may have changed page");
      } else {
         Element var4 = var3.getElementById("tableRowTemplateHolder");
         Element var5 = var3.getElementById("tableListData");
         Element var6 = var4.findByClassName("rowTemplate");
         Element var7 = var4.findByClassName("cellTemplate");
         var5.setInnerRML("");
         Iterator var8 = var2.iterator();

         while(var8.hasNext()) {
            Root$TableRow var9 = (Root$TableRow)var8.next();
            Element var10 = var6.clone();
            Element var11 = var10.findByClassName("tableRow");
            if (var9.librocketOnClick != null) {
               var10.setAttribute("onclick", var9.librocketOnClick);
            }

            if (var9.extraClasses != null) {
               var10.addClass(var9.extraClasses);
            }

            Iterator var12 = var9.tableCells.iterator();

            while(var12.hasNext()) {
               Root$TableCell var13 = (Root$TableCell)var12.next();
               Element var14 = var7.clone().findByClassName("cell");
               var14.compareAndSetText(var13.text);
               if (var13.librocketOnClick != null) {
                  var14.setAttribute("onclick", var13.librocketOnClick);
                  var14.addClass("clickablecell");
               }

               if (var13.color != null) {
                  var14.setAttribute("style", "color:" + class_296.method_2076(var13.color) + ";");
               }

               var11.appendChild(var14);
               var14.removeReference();
            }

            var5.appendChild(var10);
            var10.removeReference();
         }

      }
   }

   public ElementDocument createAndShowPopup(String var1, Object var2, String var3) {
      return this.libRocket.method_1847(var1, var2, var3, true);
   }

   public void showMainMenu() {
      class_236.method_1549().field_1939.field_955 = false;
      class_346.method_2275().method_2278();
   }

   public void onEnter() {
      ElementDocument var1 = this.libRocket.method_1838();
      if (var1 == null) {
         class_236.method_1591("onEnter: elementDocument==null");
      } else {
         ArrayList var2 = var1.getAllNestedChildren();
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            Element var4 = (Element)var3.next();
            String var5 = var4.getAttribute("onenter");
            if (var5 != null && var4.isFocused()) {
               this.scriptEngine.processScript(var5);
            }
         }

      }
   }

   public void onEscape() {
      ElementDocument var1 = this.libRocket.method_1838();
      if (var1 == null) {
         class_236.method_1591("onEscape: elementDocument==null");
      } else {
         boolean var2 = false;
         ArrayList var3 = var1.getAllNestedChildren();
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            Element var5 = (Element)var4.next();
            String var6 = var5.getAttribute("click_on_escape");
            if (var6 != null) {
               var5.click();
               var2 = true;
            }
         }

         if (!var2) {
            if (!this.closePopup()) {
               ;
            }
         }
      }
   }

   public void askQuitGame() {
      this.closePopup();
      String var1 = "Are you sure you want to quit?";
      String var2 = "";
      String var3 = "[onenter]Quit:";
      var3 = var3 + "closePopup(); exit();";
      boolean var4 = true;
      this.showPopup(var1, var2, var4, var3, (String)null);
   }

   public String getCurrentDocumentPath() {
      ElementDocument var1 = this.libRocket.getActiveDocument();
      return var1 == null ? null : var1.documentPath;
   }

   public String getCurrentPopupPath() {
      ElementDocument var1 = this.libRocket.method_1834();
      return var1 == null ? null : var1.documentPath;
   }

   public String getCreditsText() {
      return "Credits goes here";
   }

   public void runRunnable(Runnable var1) {
      this.logDebug("runRunnable");
      if (var1 == null) {
         this.logDebug("runnable==null");
      }

      var1.run();
   }

   public boolean isLinux() {
      return class_298.method_2103() == class_303.field_2515;
   }

   public boolean not(boolean var1) {
      return !var1;
   }

   public void showBattleroom() {
      String var1 = "battleroom.rml";
      ElementDocument var2 = this.libRocket.getActiveDocument();
      boolean var3 = true;
      if (var2 != null && var1.equals(var2.documentPath)) {
         class_236.method_1591("Already on battleroom page");
         var3 = false;
      }

      this.libRocket.setDocument(var1, (HashMap)null, var3);
   }

   public void setDocument(String var1) {
      this.libRocket.setDocument(var1);
   }

   public void playNextMusicTrack() {
      class_236.method_1549().field_1934.method_2758();
   }

   public void toggleMusic() {
      class_236.method_1549().field_1934.field_3697 = !class_236.method_1549().field_1934.field_3697;
   }

   public void updateMusicButton(String var1) {
      Element var2 = this.libRocket.getActiveElementById(var1);
      if (var2 != null) {
         if (class_236.method_1549().field_1934.field_3697) {
            var2.setText(">");
         } else {
            var2.setText("||");
         }
      }

   }

   public void setSandboxMapFromPopup(String var1) {
      class_236 var2 = class_236.method_1549();
      this.closePopup();
      this.libRocket.getActiveDocument().setMetadata("mode", var1);
      this.showLevelOptions();
      this.libRocket.getActiveDocument().findByClassName("mapImage").setAttribute("src", this.getMapThumbnail(var1));
      this.libRocket.getActiveDocument().findByClassName("mapText").setText(this.getMapNameFromPath(var1));
   }

   public void showSandboxMapSelect() {
      String var1 = this.getModeMapPath(this.libRocket.getActiveDocument(), "typeSelector");
      this.showMapPopup(var1, "setSandboxMapFromPopup");
   }

   public String getModeMapPath(Element var1, String var2) {
      class_236 var3 = class_236.method_1549();
      int var4;
      if (var2 == null) {
         if (var3.field_1944.field_3863.field_3775 == null) {
            class_236.method_1588("getModeMapPath: currentType==0");
            var4 = 0;
         } else {
            var4 = var3.field_1944.field_3863.field_3775.ordinal();
         }
      } else {
         Element var5 = var1.getElementById(var2);
         var4 = var5.getValueAsInt(0);
      }

      if (var4 == 0) {
         return "maps/skirmish";
      } else if (var4 == 1) {
         return "/SD/rusted_warfare_maps";
      } else if (var4 == 2) {
         return "saves";
      } else {
         throw new RuntimeException("Unknown typeIndex:" + var4);
      }
   }

   public void event_unicodeEntered() {
      ElementDocument var1 = this.libRocket.method_1838();
      if (var1 != null) {
         Element var2 = var1.findByClassName("textinputUnicodeWrap");
         if (var2 != null) {
            var2.compareAndAddClass("unicodeWasTyped");
         } else {
            class_236.method_1591("event_unicodeEntered: missing textinput");
         }
      } else {
         class_236.method_1591("event_unicodeEntered: missing document");
      }

   }

   public boolean isVersionBeta() {
      class_236 var1 = class_236.method_1549();
      return var1.method_1562();
   }

   public Object ifCondition(boolean var1, Object var2, Object var3) {
      return var1 ? var2 : var3;
   }

   public void openLinkToCG(String var1) {
      String var2 = "http://corrodinggames.com/" + var1;
      class_236.method_1591("Opening link:" + var2);

      try {
         if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               class_236.method_1591("Opening link from desktop api");
               Desktop.getDesktop().browse(new URI(var2));
               this.alert("Opened link: " + var2);
               return;
            } catch (IOException var7) {
               var7.printStackTrace();
            } catch (URISyntaxException var8) {
               var8.printStackTrace();
            }
         } else {
            String var3 = System.getProperty("os.name").toLowerCase();
            String[] var4 = null;
            if (var3.contains("win")) {
               var4 = new String[]{"rundll32", "url.dll,FileProtocolHandler", var2};
            }

            if (var3.contains("mac")) {
               var4 = new String[]{"open", var2};
            }

            if (var3.contains("nix") || var3.contains("nux")) {
               var4 = new String[]{"xdg-open", var2};
            }

            if (var4 != null) {
               Runtime var5 = Runtime.getRuntime();

               try {
                  var5.exec(var4);
                  this.alert("Opened link: " + var2);
                  return;
               } catch (IOException var9) {
                  var9.printStackTrace();
               }
            }
         }
      } catch (RuntimeException var10) {
         var10.printStackTrace();
      }

      this.alert("Sorry couldn't load browser to: " + var2 + " please navigate manually");
   }
}
