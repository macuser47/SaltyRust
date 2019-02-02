package com.corrodinggames.rts.a;

import android.app.ProgressDialog;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.corrodinggames.rts.R$id;
import com.corrodinggames.rts.R$layout;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.d.class_432;
import com.corrodinggames.rts.gameFramework.j.class_223;

// $FF: renamed from: com.corrodinggames.rts.a.e
public class class_273 extends class_266 {
   // $FF: renamed from: b android.os.Handler
   final Handler field_2341 = new Handler(Looper.method_3227());
   // $FF: renamed from: c android.app.ProgressDialog
   ProgressDialog field_2342;
   // $FF: renamed from: d boolean
   boolean field_2343 = true;

   // $FF: renamed from: b () void
   public void method_1871() {
      class_236.method_1591("IngameActivity: finish");
      super.b();
      class_353.method_2299(this, true);
   }

   public void onWindowFocusChanged(boolean var1) {
      super.onWindowFocusChanged(var1);
      if (var1) {
         class_353.method_2298(this, false, true);
      }

   }

   // $FF: renamed from: a (android.view.Menu) boolean
   public boolean method_1874(Menu var1) {
      super.a(var1);
      var1.clear();
      class_236 var2 = class_236.method_1549();
      var1.add(0, 12, 0, class_432.method_2744("menus.ingame.save")).setIcon(17301582);
      if (var2.field_1918 && class_236.method_1654()) {
         var1.add(0, 18, 0, class_432.method_2744("menus.ingame.exportMap")).setIcon(17301582);
      }

      var1.add(0, 2, 0, class_432.method_2744("menus.ingame.settings")).setIcon(17301577);
      if (!var2.method_1578()) {
      }

      if (var2.method_1578()) {
         var1.add(0, 13, 0, class_432.method_2744("menus.ingame.chat")).setIcon(17301584);
         var1.add(0, 14, 0, class_432.method_2744("menus.ingame.players")).setIcon(17301661);
         if (var2.field_1944.field_3810 && class_223.method_1462().method_1467()) {
            var1.add(0, 17, 0, class_432.method_2744("menus.ingame.steam_reinvite")).setIcon(17301584);
         }

         var1.add(0, 10, 0, class_432.method_2744("menus.ingame.disconnect")).setIcon(17301552);
      } else {
         if (var2.field_1951 != null && var2.field_1951.field_33 != null) {
            var1.add(0, 11, 0, class_432.method_2744("menus.ingame.briefing")).setIcon(17301659);
         }

         var1.add(0, 15, 0, class_432.method_2744("menus.ingame.exitGame")).setIcon(17301552);
      }

      if (var2 != null && var2.field_1937.allowGameRecording) {
         if (!var2.field_1912) {
            var1.add(0, 9, 0, "Start Recording");
         } else {
            var1.add(0, 9, 0, "Stop Recording");
         }
      }

      return true;
   }

   // $FF: renamed from: c (int) void
   public void method_1890(int var1) {
      class_236.method_1591("outer selectMenuOption: " + var1);
      e$1 var2 = new e$1(this, var1);
      this.field_2341.method_1531(var2);
   }

