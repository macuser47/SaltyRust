package com.corrodinggames.librocket;

import android.graphics.Rect;
import android.graphics.RectF;
import com.Element;
import com.ElementDocument;
import com.LibRocket;
import com.LibRocket$CompiledGeometry;
import com.LibRocket$TextureHolder;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_305;
import com.corrodinggames.rts.gameFramework.d.class_432;
import com.corrodinggames.rts.java.Main;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

// $FF: renamed from: com.corrodinggames.librocket.a
public class class_264 extends LibRocket {
   // $FF: renamed from: a com.corrodinggames.rts.java.Main
   Main field_2313;
   // $FF: renamed from: b com.corrodinggames.librocket.scripts.ScriptEngine
   public ScriptEngine field_2314;
   // $FF: renamed from: i org.newdawn.slick.opengl.renderer.SGL
   private static SGL field_2315 = Renderer.get();
   // $FF: renamed from: c org.newdawn.slick.Graphics
   Graphics field_2316;
   // $FF: renamed from: d int
   int field_2317 = 0;
   // $FF: renamed from: e android.graphics.Rect
   Rect field_2318 = new Rect();
   // $FF: renamed from: f android.graphics.RectF
   RectF field_2319 = new RectF();
   // $FF: renamed from: g boolean
   boolean field_2320 = false;
   // $FF: renamed from: j com.ElementDocument
   private ElementDocument field_2321;
   // $FF: renamed from: k com.ElementDocument
   private ElementDocument field_2322;
   // $FF: renamed from: h java.util.regex.Pattern
   Pattern field_2323 = Pattern.compile("\\$\\{([^\\}]*?)\\}");

   public class_264(Main var1) {
      this.field_2313 = var1;
      this.field_2314 = ScriptEngine.createScriptEngine(this, var1);
   }

   // $FF: renamed from: a (org.newdawn.slick.Graphics) void
   public void method_1829(Graphics var1) {
      this.field_2316 = var1;
      this.field_2317 = 0;
   }

