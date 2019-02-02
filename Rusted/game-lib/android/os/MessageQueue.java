package android.os;

import android.util.Log;
import java.util.ArrayList;

public final class MessageQueue {
   // $FF: renamed from: c boolean
   private final boolean field_3229;
   // $FF: renamed from: d long
   private long field_3230;
   // $FF: renamed from: a android.os.Message
   Message field_3231;
   // $FF: renamed from: e java.util.ArrayList
   private final ArrayList field_3232 = new ArrayList();
   // $FF: renamed from: f android.os.MessageQueue$IdleHandler[]
   private MessageQueue$IdleHandler[] field_3233;
   // $FF: renamed from: g boolean
   private boolean field_3234;
   // $FF: renamed from: h boolean
   private boolean field_3235;
   // $FF: renamed from: b java.lang.Object
   static Object field_3236 = new Object();

   // $FF: renamed from: b () long
   private long method_2499() {
      return 100L;
   }

   // $FF: renamed from: a (long) void
   private void method_2500(long var1) {
   }

   // $FF: renamed from: a (long, int) void
   private void method_2501(long var1, int var3) {
      synchronized(field_3236) {
         try {
            field_3236.wait((long)var3);
         } catch (InterruptedException var7) {
            var7.printStackTrace();
         }

      }
   }

   // $FF: renamed from: b (long) void
   private void method_2502(long var1) {
      synchronized(field_3236) {
         field_3236.notifyAll();
      }
   }

   MessageQueue(boolean var1) {
      this.field_3229 = var1;
      this.field_3230 = this.method_2499();
   }

   protected void finalize() {
      try {
         this.method_2503();
      } finally {
         super.finalize();
      }

   }

   // $FF: renamed from: c () void
   private void method_2503() {
      if (this.field_3230 != 0L) {
         this.method_2500(this.field_3230);
         this.field_3230 = 0L;
      }

   }

   // $FF: renamed from: a () android.os.Message
   Message method_2504() {
      long var1 = this.field_3230;
      if (var1 == 0L) {
         return null;
      } else {
         int var3 = -1;
         int var4 = 0;

         while(true) {
            while(true) {
               if (var4 != 0) {
                  Binder.flushPendingCommands();
               }

               System.out.println("corroding: nativePollOnce:" + var1 + "," + var4);
               this.method_2501(var1, var4);
               synchronized(this) {
                  long var6 = SystemClock.method_3231();
                  Message var8 = null;
                  Message var9 = this.field_3231;
                  if (var9 != null && var9.field_2385 == null) {
                     do {
                        var8 = var9;
                        var9 = var9.field_2387;
                     } while(var9 != null && !var9.method_1947());
                  }

                  if (var9 != null) {
                     if (var6 >= var9.field_2383) {
                        this.field_3235 = false;
                        if (var8 != null) {
                           var8.field_2387 = var9.field_2387;
                        } else {
                           this.field_3231 = var9.field_2387;
                        }

                        var9.field_2387 = null;
                        return var9;
                     }

                     var4 = (int)Math.min(var9.field_2383 - var6, 2147483647L);
                  } else {
                     var4 = -1;
                  }

                  if (this.field_3234) {
                     this.method_2503();
                     return null;
                  }

                  if (var3 < 0 && (this.field_3231 == null || var6 < this.field_3231.field_2383)) {
                     var3 = this.field_3232.size();
                  }

                  if (var3 > 0) {
                     if (this.field_3233 == null) {
                        this.field_3233 = new MessageQueue$IdleHandler[Math.max(var3, 4)];
                     }

                     this.field_3233 = (MessageQueue$IdleHandler[])this.field_3232.toArray(this.field_3233);
                     break;
                  }

                  this.field_3235 = true;
               }
            }

            for(int var5 = 0; var5 < var3; ++var5) {
               MessageQueue$IdleHandler var15 = this.field_3233[var5];
               this.field_3233[var5] = null;
               boolean var7 = false;

               try {
                  var7 = var15.method_145();
               } catch (Throwable var13) {
                  Log.method_1714("MessageQueue", "IdleHandler threw exception", var13);
               }

               if (!var7) {
                  synchronized(this) {
                     this.field_3232.remove(var15);
                  }
               }
            }

            var3 = 0;
            var4 = 0;
         }
      }
   }

   // $FF: renamed from: a (android.os.Message, long) boolean
   boolean method_2505(Message var1, long var2) {
      if (var1.field_2385 == null) {
         throw new IllegalArgumentException("Message must have a target.");
      } else if (var1.method_1949()) {
         throw new IllegalStateException(var1 + " This message is already in use.");
      } else {
         synchronized(this) {
            if (this.field_3234) {
               IllegalStateException var10 = new IllegalStateException(var1.field_2385 + " sending message to a Handler on a dead thread");
               Log.method_1711("MessageQueue", var10.getMessage(), var10);
               var1.method_1944();
               return false;
            } else {
               var1.method_1950();
               var1.field_2383 = var2;
               Message var5 = this.field_3231;
               boolean var6;
               if (var5 != null && var2 != 0L && var2 >= var5.field_2383) {
                  var6 = this.field_3235 && var5.field_2385 == null && var1.method_1947();

                  while(true) {
                     Message var7 = var5;
                     var5 = var5.field_2387;
                     if (var5 == null || var2 < var5.field_2383) {
                        var1.field_2387 = var5;
                        var7.field_2387 = var1;
                        break;
                     }

                     if (var6 && var5.method_1947()) {
                        var6 = false;
                     }
                  }
               } else {
                  var1.field_2387 = var5;
                  this.field_3231 = var1;
                  var6 = this.field_3235;
               }

               this.method_2502(this.field_3230);
               return true;
            }
         }
      }
   }
}
