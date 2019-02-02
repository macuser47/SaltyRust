package com.corrodinggames.librocket.scripts;

import java.util.ArrayList;

public class Root$TableRow {
   public ArrayList tableCells = new ArrayList();
   public Runnable androidOnclick;
   public String librocketOnClick;
   public String extraClasses;

   public void addClass(String var1) {
      if (this.extraClasses == null) {
         this.extraClasses = var1;
      } else {
         this.extraClasses = this.extraClasses + " " + var1;
      }

   }

   public Root$TableCell addCell(String var1) {
      Root$TableCell var2 = new Root$TableCell(var1);
      this.tableCells.add(var2);
      return var2;
   }

   public void setLibrocketOnClick(String var1) {
      this.librocketOnClick = var1;
   }

   public void setAndroidOnClick(Runnable var1) {
      this.androidOnclick = var1;
   }
}
