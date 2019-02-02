package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_402;
import com.corrodinggames.rts.java.audio.a.class_148;
import com.corrodinggames.rts.java.audio.a.class_165;
import java.io.IOException;

public class Ogg$MusicWithThreadedLoader extends OpenALMusic {
   private OggInputStream input;
   private OggInputStream previousInput;
   ThreadedWrappingAudioInputStream backgroundInput;

   public Ogg$MusicWithThreadedLoader(OpenALAudio var1, class_148 var2) {
      super(var1, var2);
      if (!var1.noDevice) {
         this.input = new OggInputStream(var2.method_1140());
         this.setup(this.input.getChannels(), this.input.getSampleRate());
         this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
      }
   }

   public int read(byte[] var1) {
      if (this.input == null) {
         this.input = new OggInputStream(this.file.method_1140(), this.previousInput);
         this.setup(this.input.getChannels(), this.input.getSampleRate());
         this.previousInput = null;
         this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
      }

      long var2 = class_402.method_2522();
      int var4 = this.backgroundInput.read(var1);
      double var5 = (double)class_402.method_2523(var2);
      if (var5 > 0.5D) {
         class_236.method_1591("ogg read took:" + class_402.method_2528(var5));
      }

      return var4;
   }

   public void backgroundUpdate() {
      try {
         if (this.input != null && this.backgroundInput != null) {
            this.backgroundInput.backgroundFillBuffer();
         }

      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }

   public void reset() {
      class_165.method_1202(this.input);
      this.previousInput = null;
      this.input = null;
      this.backgroundInput.close();
   }

   protected void loop() {
      class_165.method_1202(this.input);
      this.previousInput = this.input;
      this.input = null;
      this.backgroundInput.close();
   }
}
