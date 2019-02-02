package android.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

public class KeyEvent extends InputEvent implements Parcelable {
   // $FF: renamed from: b android.util.SparseArray
   private static final SparseArray field_2462 = new SparseArray();
   // $FF: renamed from: c java.lang.String[]
   private static final String[] field_2463 = new String[]{"META_SHIFT_ON", "META_ALT_ON", "META_SYM_ON", "META_FUNCTION_ON", "META_ALT_LEFT_ON", "META_ALT_RIGHT_ON", "META_SHIFT_LEFT_ON", "META_SHIFT_RIGHT_ON", "META_CAP_LOCKED", "META_ALT_LOCKED", "META_SYM_LOCKED", "0x00000800", "META_CTRL_ON", "META_CTRL_LEFT_ON", "META_CTRL_RIGHT_ON", "0x00008000", "META_META_ON", "META_META_LEFT_ON", "META_META_RIGHT_ON", "0x00080000", "META_CAPS_LOCK_ON", "META_NUM_LOCK_ON", "META_SCROLL_LOCK_ON", "0x00800000", "0x01000000", "0x02000000", "0x04000000", "0x08000000", "0x10000000", "0x20000000", "0x40000000", "0x80000000"};
   // $FF: renamed from: d java.lang.Object
   private static final Object field_2464 = new Object();
   // $FF: renamed from: e int
   private int field_2465;
   // $FF: renamed from: f int
   private int field_2466;
   // $FF: renamed from: g int
   private int field_2467;
   // $FF: renamed from: h int
   private int field_2468;
   // $FF: renamed from: i int
   private int field_2469;
   // $FF: renamed from: j int
   private int field_2470;
   // $FF: renamed from: k int
   private int field_2471;
   // $FF: renamed from: l int
   private int field_2472;
   // $FF: renamed from: m long
   private long field_2473;
   // $FF: renamed from: n long
   private long field_2474;
   // $FF: renamed from: o java.lang.String
   private String field_2475;
   // $FF: renamed from: a android.os.Parcelable.Creator
   public static final Creator field_2476;

