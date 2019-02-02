package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.e.class_215;
import com.corrodinggames.rts.gameFramework.j.class_223;
import com.corrodinggames.rts.java.a.class_224;
import java.util.ArrayList;
import java.util.Iterator;

public class Mods extends ScriptContext {
   Root root;

   Mods(Root var1) {
      this.root = var1;
   }

   public class_224 getSteam() {
      class_223 var1 = class_223.method_1462();
      if (!var1.method_1467()) {
         var1.method_1470();
         return null;
      } else {
         return (class_224)var1;
      }
   }

   public void openWorkshop() {
      class_236 var1 = class_236.method_1549();
      class_224 var2 = this.getSteam();
      if (var2 != null) {
         var2.method_1474().method_1457();
      }
   }

   public void uploadModAsk(String var1) {
      class_236 var2 = class_236.method_1549();
      if (var2.method_1562()) {
         this.root.showAlert("Workshop uploading is disabled in BETA versions to ensure compatibility for others. Please test and upload this mod with a released version or wait till beta finishes.");
      } else {
         class_215 var3 = var2.field_1946.method_1439(var1);
         if (var3 == null) {
            this.root.showAlert("Could not find mod:" + var1);
         } else {
            class_224 var4 = this.getSteam();
            if (var4 != null) {
               String var5 = "Are you sure you want to upload to the workshop?";
               String var6 = "";
               String var7 = "[onenter]Upload:";
               var7 = var7 + "closePopup(); mods.uploadMod('" + var1 + "');";
               boolean var8 = true;
               this.root.showPopup(var5, var6, var8, var7, (String)null);
            }
         }
      }
   }

   public void uploadMod(String var1) {
      class_236 var2 = class_236.method_1549();
      class_215 var3 = var2.field_1946.method_1439(var1);
      if (var3 == null) {
         this.root.showAlert("Could not find mod:" + var1);
      } else {
         class_224 var4 = this.getSteam();
         if (var4 != null) {
            if (var3.field_1740 == 0L) {
               var4.method_1474().method_1455(var3);
            } else {
               String var5 = "Changes.";
               var4.method_1474().method_1456(var3, false, var5);
            }
         }
      }
   }

   public void viewMod(String var1) {
      class_236 var2 = class_236.method_1549();
      class_215 var3 = var2.field_1946.method_1439(var1);
      if (var3 == null) {
         this.root.showAlert("Could not find mod:" + var1);
      } else {
         class_224 var4 = this.getSteam();
         if (var4 != null) {
            var4.method_1474().method_1458(var3);
         }
      }
   }

   public void loadMods() {
      ElementDocument var1 = this.libRocket.getActiveDocument();
      class_236 var2 = class_236.method_1549();
      class_236.method_1591("loadMods");
      Element var3 = var1.getElementById("modTemplate");
      Element var4 = var1.getElementById("modList");
      String var5 = var3.getInnerRML();
      String var6 = "";
      ArrayList var7 = var2.field_1946.method_1443();
      int var8 = 0;

      Iterator var9;
      class_215 var10;
      String var11;
      for(var9 = var7.iterator(); var9.hasNext(); var6 = var6 + var11) {
         var10 = (class_215)var9.next();
         String var12 = var10.method_1422();
         String var13 = "";
         var11 = var5.replace("_NAME_", this.root.htmlString(var12));
         var11 = var11.replace("_ID_", var10.field_1738);
         String var14 = var10.field_1754;
         if (var14 == null) {
            var14 = "";
         } else {
            var13 = var13 + " modItemError";
         }

         if (var10.field_1740 == 0L) {
            if (!var10.field_1746 && !var10.field_1747) {
               var13 = var13 + " modItemCanBePublished";
            }
         } else {
            if (!var10.field_1746) {
               var13 = var13 + " modItemIsOwner";
            }

            var13 = var13 + " modItemIsPublished";
         }

         if (var10.field_1748) {
            var13 = var13 + " modItemHasMaps";
         }

         String var15 = var10.method_1427();
         if (var15 == null) {
            var15 = "";
         }

         String var16 = var10.method_1423();
         var11 = var11.replace("_ERROR_", this.root.htmlString(var14));
         var11 = var11.replace("_MESSAGE_", this.root.htmlString(var15));
         var11 = var11.replace("_DESCRIPTION_", this.root.htmlString(var16));
         var11 = var11.replace("_CLASS_", var13);
         ++var8;
      }

      var4.setInnerRML(var6);
      var4.loadCharsetIfNeeded(var6);
      var9 = var7.iterator();

      while(var9.hasNext()) {
         var10 = (class_215)var9.next();
         Element var17 = var1.getElementById(var10.field_1738);
         if (var17 == null) {
            class_236.method_1588("Could not find:" + var10.field_1737);
         } else {
            var17.setCheckbox(!var10.field_1739);
         }
      }

   }

   public void saveMods() {
      boolean var1 = false;
      ElementDocument var2 = this.libRocket.getActiveDocument();
      class_236 var3 = class_236.method_1549();
      class_236.method_1591("savesMods");
      ArrayList var4 = var2.findElementsByClassName("modSelection");
      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         Element var6 = (Element)var5.next();
         String var7 = var6.getId();
         if (!var7.equals("_ID_")) {
            class_215 var8 = var3.field_1946.method_1439(var7);
            if (var8 == null) {
               this.root.showAlert("Could not find mod:" + var6.getInnerRML());
            } else {
               boolean var9 = !var6.getCheckbox();
               if (var8.field_1739 != var9) {
                  var1 = true;
               }

               var8.field_1739 = var9;
            }
         }
      }

      if (var1) {
         class_236.method_1591("mod changes made");
      } else {
         class_236.method_1591("no mod changes made");
      }

      if (var3.field_1944.field_3809) {
         class_236.method_1591("savesMods: in network game");
         this.root.showAlert("You are currently in a network game, changes will be checked and applied on next game");
      } else if (class_479.method_3138()) {
         this.root.showAlert("Changes saved. Will be used in the next game.");
      } else {
         class_236.method_1591("Errors found");
      }

      var3.field_1946.method_1437();
      var3.field_1937.save();
   }

   public void reloadModDataAsk() {
      String var1 = "Reload all mod data?";
      String var2 = "";
      var2 = var2 + "Warning! this will end your current game.";
      String var3 = "[onenter]Reload:";
      var3 = var3 + "closePopup(); mods.reloadModData();";
      boolean var4 = true;
      this.root.showPopup(var1, var2, var4, var3, (String)null);
   }

   public void reloadModData() {
      class_236 var1 = class_236.method_1549();
      this.saveMods();
      var1.field_1946.method_1444();
      this.loadMods();
   }
}
