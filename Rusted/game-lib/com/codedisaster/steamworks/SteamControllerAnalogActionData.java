package com.codedisaster.steamworks;

public class SteamControllerAnalogActionData {
   int mode;
   // $FF: renamed from: x float
   float field_3241;
   // $FF: renamed from: y float
   float field_3242;
   boolean active;

   public SteamController$SourceMode getMode() {
      return SteamController$SourceMode.byOrdinal(this.mode);
   }

   public float getX() {
      return this.field_3241;
   }

   public float getY() {
      return this.field_3242;
   }

   public boolean getActive() {
      return this.active;
   }
}
