package com.corrodinggames.rts.gameFramework.c;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.q
public class class_26 implements Menu {
   // $FF: renamed from: a java.util.ArrayList
   public ArrayList field_2 = new ArrayList();

   public MenuItem add(CharSequence var1) {
      class_115 var2 = new class_115();
      var2.setTitle(var1);
      this.field_2.add(var2);
      return var2;
   }

   public MenuItem add(int var1) {
      throw new RuntimeException("not Implemented");
   }

   public MenuItem add(int var1, int var2, int var3, CharSequence var4) {
      class_115 var5 = new class_115();
      var5.setTitle(var4);
      var5.method_1027(var2);
      this.field_2.add(var5);
      return var5;
   }

   public MenuItem add(int var1, int var2, int var3, int var4) {
      throw new RuntimeException("not Implemented");
   }

   public int addIntentOptions(int var1, int var2, int var3, ComponentName var4, Intent[] var5, Intent var6, int var7, MenuItem[] var8) {
      throw new RuntimeException("not Implemented");
   }

   public SubMenu addSubMenu(CharSequence var1) {
      throw new RuntimeException("not Implemented");
   }

   public SubMenu addSubMenu(int var1) {
      throw new RuntimeException("not Implemented");
   }

   public SubMenu addSubMenu(int var1, int var2, int var3, CharSequence var4) {
      throw new RuntimeException("not Implemented");
   }

   public SubMenu addSubMenu(int var1, int var2, int var3, int var4) {
      throw new RuntimeException("not Implemented");
   }

   public void clear() {
      this.field_2.clear();
   }

   public MenuItem getItem(int var1) {
      return (MenuItem)this.field_2.get(var1);
   }

   public void close() {
      throw new RuntimeException("not Implemented");
   }

   public MenuItem findItem(int var1) {
      throw new RuntimeException("not Implemented");
   }

   public boolean hasVisibleItems() {
      throw new RuntimeException("not Implemented");
   }

   public boolean isShortcutKey(int var1, KeyEvent var2) {
      throw new RuntimeException("not Implemented");
   }

   public boolean performIdentifierAction(int var1, int var2) {
      throw new RuntimeException("not Implemented");
   }

   public boolean performShortcut(int var1, KeyEvent var2, int var3) {
      throw new RuntimeException("not Implemented");
   }

   public void removeGroup(int var1) {
      throw new RuntimeException("not Implemented");
   }

   public void removeItem(int var1) {
      throw new RuntimeException("not Implemented");
   }

   public void setGroupCheckable(int var1, boolean var2, boolean var3) {
      throw new RuntimeException("not Implemented");
   }

   public void setGroupEnabled(int var1, boolean var2) {
      throw new RuntimeException("not Implemented");
   }

   public void setGroupVisible(int var1, boolean var2) {
      throw new RuntimeException("not Implemented");
   }

   public void setQwertyMode(boolean var1) {
      throw new RuntimeException("not Implemented");
   }

   public int size() {
      return this.field_2.size();
   }
}
