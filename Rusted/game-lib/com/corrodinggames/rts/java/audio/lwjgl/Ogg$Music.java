package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.java.audio.a.class_148;
import com.corrodinggames.rts.java.audio.a.class_165;

public class Ogg$Music extends OpenALMusic {
   private OggInputStream input;
   private OggInputStream previousInput;

   public Ogg$Music(OpenALAudio var1, class_148 var2) {
      super(var1, var2);
      if (!var1.noDevice) {
         this.input = new OggInputStream(var2.method_1140());
         this.setup(this.input.getChannels(), this.input.getSampleRate());
      }
   }

   public int read(byte[] var1) {
      if (this.input == null) {
         this.input = new OggInputStream(this.file.method_1140(), this.previousInput);
         this.setup(this.input.getChannels(), this.input.getSampleRate());
         this.previousInput = null;
      }

      int var2 = this.input.read(var1);
      return var2;
   }

   public void reset() {
      class_165.method_1202(this.input);
      this.previousInput = null;
      this.input = null;
   }

   protected void loop() {
      class_165.method_1202(this.input);
      this.previousInput = this.input;
      this.input = null;
   }
}
