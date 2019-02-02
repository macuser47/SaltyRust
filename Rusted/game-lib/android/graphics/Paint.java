package android.graphics;

import java.util.Locale;

public class Paint {
   // $FF: renamed from: a int
   public int field_3724;
   // $FF: renamed from: r android.graphics.ColorFilter
   private ColorFilter field_3725;
   // $FF: renamed from: s android.graphics.MaskFilter
   private MaskFilter field_3726;
   // $FF: renamed from: t android.graphics.PathEffect
   private PathEffect field_3727;
   // $FF: renamed from: u android.graphics.Rasterizer
   private Rasterizer field_3728;
   // $FF: renamed from: v android.graphics.Shader
   private Shader field_3729;
   // $FF: renamed from: w android.graphics.Typeface
   private Typeface field_3730;
   // $FF: renamed from: x android.graphics.Xfermode
   private Xfermode field_3731;
   // $FF: renamed from: y boolean
   private boolean field_3732;
   // $FF: renamed from: z float
   private float field_3733;
   // $FF: renamed from: A float
   private float field_3734;
   // $FF: renamed from: B java.util.Locale
   private Locale field_3735;
   // $FF: renamed from: b boolean
   public boolean field_3736;
   // $FF: renamed from: c float
   public float field_3737;
   // $FF: renamed from: d float
   public float field_3738;
   // $FF: renamed from: e float
   public float field_3739;
   // $FF: renamed from: f int
   public int field_3740;
   // $FF: renamed from: g int
   public int field_3741;
   // $FF: renamed from: h android.graphics.Paint$Style[]
   static final Paint$Style[] field_3742;
   // $FF: renamed from: i android.graphics.Paint$Cap[]
   static final Paint$Cap[] field_3743;
   // $FF: renamed from: j android.graphics.Paint$Join[]
   static final Paint$Join[] field_3744;
   // $FF: renamed from: k android.graphics.Paint$Align[]
   static final Paint$Align[] field_3745;
   // $FF: renamed from: l int
   int field_3746;
   // $FF: renamed from: m android.graphics.Paint$Style
   Paint$Style field_3747;
   // $FF: renamed from: n int
   int field_3748;
   // $FF: renamed from: o float
   float field_3749;
   // $FF: renamed from: p android.graphics.Paint$Align
   Paint$Align field_3750;
   // $FF: renamed from: q float
   float field_3751;

   public Paint() {
      this(0);
   }

   public Paint(int var1) {
      this.field_3741 = 2;
      this.field_3747 = Paint$Style.field_4585;
      this.field_3749 = 0.0F;
      this.field_3751 = 16.0F;
      this.field_3724 = method_2816();
      this.method_2775();
      this.method_2779(var1 | 1280);
      this.field_3733 = this.field_3734 = 1.0F;
      this.method_2802(Locale.getDefault());
   }

   // $FF: renamed from: a () void
   public void method_2775() {
      method_2817(this.field_3724);
      this.method_2779(1280);
      this.field_3748 = -1;
      this.field_3747 = Paint$Style.field_4585;
      this.field_3751 = 16.0F;
      this.field_3750 = Paint$Align.field_2226;
      this.field_3725 = null;
      this.field_3726 = null;
      this.field_3727 = null;
      this.field_3728 = null;
      this.field_3729 = null;
      this.field_3730 = null;
      this.field_3731 = null;
      this.field_3732 = false;
      this.field_3733 = 1.0F;
      this.field_3734 = 1.0F;
      this.field_3736 = false;
      this.field_3737 = 0.0F;
      this.field_3738 = 0.0F;
      this.field_3739 = 0.0F;
      this.field_3740 = 0;
      this.field_3741 = 2;
      this.method_2802(Locale.getDefault());
   }

   // $FF: renamed from: a (android.graphics.Paint) void
   public void method_2776(Paint var1) {
      if (this != var1) {
         method_2818(this.field_3724, var1.field_3724);
         this.method_2777(var1);
      }

   }