   // $FF: renamed from: b () void
   private static void method_2006() {
      SparseArray var0 = field_2462;
      var0.method_2434(0, "KEYCODE_UNKNOWN");
      var0.method_2434(1, "KEYCODE_SOFT_LEFT");
      var0.method_2434(2, "KEYCODE_SOFT_RIGHT");
      var0.method_2434(3, "KEYCODE_HOME");
      var0.method_2434(4, "KEYCODE_BACK");
      var0.method_2434(5, "KEYCODE_CALL");
      var0.method_2434(6, "KEYCODE_ENDCALL");
      var0.method_2434(7, "KEYCODE_0");
      var0.method_2434(8, "KEYCODE_1");
      var0.method_2434(9, "KEYCODE_2");
      var0.method_2434(10, "KEYCODE_3");
      var0.method_2434(11, "KEYCODE_4");
      var0.method_2434(12, "KEYCODE_5");
      var0.method_2434(13, "KEYCODE_6");
      var0.method_2434(14, "KEYCODE_7");
      var0.method_2434(15, "KEYCODE_8");
      var0.method_2434(16, "KEYCODE_9");
      var0.method_2434(17, "KEYCODE_STAR");
      var0.method_2434(18, "KEYCODE_POUND");
      var0.method_2434(19, "KEYCODE_DPAD_UP");
      var0.method_2434(20, "KEYCODE_DPAD_DOWN");
      var0.method_2434(21, "KEYCODE_DPAD_LEFT");
      var0.method_2434(22, "KEYCODE_DPAD_RIGHT");
      var0.method_2434(23, "KEYCODE_DPAD_CENTER");
      var0.method_2434(24, "KEYCODE_VOLUME_UP");
      var0.method_2434(25, "KEYCODE_VOLUME_DOWN");
      var0.method_2434(26, "KEYCODE_POWER");
      var0.method_2434(27, "KEYCODE_CAMERA");
      var0.method_2434(28, "KEYCODE_CLEAR");
      var0.method_2434(29, "KEYCODE_A");
      var0.method_2434(30, "KEYCODE_B");
      var0.method_2434(31, "KEYCODE_C");
      var0.method_2434(32, "KEYCODE_D");
      var0.method_2434(33, "KEYCODE_E");
      var0.method_2434(34, "KEYCODE_F");
      var0.method_2434(35, "KEYCODE_G");
      var0.method_2434(36, "KEYCODE_H");
      var0.method_2434(37, "KEYCODE_I");
      var0.method_2434(38, "KEYCODE_J");
      var0.method_2434(39, "KEYCODE_K");
      var0.method_2434(40, "KEYCODE_L");
      var0.method_2434(41, "KEYCODE_M");
      var0.method_2434(42, "KEYCODE_N");
      var0.method_2434(43, "KEYCODE_O");
      var0.method_2434(44, "KEYCODE_P");
      var0.method_2434(45, "KEYCODE_Q");
      var0.method_2434(46, "KEYCODE_R");
      var0.method_2434(47, "KEYCODE_S");
      var0.method_2434(48, "KEYCODE_T");
      var0.method_2434(49, "KEYCODE_U");
      var0.method_2434(50, "KEYCODE_V");
      var0.method_2434(51, "KEYCODE_W");
      var0.method_2434(52, "KEYCODE_X");
      var0.method_2434(53, "KEYCODE_Y");
      var0.method_2434(54, "KEYCODE_Z");
      var0.method_2434(55, "KEYCODE_COMMA");
      var0.method_2434(56, "KEYCODE_PERIOD");
      var0.method_2434(57, "KEYCODE_ALT_LEFT");
      var0.method_2434(58, "KEYCODE_ALT_RIGHT");
      var0.method_2434(59, "KEYCODE_SHIFT_LEFT");
      var0.method_2434(60, "KEYCODE_SHIFT_RIGHT");
      var0.method_2434(61, "KEYCODE_TAB");
      var0.method_2434(62, "KEYCODE_SPACE");
      var0.method_2434(63, "KEYCODE_SYM");
      var0.method_2434(64, "KEYCODE_EXPLORER");
      var0.method_2434(65, "KEYCODE_ENVELOPE");
      var0.method_2434(66, "KEYCODE_ENTER");
      var0.method_2434(67, "KEYCODE_DEL");
      var0.method_2434(68, "KEYCODE_GRAVE");
      var0.method_2434(69, "KEYCODE_MINUS");
      var0.method_2434(70, "KEYCODE_EQUALS");
      var0.method_2434(71, "KEYCODE_LEFT_BRACKET");
      var0.method_2434(72, "KEYCODE_RIGHT_BRACKET");
      var0.method_2434(73, "KEYCODE_BACKSLASH");
      var0.method_2434(74, "KEYCODE_SEMICOLON");
      var0.method_2434(75, "KEYCODE_APOSTROPHE");
      var0.method_2434(76, "KEYCODE_SLASH");
      var0.method_2434(77, "KEYCODE_AT");
      var0.method_2434(78, "KEYCODE_NUM");
      var0.method_2434(79, "KEYCODE_HEADSETHOOK");
      var0.method_2434(80, "KEYCODE_FOCUS");
      var0.method_2434(81, "KEYCODE_PLUS");
      var0.method_2434(82, "KEYCODE_MENU");
      var0.method_2434(83, "KEYCODE_NOTIFICATION");
      var0.method_2434(84, "KEYCODE_SEARCH");
      var0.method_2434(85, "KEYCODE_MEDIA_PLAY_PAUSE");
      var0.method_2434(86, "KEYCODE_MEDIA_STOP");
      var0.method_2434(87, "KEYCODE_MEDIA_NEXT");
      var0.method_2434(88, "KEYCODE_MEDIA_PREVIOUS");
      var0.method_2434(89, "KEYCODE_MEDIA_REWIND");
      var0.method_2434(90, "KEYCODE_MEDIA_FAST_FORWARD");
      var0.method_2434(91, "KEYCODE_MUTE");
      var0.method_2434(92, "KEYCODE_PAGE_UP");
      var0.method_2434(93, "KEYCODE_PAGE_DOWN");
      var0.method_2434(94, "KEYCODE_PICTSYMBOLS");
      var0.method_2434(95, "KEYCODE_SWITCH_CHARSET");
      var0.method_2434(96, "KEYCODE_BUTTON_A");
      var0.method_2434(97, "KEYCODE_BUTTON_B");
      var0.method_2434(98, "KEYCODE_BUTTON_C");
      var0.method_2434(99, "KEYCODE_BUTTON_X");
      var0.method_2434(100, "KEYCODE_BUTTON_Y");
      var0.method_2434(101, "KEYCODE_BUTTON_Z");
      var0.method_2434(102, "KEYCODE_BUTTON_L1");
      var0.method_2434(103, "KEYCODE_BUTTON_R1");
      var0.method_2434(104, "KEYCODE_BUTTON_L2");
      var0.method_2434(105, "KEYCODE_BUTTON_R2");
      var0.method_2434(106, "KEYCODE_BUTTON_THUMBL");
      var0.method_2434(107, "KEYCODE_BUTTON_THUMBR");
      var0.method_2434(108, "KEYCODE_BUTTON_START");
      var0.method_2434(109, "KEYCODE_BUTTON_SELECT");
      var0.method_2434(110, "KEYCODE_BUTTON_MODE");
      var0.method_2434(111, "KEYCODE_ESCAPE");
      var0.method_2434(112, "KEYCODE_FORWARD_DEL");
      var0.method_2434(113, "KEYCODE_CTRL_LEFT");
      var0.method_2434(114, "KEYCODE_CTRL_RIGHT");
      var0.method_2434(115, "KEYCODE_CAPS_LOCK");
      var0.method_2434(116, "KEYCODE_SCROLL_LOCK");
      var0.method_2434(117, "KEYCODE_META_LEFT");
      var0.method_2434(118, "KEYCODE_META_RIGHT");
      var0.method_2434(119, "KEYCODE_FUNCTION");
      var0.method_2434(120, "KEYCODE_SYSRQ");
      var0.method_2434(121, "KEYCODE_BREAK");
      var0.method_2434(122, "KEYCODE_MOVE_HOME");
      var0.method_2434(123, "KEYCODE_MOVE_END");
      var0.method_2434(124, "KEYCODE_INSERT");
      var0.method_2434(125, "KEYCODE_FORWARD");
      var0.method_2434(126, "KEYCODE_MEDIA_PLAY");
      var0.method_2434(127, "KEYCODE_MEDIA_PAUSE");
      var0.method_2434(128, "KEYCODE_MEDIA_CLOSE");
      var0.method_2434(129, "KEYCODE_MEDIA_EJECT");
      var0.method_2434(130, "KEYCODE_MEDIA_RECORD");
      var0.method_2434(131, "KEYCODE_F1");
      var0.method_2434(132, "KEYCODE_F2");
      var0.method_2434(133, "KEYCODE_F3");
      var0.method_2434(134, "KEYCODE_F4");
      var0.method_2434(135, "KEYCODE_F5");
      var0.method_2434(136, "KEYCODE_F6");
      var0.method_2434(137, "KEYCODE_F7");
      var0.method_2434(138, "KEYCODE_F8");
      var0.method_2434(139, "KEYCODE_F9");
      var0.method_2434(140, "KEYCODE_F10");
      var0.method_2434(141, "KEYCODE_F11");
      var0.method_2434(142, "KEYCODE_F12");
      var0.method_2434(143, "KEYCODE_NUM_LOCK");
      var0.method_2434(144, "KEYCODE_NUMPAD_0");
      var0.method_2434(145, "KEYCODE_NUMPAD_1");
      var0.method_2434(146, "KEYCODE_NUMPAD_2");
      var0.method_2434(147, "KEYCODE_NUMPAD_3");
      var0.method_2434(148, "KEYCODE_NUMPAD_4");
      var0.method_2434(149, "KEYCODE_NUMPAD_5");
      var0.method_2434(150, "KEYCODE_NUMPAD_6");
      var0.method_2434(151, "KEYCODE_NUMPAD_7");
      var0.method_2434(152, "KEYCODE_NUMPAD_8");
      var0.method_2434(153, "KEYCODE_NUMPAD_9");
      var0.method_2434(154, "KEYCODE_NUMPAD_DIVIDE");
      var0.method_2434(155, "KEYCODE_NUMPAD_MULTIPLY");
      var0.method_2434(156, "KEYCODE_NUMPAD_SUBTRACT");
      var0.method_2434(157, "KEYCODE_NUMPAD_ADD");
      var0.method_2434(158, "KEYCODE_NUMPAD_DOT");
      var0.method_2434(159, "KEYCODE_NUMPAD_COMMA");
      var0.method_2434(160, "KEYCODE_NUMPAD_ENTER");
      var0.method_2434(161, "KEYCODE_NUMPAD_EQUALS");
      var0.method_2434(162, "KEYCODE_NUMPAD_LEFT_PAREN");
      var0.method_2434(163, "KEYCODE_NUMPAD_RIGHT_PAREN");
      var0.method_2434(164, "KEYCODE_VOLUME_MUTE");
      var0.method_2434(165, "KEYCODE_INFO");
      var0.method_2434(166, "KEYCODE_CHANNEL_UP");
      var0.method_2434(167, "KEYCODE_CHANNEL_DOWN");
      var0.method_2434(168, "KEYCODE_ZOOM_IN");
      var0.method_2434(169, "KEYCODE_ZOOM_OUT");
      var0.method_2434(170, "KEYCODE_TV");
      var0.method_2434(171, "KEYCODE_WINDOW");
      var0.method_2434(172, "KEYCODE_GUIDE");
      var0.method_2434(173, "KEYCODE_DVR");
      var0.method_2434(174, "KEYCODE_BOOKMARK");
      var0.method_2434(175, "KEYCODE_CAPTIONS");
      var0.method_2434(176, "KEYCODE_SETTINGS");
      var0.method_2434(177, "KEYCODE_TV_POWER");
      var0.method_2434(178, "KEYCODE_TV_INPUT");
      var0.method_2434(180, "KEYCODE_STB_INPUT");
      var0.method_2434(179, "KEYCODE_STB_POWER");
      var0.method_2434(181, "KEYCODE_AVR_POWER");
      var0.method_2434(182, "KEYCODE_AVR_INPUT");
      var0.method_2434(183, "KEYCODE_PROG_RED");
      var0.method_2434(184, "KEYCODE_PROG_GREEN");
      var0.method_2434(185, "KEYCODE_PROG_YELLOW");
      var0.method_2434(186, "KEYCODE_PROG_BLUE");
      var0.method_2434(187, "KEYCODE_APP_SWITCH");
      var0.method_2434(188, "KEYCODE_BUTTON_1");
      var0.method_2434(189, "KEYCODE_BUTTON_2");
      var0.method_2434(190, "KEYCODE_BUTTON_3");
      var0.method_2434(191, "KEYCODE_BUTTON_4");
      var0.method_2434(192, "KEYCODE_BUTTON_5");
      var0.method_2434(193, "KEYCODE_BUTTON_6");
      var0.method_2434(194, "KEYCODE_BUTTON_7");
      var0.method_2434(195, "KEYCODE_BUTTON_8");
      var0.method_2434(196, "KEYCODE_BUTTON_9");
      var0.method_2434(197, "KEYCODE_BUTTON_10");
      var0.method_2434(198, "KEYCODE_BUTTON_11");
      var0.method_2434(199, "KEYCODE_BUTTON_12");
      var0.method_2434(200, "KEYCODE_BUTTON_13");
      var0.method_2434(201, "KEYCODE_BUTTON_14");
      var0.method_2434(202, "KEYCODE_BUTTON_15");
      var0.method_2434(203, "KEYCODE_BUTTON_16");
      var0.method_2434(204, "KEYCODE_LANGUAGE_SWITCH");
      var0.method_2434(205, "KEYCODE_MANNER_MODE");
      var0.method_2434(206, "KEYCODE_3D_MODE");
      var0.method_2434(207, "KEYCODE_CONTACTS");
      var0.method_2434(208, "KEYCODE_CALENDAR");
      var0.method_2434(209, "KEYCODE_MUSIC");
      var0.method_2434(210, "KEYCODE_CALCULATOR");
      var0.method_2434(211, "KEYCODE_ZENKAKU_HANKAKU");
      var0.method_2434(212, "KEYCODE_EISU");
      var0.method_2434(213, "KEYCODE_MUHENKAN");
      var0.method_2434(214, "KEYCODE_HENKAN");
      var0.method_2434(215, "KEYCODE_KATAKANA_HIRAGANA");
      var0.method_2434(216, "KEYCODE_YEN");
      var0.method_2434(217, "KEYCODE_RO");
      var0.method_2434(218, "KEYCODE_KANA");
      var0.method_2434(219, "KEYCODE_ASSIST");
      var0.method_2434(220, "KEYCODE_BRIGHTNESS_DOWN");
      var0.method_2434(221, "KEYCODE_BRIGHTNESS_UP");
      var0.method_2434(222, "KEYCODE_MEDIA_AUDIO_TRACK");
   }

