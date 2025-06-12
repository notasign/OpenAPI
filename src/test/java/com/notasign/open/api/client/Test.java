package com.notasign.open.api.client;


import com.notasign.open.api.bean.base.ApiResponse;
import com.notasign.open.api.bean.req.accesstoken.AccessTokenReq;
import com.notasign.open.api.bean.req.envelope.DeleteEnvelopeReq;
import com.notasign.open.api.bean.req.envelope.GetEnvelopeReq;
import com.notasign.open.api.bean.resp.accesstoken.GetAccessTokenResp;
import com.notasign.open.api.bean.resp.envelope.EnvelopeDetailResp;
import com.notasign.open.api.exception.ApiException;
import com.notasign.open.api.utils.json.JacksonUtil;
import com.notasign.open.api.utils.jwt.AccessTokenJwtUtil;

/**
 * @author FADADA
 * @date 2024/10/18 16:22
 */
public class Test {
    private static final String APP_ID = "63256854";
    private static final String APP_SECRET = "9846477308844f2280bee45cd3480526";
    private static final String API_URL = "https://openapi-ap1-nota.fadada.com";
    private static final String USER_CODE = "4940c39e9ffb46e09627ce1f0c1a84ee";


    public static void main(String[] args) throws ApiException {
        NotaSignClient client = getNotaSignClient();
        //获取accessToken
//        String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCKlOsMCBjbbSTwmQvU3Hub9iQcMcyU87PIqNTIWzWr5oaqeXm3blo/kInxcoTKxv2ImfxYwrXlISoQuekrWKtwXfm+Hw1soDo9bKjwk0q81Nww3Aigl6W/dTDtjJUMmHJHjKTjjw5ZBI6wygSfpG5OSXfKHlB5Fk4XtEar8OGtPAnAlU7ME0jkLHgTN6xsXNlc3TvWhBi87yWRJLO2MrEegtcwX+tP8GfNs0r1j42d8oFWcr00qo+Zqj+qUuR//s43Mh0X9l13iHK1S4S3CtLKjI3edLrNP2ag6jmcTtwWdJI6Rr+1nmjhuSbhyJm4sQwis10vJWOAzrJ9uFIjA6mBAgMBAAECggEAFUfpEF/t8URBd/EIsBdro/eYc/vxvq3t3dKPWnUnOM6dv3AIEPMRSNGZXUqIudr09BUxey/rXtRI8WibNdzX9tl3kIqUNSolx2j4SHlV8Ml/RsGDUaX3/f6xFMmR2e1PH02pxIgjW+gnQV7Edv95MOx3SMJ++RlDxMAaWi0TetaTj2j5SJPSEhjEradXKkSwqYi/Fl2MyNxidqe1bWWfj7HBATbArbX4ziJhkzbQF1liFoj4iF5gfFIyh2Y3B2iITBpJkTOFesgtXzK6g2bLEhlKZb5Q3bwp5MZJkz6IrwK57QqQnpGFh9do6ZJfMtzDslLCXv5VdAs+cnIT47xBQQKBgQC9JizzZvV+piXNTmstVK3uZNVVcQN9D6QeZMqGNpvEyn7/gT6tFH+hHTvLeDcX1wEfX9IZ4NyRv/Flr4t6xkgLmjyDvcWnZ7zalICCUFHHD9QwYpA+wkuN/witx8m1KHdOs34n00v4a+UbfgnBRviSRC7GJPmzGNE7+Iw/qhdWhwKBgQC7j4HGzWF8wz6o+jdp40lMSTDJhb2Tx+vo+nCpgIeI4tY9w7B1ECE/DjK5JAAO2qUI1WErov4y5Qy4xNVKcoA69z8e9iS9BhZGImseU/fDDtt0tQ6k178mWDXWEVz2j0az3PPLVxNAMlhMe+DPW3BFY9kgJwyk8yorSOxrdNl5twKBgQCevaAx8jGLxbKp9+sY0x1ZmgQ0PbF4zpyk6V/SfZgC8xLcKcLJDRADzf31yAEsn8OQaiFwmHdkVpsoBMhhFHE4U4v/4E82LGihZMnpE7FeB5nDtaRrFzLDi8rj1W0h/UELqrXwhHMYnKxdg0x6ia5pSpGat0NcHDLVSsWhVIVblwKBgFzbeYaxG7im+RizeEfGLP3Fpo++1NKbQeKAStLAPVm55BOEFJKAP9V19ArRFe5EtTwgWBFAitUrrRa07FwFQBLxYaC0gA/NOa3TUHEdZSZ+7otjMDLQVWRoe47V3c57tKdLlq9vFqrLwgdrtSszu+u+uTo/2vS3JoNzgQjaOukVAoGARkxgIZhalCEKa7O0Zjwku7SA9kT7BaSy5of2vsp2cvk3IMC6BaL+VybWMHNkIvDUdUhvPTjW8e6dG+AECoQtdwRUGGFolTOquZT6eitfOgXNYmaaIyVTcqGVmiA6ttmBkDPFmfpZrsTKxaKo19nFbbc1fXDZlh9jYKTpMlxCHcA=";
//        String jwtStr = AccessTokenJwtUtil.generateAccessTokenJwt(privateKey, APP_ID, USER_CODE, "band.fadada.com", 10000L, null);
//        AccessTokenReq accessTokenReq = new AccessTokenReq();
//        accessTokenReq.setAssertion(jwtStr);
//        accessTokenReq.setGrantType("jwt-bearer");
//        ApiResponse<GetAccessTokenResp> accessToken = client.execute(accessTokenReq);
//        System.out.println(JacksonUtil.toJson(accessToken));

        String accessTokens = "c60bd6d4-ba51-4e70-8171-aacde123459d";
        GetEnvelopeReq getEnvelopeReq = new GetEnvelopeReq();
        getEnvelopeReq.setAccessToken(accessTokens);
        getEnvelopeReq.setEnvelopeId("174971949838313");
        ApiResponse<EnvelopeDetailResp> detail = client.execute(getEnvelopeReq);
        //获取企业授权链接
        //getCorpAuthUrl() ;
        //创建任务
        //createSignTask() ;
        //获取参与方签署链接
        //getSignActorUrl() ;
    }


    //获取accessToken
    public static NotaSignClient getNotaSignClient() {
        return new NotaSignClient(APP_ID, APP_SECRET, API_URL, USER_CODE);
    }


}
