package com.notasign.open.api.utils.jwt;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import com.notasign.open.api.constants.RequestConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.Objects;

/**
 * @author FADADA
 * @date 2025/6/12 09:31
 */
public class OauthJwtUtil {

    private static final Logger log = LoggerFactory.getLogger(OauthJwtUtil.class);

    public static String generateAccessTokenJwt(String privateKeyStr, String appId, String userCode,
                                                String audience, Long exp, String scope) {
        try {
            // 1. 加载私钥
            PrivateKey privateKey = loadPrivateKey(privateKeyStr);
            // 2. 创建 JWT 声明集
            JWTClaimsSet claimsSet = buildClaimsSet(appId, userCode, audience, exp, scope);

            // 3. 生成 JWT
            return generateJwt(privateKey, claimsSet);
        } catch (Exception e) {
            log.info("生成 AccessToken JWT 失败，异常信息：{}", e.getMessage());
            return null;
        }
    }


    /**
     * 生成 JWT
     *
     * @param privateKey 私钥
     * @param claimsSet  JWT 声明集
     * @return 生成的 JWT 字符串
     */
    public static String generateJwt(PrivateKey privateKey, JWTClaimsSet claimsSet) throws JOSEException {
        // 1. 创建 JWT 头部
        JWSHeader header = new JWSHeader.Builder(JWSAlgorithm.RS256).type(JOSEObjectType.JWT).build();

        // 2. 创建签名 JWT
        SignedJWT signedJWT = new SignedJWT(header, claimsSet);

        // 3. 创建签名器
        JWSSigner signer = new RSASSASigner(privateKey);

        // 4. 应用签名
        signedJWT.sign(signer);

        // 5. 序列化为字符串
        return signedJWT.serialize();
    }

    /**
     * 加载私钥
     *
     * @param privateKey 私钥字符串
     * @return 加载的私钥对象
     * @throws Exception 异常信息
     */
    public static PrivateKey loadPrivateKey(String privateKey) throws Exception {

        // 清理 PEM 格式
        String keyContent = privateKey.replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replace("-----BEGIN RSA PRIVATE KEY-----", "")
                .replace("-----END RSA PRIVATE KEY-----", "")
                .replaceAll("\\s", ""); // 移除所有空白字符

        // Base64 解码
        byte[] keyBytes = Base64.getDecoder().decode(keyContent);

        // 创建密钥规范
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);

