package com.corrodinggames.rts.java.audio;

import com.corrodinggames.rts.java.audio.a.class_148;

public interface Audio {
   AudioDevice newAudioDevice(int var1, boolean var2);

   AudioRecorder newAudioRecorder(int var1, boolean var2);

   Sound newSound(class_148 var1);

   Music newMusic(class_148 var1);
}
