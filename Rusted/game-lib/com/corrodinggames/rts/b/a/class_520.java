package com.corrodinggames.rts.b.a;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.b.a.a
public class class_520 extends class_519 {
   // $FF: renamed from: a () void
   public void method_3293() {
      class_236.method_1591("Running unit tests - maths (v3)");
      class_296.method_2097(100.0F, 100.0F);
      class_296.method_2097(0.0F, 100.0F);
      class_296.method_2097(100.0F, 0.0F);
      class_296.method_2097(0.0F, -100.0F);
      class_296.method_2097(-100.0F, 0.0F);
      class_296.method_2097(0.0F, 0.0F);
      class_236.method_1591("fast_atan2 - NaN");
      class_296.method_2097(Float.NaN, 0.0F);
      class_296.method_2097(0.0F, Float.NaN);
      class_296.method_2097(Float.NaN, Float.NaN);
      class_236.method_1591("fast_atan2 - Max");
      class_296.method_2097(Float.MAX_VALUE, 0.0F);
      class_296.method_2097(Float.MIN_VALUE, 0.0F);
      class_296.method_2097(0.0F, Float.MAX_VALUE);
      class_296.method_2097(0.0F, Float.MIN_VALUE);
      class_236.method_1591("fast_atan2 - NaN+Max");
      class_296.method_2097(Float.MAX_VALUE, Float.NaN);
      class_296.method_2097(Float.MIN_VALUE, Float.MAX_VALUE);
      class_296.method_2097(Float.MAX_VALUE, Float.MIN_VALUE);
      class_296.method_2097(900000.0F, 900000.0F);
      class_296.method_2097(3.4028236E33F, 3.4028236E33F);
      class_296.method_2097(3.4028236E34F, 3.4028236E34F);
      class_296.method_2097(3.4028234E35F, 3.4028234E35F);
      class_296.method_2097(3.4028236E36F, 3.4028236E36F);
      class_296.method_2097(3.4028235E37F, 3.4028235E37F);
      class_296.method_2097(Float.MAX_VALUE, Float.MAX_VALUE);
      class_236.method_1591("fast_atan2 - max,max");
      class_296.method_2097(Float.MAX_VALUE, Float.MAX_VALUE);
      class_296.method_2097(Float.MIN_VALUE, Float.MIN_VALUE);
      class_236.method_1591("cos/sin");
      class_522.method_3296(class_296.method_2099(0.0F), 1.0F);
      class_522.method_3296(class_296.method_2099(360.0F), 1.0F);
      class_522.method_3296(class_296.method_2099(10800.0F), 1.0F);
      class_522.method_3296(class_296.method_2099(45.0F), 0.70710677F);
      class_522.method_3296(class_296.method_2099(90.0F), 0.0F);
      class_522.method_3296(class_296.method_2099(450.0F), 0.0F);
      class_522.method_3296(class_296.method_2099(10890.0F), 0.0F);
      class_522.method_3296(class_296.method_2098(0.0F), 0.0F);
      class_522.method_3296(class_296.method_2098(90.0F), 1.0F);
      class_296.method_2099(-999999.0F);
      class_296.method_2099(999999.0F);
      class_296.method_2099(Float.MAX_VALUE);
      class_296.method_2099(Float.MIN_VALUE);
      class_296.method_2098(Float.MAX_VALUE);
      class_296.method_2098(Float.MIN_VALUE);
   }
}
