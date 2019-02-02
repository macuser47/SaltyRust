package com.corrodinggames.rts.game.b;

import java.io.ByteArrayInputStream;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

class b$1 implements EntityResolver {
   // $FF: renamed from: a com.corrodinggames.rts.game.b.b
   // $FF: synthetic field
   final class_408 field_4725;

   strictfp b$1(class_408 var1) {
      this.field_4725 = var1;
   }

   public strictfp InputSource resolveEntity(String var1, String var2) {
      return new InputSource(new ByteArrayInputStream(new byte[0]));
   }
}