   // $FF: renamed from: a () int
   public static int method_2007() {
      return 222;
   }

   private KeyEvent() {
   }

   public final int getDeviceId() {
      return this.field_2465;
   }

   public final int getSource() {
      return this.field_2466;
   }

   public final long getEventTime() {
      return this.field_2474;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("KeyEvent { action=").append(method_2008(this.field_2468));
      var1.append(", keyCode=").append(method_2009(this.field_2469));
      var1.append(", scanCode=").append(this.field_2470);
      if (this.field_2475 != null) {
         var1.append(", characters=\"").append(this.field_2475).append("\"");
      }

      var1.append(", metaState=").append(method_2010(this.field_2467));
      var1.append(", flags=0x").append(Integer.toHexString(this.field_2472));
      var1.append(", repeatCount=").append(this.field_2471);
      var1.append(", eventTime=").append(this.field_2474);
      var1.append(", downTime=").append(this.field_2473);
      var1.append(", deviceId=").append(this.field_2465);
      var1.append(", source=0x").append(Integer.toHexString(this.field_2466));
      var1.append(" }");
      return var1.toString();
   }

   // $FF: renamed from: a (int) java.lang.String
   public static String method_2008(int var0) {
      switch(var0) {
      case 0:
         return "ACTION_DOWN";
      case 1:
         return "ACTION_UP";
      case 2:
         return "ACTION_MULTIPLE";
      default:
         return Integer.toString(var0);
      }
   }