   // $FF: renamed from: b (android.graphics.Paint) void
   private void method_2777(Paint var1) {
      this.field_3747 = var1.field_3747;
      this.field_3748 = var1.field_3748;
      this.field_3751 = var1.field_3751;
      this.field_3750 = var1.field_3750;
      this.field_3725 = var1.field_3725;
      this.field_3726 = var1.field_3726;
      this.field_3727 = var1.field_3727;
      this.field_3728 = var1.field_3728;
      this.field_3730 = var1.field_3730;
      this.field_3731 = var1.field_3731;
      this.field_3732 = var1.field_3732;
      this.field_3733 = var1.field_3733;
      this.field_3734 = var1.field_3734;
      this.field_3736 = var1.field_3736;
      this.field_3737 = var1.field_3737;
      this.field_3738 = var1.field_3738;
      this.field_3739 = var1.field_3739;
      this.field_3740 = var1.field_3740;
      this.field_3741 = var1.field_3741;
      this.field_3735 = var1.field_3735;
   }

   // $FF: renamed from: b () int
   public int method_2778() {
      return this.field_3746;
   }

   // $FF: renamed from: a (int) void
   public void method_2779(int var1) {
      this.field_3746 = var1;
   }

   // $FF: renamed from: c () boolean
   public final boolean method_2780() {
      return (this.method_2778() & 1) != 0;
   }

   // $FF: renamed from: a (boolean) void
   public void method_2781(boolean var1) {
      if (var1) {
         this.method_2779(this.field_3746 | 1);
      } else {
         this.method_2779(this.field_3746 & -2);
      }

   }

   // $FF: renamed from: b (boolean) void
   public void method_2782(boolean var1) {
   }

   // $FF: renamed from: c (boolean) void
   public void method_2783(boolean var1) {
   }

   // $FF: renamed from: d (boolean) void
   public void method_2784(boolean var1) {
   }

   // $FF: renamed from: d () android.graphics.Paint$Style
   public Paint$Style method_2785() {
      return this.field_3747;
   }

   // $FF: renamed from: a (android.graphics.Paint$Style) void
   public void method_2786(Paint$Style var1) {
      this.field_3747 = var1;
   }

   // $FF: renamed from: e () int
   public int method_2787() {
      return this.field_3748;
   }

   // $FF: renamed from: b (int) void
   public void method_2788(int var1) {
      this.field_3748 = var1;
   }

   // $FF: renamed from: f () int
   public int method_2789() {
      return Color.method_3072(this.field_3748);
   }

   // $FF: renamed from: c (int) void
   public void method_2790(int var1) {
      this.field_3748 = Color.method_3077(var1, Color.method_3073(this.field_3748), Color.method_3074(this.field_3748), Color.method_3075(this.field_3748));
   }

   // $FF: renamed from: a (int, int, int, int) void
   public void method_2791(int var1, int var2, int var3, int var4) {
      this.method_2788(var1 << 24 | var2 << 16 | var3 << 8 | var4);
   }

   // $FF: renamed from: g () float
   public float method_2792() {
      return this.field_3749;
   }

   // $FF: renamed from: a (float) void
   public void method_2793(float var1) {
      this.field_3749 = var1;
   }

   // $FF: renamed from: a (android.graphics.Paint$Cap) void
   public void method_2794(Paint$Cap var1) {
      method_2819(this.field_3724, var1.field_1810);
   }

   // $FF: renamed from: h () android.graphics.ColorFilter
   public ColorFilter method_2795() {
      return this.field_3725;
   }

   // $FF: renamed from: a (android.graphics.ColorFilter) android.graphics.ColorFilter
   public ColorFilter method_2796(ColorFilter var1) {
      byte var2 = 0;
      method_2820(this.field_3724, var2);
      this.field_3725 = var1;
      return var1;
   }

   // $FF: renamed from: a (android.graphics.Xfermode) android.graphics.Xfermode
   public Xfermode method_2797(Xfermode var1) {
      byte var2 = 0;
      method_2821(this.field_3724, var2);
      this.field_3731 = var1;
      return var1;
   }

