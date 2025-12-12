package com.notasign.open.api.utils.crypt;

import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Map;
import java.util.TreeMap;

public class SignatureUtil {
    // 签名算法
    public static final String SIGNATURE_ALGORITHM = "SHA256withRSA";

    // 加密算法
    private static final String ENCRYPT_ALGORITHM = "RSA";

    // 密钥长度
    private static final int KEY_SIZE = 2048;

    /**
     * 生成RSA密钥对
     */
    public static KeyPair generateKeyPair(String algorithm) throws NoSuchAlgorithmException {
        if(null == algorithm || algorithm.length() < 1) {
            algorithm = ENCRYPT_ALGORITHM;
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithm);
        keyPairGenerator.initialize(KEY_SIZE);
        return keyPairGenerator.generateKeyPair();
    }

    /**
     * 使用私钥对数据进行签名
     * @param data 原始数据
     * @param privateKeyStr 私钥字符串
     * @return Base64编码的签名
     */
    public static String signWithStrKey(String data, String privateKeyStr) throws Exception {
        if(null == data || data.length() < 1 || null == privateKeyStr || privateKeyStr.length() < 1) {
            throw new Exception("使用私钥对数据进行签名失败，参数异常");
        }

        // 转化私钥
        PrivateKey privateKey = SignatureUtil.strToPrivateKey(privateKeyStr, null);
        if(null == privateKey) {
            throw new Exception("转换私钥字符串失败");
        }

        try {
            String signedStr = SignatureUtil.signWithPrivateKey(data.getBytes(StandardCharsets.UTF_8), privateKey);
            return signedStr;
        }
        catch (Exception e) {
            throw new Exception("使用私钥签名发生异常: " + e.getMessage());
        }
    }

    /**
     * 使用私钥对数据进行签名
     * @param data 原始数据
     * @param privateKey 私钥
     * @return Base64编码的签名
     */
    public static String signWithPrivateKey(byte[] data, PrivateKey privateKey) throws Exception {
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initSign(privateKey);
        signature.update(data);
        byte[] digitalSignature = signature.sign();
        return Base64.getEncoder().encodeToString(digitalSignature);
    }

    /**
     * 使用公钥验证签名
     * @param data 原始数据
     * @param digitalSignature Base64编码的签名
     * @param publicKeyStr 公钥字符串
     * @return 验证结果
     */
    public static boolean verify(String data, String digitalSignature, String publicKeyStr) throws Exception {
        if(null == data || data.length() < 1 || null == publicKeyStr || publicKeyStr.length() < 1 || null == digitalSignature || digitalSignature.length() < 1) {
            throw new Exception("使用公钥验证签名失败，参数异常");
        }

        // 转换公钥
        PublicKey publicKey = strToPublicKey(publicKeyStr, null);
        if(null == publicKey) {
            throw new Exception("转换公钥字符串失败");
        }

        return SignatureUtil.verifyWithPublicKey(data.getBytes(StandardCharsets.UTF_8), digitalSignature, publicKey);
    }

    /**
     * 使用公钥验证签名
     * @param data 原始数据
     * @param digitalSignature Base64编码的签名
     * @param publicKey 公钥
     * @return 验证结果
     */
    public static boolean verifyWithPublicKey(byte[] data, String digitalSignature, PublicKey publicKey) throws Exception {
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initVerify(publicKey);
        signature.update(data);
        byte[] signatureBytes = Base64.getDecoder().decode(digitalSignature);
        return signature.verify(signatureBytes);
    }

    /**
     * 将Base64编码的公钥转换为PublicKey
     * @return PublicKey
     */
    public static PublicKey strToPublicKey(String publicKeyStr, String algorithm) throws Exception {
        if(null == algorithm || algorithm.length() < 1) {
            algorithm = ENCRYPT_ALGORITHM;
        }

        // 解码Base64字符串
        byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyStr);
        // 创建密钥工厂
        KeyFactory keyFactory = KeyFactory.getInstance(algorithm);

        // 生成公钥对象
        X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
        PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
        return publicKey;
    }

    /**
     * 将Base64编码的公钥转换为PublicKey
     * @return PublicKey
     */
    public static PrivateKey strToPrivateKey(String privateKeyStr, String algorithm) throws Exception {
        if(null == algorithm || algorithm.length() < 1) {
            algorithm = ENCRYPT_ALGORITHM;
        }

        // 解码Base64字符串
        byte[] privateKeyBytes = Base64.getDecoder().decode(privateKeyStr);
        // 创建密钥工厂
        KeyFactory keyFactory = KeyFactory.getInstance(algorithm);

        // 生成公钥对象
        PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
        PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);
        return privateKey;
    }

    /**
     * 对参数进行排序，并转化成Json字符串
     * @return String
     */
    public static String sortParameters(Map<String, String> paramMap) {
        if(null == paramMap || paramMap.size() < 1) {
            return null;
        }

        // 1. 按key排序
        Map<String, String> sortedMap = new TreeMap<>(paramMap);
        return cn.hutool.json.JSONUtil.toJsonStr(sortedMap);
    }
}
