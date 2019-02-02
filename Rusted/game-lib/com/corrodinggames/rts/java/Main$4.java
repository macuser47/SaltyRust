package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.f.class_458;

class Main$4 implements Runnable {
   // $FF: renamed from: a int
   // $FF: synthetic field
   final int field_4454;
   // $FF: renamed from: b java.lang.String
   // $FF: synthetic field
   final String field_4455;
   // $FF: renamed from: c java.lang.String
   // $FF: synthetic field
   final String field_4456;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.f.c
   // $FF: synthetic field
   final class_458 field_4457;
   // $FF: renamed from: e com.corrodinggames.rts.java.Main
   // $FF: synthetic field
   final Main field_4458;

   Main$4(Main var1, int var2, String var3, String var4, class_458 var5) {
      this.field_4458 = var1;
      this.field_4454 = var2;
      this.field_4455 = var3;
      this.field_4456 = var4;
      this.field_4457 = var5;
   }

   public void run() {
      this.field_4458.field_1847.field_2314.getRoot().receiveChatMessage(this.field_4454, this.field_4455, this.field_4456, this.field_4457);
   }
}
