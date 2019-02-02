package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.java.audio.a.class_145;
import com.corrodinggames.rts.java.audio.a.class_148;
import com.corrodinggames.rts.java.audio.a.class_165;
import java.io.IOException;

public class Wav$Music extends OpenALMusic {
   private Wav$WavInputStream input;

   public Wav$Music(OpenALAudio var1, class_148 var2) {
      super(var1, var2);
      this.input = new Wav$WavInputStream(var2);
      if (!var1.noDevice) {
         this.setup(this.input.channels, this.input.sampleRate);
      }
   }

   public int read(byte[] var1) {
      if (this.input == null) {
         this.input = new Wav$WavInputStream(this.file);
         this.setup(this.input.channels, this.input.sampleRate);
      }

      try {
         return this.input.read(var1);
      } catch (IOException var3) {
         throw new class_145("Error reading WAV file: " + this.file, var3);
      }
   }

   public void reset() {
      class_165.method_1202(this.input);
      this.input = null;
   }
}