   // $FF: renamed from: b (int) java.lang.String
   public static String method_2009(int var0) {
      String var1 = (String)field_2462.method_2427(var0);
      return var1 != null ? var1 : Integer.toString(var0);
   }

   // $FF: renamed from: c (int) java.lang.String
   public static String method_2010(int var0) {
      if (var0 == 0) {
         return "0";
      } else {
         StringBuilder var1 = null;

         for(int var2 = 0; var0 != 0; ++var2) {
            boolean var3 = (var0 & 1) != 0;
            var0 >>>= 1;
            if (var3) {
               String var4 = field_2463[var2];
               if (var1 == null) {
                  if (var0 == 0) {
                     return var4;
                  }

                  var1 = new StringBuilder(var4);
               } else {
                  var1.append('|');
                  var1.append(var4);
               }
            }
         }

         return var1.toString();
      }
   }

   // $FF: renamed from: a (android.os.Parcel) android.view.KeyEvent
   public static KeyEvent method_2011(Parcel var0) {
      return new KeyEvent(var0);
   }

   private KeyEvent(Parcel var1) {
      this.field_2465 = var1.readInt();
      this.field_2466 = var1.readInt();
      this.field_2468 = var1.readInt();
      this.field_2469 = var1.readInt();
      this.field_2471 = var1.readInt();
      this.field_2467 = var1.readInt();
      this.field_2470 = var1.readInt();
      this.field_2472 = var1.readInt();
      this.field_2473 = var1.readLong();
      this.field_2474 = var1.readLong();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.field_2465);
      var1.writeInt(this.field_2466);
      var1.writeInt(this.field_2468);
      var1.writeInt(this.field_2469);
      var1.writeInt(this.field_2471);
      var1.writeInt(this.field_2467);
      var1.writeInt(this.field_2470);
      var1.writeInt(this.field_2472);
      var1.writeLong(this.field_2473);
      var1.writeLong(this.field_2474);
   }

   static {
      method_2006();
      field_2476 = new KeyEvent$1();
   }
}
