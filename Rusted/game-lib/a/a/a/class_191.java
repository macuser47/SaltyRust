package a.a.a;

// $FF: renamed from: a.a.a.i
public class class_191 extends Thread {
   // $FF: renamed from: a java.lang.Runnable
   private Runnable field_1608;
   // $FF: renamed from: b long
   private long field_1609;
   // $FF: renamed from: c long
   private long field_1610;
   // $FF: renamed from: d boolean
   private boolean field_1611;
   // $FF: renamed from: e boolean
   private boolean field_1612;
   // $FF: renamed from: f boolean
   private boolean field_1613;
   // $FF: renamed from: g boolean
   private boolean field_1614;
   // $FF: renamed from: h java.lang.Object
   private Object field_1615 = new Object();

   public class_191(String var1, Runnable var2) {
      super(var1);
      this.setDaemon(true);
      this.field_1608 = var2;
      this.field_1609 = 0L;
      this.field_1610 = 0L;
      this.start();
   }

   public void run() {
      label104:
      while(true) {
         label102: {
            if (!this.field_1614) {
               synchronized(this) {
                  while(!this.field_1612 && !this.field_1614) {
                     try {
                        this.wait();
                     } catch (InterruptedException var8) {
                        var8.printStackTrace();
                     }
                  }

                  if (!this.field_1614) {
                     break label102;
                  }
               }
            }

            return;
         }

         synchronized(this.field_1615) {
            this.field_1613 = false;
            this.field_1611 = false;
            if (this.field_1609 > 0L) {
               try {
                  this.field_1615.wait(this.field_1609);
               } catch (InterruptedException var7) {
                  var7.printStackTrace();
               }
            }

            if (this.field_1611) {
               continue;
            }
         }

         if (!this.field_1613) {
            this.field_1608.run();
         }

         if (this.field_1610 > 0L) {
            while(true) {
               while(true) {
                  synchronized(this.field_1615) {
                     this.field_1613 = false;

                     try {
                        this.field_1615.wait(this.field_1610);
                     } catch (InterruptedException var6) {
                        var6.printStackTrace();
                     }

                     if (this.field_1611) {
                        continue label104;
                     }

                     if (!this.field_1613) {
                        break;
                     }
                  }
               }

               this.field_1608.run();
            }
         }
      }
   }

   // $FF: renamed from: a (long) void
   public synchronized void method_1292(long var1) {
      this.method_1293(var1, 0L);
   }

   // $FF: renamed from: a (long, long) void
   public synchronized void method_1293(long var1, long var3) {
      this.field_1609 = var1;
      this.field_1610 = var3;
      if (this.field_1612) {
         throw new IllegalStateException("already scheduled");
      } else {
         this.field_1612 = true;
         this.notify();
         synchronized(this.field_1615) {
            this.field_1615.notify();
         }
      }
   }

   // $FF: renamed from: a () boolean
   public synchronized boolean method_1294() {
      return this.field_1612;
   }

   // $FF: renamed from: b () boolean
   public synchronized boolean method_1295() {
      return !this.method_1294();
   }

   // $FF: renamed from: c () void
   public synchronized void method_1296() {
      synchronized(this.field_1615) {
         this.field_1613 = true;
         this.field_1615.notify();
      }
   }

   // $FF: renamed from: d () void
   public synchronized void method_1297() {
      this.field_1612 = false;
      synchronized(this.field_1615) {
         this.field_1611 = true;
         this.field_1615.notify();
      }
   }

   public synchronized void destroy() {
      this.method_1297();
      this.field_1614 = true;
      this.notify();
   }
}
