package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.java.audio.a.class_145;
import com.corrodinggames.rts.java.audio.a.class_148;
import com.corrodinggames.rts.java.audio.a.class_165;
import java.io.IOException;

public class Wav$Sound extends OpenALSound {
   public Wav$Sound(OpenALAudio var1, class_148 var2) {
      super(var1);
      if (!var1.noDevice) {
         Wav$WavInputStream var3 = null;

         try {
            var3 = new Wav$WavInputStream(var2);
            this.setup(class_165.method_1201(var3, var3.dataRemaining), var3.channels, var3.sampleRate);
         } catch (IOException var8) {
            throw new class_145("Error reading WAV file: " + var2, var8);
         } finally {
            class_165.method_1202(var3);
         }

      }
   }
}
