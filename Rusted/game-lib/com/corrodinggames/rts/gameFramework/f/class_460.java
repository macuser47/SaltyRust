package com.corrodinggames.rts.gameFramework.f;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.i
public class class_460 {
   // $FF: renamed from: a java.lang.String
   public String field_3955;
   // $FF: renamed from: b java.io.ByteArrayInputStream
   public ByteArrayInputStream field_3956;
   // $FF: renamed from: c java.io.DataInputStream
   public DataInputStream field_3957;

   public strictfp class_460(byte[] var1, boolean var2, boolean var3) {
      this.field_3956 = new ByteArrayInputStream(var1);
      Object var4;
      if (var2) {
         var4 = new BufferedInputStream(new GZIPInputStream(this.field_3956));
      } else {
         var4 = this.field_3956;
      }

      this.field_3957 = new DataInputStream((InputStream)var4);
   }
}
