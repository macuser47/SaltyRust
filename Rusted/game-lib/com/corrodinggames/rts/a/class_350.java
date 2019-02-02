package com.corrodinggames.rts.a;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;

// $FF: renamed from: com.corrodinggames.rts.a.j
public class class_350 {
   // $FF: renamed from: a boolean
   public static final boolean field_2751;
   // $FF: renamed from: b boolean
   public static final boolean field_2752;
   // $FF: renamed from: c java.lang.reflect.Method
   private static Method field_2753;
   // $FF: renamed from: d java.lang.reflect.Method
   private static Method field_2754;
   // $FF: renamed from: e java.lang.reflect.Method
   private static Method field_2755;
   // $FF: renamed from: f java.lang.reflect.Method
   private static Method field_2756;
   // $FF: renamed from: g java.lang.reflect.Method
   private static Method field_2757;
   // $FF: renamed from: h java.lang.reflect.Method
   private static Method field_2758;
   // $FF: renamed from: i java.lang.reflect.Method
   private static Method field_2759;
   // $FF: renamed from: j java.lang.reflect.Method
   private static Method field_2760;
   // $FF: renamed from: k java.lang.reflect.Method
   private static Method field_2761;
   // $FF: renamed from: l int
   private static int field_2762 = 6;
   // $FF: renamed from: m int
   private static int field_2763 = 8;
   // $FF: renamed from: n float[]
   private static final float[] field_2764;
   // $FF: renamed from: o float[]
   private static final float[] field_2765;
   // $FF: renamed from: p float[]
   private static final float[] field_2766;
   // $FF: renamed from: q int[]
   private static final int[] field_2767;
   // $FF: renamed from: r int[]
   private static final int[] field_2768;

   // $FF: renamed from: a () int[]
   // $FF: synthetic method
   static int[] method_2280() {
      return field_2768;
   }

   static {
      boolean var0 = false;

      try {
         field_2754 = MotionEvent.class.getMethod("getPointerCount");
         field_2755 = MotionEvent.class.getMethod("findPointerIndex", Integer.TYPE);
         field_2756 = MotionEvent.class.getMethod("getPressure", Integer.TYPE);
         field_2757 = MotionEvent.class.getMethod("getHistoricalX", Integer.TYPE, Integer.TYPE);
         field_2758 = MotionEvent.class.getMethod("getHistoricalY", Integer.TYPE, Integer.TYPE);
         field_2759 = MotionEvent.class.getMethod("getHistoricalPressure", Integer.TYPE, Integer.TYPE);
         field_2760 = MotionEvent.class.getMethod("getX", Integer.TYPE);
         field_2761 = MotionEvent.class.getMethod("getY", Integer.TYPE);
         var0 = true;
      } catch (Exception var5) {
         Log.method_1713("MultiTouchController", "static initializer failed", var5);
      }

      field_2751 = var0;
      if (field_2751) {
         try {
            field_2762 = MotionEvent.class.getField("ACTION_POINTER_UP").getInt((Object)null);
            field_2763 = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt((Object)null);
         } catch (Exception var4) {
         }
      }

      boolean var1 = false;

      try {
         field_2753 = MotionEvent.class.getMethod("getButtonState");
         var1 = true;
         Log.method_1709("MultiTouchController", "--- Mouse API succeeded");
      } catch (Exception var3) {
         Log.method_1713("MultiTouchController", "static initializer for mouse failed", var3);
      }

      field_2752 = var1;
      field_2764 = new float[10];
      field_2765 = new float[10];
      field_2766 = new float[10];
      field_2767 = new int[10];
      field_2768 = new int[10];
   }
}