   public void RenderGeometryPossiblyCompiled(float[] var1, float[] var2, int[] var3, int[] var4, int var5, float var6, float var7, LibRocket$CompiledGeometry var8) {
      try {
         if (this.debug) {
            System.out.println("SlickLibRocket:RenderGeometry(" + var1.length + "," + var5 + ")");
            System.out.println("indices.length=" + var4.length + "");
         }

         class_275 var9 = null;
         if (var5 != 0) {
            var9 = (class_275)this.findTextureHolder(var5);
         }

         RectF var10 = null;
         if (var8 != null) {
            var10 = (RectF)var8.bbox;
         }

         float var15;
         if (var10 == null) {
            var10 = new RectF();
            int var11 = 0;

            while(true) {
               if (var11 >= var4.length) {
                  var10.method_1978();
                  if (var8 != null) {
                     var8.bbox = var10;
                  }
                  break;
               }

               int var10000 = var4[var11];

               for(int var13 = 0; var13 <= 2; ++var13) {
                  int var12 = var4[var11 + var13];
                  float var14 = var1[var12 * 2 + 0];
                  var15 = var1[var12 * 2 + 1];
                  if (var10.method_1963()) {
                     var10.method_1969(var14, var15, var14 + 1.0F, var15 + 1.0F);
                  } else {
                     var10.method_1977(var14, var15);
                  }
               }

               var11 += 3;
            }
         }

         RectF var23 = new RectF(var10);
         var23.method_1972(var6, var7);
         if (this.field_2320 && !class_296.method_2082(var23, this.field_2319)) {
            boolean var24 = true;
            if (var9 != null && var9.field_2345 == null && var9.field_2347 && var9.field_2350 == null) {
               var24 = false;
            }

            if (var24) {
               return;
            }
         }

         if (var9 != null && var9.field_2346 != null) {
            System.out.println("Loading image for: " + var9.index);
            var9.field_2345 = new Image(var9.field_2346);
            if (var9.field_2345 == null) {
               throw new RuntimeException("slickTextureHolder.image==null");
            }

            var9.field_2346 = null;
         }

         this.field_2316.pushTransform();
         this.field_2316.setDrawMode(Graphics.MODE_NORMAL);
         this.field_2316.translate(var6, var7);
         float var25 = 1.0F;
         float var26 = 1.0F;
         boolean var27 = false;
         var15 = 1.0F;
         boolean var16 = false;
         Texture var17 = null;
         if (var9 != null) {
            var27 = var9.field_2348;
            var15 = var9.field_2349;
            var17 = TextureImpl.getLastBind();
            if (var9.field_2345 == null && var9.field_2347) {
               if (var9.field_2350 != null) {
                  float var18 = (float)class_236.method_1549().field_1922 / 1000.0F / 10.0F * 360.0F % 360.0F;
                  this.field_2316.translate(-var6, -var7);
                  Rect var19 = new Rect(this.field_2318.field_2352, this.field_2318.field_2353, this.field_2318.field_2354, this.field_2318.field_2355);
                  class_236.method_1549().field_1935.method_83(var19);
                  class_469.method_3061(var9.field_2350, var23.method_1966(), var23.method_1967(), var18, 3.0F, class_107.method_954(0), var23.method_1965() * 0.6F, var23.method_1965(), false, false, 1);
                  var15 = 0.0F;
               } else if (this.field_2317 < 1) {
                  var9.method_1902();
                  ++this.field_2317;
               }
            }

            if (var9.field_2345 != null) {
               var9.field_2345.getTexture().bind();
               var25 = var9.field_2345.getTextureWidth();
               var26 = var9.field_2345.getTextureHeight();
               var16 = true;
            } else if (var9.field_2347) {
               var15 = 0.1F;
            }
         }

         if (!var16) {
            TextureImpl.bindNone();
         }

         Color var28 = new Color(1.0F, 1.0F, 1.0F, var15);
         this.field_2316.setColor(var28);
         field_2315.glBegin(4);

         for(int var29 = 0; var29 < var4.length; var29 += 3) {
            int var20 = var4[var29];
            int var21;
            if (!var27) {
               var21 = var3[var20];
               var28.r = (float)(var21 >> 24 & 255) / 255.0F;
               var28.g = (float)(var21 >> 16 & 255) / 255.0F;
               var28.b = (float)(var21 >> 8 & 255) / 255.0F;
               var28.a = (float)(var21 & 255) / 255.0F;
               var28.a *= var15;
               var28.bind();
            }

            for(var21 = 0; var21 <= 2; ++var21) {
               var20 = var4[var29 + var21];
               field_2315.glTexCoord2f(var2[var20 * 2 + 0] * var25, var2[var20 * 2 + 1] * var26);
               field_2315.glVertex2f(var1[var20 * 2 + 0], var1[var20 * 2 + 1]);
            }
         }

         field_2315.glEnd();
         this.field_2316.popTransform();
      } catch (Throwable var22) {
         ScriptEngine.throwDelayedException("UI Render Failed", var22);
      }

   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public String method_1830(String var1) {
      if (var1.startsWith("base:")) {
         return var1.substring("base:".length());
      } else if (var1.startsWith("drawable:")) {
         return "res/drawable/" + var1.substring("drawable:".length());
      } else if (var1.startsWith("assets:")) {
         String var2 = var1.substring("assets:".length());
         return class_236.method_1637(var2);
      } else if (var1.startsWith("assets/gui/")) {
         class_236.method_1591("convertTexturePath already had path:" + var1);
         return var1;
      } else {
         return "assets/gui/" + var1;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) java.util.regex.Matcher
   public Matcher method_1831(String var1, String var2) {
      Pattern var3 = Pattern.compile(var1);
      Matcher var4 = var3.matcher(var2);
      return var4.matches() ? var4 : null;
   }

   public void ReleaseTexture(int var1) {
      this.removeTextureHolder(var1);
   }

   public boolean LoadTexture(int var1, String var2) {
      class_275 var3 = (class_275)this.findTextureHolder(var1);
      boolean var4 = false;
      boolean var5 = false;
      class_24 var6 = null;
      if (var2.startsWith("lazy:")) {
         var2 = var2.substring("lazy:".length());
         var4 = true;
      }

      if (var2.startsWith("nocolor:")) {
         var2 = var2.substring("nocolor:".length());
         var5 = true;
      }

      if (var2.startsWith("unit:")) {
         var2 = var2.substring("unit:".length());
         var6 = class_469.method_3052(var2);
         var4 = true;
      }

      Matcher var7 = this.method_1831("^(alpha\\((.*)\\):).*", var2);
      String var8;
      if (var7 != null) {
         var8 = var7.group(1);
         String var9 = var7.group(2);
         class_236.method_1591("alpha=" + var9);
         var3.field_2349 = Float.parseFloat(var9);
         var2 = var2.substring(var8.length());
      }

      var8 = this.method_1830(var2);
      var3.field_2347 = var4;
      var3.field_2348 = var5;
      var3.field_2350 = var6;
      var3.field_2344 = var8;
      return var4 || var3.method_1902();
   }

   public boolean GenerateTexture(int var1, byte[] var2) {
      try {
         class_275 var3 = (class_275)this.findTextureHolder(var1);
         ImageBuffer var4 = new ImageBuffer(var3.width, var3.height);
         byte[] var5 = var4.getRGBA();

         for(int var6 = 0; var6 < var2.length; ++var6) {
            var5[var6] = var2[var6];
         }

         var3.field_2345 = new Image(var4);
         if (var3.field_2345 == null) {
            throw new RuntimeException("slickTextureHolder.image==null");
         } else {
            return true;
         }
      } catch (Throwable var7) {
         ScriptEngine.throwDelayedException("GenerateTexture Failed", var7);
         return true;
      }
   }

   public void EnableScissorRegion(boolean var1) {
      if (var1) {
         this.field_2316.setWorldClip((float)this.field_2318.field_2352, (float)this.field_2318.field_2353, (float)this.field_2318.method_1904(), (float)this.field_2318.method_1905());
         this.field_2320 = true;
      } else {
         this.field_2316.clearWorldClip();
         this.field_2320 = false;
      }

   }

   public void SetScissorRegion(int var1, int var2, int var3, int var4) {
      this.field_2318.method_1911(var1, var2, var1 + var3, var2 + var4);
      this.field_2319.method_1969((float)var1, (float)var2, (float)(var1 + var3), (float)(var2 + var4));
      this.EnableScissorRegion(true);
   }

   // $FF: renamed from: a () boolean
   public boolean method_1832() {
      if (this.getActiveDocument() != null) {
         return false;
      } else if (this.field_2322 != null) {
         return false;
      } else {
         return this.field_2321 == null;
      }
   }

   public void HandleEvent(String var1) {
      this.field_2314.processScript(var1);
   }

   // $FF: renamed from: b (java.lang.String) java.lang.Object
   public Object method_1833(String var1) {
      HashMap var2 = this.getActiveDocumentMetadata();
      return var2 == null ? null : var2.get(var1);
   }

   public LibRocket$TextureHolder getFromTextureHolderFactory() {
      return new class_275(this);
   }

   public void newDocumentLoaded(ElementDocument var1) {
      this.field_2314.getRootNoCheck().convertTextOnPage();
   }

   public void newDocumentShown(ElementDocument var1) {
      if (this.field_2322 != null) {
         this.field_2322.pullToFront();
      }

      if (this.field_2321 != null) {
         this.field_2321.pullToFront();
      }

   }

   // $FF: renamed from: b () com.ElementDocument
   public ElementDocument method_1834() {
      return this.field_2322;
   }

   // $FF: renamed from: c () com.ElementDocument
   public ElementDocument method_1835() {
      return this.field_2321;
   }

   // $FF: renamed from: d () com.ElementDocument
   public ElementDocument method_1836() {
      return this.field_2321 != null ? this.field_2321 : this.field_2322;
   }

   // $FF: renamed from: e () com.ElementDocument
   public ElementDocument method_1837() {
      ElementDocument var1;
      if (this.field_2322 != null) {
         var1 = this.field_2322;
      } else {
         var1 = this.getActiveDocument();
      }

      return var1;
   }

   // $FF: renamed from: f () com.ElementDocument
   public ElementDocument method_1838() {
      ElementDocument var1;
      if (this.field_2321 != null) {
         var1 = this.field_2321;
      } else if (this.field_2322 != null) {
         var1 = this.field_2322;
      } else {
         var1 = this.getActiveDocument();
      }

      return var1;
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_1839(String var1) {
      this.method_1840((String)null, var1);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   public void method_1840(String var1, String var2) {
      this.method_1843(var1, var2, (String)null, (Object)null, (Object)null, true);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) void
   public void method_1841(String var1, String var2, String var3, String var4, String var5) {
      this.method_1843(var1, var2, var3, var4, var5, true);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String, com.corrodinggames.librocket.b, com.corrodinggames.librocket.b) void
   public void method_1842(String var1, String var2, String var3, class_263 var4, class_263 var5) {
      this.method_1843(var1, var2, var3, var4, var5, true);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, boolean) com.ElementDocument
   public ElementDocument method_1843(String var1, String var2, String var3, Object var4, Object var5, boolean var6) {
      return this.method_1844(var1, var2, var3, var4, var5, var6, true);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, boolean, boolean) com.ElementDocument
   public ElementDocument method_1844(String var1, String var2, String var3, Object var4, Object var5, boolean var6, boolean var7) {
      ScriptEngine.checkThreadAccess();
      ElementDocument var8 = this.createPopup("messagebox.rml", (Object)null);
      HashMap var9 = var8.getMetadataMap();
      var8.setMetadata("sourceDocumentId", var2);
      var8.getElementById("message").setText(var2);
      if (var1 == null) {
         var1 = "";
      }

      var8.getElementById("title").setText(var1);
      this.method_1849(var8, "button_1", var4, var9);
      this.method_1849(var8, "button_2", var5, var9);
      Element var10 = var8.getElementById("button_back");
      var10.loadCharsetIfNeededWithCurrentText();
      var10.setAttribute("onclick", "closePopup();");
      if (!var7) {
         var10.hide();
      }

      if (var4 == null && var5 == null) {
         var10.setText(class_432.method_2744("menus.common.ok"));
         var10.focus();
      }

      if (var3 != null) {
         Element var11 = var8.getElementById("textInputWrapper");
         var11.show();
         Element var12 = var8.getElementById("textInput");
         var12.setAttribute("value", var3);
         var12.focus();
      }

      if (var6) {
         if (this.method_1845(var8)) {
            return var8;
         } else {
            this.closeDocument(var8);
            return null;
         }
      } else {
         return var8;
      }
   }

   // $FF: renamed from: a (com.ElementDocument) boolean
   public boolean method_1845(ElementDocument var1) {
      if (this.field_2321 != null) {
         class_236.method_1591("AlertPopup already visible closing");
         this.closeDocument(this.field_2321);
         this.field_2321 = null;
      }

      this.field_2321 = var1;
      this.field_2321.show(4);
      return true;
   }

   // $FF: renamed from: b (com.ElementDocument) boolean
   public boolean method_1846(ElementDocument var1) {
      if (this.field_2322 != null) {
         class_236.method_1591("Popup already visible, cannot show: " + var1.getMetadata("sourceDocumentId"));
         if (this.field_2321 != null) {
            this.field_2321.pullToFront();
            return false;
         } else {
            this.field_2322.pullToFront();
            return false;
         }
      } else {
         this.field_2322 = var1;
         this.field_2322.show(4);
         return true;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Object, java.lang.String, boolean) com.ElementDocument
   public ElementDocument method_1847(String var1, Object var2, String var3, boolean var4) {
      ScriptEngine.checkThreadAccess();
      ElementDocument var5 = this.createPopup("messagebox.rml", var2);
      var5.setMetadata("sourceDocumentId", var1);
      File var6 = new File(this.method_1830(var1));
      String var7 = class_296.method_2087(var6);
      var5.getElementById("mainButtons").hide();
      Element var8 = var5.getElementById("message");
      var8.setInnerRML(var7);
      this.method_1848(var8);
      if (var3 == null) {
         var3 = "";
      }

      var5.getElementById("title").setText(var3);
      if (var4) {
         if (this.method_1846(var5)) {
            return var5;
         } else {
            this.closeDocument(var5);
            return null;
         }
      } else {
         return var5;
      }
   }

   // $FF: renamed from: a (com.Element) void
   public void method_1848(Element var1) {
      if (var1 == null) {
         class_236.method_1591("loadCharsetIfNeededOnChildren: root is null");
      } else {
         ArrayList var2 = var1.getAllNestedChildren();
         Iterator var3 = var2.iterator();

         while(true) {
            Element var4;
            String var5;
            do {
               if (!var3.hasNext()) {
                  return;
               }

               var4 = (Element)var3.next();
               var5 = var4.getTagName();
            } while(!var5.equals("p") && !var5.startsWith("h") && !var5.startsWith("label") && !var5.startsWith("button") && !var5.startsWith("select"));

            boolean var6 = var4.loadCharsetIfNeededWithCurrentText();
         }
      }
   }

   // $FF: renamed from: a (com.ElementDocument, java.lang.String, java.lang.Object, java.util.HashMap) void
   public void method_1849(ElementDocument var1, String var2, Object var3, HashMap var4) {
      Element var5 = var1.getElementById(var2);
      if (var3 == null) {
         var5.hide();
      } else if (var3 instanceof String) {
         String var6 = (String)var3;
         int var7 = var6.indexOf(":");
         String var8 = var6.substring(0, var7);
         String var9 = "";
         if (var7 + 1 < var6.length()) {
            var9 = var6.substring(var7 + 1);
         }

         if (var8.startsWith("[onenter]")) {
            var8 = var8.substring("[onenter]".length());
            var1.getElementById("textInput").setAttribute("onenter", var9);
         }

         var5.setText(var8);
         var5.setAttribute("onclick", var9);
      } else if (var3 instanceof class_263) {
         class_263 var10 = (class_263)var3;
         String var11 = "action_" + var2;
         var4.put(var11, var10.field_2311);
         var5.setText(var10.field_2310);
         var5.setAttribute("onclick", "runRunnable(" + var11 + ");");
      } else {
         class_236.method_1595("Unhandled type:" + var3);
      }

   }

   // $FF: renamed from: g () boolean
   public boolean method_1850() {
      if (this.field_2321 != null) {
         class_236.method_1591("Closing alert");
         this.closeDocument(this.field_2321);
         this.field_2321 = null;
         return true;
      } else if (this.field_2322 != null) {
         class_236.method_1591("Closing popup");
         this.closeDocument(this.field_2322);
         this.field_2322 = null;
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: h () java.lang.String
   public String method_1851() {
      ElementDocument var1 = this.method_1836();
      Element var2 = var1.getElementById("textInput");
      return var2.getAttribute("value");
   }

   // $FF: renamed from: d (java.lang.String) java.lang.String
   public String method_1852(String var1) {
      String var2 = null;
      if (var1 != null && var1.contains("class=\"log-entry\"")) {
         System.out.println("parseText: skipping log line:" + var1);
         return null;
      } else {
         int var3 = 0;

         for(Matcher var4 = this.field_2323.matcher(var1); var4.find(); var2 = var1) {
            ++var3;
            if (var3 > 100) {
               System.out.println("parseText too many loops!!");
               return null;
            }

            String var5 = var4.group(1);
            String var6 = null;
            if (this.debug) {
               System.out.println("parseText:" + var5);
            }

            if (var5.startsWith("i:")) {
               String var7 = var5.substring(2);
               var6 = class_432.method_2744(var7);
            }

            if (var6 == null) {
               Object var8 = this.field_2314.processArg(var5);
               if (var8 != null) {
                  var6 = var8.toString();
               }
            }

            if (var6 == null) {
               var1 = var4.replaceFirst("(unhandled:" + var5 + ")");
            } else {
               var1 = var4.replaceFirst(var6);
            }

            if (var6 != null) {
               ElementDocument var9 = this.getActiveDocument();
               if (var9 != null && !var9.translatedToUnicode && class_296.method_2094(var6)) {
                  var9.translatedToUnicode = true;
               }

               var9 = this.method_1838();
               if (var9 != null && !var9.translatedToUnicode && class_296.method_2094(var6)) {
                  var9.translatedToUnicode = true;
               }
            }

            var4 = this.field_2323.matcher(var1);
         }

         return var2;
      }
   }

   public String TranslateString(String var1) {
      try {
         String var2 = this.method_1852(var1);
         return var2 != null ? var2 : null;
      } catch (Exception var3) {
         ScriptEngine.throwDelayedException("TranslateString exception on: " + var1, var3);
         class_236.method_1589("Exception in TranslateString", var3);
         class_236.method_1588("start");
         var3.printStackTrace();
         class_236.method_1588("end");
         class_236.method_1588("start logStack");
         class_236.method_1594();
         class_236.method_1588("end logStack");
         System.out.println("test!!!");
         System.err.flush();
         System.out.flush();
         return null;
      }
   }

   public long getFileLastModified(String var1) {
      return class_305.method_2107(var1, false);
   }

   public void postUpdate() {
      boolean var1 = this.queueExtraUpdate;
      super.postUpdate();
      if (var1) {
         this.field_2314.checkForErrors();
      }

   }
}
