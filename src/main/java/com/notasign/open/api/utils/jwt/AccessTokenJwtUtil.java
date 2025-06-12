package com.notasign.open.api.utils.jwt;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import com.notasign.open.api.constants.RequestConstants;
import com.notasign.open.api.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Date;
import java.util.Objects;

/**
 * @author caishangdong
 * @date 2025/6/12 09:31
 */
public class AccessTokenJwtUtil {

    private static final Logger log = LoggerFactory.getLogger(AccessTokenJwtUtil.class);

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
            String privateKeyStr = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCKlOsMCBjbbSTwmQvU3Hub9iQcMcyU87PIqNTIWzWr5oaqeXm3blo/kInxcoTKxv2ImfxYwrXlISoQuekrWKtwXfm+Hw1soDo9bKjwk0q81Nww3Aigl6W/dTDtjJUMmHJHjKTjjw5ZBI6wygSfpG5OSXfKHlB5Fk4XtEar8OGtPAnAlU7ME0jkLHgTN6xsXNlc3TvWhBi87yWRJLO2MrEegtcwX+tP8GfNs0r1j42d8oFWcr00qo+Zqj+qUuR//s43Mh0X9l13iHK1S4S3CtLKjI3edLrNP2ag6jmcTtwWdJI6Rr+1nmjhuSbhyJm4sQwis10vJWOAzrJ9uFIjA6mBAgMBAAECggEAFUfpEF/t8URBd/EIsBdro/eYc/vxvq3t3dKPWnUnOM6dv3AIEPMRSNGZXUqIudr09BUxey/rXtRI8WibNdzX9tl3kIqUNSolx2j4SHlV8Ml/RsGDUaX3/f6xFMmR2e1PH02pxIgjW+gnQV7Edv95MOx3SMJ++RlDxMAaWi0TetaTj2j5SJPSEhjEradXKkSwqYi/Fl2MyNxidqe1bWWfj7HBATbArbX4ziJhkzbQF1liFoj4iF5gfFIyh2Y3B2iITBpJkTOFesgtXzK6g2bLEhlKZb5Q3bwp5MZJkz6IrwK57QqQnpGFh9do6ZJfMtzDslLCXv5VdAs+cnIT47xBQQKBgQC9JizzZvV+piXNTmstVK3uZNVVcQN9D6QeZMqGNpvEyn7/gT6tFH+hHTvLeDcX1wEfX9IZ4NyRv/Flr4t6xkgLmjyDvcWnZ7zalICCUFHHD9QwYpA+wkuN/witx8m1KHdOs34n00v4a+UbfgnBRviSRC7GJPmzGNE7+Iw/qhdWhwKBgQC7j4HGzWF8wz6o+jdp40lMSTDJhb2Tx+vo+nCpgIeI4tY9w7B1ECE/DjK5JAAO2qUI1WErov4y5Qy4xNVKcoA69z8e9iS9BhZGImseU/fDDtt0tQ6k178mWDXWEVz2j0az3PPLVxNAMlhMe+DPW3BFY9kgJwyk8yorSOxrdNl5twKBgQCevaAx8jGLxbKp9+sY0x1ZmgQ0PbF4zpyk6V/SfZgC8xLcKcLJDRADzf31yAEsn8OQaiFwmHdkVpsoBMhhFHE4U4v/4E82LGihZMnpE7FeB5nDtaRrFzLDi8rj1W0h/UELqrXwhHMYnKxdg0x6ia5pSpGat0NcHDLVSsWhVIVblwKBgFzbeYaxG7im+RizeEfGLP3Fpo++1NKbQeKAStLAPVm55BOEFJKAP9V19ArRFe5EtTwgWBFAitUrrRa07FwFQBLxYaC0gA/NOa3TUHEdZSZ+7otjMDLQVWRoe47V3c57tKdLlq9vFqrLwgdrtSszu+u+uTo/2vS3JoNzgQjaOukVAoGARkxgIZhalCEKa7O0Zjwku7SA9kT7BaSy5of2vsp2cvk3IMC6BaL+VybWMHNkIvDUdUhvPTjW8e6dG+AECoQtdwRUGGFolTOquZT6eitfOgXNYmaaIyVTcqGVmiA6ttmBkDPFmfpZrsTKxaKo19nFbbc1fXDZlh9jYKTpMlxCHcA=";
            // 1. 加载私钥
            PrivateKey privateKey = loadPrivateKey(privateKeyStr);

            String appId = "123456";
            String memberCode = "4940c39e9ffb46e09627ce1f0c1a84ee";
            String audience = "baidu.com";
            // 2. 创建 JWT 声明集
            JWTClaimsSet claimsSet = buildClaimsSet(appId, memberCode, audience, 6000L, null);

            // 3. 生成 JWT
            String jwt = generateJwt(privateKey, claimsSet);
            System.out.println("生成的 JWT: " + jwt);
        } catch (Exception e) {
            System.err.println("错误: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