   // $FF: renamed from: d (int) void
   public void method_1891(int var1) {
      class_236 var3;
      switch(var1) {
      case 2:
         Intent var2 = new Intent(this.i(), p.class);
         this.a(var2, 0);
         break;
      case 3:
         (new Builder(this)).setIcon(17301543).setTitle("Skip?").setMessage("Are you sure you want to skip this level?").setPositiveButton("Yes", new e$4(this)).setNegativeButton("No", (OnClickListener)null).show();
         break;
      case 4:
         class_236.method_1549().field_1953 = !class_236.method_1549().field_1953;
         break;
      case 5:
         (new Builder(this)).setIcon(17301543).setTitle("Restart?").setMessage("Are you sure you want to restart this level?").setPositiveButton("Yes", new e$5(this)).setNegativeButton("No", (OnClickListener)null).show();
         break;
      case 6:
         var3 = class_236.method_1549();
         var3.field_1910 = !var3.field_1910;
      case 7:
      case 8:
      case 17:
      case 18:
      default:
         break;
      case 9:
         var3 = class_236.method_1549();
         if (!var3.field_1912) {
            var3.field_1912 = true;
         } else {
            var3.field_1912 = false;
         }
         break;
      case 10:
         (new Builder(this)).setIcon(17301543).setTitle("Disconnect?").setMessage("Are you sure you want to disconnect, and end this game?").setPositiveButton("Yes", new e$6(this)).setNegativeButton("No", (OnClickListener)null).show();
         break;
      case 11:
         var3 = class_236.method_1549();
         if (var3.field_1951 != null && var3.field_1951.field_33 != null) {
            var3.method_1609("Briefing", var3.field_1951.field_33);
         }
         break;
      case 12:
         if (class_353.method_2300(this)) {
            this.method_1893((String)null);
         }
         break;
      case 13:
         this.method_1892();
         break;
      case 14:
         var3 = class_236.method_1549();
         if (var3.field_1944 != null) {
            var3.field_1944.method_2895();
         }
         break;
      case 15:
         (new Builder(this)).setIcon(17301543).setTitle("Exit?").setMessage("Are you sure you want to exit this game?").setPositiveButton("Yes", new e$7(this)).setNegativeButton("No", (OnClickListener)null).show();
         break;
      case 16:
         class_236.method_1591("TODO team message");
         this.method_1892();
      }

   }

   // $FF: renamed from: l () void
   private void method_1892() {
      class_236 var1 = class_236.method_1549();
      Builder var2 = new Builder(this);
      var2.setTitle("Send Message");
      LayoutInflater var3 = LayoutInflater.from(this);
      View var4 = var3.inflate(R$layout.alert_chat, (ViewGroup)null);
      var2.setView(var4);
      TextView var5 = (TextView)var4.findViewById(R$id.chat_messages);
      EditText var6 = (EditText)var4.findViewById(R$id.chat_text);
      var5.setText(var1.field_1944.field_3867.method_2976());
      var6.setText("");
      var6.requestFocus();
      var2.setPositiveButton("Send", new e$8(this, var6));
      var2.setNeutralButton("Send & Ping Map", new e$9(this, var6));
      var2.setNegativeButton("Cancel", new e$10(this));
      var2.show();
   }

   // $FF: renamed from: d (java.lang.String) void
   private void method_1893(String var1) {
      class_236 var2 = class_236.method_1549();
      Builder var3 = new Builder(this);
      var3.setTitle("Save Game");
      var3.setMessage("Enter a name to save the game under");
      EditText var4 = new EditText(this);
      if (var1 == null) {
         var4.setText(var2.method_1644() + " (" + class_296.method_2017("d MMM yyyy HH.mm.ss") + ")");
      } else {
         var4.setText(var1);
      }

      var3.setView(var4);
      var3.setPositiveButton("Ok", new e$11(this, var4));
      var3.setNegativeButton("Cancel", new e$2(this));
      var3.show();
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_1894(String var1) {
      this.a(0);
      class_349 var2 = new class_349(this);
      var2.field_2749 = var1;
      (new Thread(var2)).start();
   }

   // $FF: renamed from: j () void
   public void method_1895() {
      e$3 var1 = new e$3(this);
      this.field_2341.method_1531(var1);
   }

   // $FF: renamed from: m () void
   private void method_1896() {
      try {
         Intent var1 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.corrodinggames.rts"));
         this.a(var1);
      } catch (ActivityNotFoundException var5) {
         String var2 = "Failed to open Android Market";
         byte var3 = 0;
         Toast var4 = Toast.makeText(this.g(), var2, var3);
         var4.show();
      }

   }

   // $FF: renamed from: k () void
   public void method_1897() {
   }

   // $FF: renamed from: a (com.corrodinggames.rts.a.e, java.lang.String) void
   // $FF: synthetic method
   static void method_1898(class_273 var0, String var1) {
      var0.method_1893(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.a.e) void
   // $FF: synthetic method
   static void method_1899(class_273 var0) {
      var0.method_1896();
   }
}