        // 生成私钥
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(keySpec);
    }

    // 构建 JWT 声明集

    /**
     * 构建 JWT 声明集
     *
     * @param appId    应用 ID
     * @param userCode 用户代码
     * @param audience 受众
     * @param exp      JWT过期时间（秒）
     * @param scope    授权范围
     */
    public static JWTClaimsSet buildClaimsSet(String appId, String userCode, String audience, Long exp, String scope) {
        // 获取当前时间（秒）
        long currentTimeSeconds = System.currentTimeMillis() / 1000;

        return new JWTClaimsSet.Builder().issuer(appId)          // iss
                .subject(userCode)       // sub
                .audience(audience)         // aud
                .issueTime(new Date(currentTimeSeconds * 1000))      // iat (转换为毫秒)
                .expirationTime(Objects.nonNull(exp) ? new Date((currentTimeSeconds + exp) * 1000) : null) // 过期时间
                .claim(RequestConstants.AUTH_SCOPE, scope)       // 自定义声明
                .build();
    }

    public static void main(String[] args) {
        try {
            String privateKeyStr = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCYCldhBx264E4CmftSTXJ8as6xNa8KWECfctMo/aXaO3dEq3av+vbUrTfE30cLvGfWFUpBPB7iuKfTBjUmB21piR/IyenXrQm8t6wWfDo5EHMFigelWLPDD01h7+JZ+gwPoS6M3tdlyghSJW1exmDYcGJ5c+n6R0WFYdWqCywFGJlMNJJcLe84W/bVI/dnITLWrCC6kFvPtg8jPTbC0/D8dd9kEYCicgkXm2QyGzEUUMSexQ59ZakFKj8iQoJ5baG4gyUkvI7CZoDvmWfP0gbkOoXJjEFrHu82rMhaCaBUwbywqpKURi3fIe1mSpskbMpFISwTt+tb2nE4aW+ad7PdAgMBAAECggEAU1owB0CYevAntGNolflhj3YatKpCuUAixYd03l8Ygujg/SOnYNkMYxJHpcXmtDdpEcQAPn1QTWmAkD8x+hROVnJXm4OekKAL24sya+1VGh27gUjn4i0b+A82lD+n7z4XSKZL1+z/V42IPEjKig/l3iLWydDTcGOMaJB3S87uJig3U2zKPmM5vTqStVdGeRoHyRZdcF6Q+Yc+GZe715iXS+hGBa9FFmAUY/7Nmz6U2rVap+Cse2OVLGRwG+ngykmdjaOCVwYfS0QIUyCZHloejmPOhETGQZOHf/3MCvwvHjW3NfNx9VFn5/rCoAvEVqoOmEQJ3W1hC9kKyY1MwQ/tXQKBgQDsnwwD5e5FxDH32g++mbpQKrByf+YzckYNrkhUBEmrtzrA4szU51QEF4VKcQfY2CBRtSF5lX8Quv6TZ7wxU6UODgDb/UWOxGsV8y+21/8AIw/R/VE2mCIQXv/XkHNIfWnqI44d9JUQ+3kab/u/kNaP/JewBSvAH/GIzZPRtJWYvwKBgQCkff0wH5xH8VKLt7XvmIIat657mYH4JCZQEeku39NnbppKXFJ7I8yJr0HQ+jmkR6jGqtQNNOi4pwOlK8PWdyDsQFuYpVPbPN3Q1sy3DaWh84SLT+MoInTM+dpT3xxcDnUW8rJysc78sBx9WsxtyfaX+hlGzqIReZWnJ1n1F9jeYwKBgQDoFEr9m8yrAvabiXZ91Fun+2battV7Si6phnIMbbQwRuPKgeizPTzrUoJ6dAhlR/3TBhwSG23oY/ADdfBgVREDivqOyogpsj7x5Xa8GHhUkw8WQCYirO5kLjkzHcvkopV6f2sJuHVola2/H2zFBHNeADpq+3dg1jPZoQDF4yADEwKBgQCY7SzzjZ/c3sXQcYZq702eC0DjVk8X5HveGxjAZIUFdzVohraEFz80jkRRRiFK0vhdYzpr4NGvwk5IRAz5GZ35JshBfQseG1NZsil20fA4Rc7nOelFSetvGabaLOYPy70eDZrLuPVnxU9nV4ARXh+tIW5Yfwj72B7C3XnrvDT6YwKBgFvsAGpjaKOJjSGdI/pkz3BfwHb1vgdRZKr+399M5epe1+s8BYoQFeWKucozY0cOsIdPxXDX9Mu3CpYIdblWV3RHBmgUgfV+ltI3Q6HnZOWORroTopYC27cqWWkpVjFnsR1Sx8E3NcFlIx6ACjNYTIAB/vSxnzmi2N94JHU0o/Vy";
            // 1. 加载私钥
            PrivateKey privateKey = loadPrivateKey(privateKeyStr);

            String appId = "46199801";
            String memberCode = "372c3c5fda57425d92efa7ec5f88cd43";
            String audience = "baidu.com";
            // 2. 创建 JWT 声明集
            JWTClaimsSet claimsSet = buildClaimsSet(appId, memberCode, audience, 99999999999999999L, null);

            // 3. 生成 JWT
            String jwt = generateJwt(privateKey, claimsSet);
            System.out.println("生成的 JWT: " + jwt);
        } catch (Exception e) {
            System.err.println("错误: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
