package com.corrodinggames.rts.game.units.custom.logicBooleans;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

public class LogicBoolean$ParameterMapping {
   public HashMap parameterFields = new HashMap();
   public HashMap parameterMethods = new HashMap();
   public Class type;
   public String allParametersString;

   public LogicBoolean$ParameterMapping(Class var1) {
      this.type = var1;
      ArrayList var2 = new ArrayList();
      LogicBoolean.getAllFieldsInherited(var2, var1);
      this.allParametersString = "";
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         Field var4 = (Field)var3.next();
         if (var4.isAnnotationPresent(LogicBoolean$Parameter.class)) {
            this.parameterFields.put(var4.getName().toLowerCase(Locale.ROOT), var4);
            this.allParametersString = this.allParametersString + var4.getName() + ", ";
         }
      }

      Method[] var8 = var1.getMethods();
      Method[] var9 = var8;
      int var5 = var8.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         Method var7 = var9[var6];
         if (var7.isAnnotationPresent(LogicBoolean$Parameter.class)) {
            this.parameterMethods.put(var7.getName().toLowerCase(Locale.ROOT), var7);
            this.allParametersString = this.allParametersString + var7.getName() + " ,";
         }
      }

   }
}
