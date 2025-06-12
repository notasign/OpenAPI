package com.notasign.open.api.constants;


/**
 * @author Fadada
 * 2021/9/8 16:09:38
 */
public class RequestConstants {

    private RequestConstants() {
    }


    /**
     * 企业控制台创建应用后得到的应用ID
     */
    public static final String APP_ID = "X-GLOBAL-App-Id";
    /**
     * GLOBAL.openApi子版本号。如当前版本为：5.1
     */
    public static final String API_SUB_VERSION = "X-GLOBAL-Api-SubVersion";

    public static final String CURRENT_SUB_VERSION = "1.0";
    /**
     * 签名算法类型:固定HMAC-SHA256
     */
    public static final String SIGN_TYPE = "X-GLOBAL-Sign-Type";
    /**
     * 请求参数的签名值
     */
    public static final String SIGN = "X-GLOBAL-Sign";
    /**
     * 时间戳(yyyy-MM-dd HH:mm:ss.sss)，时间戳必须是保证是当前时间，同时跟法大大这边的服务器时间正负不能相差5分钟
     */
    public static final String TIMESTAMP = "X-GLOBAL-Timestamp";
    /**
     * 随机数(32位, 10分钟内不能重复请求)
     */
    public static final String NONCE = "X-GLOBAL-Nonce";
    /**
     * 平台令牌,通过获取令牌接口返回
     */
    public static final String ACCESS_TOKEN = "Authorization";

    /**
     * 请求参数的集合，除公共请求参数都必须放在这个参数中传递（除文件，字节流等）,json字符串.
     */
    public static final String DATA_KEY = "bizContent";

    public static final String FDD_REQEUST_ID = "X-GLOBAL-Request-Id";


    public static final String SUCCESS_CODE = "100001001000000";

    public static final int SUCCESS_CODE_200 = 200;


    /**
     * 字符集
     **/
    public static final String CHARSET_UTF8 = "UTF-8";
    public static final String CHARSET_GBK = "GBK";

    /**
     * HTTP请求相关
     **/
    public static final String METHOD_POST = "POST";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_PUT = "PUT";
    public static final String METHOD_DELETE = "GET";

    public static final String AUTH_SCOPE = "scope";

}
