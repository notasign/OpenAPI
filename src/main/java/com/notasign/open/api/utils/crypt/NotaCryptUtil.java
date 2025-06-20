package com.notasign.open.api.utils.crypt;

import com.notasign.open.api.utils.string.StringUtil;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.*;
import java.util.Map.Entry;

/**
 * @author Nota
 * 2021/9/8 16:09:38
 */
public class NotaCryptUtil {


    private NotaCryptUtil() {
    }

    private static final Charset UTF8 = StandardCharsets.UTF_8;

    /**
     * RSA私钥签名
     * @param sortParam 排序后得参数字符串
     * @param privateKey 私钥
     * @return 签名值
     * @throws Exception 异常
     */
    public static String sign(String sortParam, String privateKey) throws Exception {
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(privateKey));
        PrivateKey rsaPrivateKey = KeyFactory.getInstance("RSA").generatePrivate(keySpec);

        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(rsaPrivateKey);
        signature.update(sortParam.getBytes(UTF8));
        return Base64.getEncoder().encodeToString(signature.sign()); // Base64编码签名
    }


    public static String sortParameters(Map<String, String> parameters) {
        if (parameters.isEmpty()) {
            return "";
        }
        List<String> removeKeys = new ArrayList<>();
        for (Entry<String, String> entry : parameters.entrySet()) {
            if (StringUtil.isBlank(entry.getValue())) {
                removeKeys.add(entry.getKey());
            }
        }

        for (String key : removeKeys) {
            parameters.remove(key);
        }
        StringBuilder stringBuilder = new StringBuilder();
        SortedMap<String, String> paramMap = new TreeMap<>(parameters);
        int index = 0;
        for (Entry<String, String> entry : paramMap.entrySet()) {
            stringBuilder.append(entry.getKey()).append("=").append(entry.getValue());
            index++;
            if (index != parameters.size()) {
                stringBuilder.append("&");
            }
        }
        return stringBuilder.toString();
    }



}

