package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Element {
   private long nativeHandle;
   boolean loadedChinese = false;
   HashSet charsetsLoaded;

   public native Element getElementById(String var1);

   public String getAttribute(String var1) {
      return this.getAttribute(var1, (String)null);
   }

   public String getId() {
      return this.getAttribute("id");
   }

   public native String getTagName();

   public native boolean focus();

   public native void blur();

   public native void click();

   public native void addReference();

   public native void removeReference();

   public native String getAttribute(String var1, String var2);

   public native void setAttribute(String var1, String var2);

   public void addStyle(String var1) {
      String var2 = this.getAttribute("style");
      if (var2 == null) {
         var2 = "";
      }

      var2 = var2 + var1;
      this.setAttribute("style", var2);
   }

   public void setStyle(String var1) {
      this.setAttribute("style", var1);
   }

   public void setValue(String var1) {
      this.setAttribute("value", var1);
   }

   public void setCheckbox(boolean var1) {
      if (var1) {
         this.setAttribute("checked", "");
      } else {
         this.setAttribute("checked", (String)null);
      }

   }

   public boolean getCheckbox() {
      String var1 = this.getAttribute("checked");
      return var1 != null && !"false".equals(var1);
   }

   public String getValue() {
      return this.getAttribute("value");
   }

   public Integer getValueAsInt(Integer var1) {
      String var2 = this.getValue();
      return var2 != null && !var2.equals("") ? Integer.parseInt(var2) : var1;
   }

   public Boolean getValueAsBoolean(Boolean var1) {
      String var2 = this.getValue();
      return var2 != null && !var2.equals("") ? Boolean.parseBoolean(var2) : var1;
   }

   public native String getAttributeKey(int var1);

   public native String getAttributeValue(int var1);

   public native int getNumAttributes();

   public native Element getChild(int var1);

   public native int getNumChildren();

   public native String getInnerRML();

   public native void setInnerRML(String var1);

   public void setTextNoCharset(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      var1 = var1.replace("&", "&amp;");
      var1 = var1.replace("<", "&lt;");
      var1 = var1.replace(">", "&gt;");
      var1 = var1.replace("${", "$ {");
      this.setInnerRML(var1);
   }

   public boolean loadCharsetIfNeededWithCurrentText() {
      return this.loadCharsetIfNeeded(this.getInnerRML());
   }

   public boolean loadCharsetIfNeeded(String var1) {
      String var2 = "";
      int var3 = var1.length();

      int var5;
      for(int var4 = 0; var4 < var3; var4 += Character.charCount(var5)) {
         var5 = var1.codePointAt(var4);
         if (var5 > 128) {
            boolean var6 = false;
            if (var5 >= 196 && var5 <= 252) {
               var6 = true;
            }

            if (!var6) {
               if (this.charsetsLoaded == null) {
                  this.charsetsLoaded = new HashSet();
               }

               if (!this.charsetsLoaded.contains(var5)) {
                  this.charsetsLoaded.add(var5);
                  if (!var2.equals("")) {
                     var2 = var2 + ",";
                  }

                  var2 = var2 + keycodeToHex(var5);
               }
            }
         }
      }

      if (!var2.equals("")) {
         this.compareAndAddClass("needsUnicodeFont");
         return true;
      } else {
         return false;
      }
   }

   public static final String keycodeToHex(int var0) {
      String var1 = String.format("U+%04X", var0);
      return var1;
   }

   public void compareAndSetText(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      if (!var1.equals(this.getInnerRML())) {
         this.setText(var1);
      }

   }

   public void setText(String var1) {
      this.loadCharsetIfNeeded(var1);
      this.setTextNoCharset(var1);
   }

   public void addClass(String var1) {
      this.setClassNames(this.getClassNames() + " " + var1);
   }

   public void compareAndAddClass(String var1) {
      if (!this.hasClassName(var1)) {
         this.addClass(var1);
      }

   }

   public void removeClass(String var1) {
      String var2 = this.getClassNames();
      String var3 = var2.replaceAll("\\b" + var1 + "\\b", "");
      if (!var2.equals(var3)) {
         this.setClassNames(var3);
      }

   }

   public void compareAndSetClassNames(String var1) {
      if (!var1.equals(this.getClassNames())) {
         this.setClassNames(var1);
      }

   }

   public native void setClassNames(String var1);

   public native String getClassNames();

   public native Element clone();

   public native void appendChild(Element var1);

   public native void insertBefore(Element var1, Element var2);

   public native void removeChild(Element var1);

   public native String getProperty(String var1, String var2);

   public native void setProperty(String var1, String var2);

   public native boolean isPseudoClassSet(String var1);

   public native float getAbsoluteLeft();

   public native float getAbsoluteTop();

   public native float getOffsetLeft();

   public native float getOffsetTop();

   public native float getOffsetWidth();

   public native float getOffsetHeight();

   public native float getScrollTop();

   public native void setScrollTop(float var1);

   public native void scrollIntoView(boolean var1);

   public boolean isFocused() {
      return this.isPseudoClassSet("focus");
   }

   public void prependChild(Element var1) {
      if (this.getNumChildren() == 0) {
         this.appendChild(var1);
      } else {
         this.insertBefore(var1, this.getChild(0));
      }

   }

   public void clearAllChildren() {
      int var1 = this.getNumChildren();

      for(int var2 = var1; var2 >= 0; --var2) {
         Element var3 = this.getChild(var2);
         if (var3 == null) {
            throw new RuntimeException("child==null, i:" + var2);
         }

         String var4 = var3.getTagName();
         if (!var4.equals("scrollbarvertical")) {
            this.removeChild(var3);
         }
      }

   }

   public ArrayList getChildren() {
      ArrayList var1 = new ArrayList();
      int var2 = this.getNumChildren();

      for(int var3 = 0; var3 < var2; ++var3) {
         Element var4 = this.getChild(var3);
         if (var4 == null) {
            throw new RuntimeException("child==null, i:" + var3);
         }

         var1.add(var4);
      }

      return var1;
   }

   public ArrayList getAllNestedChildren() {
      ArrayList var1 = new ArrayList();
      this.getAllNestedChildren(var1);
      return var1;
   }

   public void getAllNestedChildren(ArrayList var1) {
      int var2 = this.getNumChildren();

      for(int var3 = 0; var3 < var2; ++var3) {
         Element var4 = this.getChild(var3);
         if (var4 == null) {
            throw new RuntimeException("child==null, i:" + var3);
         }

         var1.add(var4);
         var4.getAllNestedChildren(var1);
      }

   }

   public boolean hasClassName(String var1) {
      return (" " + this.getClassNames() + " ").contains(" " + var1 + " ");
   }

   public Element findByClassName(String var1) {
      int var2 = this.getNumChildren();

      for(int var3 = 0; var3 < var2; ++var3) {
         Element var4 = this.getChild(var3);
         if (var4 == null) {
            throw new RuntimeException("child==null, i:" + var3);
         }

         if (var4.hasClassName(var1)) {
            return var4;
         }

         Element var5 = var4.findByClassName(var1);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   public Element findByTagName(String var1) {
      int var2 = this.getNumChildren();

      for(int var3 = 0; var3 < var2; ++var3) {
         Element var4 = this.getChild(var3);
         if (var4 == null) {
            throw new RuntimeException("child==null, i:" + var3);
         }

         if (var4.getTagName().equalsIgnoreCase(var1)) {
            return var4;
         }

         Element var5 = var4.findByTagName(var1);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   public ArrayList findElementsByClassName(String var1) {
      ArrayList var2 = new ArrayList();
      this.findElementsByClassName(var1, var2);
      return var2;
   }

   public void findElementsByClassName(String var1, List var2) {
      int var3 = this.getNumChildren();

      for(int var4 = 0; var4 < var3; ++var4) {
         Element var5 = this.getChild(var4);
         if (var5 == null) {
            throw new RuntimeException("child==null, i:" + var4);
         }

         if ((" " + var5.getClassNames() + " ").contains(" " + var1 + " ")) {
            var2.add(var5);
         }

         var5.findElementsByClassName(var1, var2);
      }

   }

   public void hide() {
      this.show(false);
   }

   public void show() {
      this.show(true);
   }

   public void show(boolean var1) {
      if (!var1) {
         this.compareAndAddClass("hide");
      } else {
         this.removeClass("hide");
      }

   }
}
