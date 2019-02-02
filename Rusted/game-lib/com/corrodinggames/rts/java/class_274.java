package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.a.class_273;
import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.java.f
public class class_274 extends class_273 {
   // $FF: renamed from: c (int) void
   public void method_1890(int var1) {
      class_236.method_1591("InGameActivityJava selectMenuOption: " + var1);
      this.method_1891(var1);
   }

   // $FF: renamed from: d (java.lang.String) void
   private void method_1900(String var1) {
      ScriptEngine.getInstance().getRoot().makeSaveGamePopup(var1);
   }

   // $FF: renamed from: e (java.lang.String) void
   private void method_1901(String var1) {
      ScriptEngine.getInstance().getRoot().makeExportMapGamePopup(var1);
   }

   // $FF: renamed from: d (int) void
   public void method_1891(int var1) {
      class_236 var2;
      switch(var1) {
      case 2:
         class_346.method_2275().method_2279();
         break;
      case 3:
         class_236.method_1591("TODO");
         break;
      case 4:
         class_236.method_1549().field_1953 = !class_236.method_1549().field_1953;
         break;
      case 5:
         class_236.method_1591("TODO");
         break;
      case 6:
         var2 = class_236.method_1549();
         var2.field_1910 = !var2.field_1910;
      case 7:
      case 8:
      default:
         break;
      case 9:
         var2 = class_236.method_1549();
         if (!var2.field_1912) {
            var2.field_1912 = true;
         } else {
            var2.field_1912 = false;
         }
         break;
      case 10:
         ScriptEngine.getInstance().addScriptToQueue("mp.multiplayerExitPrompt();");
         break;
      case 11:
         var2 = class_236.method_1549();
         if (var2.field_1951 != null && var2.field_1951.field_33 != null) {
            var2.method_1609("Briefing", var2.field_1951.field_33);
         }
         break;
      case 12:
         this.method_1900((String)null);
         break;
      case 13:
         ScriptEngine.getInstance().addScriptToQueue("makeSendMessagePopup();");
         break;
      case 14:
         var2 = class_236.method_1549();
         if (var2.field_1944 != null) {
            var2.field_1944.method_2895();
         }
         break;
      case 15:
         ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
         break;
      case 16:
         ScriptEngine.getInstance().addScriptToQueue("makeSendTeamMessagePopup();");
         break;
      case 17:
         ScriptEngine.getInstance().addScriptToQueue("mp.reinviteAsk();");
         break;
      case 18:
         this.method_1901((String)null);
      }

   }

   // $FF: renamed from: k () void
   public void method_1897() {
      ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
   }
}
