package com;

import java.util.ArrayList;
import java.util.HashMap;

public class ElementDocument extends Element {
   public static final int NONE = 0;
   public static final int FOCUS = 2;
   public static final int MODAL = 4;
   public String documentPath;
   public HashMap metadata;
   public boolean translatedToUnicode;
   public ArrayList pageTimers = new ArrayList(1);

   public void show() {
      this.show(2);
   }

   public native void show(int var1);

   public native void hide();

   public void closeDocument() {
      this.close();
   }

   private native void close();

   public native void pullToFront();

   public native void pushToBack();

   public Object getMetadata(String var1) {
      return this.metadata == null ? null : this.metadata.get(var1);
   }

   public void setMetadata(String var1, Object var2) {
      if (this.metadata == null) {
         this.metadata = new HashMap();
      }

      this.metadata.put(var1, var2);
   }

   public HashMap getMetadataMap() {
      if (this.metadata == null) {
         this.metadata = new HashMap();
      }

      return this.metadata;
   }
}
