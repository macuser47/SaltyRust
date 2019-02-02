package com.corrodinggames.rts.game.b;

import java.io.ByteArrayInputStream;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

class b$2 implements EntityResolver {
   // $FF: renamed from: a com.corrodinggames.rts.game.b.b
   // $FF: synthetic field
   final class_408 field_4726;

   strictfp b$2(class_408 var1) {
      this.field_4726 = var1;
   }

   public strictfp InputSource resolveEntity(String var1, String var2) {
      return new InputSource(new ByteArrayInputStream(new byte[0]));
   }
}
