package com.corrodinggames.rts.java.a;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamNetworking$P2PSessionError;
import com.codedisaster.steamworks.SteamNetworkingCallback;
import com.corrodinggames.rts.gameFramework.class_236;
import java.io.IOException;

// $FF: renamed from: com.corrodinggames.rts.java.a.f
public class class_219 implements SteamNetworkingCallback {
   // $FF: renamed from: a com.corrodinggames.rts.java.a.b
   class_224 field_1762;

   public class_219(class_224 var1) {
      this.field_1762 = var1;
   }

   public void onP2PSessionConnectFail(SteamID var1, SteamNetworking$P2PSessionError var2) {
      class_236.method_1591("onP2PSessionConnectFail:" + var2);
      class_212 var3 = (class_212)this.field_1762.field_1787.get(var1);
      if (var3 != null && !var3.isClosed()) {
         class_236.method_1591("onP2PSessionConnectFail: closing active socket");

         try {
            var3.close();
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }

   }

   public void onP2PSessionRequest(SteamID var1) {
      class_236.method_1591("onP2PSessionRequest:" + var1);
      this.field_1762.field_1783.acceptP2PSessionWithUser(var1);
   }
}
