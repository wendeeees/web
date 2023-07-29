package com.example.Util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

//public class JwtUtil {
//    private static final String SECRET_KEY = "your-secret-key";
//    private static final long EXPIRATION_TIME = 600000; // 10min
//    public static String genJwt( Map<String, Object> claims) {
////        Map<String, Object> claims = new HashMap<>();
////        claims.put("id", 1);
////        claims.put("username", "Tom");
//        String jwt = Jwts.builder()
//                .setClaims(claims) //自定义内容(载荷)
//                .signWith(SignatureAlgorithm.HS256, SECRET_KEY) //签名算法
//                .setExpiration(new Date(System.currentTimeMillis() +EXPIRATION_TIME )) //有效期
//                .compact();
//        return jwt;
//    }
//
//    public static Claims parseJwt(String jwt) {
//        Claims claims = Jwts.parser()
//                .setSigningKey(SECRET_KEY) //指定签名秘钥
//                .parseClaimsJws(jwt) //解析令牌
//                .getBody();
//        return claims;
//    }
//}
