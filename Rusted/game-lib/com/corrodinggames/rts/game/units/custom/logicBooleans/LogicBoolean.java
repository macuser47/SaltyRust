package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;
import com.corrodinggames.rts.gameFramework.class_296;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class LogicBoolean implements Cloneable {
   boolean not;
   public static final LogicBoolean$StaticBoolean trueBoolean = new LogicBoolean$StaticBooleanTrue();
   public static final LogicBoolean$StaticBoolean falseBoolean = new LogicBoolean$StaticBooleanFalse();
   static HashMap booleans = new HashMap();
   HashMap parameterMappings = new HashMap();
   boolean locked = false;

   static void addBooleanType(LogicBoolean var0, String... var1) {
      String[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2[var4];
         booleans.put(var5, var0);
         String var6 = var5.replace("self.", "subject.");
         if (!var6.equals(var5)) {
         }
      }

   }

   public String[] getParameters() {
      return new String[0];
   }

   public static Matcher match(String var0, String var1) {
      Pattern var2 = Pattern.compile(var0);
      Matcher var3 = var2.matcher(var1);
      return var3.matches() ? var3 : null;
   }

   public static Object convertParameterData(String var0, Class var1) {
      var0 = var0.trim();
      if (var0.length() == 0) {
         return null;
      } else if (var0.equals("null")) {
         return null;
      } else if ("false".equalsIgnoreCase(var0)) {
         return Boolean.FALSE;
      } else if ("true".equalsIgnoreCase(var0)) {
         return Boolean.TRUE;
      } else {
         Matcher var2 = match("'(.*)'", var0);
         if (var2 != null) {
            return class_296.method_2100(var2.group(1));
         } else {
            var2 = match("\"(.*)\"", var0);
            if (var2 != null) {
               return class_296.method_2100(var2.group(1));
            } else {
               var2 = match("(-?\\d*)", var0);
               if (var2 != null) {
                  return Integer.parseInt(var2.group(1));
               } else {
                  var2 = match("(-?\\d*\\.\\d*)", var0);
                  if (var2 != null) {
                     return Float.parseFloat(var2.group(1));
                  } else {
                     String var3 = "LogicBoolean: Failed to read parameter:" + var0 + "";
                     if (var1 == String.class) {
                        var3 = var3 + " (A quoted string was expected)";
                     }

                     throw new RuntimeException(var3);
                  }
               }
            }
         }
      }
   }

   public static List getAllFieldsInherited(List var0, Class var1) {
      var0.addAll(Arrays.asList(var1.getFields()));
      Class var2 = var1.getSuperclass();
      if (var2 != null && var2 != LogicBoolean.class) {
         getAllFieldsInherited(var0, var2);
      }

      return var0;
   }

   public void setArgument(String var1, String var2) {
      var1 = var1.toLowerCase(Locale.ROOT);
      LogicBoolean$ParameterMapping var3 = (LogicBoolean$ParameterMapping)this.parameterMappings.get(this.getClass());
      if (var3 == null) {
         var3 = new LogicBoolean$ParameterMapping(this.getClass());
         this.parameterMappings.put(var3.type, var3);
      }

      Field var4 = (Field)var3.parameterFields.get(var1);
      if (var4 != null) {
         Class var14 = var4.getType();
         Object var15 = convertParameterData(var2, var14);

         try {
            var4.set(this, var15);
         } catch (IllegalArgumentException var9) {
            throw new RuntimeException("LogicBoolean: Error parameter:'" + var1 + "' on " + this.getClass().getSimpleName(), var9);
         } catch (IllegalAccessException var10) {
            throw new RuntimeException("LogicBoolean: Error parameter:'" + var1 + "' on " + this.getClass().getSimpleName(), var10);
         }
      } else {
         Method var5 = (Method)var3.parameterMethods.get(var1);
         if (var5 != null) {
            Class var6 = var5.getParameterTypes()[0];
            Object var7 = convertParameterData(var2, var6);

            try {
               var5.invoke(this, var7);
            } catch (IllegalArgumentException var11) {
               throw new RuntimeException("LogicBoolean: Error parameter:'" + var1 + "' on " + this.getClass().getSimpleName(), var11);
            } catch (IllegalAccessException var12) {
               throw new RuntimeException("LogicBoolean: Error parameter:'" + var1 + "' on " + this.getClass().getSimpleName(), var12);
            } catch (InvocationTargetException var13) {
               throw new RuntimeException("LogicBoolean: Error parameter:'" + var1 + "' on " + this.getClass().getSimpleName(), var13);
            }
         } else {
            throw new RuntimeException("LogicBoolean: No parameter:'" + var1 + "' on " + this.getClass().getSimpleName() + " possible parameters:" + var3.allParametersString);
         }
      }
   }

   public void setArgumentsRaw(String var1) {
      if (var1 != null && !"".equals(var1)) {
         ArrayList var2 = topLevelSplit(var1, ",", false);

         String var5;
         String var6;
         for(Iterator var3 = var2.iterator(); var3.hasNext(); this.setArgument(var5, var6)) {
            String var4 = (String)var3.next();
            int var7 = var4.indexOf("=");
            if (var7 > 0) {
               var5 = var4.substring(0, var7);
               var6 = var4.substring(var7 + 1);
            } else {
               var5 = var4;
               var6 = null;
            }
         }

      }
   }

   public LogicBoolean lock() {
      LogicBoolean var1;
      try {
         var1 = (LogicBoolean)this.clone();
      } catch (CloneNotSupportedException var3) {
         throw new RuntimeException(var3);
      }

      var1.locked = true;
      return var1;
   }

   public LogicBoolean with(String var1) {
      LogicBoolean var2;
      try {
         var2 = (LogicBoolean)this.clone();
      } catch (CloneNotSupportedException var4) {
         throw new RuntimeException(var4);
      }

      if (this.locked) {
         if (var1 != null && !var1.trim().equals("")) {
            throw new RuntimeException("LogicBoolean: No parameters accepted for " + this.getClass().getSimpleName());
         }
      } else {
         var2.setArgumentsRaw(var1);
      }

      return var2;
   }

   public static LogicBoolean convertAlwaysTrueToNull(LogicBoolean var0) {
      return var0 == trueBoolean ? null : var0;
   }

   public static LogicBoolean create(String var0) {
      return create(var0, (LogicBoolean)null);
   }

   public static LogicBoolean create(String var0, LogicBoolean var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.toLowerCase(Locale.ENGLISH);
            if (var0.equalsIgnoreCase("true")) {
               return trueBoolean;
            } else if (var0.equalsIgnoreCase("false")) {
               return falseBoolean;
            } else if (var0.startsWith("if ")) {
               var0 = var0.substring("if ".length());
               return parseBlock(var0);
            } else {
               throw new RuntimeException("LogicBoolean: cannot handle:'" + var0 + "' expected true, false or statement starting with if");
            }
         }
      } catch (RuntimeException var3) {
         throw new RuntimeException("LogicBoolean: Error parsing:'" + var0 + "':" + var3.getMessage(), var3);
      }
   }

   public static LogicBoolean parseBlock(String var0) {
      var0 = var0.trim();
      if (var0.startsWith("(") && var0.endsWith(")")) {
         var0 = var0.substring(1, var0.length() - 1);
         var0 = var0.trim();
      }

      String[] var1 = new String[]{"or", "and"};
      String[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2[var4];
         ArrayList var6 = topLevelSplit(var0, var5, true);
         if (var6.size() != 1) {
            ArrayList var7 = new ArrayList();
            Iterator var8 = var6.iterator();

            while(var8.hasNext()) {
               String var9 = (String)var8.next();
               LogicBoolean var10 = parseBlock(var9);
               if (var10 == null) {
                  throw new RuntimeException("LogicBoolean: null on:'" + var0 + "'");
               }

               var7.add(var10);
            }

            return LogicBoolean$JoinerBoolean.createJoiner(var5, (LogicBoolean[])var7.toArray(new LogicBoolean[0]));
         }
      }

      boolean var11 = false;
      if (var0.startsWith("not ")) {
         var11 = true;
         var0 = var0.substring("not ".length());
      }

      String var12 = var0.split("\\(")[0];
      var12 = var12.trim();
      Iterator var13 = booleans.entrySet().iterator();

      String var15;
      LogicBoolean var16;
      do {
         if (!var13.hasNext()) {
            throw new RuntimeException("LogicBoolean: Unknown function:'" + var0 + "'");
         }

         Entry var14 = (Entry)var13.next();
         var15 = (String)var14.getKey();
         var16 = (LogicBoolean)var14.getValue();
      } while(!var12.equals(var15.toLowerCase(Locale.ROOT)));

      String var17 = var0.substring(var15.length());
      var17 = var17.trim();
      if (var17.equals("")) {
         var17 = "()";
      }

      if (var17.startsWith("(") && var17.endsWith(")")) {
         var17 = var17.substring(1, var17.length() - 1);
         var17 = var17.trim();
         LogicBoolean var18 = var16.with(var17);
         var18.not = var11;
         return var18;
      } else {
         throw new RuntimeException("LogicBoolean: Failed to parse function arguments in:'" + var0 + "'");
      }
   }

   public abstract boolean read(class_66 var1);

   public abstract String getMatchFailReasonForPlayer(class_66 var1);

   public static boolean isVariableChar(String var0, int var1) {
      if (var1 >= 0 && var1 < var0.length()) {
         char var2 = var0.charAt(var1);
         return Character.isLetter(var2) || Character.isDigit(var2);
      } else {
         return false;
      }
   }

   public static ArrayList topLevelSplit(String var0, String var1, boolean var2) {
      int var3 = 0;
      StringBuffer var4 = new StringBuffer();
      ArrayList var5 = new ArrayList();

      for(int var6 = 0; var6 < var0.length(); ++var6) {
         char var7 = var0.charAt(var6);
         if (var7 == '(') {
            ++var3;
         } else if (var7 == ')') {
            --var3;
         }

         if (var3 != 0 || var0.indexOf(var1, var6) != var6 || var2 && (isVariableChar(var0, var6 - 1) || isVariableChar(var0, var6 + var1.length()))) {
            var4.append(var7);
         } else {
            var5.add(var4.toString());
            var4 = new StringBuffer();
            var6 += var1.length();
         }
      }

      var5.add(var4.toString());
      new StringBuffer();
      return var5;
   }

   static {
      addBooleanType((new LogicBoolean$HeightBoolean()).with("underwater=true"), "self.underwater", "self.isUnderwater");
      addBooleanType((new LogicBoolean$HeightBoolean()).with("ground=true"), "self.gound", "self.ground", "self.isAtGroundHeight");
      addBooleanType((new LogicBoolean$HeightBoolean()).with("flying=true"), "self.flying", "self.isFlying");
      addBooleanType(new LogicBoolean$MovingBoolean(), "self.isMoving");
      addBooleanType((new LogicBoolean$SpeedBoolean()).with("atTopSpeed=true"), "self.maxspeed", "self.isAtTopSpeed");
      addBooleanType(new LogicBoolean$TouchWaterBoolean(), "self.inwater", "self.isInWater");
      addBooleanType(new LogicBoolean$OverWaterBoolean(), "self.overwater", "self.isOverwater");
      addBooleanType(new LogicBoolean$OverLiquidBoolean(), "self.isOverLiquid");
      addBooleanType(new LogicBoolean$OverCliftBoolean(), "self.isOverClift");
      addBooleanType(new LogicBoolean$OverPassableTileBoolean(), "self.isOverPassableTile");
      addBooleanType((new LogicBoolean$OverPassableTileBoolean()).with("type='LAND'").lock(), "self.isOverOpenLand");
      addBooleanType(new LogicBoolean$TagsBoolean(), "self.tags");
      addBooleanType(new LogicBoolean$HasFlagBoolean(), "self.hasFlag");
      addBooleanType(new LogicBoolean$EnergyBoolean(), "self.energy");
      addBooleanType(new LogicBoolean$EnergyIncludingQueuedBoolean(), "self.energyIncludingQueued");
      addBooleanType((new LogicBoolean$EnergyBoolean()).with("full=true"), "self.isEnergyFull");
      addBooleanType((new LogicBoolean$EnergyBoolean()).with("empty=true"), "self.isEnergyEmpty");
      addBooleanType(new LogicBoolean$TransportingCountBoolean(), "self.transportingCount");
      addBooleanType(new LogicBoolean$TransportingUnitWithTagsBoolean(), "self.transportingUnitWithTags");
      addBooleanType(new LogicBoolean$HpBoolean(), "self.hp");
      addBooleanType(new LogicBoolean$ShieldBoolean(), "self.shield");
      addBooleanType(new LogicBoolean$AmmoBoolean(), "self.ammo");
      addBooleanType((new LogicBoolean$AmmoBoolean()).with("empty=true"), "self.isAmmoEmpty");
      addBooleanType(new LogicBoolean$AmmoIncludingQueuedBoolean(), "self.ammoIncludingQueued");
      addBooleanType(new LogicBoolean$TimeAliveBoolean(), "self.timeAlive");
      addBooleanType(new LogicBoolean$LastConvertedBoolean(), "self.lastConverted");
      addBooleanType(new LogicBoolean$CustomTimerBoolean(), "self.customTimer");
      addBooleanType(new LogicBoolean$HasTakenDamage(), "self.hasTakenDamage");
      addBooleanType(new LogicBoolean$IsAttackingBoolean(), "self.isAttacking");
      addBooleanType((new LogicBoolean$GameModeBoolean()).with("nukesEnabled=true").lock(), "game.nukesEnabled");
      addBooleanType(trueBoolean, "true");
      addBooleanType(falseBoolean, "false");
   }
}
