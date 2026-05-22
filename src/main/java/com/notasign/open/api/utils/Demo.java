package com.notasign.open.api.utils;

import cn.hutool.json.JSONUtil;
import com.notasign.open.api.bean.base.ApiResponse;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.client.NotaSignClient;
import com.notasign.open.api.config.HttpConfig;
import com.notasign.open.api.enums.oauth.OauthGrantTypeEnum;
import com.notasign.open.api.req.accesstoken.AccessTokenReq;
import com.notasign.open.api.req.envelope.GetEnvelopeReq;
import com.notasign.open.api.req.envelope.RemindEnvelopeReq;
import com.notasign.open.api.resp.accesstoken.GetAccessTokenResp;
import com.notasign.open.api.resp.envelope.EnvelopeDetailResp;
import com.notasign.open.api.stratey.DefaultJsonStrategy;
import com.notasign.open.api.utils.jwt.OauthJwtUtil;

/**
 * Demo
 */
public class Demo {

    //法大大分配的appId
    public static String appId = "19561477";
    //法大大分配的appId对应的秘钥
    public static String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC1jnZ9GSvbjjRVLKOo19CeZTePI35PV0XfG6ZJzVRk7VDUfF14oB/nNEh5yl6CaunfPUt6Kw5HHhVoKsGBbRBCjK2Le/gjEFV5jS1Q/3eMCd6kHzrbNtaa8VsYwoFN3pI2MvdLt9riJ/QJ5MNKWNbaTVSFRaG3UiorylpXZbgvPqPOGzRvHHkFK0OZI89q0UdyzGvyradc/vM6+tzdEIDu73eK1FkMsph6/3xBPvrKfyWJoRa+hmWNVFZ3rHWPO+Bv+atEJ24DyzwPMCe5UVLB3yNpdatyZh1qTiDwDBjWYr0B6LEM4g05diEoQsnzGVaDmIuoQ+syIjP5GWmY+vBxAgMBAAECggEAP8fHalUgaiX/zng7GkKOwEZQiVFvuxGusx00grLGVhpkjfEOqSSfcIqWd2qXXvuOI2WWEVn0zxkLbievCPe2gZqIEPtBBZhkXqow5EaKycBh3Yg3FfGi3JWzafRSlnd9J9spswjotRBSE/Owg3rIJ7KI4bS/hfYwaGfS6ucKGFYwghbgLAAkuv0HtDltF+ez7p6FKaB8DiECJrnmm0phAlg+boWzuIOyf57ZHNREWEdupNbyTX5aFA5DiVjOyZr9cAFDcHI9wZlk3kzNDJrEVuLZfqFbp0hy9j8aSaUybt5BSSa9wLKhLhO3pBBVC4+1uYNW+FhYIiv6ie8qPIJzTQKBgQD+sa/c+u788lK/lzcYCNY9I6B6Bh3pIBMwa6kupz8wtL0JO/FKeQTaYIdiPSwEW1c7HLcNHssnWliBqMMY4woaAfgkC9I0ElM+jyGu25zGPaamCreCWWtbIzDYiQBxb1wWsejuxRCHEU07fbbpZGv/O61s2OUB8Ad80VpB23OgCwKBgQC2fMZn6WqOEC4Gz/P5Ral4hTTdeVjZwF9ungmlWJOnSJUjuO4sbgj/qMrjTSVf0ScmO7RlfKGvNhq8hFHCf6zX3WcQmjhE9tlKSFGvPCefkVbf5Jwh3OaV8s6YuzPFg0ibk+05XRAuyNibkcuLj/3uOSEIVI3t7wfcPTitJHPS8wKBgQC7RXOGDIxFOPhXH5zG81hzxApvLqg3jfoOFFtljlwMOBj2/ThCBhHncCqbtVb0LSVKtaZy4z2FRgzl6Wzqk6YN0XzfJEH/P6otyZh+tcPkj9hFJoQgOBeT/6Ae1z2YKsWPemlHh2bLqZEcOSeRHOG73el6q1BXyGH5CQZQfkfaWQKBgAU4jqicafsEhXyWaIGCN7YGAZwwg5U/Rruwc9AyN486qWGrQc0tnL5Lwvo708zo+/jBDok0xp9vqdYo5vnskzJd2DwGXYPDmDXi2ctsqimLi/O946WoX0R8/OIrwPBusB4bXlcczYC5KFFTG4KzrO0q30IQwTrEcvIfIkb52wJ3AoGAAtWawxk2L0tfMnfBsadP7XPbpMglq29F/R9fn0Xnf0+kY6RwXJNlQBw4qp8pxFztortI2Oglwjo23bG5u+ONwEPZDuOcak+I6jrT6nxPCSqSl2O6vVKxudSU2NiaJrnGxz2jHCBlGcDlicWzziC4icEiOzoQ61khC8X8zRnqv74=";
    //API请求地址
    public static String serverUrl = "https://sit-openapi-nota.fadada.com";
//    public static String serverUrl = "https://sit-workspace-nota.fadada.com";
    //    public static String serverUrl = "https://openapi-ap2.uat.notasign.com";
    //用户授权码
    public static String userCode = "56b88d1ad515401fbd89257bd95949f3";

    public static NotaSignClient NOTA_SIGN_CLIENT;

    public static void init() {
        // 初始化客户端
        NOTA_SIGN_CLIENT = new NotaSignClient(appId, privateKey, serverUrl, userCode);
        // http超时配置设置， 默认不设置超时时间
        // 如果不设置超时时间 该设置可忽略
        HttpConfig httpConfig = new HttpConfig();
        httpConfig.setConnectTimeout(1000000);
        httpConfig.setReadTimeout(1000000);
        NOTA_SIGN_CLIENT.setHttpConfig(httpConfig);
        NOTA_SIGN_CLIENT.setSignType("RSA-SHA256");
        // Json序列化策率，默认使用Jackson，如果要使用其他如FastJson,Gson等实现JsonStrategy接口即可
        // 如果使用默认该设置可以忽略
        NOTA_SIGN_CLIENT.setJsonStrategy(new DefaultJsonStrategy());
    }

    public static void main(String[] args) throws Exception {
        //SDK客户端初始化
        init();
        //业务请求
        try {
            //获取accessToken
            String jwtStr = OauthJwtUtil.generateAccessTokenJwt(privateKey, appId, userCode, "api.nota.com", 10000L, null);
            AccessTokenReq accessTokenReq = new AccessTokenReq();
            accessTokenReq.setAssertion(jwtStr);
            accessTokenReq.setGrantType(OauthGrantTypeEnum.JWT.getCode());
            ApiResponse<GetAccessTokenResp> result = NOTA_SIGN_CLIENT.execute(accessTokenReq);
            if (!result.isSuccess()) {
                System.err.println(JSONUtil.toJsonStr(result));
                return;
            }
            String accessToken = result.getData().getAccessToken();
            System.out.println("accessToken: " + accessToken);
            String envelopeId = "xxxxxxxx";
            // 调用查询信封详情方法
//            GetEnvelopeReq getEnvelopeReq = new GetEnvelopeReq();
//            getEnvelopeReq.setAccessToken(accessToken);
//            getEnvelopeReq.setEnvelopeId(envelopeId);
            RemindEnvelopeReq remindEnvelopeReq = new RemindEnvelopeReq();
            remindEnvelopeReq.setAccessToken(accessToken);
            remindEnvelopeReq.setEnvelopeId(envelopeId);
            ApiResponse<EmptyResp> detail = NOTA_SIGN_CLIENT.execute(remindEnvelopeReq);
            System.out.println(JSONUtil.toJsonStr(detail));
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
