package com.corrodinggames.rts.gameFramework;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

class am$2 implements OnPreparedListener {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.am
   // $FF: synthetic field
   final class_321 field_4721;

   am$2(class_321 var1) {
      this.field_4721 = var1;
   }

   public void onPrepared(MediaPlayer var1) {
      var1.start();
   }
}
