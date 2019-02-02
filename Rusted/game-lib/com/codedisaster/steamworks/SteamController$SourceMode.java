package com.codedisaster.steamworks;

public enum SteamController$SourceMode {
   None,
   Dpad,
   Buttons,
   FourButtons,
   AbsoluteMouse,
   RelativeMouse,
   JoystickMove,
   JoystickMouse,
   JoystickCamera,
   ScrollWheel,
   Trigger,
   TouchMenu,
   MouseJoystick,
   MouseRegion,
   RadialMenu,
   Switches;

   private static final SteamController$SourceMode[] values = values();

   static SteamController$SourceMode byOrdinal(int var0) {
      return values[var0];
   }
}
