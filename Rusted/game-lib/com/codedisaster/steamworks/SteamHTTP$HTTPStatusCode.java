package com.codedisaster.steamworks;

public enum SteamHTTP$HTTPStatusCode {
   Invalid(0),
   Continue(100),
   SwitchingProtocols(101),
   // $FF: renamed from: OK com.codedisaster.steamworks.SteamHTTP$HTTPStatusCode
   field_1575(200),
   Created(201),
   Accepted(202),
   NonAuthoritative(203),
   NoContent(204),
   ResetContent(205),
   PartialContent(206),
   MultipleChoices(300),
   MovedPermanently(301),
   Found(302),
   SeeOther(303),
   NotModified(304),
   UseProxy(305),
   TemporaryRedirect(307),
   BadRequest(400),
   Unauthorized(401),
   PaymentRequired(402),
   Forbidden(403),
   NotFound(404),
   MethodNotAllowed(405),
   NotAcceptable(406),
   ProxyAuthRequired(407),
   RequestTimeout(408),
   Conflict(409),
   Gone(410),
   LengthRequired(411),
   PreconditionFailed(412),
   RequestEntityTooLarge(413),
   RequestURITooLong(414),
   UnsupportedMediaType(415),
   RequestedRangeNotSatisfiable(416),
   ExpectationFailed(417),
   Unknown4xx(418),
   TooManyRequests(429),
   InternalServerError(500),
   NotImplemented(501),
   BadGateway(502),
   ServiceUnavailable(503),
   GatewayTimeout(504),
   HTTPVersionNotSupported(505),
   Unknown5xx(599);

   private final int code;
   private static final SteamHTTP$HTTPStatusCode[] values = values();

   private SteamHTTP$HTTPStatusCode(int var3) {
      this.code = var3;
   }

   static SteamHTTP$HTTPStatusCode byValue(int var0) {
      SteamHTTP$HTTPStatusCode[] var1 = values;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         SteamHTTP$HTTPStatusCode var4 = var1[var3];
         if (var4.code == var0) {
            return var4;
         }
      }

      return Invalid;
   }
}