   // $FF: renamed from: i () android.graphics.Typeface
   public Typeface method_2798() {
      return this.field_3730;
   }

   // $FF: renamed from: a (android.graphics.Typeface) android.graphics.Typeface
   public Typeface method_2799(Typeface var1) {
      this.field_3730 = var1;
      return var1;
   }

   // $FF: renamed from: j () android.graphics.Paint$Align
   public Paint$Align method_2800() {
      return this.field_3750;
   }

   // $FF: renamed from: a (android.graphics.Paint$Align) void
   public void method_2801(Paint$Align var1) {
      this.field_3750 = var1;
   }

   // $FF: renamed from: a (java.util.Locale) void
   public void method_2802(Locale var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("locale cannot be null");
      } else if (!var1.equals(this.field_3735)) {
         this.field_3735 = var1;
         method_2822(this.field_3724, var1.toString());
      }
   }

   // $FF: renamed from: k () float
   public float method_2803() {
      return this.field_3751;
   }

   // $FF: renamed from: b (float) void
   public void method_2804(float var1) {
      this.field_3751 = var1;
   }

   // $FF: renamed from: l () float
   public float method_2805() {
      return -this.field_3751;
   }

   // $FF: renamed from: m () float
   public float method_2806() {
      return 0.0F;
   }

   // $FF: renamed from: a (java.lang.String) float
   public float method_2807(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("text cannot be null");
      } else if (var1.length() == 0) {
         return 0.0F;
      } else if (!this.field_3732) {
         return (float)Math.ceil((double)this.method_2808(var1, this.field_3741));
      } else {
         float var2 = this.method_2803();
         this.method_2804(var2 * this.field_3733);
         float var3 = this.method_2808(var1, this.field_3741);
         this.method_2804(var2);
         return (float)Math.ceil((double)(var3 * this.field_3734));
      }
   }

   // $FF: renamed from: a (java.lang.String, int) float
   private float method_2808(String var1, int var2) {
      return (float)var1.length() * this.method_2803();
   }

   // $FF: renamed from: a (char[], int, int, float, float[]) int
   public int method_2809(char[] var1, int var2, int var3, float var4, float[] var5) {
      if (var1 == null) {
         throw new IllegalArgumentException("text cannot be null");
      } else if (var2 >= 0 && var1.length - var2 >= Math.abs(var3)) {
         if (var1.length != 0 && var3 != 0) {
            if (!this.field_3732) {
               return this.method_2810(var1, var2, var3, var4, this.field_3741, var5);
            } else {
               float var6 = this.method_2803();
               this.method_2804(var6 * this.field_3733);
               int var7 = this.method_2810(var1, var2, var3, var4 * this.field_3733, this.field_3741, var5);
               this.method_2804(var6);
               if (var5 != null) {
                  var5[0] *= this.field_3734;
               }

               return var7;
            }
         } else {
            return 0;
         }
      } else {
         throw new ArrayIndexOutOfBoundsException();
      }
   }

   // $FF: renamed from: a (char[], int, int, float, int, float[]) int
   private int method_2810(char[] var1, int var2, int var3, float var4, int var5, float[] var6) {
      return var3;
   }

   // $FF: renamed from: a (java.lang.String, boolean, float, int, float[]) int
   private int method_2811(String var1, boolean var2, float var3, int var4, float[] var5) {
      return var1.length();
   }

   // $FF: renamed from: a (java.lang.CharSequence, int, int, boolean, float, float[]) int
   public int method_2812(CharSequence var1, int var2, int var3, boolean var4, float var5, float[] var6) {
      if (var1 == null) {
         throw new IllegalArgumentException("text cannot be null");
      } else if ((var2 | var3 | var3 - var2 | var1.length() - var3) < 0) {
         throw new IndexOutOfBoundsException();
      } else if (var1.length() != 0 && var2 != var3) {
         if (var2 == 0 && var1 instanceof String && var3 == var1.length()) {
            return this.method_2814((String)var1, var4, var5, var6);
         } else {
            char[] var7 = TemporaryBuffer.method_2243(var3 - var2);
            method_2813(var1, var2, var3, var7, 0);
            int var8;
            if (var4) {
               var8 = this.method_2809(var7, 0, var3 - var2, var5, var6);
            } else {
               var8 = this.method_2809(var7, 0, -(var3 - var2), var5, var6);
            }

            TemporaryBuffer.method_2244(var7);
            return var8;
         }
      } else {
         return 0;
      }
   }

   // $FF: renamed from: a (java.lang.CharSequence, int, int, char[], int) void
   public static void method_2813(CharSequence var0, int var1, int var2, char[] var3, int var4) {
      Class var5 = var0.getClass();
      if (var5 == String.class) {
         ((String)var0).getChars(var1, var2, var3, var4);
      } else if (var5 == StringBuffer.class) {
         ((StringBuffer)var0).getChars(var1, var2, var3, var4);
      } else if (var5 == StringBuilder.class) {
         ((StringBuilder)var0).getChars(var1, var2, var3, var4);
      } else {
         for(int var6 = var1; var6 < var2; ++var6) {
            var3[var4++] = var0.charAt(var6);
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, boolean, float, float[]) int
   public int method_2814(String var1, boolean var2, float var3, float[] var4) {
      if (var1 == null) {
         throw new IllegalArgumentException("text cannot be null");
      } else if (var1.length() == 0) {
         return 0;
      } else if (!this.field_3732) {
         return this.method_2811(var1, var2, var3, this.field_3741, var4);
      } else {
         float var5 = this.method_2803();
         this.method_2804(var5 * this.field_3733);
         int var6 = this.method_2811(var1, var2, var3 * this.field_3733, this.field_3741, var4);
         this.method_2804(var5);
         if (var4 != null) {
            var4[0] *= this.field_3734;
         }

         return var6;
      }
   }

   // $FF: renamed from: a (java.lang.String, int, int, android.graphics.Rect) void
   public void method_2815(String var1, int var2, int var3, Rect var4) {
      if ((var2 | var3 | var3 - var2 | var1.length() - var3) < 0) {
         throw new IndexOutOfBoundsException();
      } else if (var4 == null) {
         throw new NullPointerException("need bounds Rect");
      } else {
         var4.method_1911(0, 0, 0, (int)this.field_3751);
      }
   }

   protected void finalize() {
      try {
         method_2823(this.field_3724);
      } finally {
         super.finalize();
      }

   }

   // $FF: renamed from: n () int
   private static int method_2816() {
      return 0;
   }

   // $FF: renamed from: d (int) void
   private static void method_2817(int var0) {
   }

   // $FF: renamed from: a (int, int) void
   private static void method_2818(int var0, int var1) {
   }

   // $FF: renamed from: b (int, int) void
   private static void method_2819(int var0, int var1) {
   }

   // $FF: renamed from: c (int, int) int
   private static int method_2820(int var0, int var1) {
      return 0;
   }

   // $FF: renamed from: d (int, int) int
   private static int method_2821(int var0, int var1) {
      return 0;
   }

   // $FF: renamed from: a (int, java.lang.String) void
   private static void method_2822(int var0, String var1) {
   }

   // $FF: renamed from: e (int) void
   private static void method_2823(int var0) {
   }

   static {
      field_3742 = new Paint$Style[]{Paint$Style.field_4585, Paint$Style.field_4586, Paint$Style.field_4587};
      field_3743 = new Paint$Cap[]{Paint$Cap.field_1807, Paint$Cap.field_1808, Paint$Cap.field_1809};
      field_3744 = new Paint$Join[]{Paint$Join.field_4134, Paint$Join.field_4135, Paint$Join.field_4136};
      field_3745 = new Paint$Align[]{Paint$Align.field_2226, Paint$Align.field_2227, Paint$Align.field_2228};
   }
}
