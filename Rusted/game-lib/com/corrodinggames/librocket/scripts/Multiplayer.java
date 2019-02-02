package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.rts.a.class_271;
import com.corrodinggames.rts.a.class_272;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.d.class_432;
import com.corrodinggames.rts.gameFramework.f.class_396;
import com.corrodinggames.rts.gameFramework.f.class_453;
import com.corrodinggames.rts.gameFramework.j.class_223;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Multiplayer extends ScriptContext {
   Root root;
   String[] currentDropdownRawArray;
   boolean useMapDropdown = false;

   Multiplayer(Root var1) {
      this.root = var1;
   }

   void updateMapDropdown(Element var1, String var2, String var3) {
      class_236 var4 = class_236.method_1549();
      Element var5 = var1.getElementById(var3);
      int var6 = var5.getValueAsInt(0);
      this.currentDropdownRawArray = null;
      ArrayList var7 = new ArrayList();
      String[] var8;
      int var9;
      int var10;
      String var11;
      String var12;
      if (var6 == 0) {
         this.currentDropdownRawArray = class_236.method_1638("maps/skirmish", true);
         Arrays.sort(this.currentDropdownRawArray);
         var8 = this.currentDropdownRawArray;
         var9 = var8.length;

         for(var10 = 0; var10 < var9; ++var10) {
            var11 = var8[var10];
            var12 = class_271.method_1887(var11);
            var7.add(var12);
         }
      } else if (var6 == 1) {
         this.currentDropdownRawArray = class_236.method_1638("/SD/rusted_warfare_maps", true);
         if (this.currentDropdownRawArray == null) {
            var4.method_1608("Could not find folder: /SD/rusted_warfare_maps", 1);
            this.currentDropdownRawArray = new String[0];
         }

         Arrays.sort(this.currentDropdownRawArray);
         var8 = this.currentDropdownRawArray;
         var9 = var8.length;

         for(var10 = 0; var10 < var9; ++var10) {
            var11 = var8[var10];
            var12 = class_271.method_1887(var11);
            var7.add(var12);
         }
      } else {
         if (var6 != 2) {
            throw new RuntimeException("Unknown typeIndex:" + var6);
         }

         this.currentDropdownRawArray = class_272.method_1889();
         if (this.currentDropdownRawArray == null) {
            var4.method_1608("Could not find a save folder on SD card", 1);
            this.currentDropdownRawArray = new String[0];
         }

         var8 = this.currentDropdownRawArray;
         var9 = var8.length;

         for(var10 = 0; var10 < var9; ++var10) {
            var11 = var8[var10];
            var12 = class_271.method_1887(var11);
            var7.add(var12);
         }
      }

      String var18 = "";
      String var19 = "maps/skirmish";
      var10 = 0;
      int var20 = 1;
      String[] var21 = this.currentDropdownRawArray;
      int var13 = var21.length;

      int var14;
      String var15;
      for(var14 = 0; var14 < var13; ++var14) {
         var15 = var21[var14];
         ++var10;
         if (var6 == 0 && var15.equalsIgnoreCase("[p8]Many Islands (8p).tmx")) {
            var20 = var10;
         }
      }

      var10 = 0;
      var21 = this.currentDropdownRawArray;
      var13 = var21.length;

      for(var14 = 0; var14 < var13; ++var14) {
         var15 = var21[var14];
         ++var10;
         String var16 = this.root.convertMapName(var15);
         boolean var17 = var10 == var20;
         var18 = var18 + this.generateOption(var15, var16, var17) + "\n";
      }

      class_236.method_1591("mapList:" + var18);
      if (var6 != 2) {
      }

      Element var22 = var1.getElementById("mapsSelectorParent");
      String var23 = "<p data-workaround='this stops disappearing select'></p><select id='mapsSelector' class='mapsSelector'><option value='0'>...</option></select>";
      var22.setInnerRML(var23);
      Element var24 = this.getMapDropdown();
      var24.setInnerRML(var18);
   }

   String generateOption(String var1, String var2, boolean var3) {
      String var4 = "";
      if (var3) {
         var4 = var4 + " selected='selected'";
      }

      return "<option value=" + this.root.escapedString(var1) + " " + var4 + ">" + this.root.htmlString(var2) + "</option>";
   }

   Element getMapDropdown() {
      ElementDocument var1 = this.libRocket.method_1834();
      Element var2 = var1.findByClassName("mapsSelector");
      return var2;
   }

   String getMapDropdownSelected() {
      return this.getMapDropdown().getAttribute("value");
   }

   void readInterfaceIntoNetworkSettings() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1944.field_3810) {
         String var2 = this.getMapDropdownSelected();
         if (var2 == null) {
            var2 = "<No Map>";
         }

         var1.field_1944.field_3863.field_3776 = var2;
         byte var3 = 0;
         var1.field_1944.field_3863.field_3775 = class_396.values()[var3];
      }

   }

   public void multiplayerStart() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1944.field_3810) {
         if (var1.field_1944.field_3863.field_3775 == class_396.field_3237) {
            var1.field_1944.field_3864 = "maps/skirmish/" + var1.field_1944.field_3863.field_3776;
         } else if (var1.field_1944.field_3863.field_3775 == class_396.field_3238) {
            var1.field_1944.field_3864 = "/SD/rusted_warfare_maps/" + var1.field_1944.field_3863.field_3776;
         } else {
            if (var1.field_1944.field_3863.field_3775 != class_396.field_3239) {
               this.libRocket.method_1839("Error: No map type selected");
               return;
            }

            var1.field_1944.field_3864 = null;
         }

         if (var1.field_1944.field_3863.field_3776 == null || "".equals(var1.field_1944.field_3863.field_3776) || var1.field_1944.field_3863.field_3776.equals("<No Map>")) {
            this.libRocket.method_1839("Error: No map selected");
            return;
         }

         var1.field_1944.method_2945();
      } else if (var1.field_1944.field_3813) {
         var1.field_1944.method_2937("-start");
      } else {
         class_236.method_1592("startNetButton.setOnClickListener", "Clicked but not server or proxy controller");
      }

   }

   public void battleroomSetup() {
      class_236 var1 = class_236.method_1549();
      this.refreshUI();
      this.root.refreshChat();
      var1.field_1944.method_2968();
   }

   public void refreshUI() {
      class_236 var1 = class_236.method_1549();
      Element var2 = this.libRocket.getActiveElementById("infoDiv");
      if (var2 == null) {
         class_236.method_1591("refreshUI: infoTextElement==null");
      } else {
         ElementDocument var3 = this.libRocket.getActiveDocument();
         boolean var4 = var1.field_1944.field_3810 || var1.field_1944.field_3813;
         boolean var5 = var1.field_1944.field_3810;
         Iterator var6 = var3.findElementsByClassName("forHostOnly").iterator();

         Element var7;
         while(var6.hasNext()) {
            var7 = (Element)var6.next();
            var7.show(var4);
         }

         var6 = var3.findElementsByClassName("forLocalHostOnly").iterator();

         while(var6.hasNext()) {
            var7 = (Element)var6.next();
            var7.show(var5);
         }

         if (var1.method_1579()) {
            var6 = var3.findElementsByClassName("forRealNetworkOnly").iterator();

            while(var6.hasNext()) {
               var7 = (Element)var6.next();
               var7.show(false);
            }
         }

         String var9 = var1.field_1944.method_2969();
         var2.compareAndSetText(var9);
         String var10 = var1.field_1944.method_2970();
         if (var1.field_1944.field_3863.field_3775 == class_396.field_3239) {
            var10 = "saves/" + var1.field_1944.field_3863.field_3776;
         }

         Element var8 = this.libRocket.getActiveElementById("mapImage");
         if (var1.field_1944.field_3802) {
            var8.hide();
         }

         if (var10 == null) {
            var8.setAttribute("src", "");
         } else {
            var8.setAttribute("src", this.root.getMapThumbnail(var10));
         }

         this.refreshPlayerTable();
      }
   }

   public void refreshPlayerTable() {
      ArrayList var1 = this.getPlayerTable();
      this.root.refreshTable("playersDiv", var1);
   }

   public ArrayList getPlayerTable() {
      class_236 var1 = class_236.method_1549();
      ArrayList var2 = new ArrayList();
      Iterator var4 = class_107.method_918().iterator();

      Root$TableRow var3;
      while(var4.hasNext()) {
         class_107 var5 = (class_107)var4.next();
         if (var5 != null) {
            String var6 = "unnamed";
            String var7 = "-";
            if (var5.field_1233 != null) {
               var6 = var5.field_1233;
            }

            int var8 = var5.method_926();
            if (var8 != -2) {
               var7 = Integer.toString(var8);
            }

            String var9 = Integer.toString(var5.field_1227 + 1);
            String var10 = Integer.toString(var5.field_1231 + 1);
            var3 = new Root$TableRow();
            var3.addCell(var6);
            Root$TableCell var11 = var3.addCell(var9);
            var11.color = class_107.method_946(var5.field_1227);
            Root$TableCell var12 = var3.addCell(var10);
            var12.color = class_107.method_946(var5.field_1231);
            var3.addCell(var7);
            var3.setLibrocketOnClick("mp.showPlayerConfig('" + var5.field_1227 + "')");
            var2.add(var3);
         }
      }

      if (!var1.field_1944.field_3810 && var1.field_1944.field_3822 == null) {
         var2.clear();
         String var13 = "Connecting...";
         if (var1.field_1944.field_3877.size() == 0) {
            var13 = "Disconnected";
         }

         var3 = new Root$TableRow();
         var3.addCell(var13);
         Root$TableCell var14 = var3.addCell("");
         Root$TableCell var15 = var3.addCell("");
         var3.addCell("");
         var2.add(var3);
      }

      return var2;
   }

   public void showPlayerConfig(String var1) {
      class_236 var2 = class_236.method_1549();
      if (var2.field_1944.method_2971()) {
         int var3 = Integer.parseInt(var1);
         class_107 var4 = class_107.method_954(var3);
         if (var4 == null) {
            this.root.logWarn("showPlayerConfig: " + var1 + "==null");
         } else {
            ElementDocument var5 = this.root.createAndShowPopup("battleroom_player.rml", var4, var4.field_1233 + " (" + (var4.field_1227 + 1) + ")");
            if (var5 != null) {
               var5.getElementById("team_id").setValue("" + var4.field_1227);
               Element var6 = var5.getElementById("spawnPoint");
               Element var7 = var5.getElementById("allyTeam");
               var6.setValue("" + (var4.field_1227 + 1));
               if (var4.field_1232) {
                  var7.setValue("" + (var4.field_1231 + 1));
               } else {
                  var7.setValue("fromSpawn2");
               }
            }

         }
      }
   }

   public void playerConfig_kick() {
      class_236 var1 = class_236.method_1549();
      class_236.method_1591("playerConfig_kick");
      String var2 = this.libRocket.method_1834().getElementById("team_id").getValue();
      int var3 = Integer.parseInt(var2);
      class_107 var4 = class_107.method_954(var3);
      if (var4 == null) {
         this.root.logWarn("playerConfig_kick: " + var2 + "==null");
      } else {
         var1.field_1944.method_2959(var4);
      }
   }

   public void playerConfig_apply() {
      class_236 var1 = class_236.method_1549();
      class_236.method_1591("playerConfig_kick");
      String var2 = this.libRocket.method_1834().getElementById("team_id").getValue();
      int var3 = Integer.parseInt(var2);
      class_107 var4 = class_107.method_954(var3);
      if (var4 == null) {
         this.root.logWarn("playerConfig_kick: " + var2 + "==null");
      } else {
         Element var5 = this.libRocket.method_1834().getElementById("spawnPoint");
         Element var6 = this.libRocket.method_1834().getElementById("allyTeam");
         String var7 = var5.getValue();
         String var8 = var6.getValue();

         int var9;
         try {
            var9 = Integer.valueOf(var7) - 1;
            if (var9 < 0) {
               var9 = 1;
            }

            if (var9 > 9) {
               var9 = 9;
            }

            if (var4.field_1227 != var9) {
               if (var1.field_1944.field_3810) {
                  var1.field_1944.method_2962(var4, var9);
               } else if (var1.field_1944.field_3813) {
                  var1.field_1944.method_2963(var4, var9);
               } else {
                  class_236.method_1592("row.setOnClickListener", "Clicked but not server or proxy controller");
               }
            }
         } catch (NumberFormatException var11) {
            var11.printStackTrace();
         }

         try {
            if (var8.equals("fromSpawn2")) {
               var9 = var4.field_1227 % 2;
               var4.field_1232 = false;
            } else {
               var9 = Integer.valueOf(var8) - 1;
               var4.field_1232 = true;
            }

            if (var4.field_1231 != var9) {
               if (var1.field_1944.field_3810) {
                  var4.field_1231 = var9;
               } else if (var1.field_1944.field_3813) {
                  var1.field_1944.method_2964(var4, var9);
               } else {
                  class_236.method_1592("row.setOnClickListener", "Clicked but not server or proxy controller");
               }
            }
         } catch (NumberFormatException var10) {
            var10.printStackTrace();
         }

         this.refreshUI();
      }
   }

   public void disconnect(String var1) {
      class_236 var2 = class_236.method_1549();
      var2.field_1944.method_2873(var1);
   }

   public void multiplayerBackPrompt() {
      String var1 = class_432.method_2744("menus.ingame.multiplayerClose.title");
      String var2 = "What would you like to do?";
      String var3 = class_432.method_2744("menus.ingame.multiplayerClose.disconnectButton") + ":";
      var3 = var3 + "closePopup(); mp.disconnect('exited'); back();";
      boolean var4 = true;
      this.root.showPopup(var1, var2, var4, var3, (String)null);
   }

   public void multiplayerExitPrompt() {
      String var1 = class_432.method_2744("menus.ingame.multiplayerClose.title");
      String var2 = "Are you sure you want to disconnect, and end this game?";
      String var3 = class_432.method_2744("menus.ingame.multiplayerClose.disconnectButton") + ":";
      var3 = var3 + "closePopup(); mp.disconnect('exited'); showMainMenu();";
      boolean var4 = true;
      this.root.showPopup(var1, var2, var4, var3, (String)null);
   }

   public void addAI() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1944.field_3810) {
         var1.field_1944.method_2960();
      } else if (var1.field_1944.field_3813) {
         var1.field_1944.method_2937("-addai");
      } else {
         this.root.logWarn("addAI(): Clicked but not server or proxy controller");
      }

   }

   public void loadUsername() {
      class_236.method_1591("mp.loadUsername()");
      class_236 var1 = class_236.method_1549();
      String var2 = var1.field_1937.lastNetworkPlayerName;
      Element var3 = this.libRocket.getActiveElementById("username");
      String var4 = class_223.method_1462().method_1465();
      class_236.method_1591("steamName:" + var4);
      if (var4 != null && var2 == null) {
         var2 = var4;
      }

      if (var2 == null) {
         class_236.method_1591("oldPlayername: null");
      } else {
         var3.loadCharsetIfNeeded(var2);
         var3.setAttribute("value", var2);
      }
   }

   public void getUsernameFromInterface() {
      class_236 var1 = class_236.method_1549();
      String var2 = this.root.getValueById("username");
      if (var2 == null) {
         class_236.method_1588("getUsernameFromInterface: Cannot find username");
      } else {
         var2 = var2.trim();
         class_236.method_1591("set username:" + var2);
         if (var2.equals("")) {
            var2 = "Unnamed";
         }

         var1.field_1944.field_3804 = var2;
         var1.field_1937.lastNetworkPlayerName = var1.field_1944.field_3804;
         var1.field_1937.save();
      }
   }

   public void gameOptionsGet() {
      this.gameOptionsGetOrPush(false);
   }

   public void gameOptionsPush() {
      this.gameOptionsGetOrPush(true);
   }

   public void gameOptionsRefreshTypes() {
      class_236 var1 = class_236.method_1549();
      ElementDocument var2 = this.libRocket.method_1834();
      if (this.useMapDropdown) {
         this.updateMapDropdown(var2, "mapsSelector", "typeSelector");
      }

   }

   public void gameOptionsGetOrPush(boolean var1) {
      class_236 var2 = class_236.method_1549();
      ElementDocument var3 = this.libRocket.method_1834();
      Element var4 = var3.getElementById("fogMode");
      Element var5 = var3.getElementById("startingCredits");
      Element var6 = var3.getElementById("doubleIncome");
      Element var7 = var3.getElementById("noNukes");
      Element var8 = var3.getElementById("sharedControl");
      Element var9 = var3.getElementById("aiDifficulty");
      Element var10 = var3.getElementById("startingUnits");
      if (!var1) {
         this.setupStartingUnitDropDown(var10);
      }

      Element var11 = var3.getElementById("typeSelector");
      Element var12 = this.getMapDropdown();
      if (!var1) {
         if (var2.field_1944.field_3863.field_3775 == null) {
            class_236.method_1591("gameOptionsGetOrPush: game.network.setup.currentType==null");
         } else {
            var11.setValue("" + var2.field_1944.field_3863.field_3775.ordinal());
         }

         if (this.useMapDropdown) {
            this.updateMapDropdown(var3, "mapsSelector", "typeSelector");
            var12 = this.getMapDropdown();
            class_236.method_1591("new currentMapSelection=" + var2.field_1944.field_3863.field_3776);
            var12.setValue("" + var2.field_1944.field_3863.field_3776);
         }

         var11 = var3.getElementById("typeSelector");
         var4.setValue("" + var2.field_1944.field_3863.field_3778);
         var5.setValue("" + var2.field_1944.field_3863.field_3777);
         var10.setValue("" + var2.field_1944.field_3863.field_3781);
         var2.field_1944.field_3863.field_3779 = true;
         var7.setCheckbox(var2.field_1944.field_3863.field_3783);
         var8.setCheckbox(var2.field_1944.field_3863.field_3785);
         var6.setCheckbox(var2.field_1944.field_3863.field_3782 == 2.0F);
         var9.setValue("" + var2.field_1944.field_3863.field_3780);
      } else {
         class_453 var13 = var2.field_1944.method_2850();
         if (var13 != null) {
            String var14 = null;
            if (this.useMapDropdown) {
               var14 = var12.getValue();
               if (var14 == null) {
                  class_236.method_1591("gameOptionsGetOrPush: mapDropdownSelected==null");
                  var14 = "<No Map>";
               }
            }

            int var15 = var11.getValueAsInt(0);
            class_396 var16 = var13.field_3775;
            var13.field_3775 = class_396.values()[var15];
            if (this.useMapDropdown) {
               var13.field_3776 = var14;
            } else if (var16 != var13.field_3775) {
               var13.field_3776 = null;
            }

            var13.field_3778 = var4.getValueAsInt((Integer)null);
            var13.field_3777 = var5.getValueAsInt((Integer)null);
            var13.field_3782 = var6.getCheckbox() ? 2.0F : 1.0F;
            var13.field_3783 = var7.getCheckbox();
            var13.field_3785 = var8.getCheckbox();
            var13.field_3780 = var9.getValueAsInt((Integer)null);
            var13.field_3781 = var10.getValueAsInt(1);
            var2.field_1944.method_2852(var13);
         }

      }
   }

   public void closeBattleroomIfOpen() {
      class_236 var1 = class_236.method_1549();
      Element var2 = this.libRocket.getActiveElementById("battleroomPage");
      if (var2 == null) {
         class_236.method_1591("closeBattleroomIfOpen: battleroomPage==null");
      } else {
         this.libRocket.backToLastDocument();
      }
   }

   public void reinviteAsk() {
      String var1 = class_432.method_2744("menus.ingame.multiplayerReinvite.title");
      String var2 = "While in-game you can only reinvite players who were in-game before but dropped out";
      String var3 = "reInvite:";
      var3 = var3 + "closePopup(); mp.showSteamInviteDialog();";
      boolean var4 = true;
      this.root.showPopup(var1, var2, var4, var3, (String)null);
   }

   public void showSteamInviteDialog() {
      class_223 var1 = class_223.method_1462();
      var1.method_1469();
   }

   public void setMapFromPopup(String var1) {
      if (!this.isInControlOfServer()) {
         String var5 = this.root.getMapNameFromPath(var1);
         String var6 = "clicked on '" + var5 + "'";
         this.root.sendChatMessage(var6);
         this.root.closePopup();
      } else {
         class_236 var2 = class_236.method_1549();
         class_453 var3 = var2.field_1944.method_2850();
         if (var3 != null) {
            String var4 = var1;
            if (!var1.contains("MOD|")) {
               var4 = class_296.method_2092(var1);
            }

            var3.field_3776 = var4;
            var2.field_1944.method_2852(var3);
         }

         this.root.closePopup();
      }
   }

   public void showMapSelect() {
      String var1 = this.root.getModeMapPath((Element)null, (String)null);
      this.root.showMapPopup(var1, "mp.setMapFromPopup");
   }

   public boolean isInControlOfServer() {
      class_236 var1 = class_236.method_1549();
      boolean var2 = var1.field_1944.field_3810 || var1.field_1944.field_3813;
      return var2;
   }

   public void askPassword() {
      class_236.method_1591("mp.askPassword()");
      class_236 var1 = class_236.method_1549();
      String var2 = "Password Required";
      String var3 = "This server requires a password to join";
      String var4 = "";
      this.root.showInputPopupNonClose(var2, var3, var4, "Close:mp.cancelPaswordAsk()", "[onenter]Join:mp.askPasswordEntered(getPopupText())");
   }

   public void askPasswordEntered(String var1) {
      class_236.method_1591("mp.askPasswordEntered()");
      class_236 var2 = class_236.method_1549();
      var2.field_1944.field_3796 = var1;
      var2.field_1944.method_2925();
      this.root.closePopup();
   }

   public void cancelPaswordAsk() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1944.field_3810) {
         this.root.logWarn("cancelPaswordAsk: we are the server");
      } else {
         var1.field_1944.method_2873("Cancel password");
         this.closeBattleroomIfOpen();
      }

      this.root.closePopup();
   }

   public void setupStartingUnitDropDown(Element var1) {
      String var2 = "";

      Multiplayer$DropdownOption var4;
      for(Iterator var3 = this.getStartingUnitOptions().iterator(); var3.hasNext(); var2 = var2 + this.generateOption(var4.key, var4.value, false)) {
         var4 = (Multiplayer$DropdownOption)var3.next();
      }

      var1.setInnerRML(var2);
   }

   public ArrayList getStartingUnitOptions() {
      class_236 var1 = class_236.method_1549();
      ArrayList var2 = new ArrayList();
      Iterator var3 = var1.field_1944.method_2860().iterator();

      while(var3.hasNext()) {
         Integer var4 = (Integer)var3.next();
         String var5 = var1.field_1944.method_2861(var4);
         var2.add(new Multiplayer$DropdownOption(var4.toString(), var5));
      }

      return var2;
   }
}
