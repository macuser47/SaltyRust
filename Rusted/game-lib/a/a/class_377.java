package a.a;

// $FF: renamed from: a.a.q
public class class_377 {
   // $FF: renamed from: a int
   private int field_3030;
   // $FF: renamed from: b int
   private int field_3031;
   // $FF: renamed from: c int
   private int field_3032;
   // $FF: renamed from: d int
   private int field_3033;
   // $FF: renamed from: e int
   private int field_3034;
   // $FF: renamed from: f int
   private int field_3035;
   // $FF: renamed from: g int
   private int field_3036;
   // $FF: renamed from: h int
   private int field_3037;
   // $FF: renamed from: i int
   private int field_3038;
   // $FF: renamed from: j int
   private int field_3039;
   // $FF: renamed from: k int
   private int field_3040;

   public class_377() {
      this(32, 32, 128, 3, 0, 3, 3, 3, 2000, 600, 300);
   }

   public class_377(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.method_2406("maxSendQueueSize", var1, 1, 255);
      this.method_2406("maxRecvQueueSize", var2, 1, 255);
      this.method_2406("maxSegmentSize", var3, 22, 65535);
      this.method_2406("maxOutstandingSegs", var4, 1, 255);
      this.method_2406("maxRetrans", var5, 0, 255);
      this.method_2406("maxCumulativeAcks", var6, 0, 255);
      this.method_2406("maxOutOfSequence", var7, 0, 255);
      this.method_2406("maxAutoReset", var8, 0, 255);
      this.method_2406("nullSegmentTimeout", var9, 0, 65535);
      this.method_2406("retransmissionTimeout", var10, 100, 65535);
      this.method_2406("cumulativeAckTimeout", var11, 100, 65535);
      this.field_3030 = var1;
      this.field_3031 = var2;
      this.field_3032 = var3;
      this.field_3033 = var4;
      this.field_3034 = var5;
      this.field_3035 = var6;
      this.field_3036 = var7;
      this.field_3037 = var8;
      this.field_3038 = var9;
      this.field_3039 = var10;
      this.field_3040 = var11;
   }

   // $FF: renamed from: a () int
   public int method_2397() {
      return this.field_3032;
   }

   // $FF: renamed from: b () int
   public int method_2398() {
      return this.field_3033;
   }

   // $FF: renamed from: c () int
   public int method_2399() {
      return this.field_3034;
   }

   // $FF: renamed from: d () int
   public int method_2400() {
      return this.field_3035;
   }

   // $FF: renamed from: e () int
   public int method_2401() {
      return this.field_3036;
   }

   // $FF: renamed from: f () int
   public int method_2402() {
      return this.field_3037;
   }

   // $FF: renamed from: g () int
   public int method_2403() {
      return this.field_3038;
   }

   // $FF: renamed from: h () int
   public int method_2404() {
      return this.field_3039;
   }

   // $FF: renamed from: i () int
   public int method_2405() {
      return this.field_3040;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("[");
      var1.append(this.field_3030).append(", ");
      var1.append(this.field_3031).append(", ");
      var1.append(this.field_3032).append(", ");
      var1.append(this.field_3033).append(", ");
      var1.append(this.field_3034).append(", ");
      var1.append(this.field_3035).append(", ");
      var1.append(this.field_3036).append(", ");
      var1.append(this.field_3037).append(", ");
      var1.append(this.field_3038).append(", ");
      var1.append(this.field_3039).append(", ");
      var1.append(this.field_3040);
      var1.append("]");
      return var1.toString();
   }

   // $FF: renamed from: a (java.lang.String, int, int, int) void
   private void method_2406(String var1, int var2, int var3, int var4) {
      if (var2 < var3 || var2 > var4) {
         throw new IllegalArgumentException(var1);
      }
   }
}
