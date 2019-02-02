package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.j.a
public class class_223 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.j.a
   public static class_223 field_1776 = new class_223();

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.j.a
   public static class_223 method_1462() {
      return field_1776;
   }

   // $FF: renamed from: b () void
   public void method_1463() {
      class_236.method_1591("SteamEngine - blank init");
   }

   // $FF: renamed from: a (float) void
   public void method_1464(float var1) {
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1465() {
      return null;
   }

   // $FF: renamed from: d () void
   public void method_1466() {
      class_236.method_1591("SteamEngine - disableSteam - already disabled");
   }

   // $FF: renamed from: e () boolean
   public boolean method_1467() {
      return !this.method_1468();
   }

   // $FF: renamed from: f () boolean
   public boolean method_1468() {
      return true;
   }

   // $FF: renamed from: g () void
   public void method_1469() {
      class_236.method_1591("disabledSteam - showInviteDialog");
      class_236.method_1549().method_1607("steam API not connected");
   }

   // $FF: renamed from: h () void
   public void method_1470() {
      class_236.method_1591("Steam: alertNotEnabled");
      class_236 var1 = class_236.method_1549();
      if (var1 != null) {
         var1.method_1607("steam API not connected");
      }

   }

   // $FF: renamed from: i () void
   public void method_1471() {
   }

   // $FF: renamed from: j () void
   public void method_1472() {
   }

   // $FF: renamed from: k () void
   public void method_1473() {
      class_236.method_1591("disabledSteam - loadWorkshopMods");
   }
}
