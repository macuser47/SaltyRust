package com.corrodinggames.rts.java.audio.a;

import java.io.ByteArrayOutputStream;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.t
public class class_163 extends ByteArrayOutputStream {
   public class_163(int var1) {
      super(var1);
   }

   public synchronized byte[] toByteArray() {
      return this.count == this.buf.length ? this.buf : super.toByteArray();
   }
}
