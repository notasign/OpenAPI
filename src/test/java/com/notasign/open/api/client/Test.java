package com.notasign.open.api.client;


import com.notasign.open.api.bean.base.ApiResponse;
import com.notasign.open.api.bean.dto.document.DocumentReqDTO;
import com.notasign.open.api.bean.dto.field.DocumentFieldReqDTO;
import com.notasign.open.api.bean.dto.field.PositionDTO;
import com.notasign.open.api.bean.dto.recipient.ParticipantReqDTO;
import com.notasign.open.api.config.HttpConfig;
import com.notasign.open.api.enums.envelope.SignatureLevelEnum;
import com.notasign.open.api.enums.field.FieldTypeEnum;
import com.notasign.open.api.enums.field.PositionModeEnum;
import com.notasign.open.api.enums.oauth.OauthGrantTypeEnum;
import com.notasign.open.api.exception.ApiException;
import com.notasign.open.api.req.accesstoken.AccessTokenReq;
import com.notasign.open.api.req.envelope.CreateEnvelopeReq;
import com.notasign.open.api.req.envelope.GetEnvelopeReq;
import com.notasign.open.api.resp.accesstoken.GetAccessTokenResp;
import com.notasign.open.api.resp.envelope.CreateEnvelopeResp;
import com.notasign.open.api.resp.envelope.EnvelopeDetailResp;
import com.notasign.open.api.stratey.DefaultJsonStrategy;
import com.notasign.open.api.utils.json.JacksonUtil;
import com.notasign.open.api.utils.jwt.OauthJwtUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nota
 * @date 2024/10/18 16:22
 */
public class Test {
    private static final String APP_ID = "63256854";
    //https://openapi-ap1-nota.fadada.com
    private static final String API_URL = "http://localhost:8015";

    private static final String USER_CODE = "4940c39e9ffb46e09627ce1f0c1a84ee";
    private static final String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCKlOsMCBjbbSTwmQvU3Hub9iQcMcyU87PIqNTIWzWr5oaqeXm3blo/kInxcoTKxv2ImfxYwrXlISoQuekrWKtwXfm+Hw1soDo9bKjwk0q81Nww3Aigl6W/dTDtjJUMmHJHjKTjjw5ZBI6wygSfpG5OSXfKHlB5Fk4XtEar8OGtPAnAlU7ME0jkLHgTN6xsXNlc3TvWhBi87yWRJLO2MrEegtcwX+tP8GfNs0r1j42d8oFWcr00qo+Zqj+qUuR//s43Mh0X9l13iHK1S4S3CtLKjI3edLrNP2ag6jmcTtwWdJI6Rr+1nmjhuSbhyJm4sQwis10vJWOAzrJ9uFIjA6mBAgMBAAECggEAFUfpEF/t8URBd/EIsBdro/eYc/vxvq3t3dKPWnUnOM6dv3AIEPMRSNGZXUqIudr09BUxey/rXtRI8WibNdzX9tl3kIqUNSolx2j4SHlV8Ml/RsGDUaX3/f6xFMmR2e1PH02pxIgjW+gnQV7Edv95MOx3SMJ++RlDxMAaWi0TetaTj2j5SJPSEhjEradXKkSwqYi/Fl2MyNxidqe1bWWfj7HBATbArbX4ziJhkzbQF1liFoj4iF5gfFIyh2Y3B2iITBpJkTOFesgtXzK6g2bLEhlKZb5Q3bwp5MZJkz6IrwK57QqQnpGFh9do6ZJfMtzDslLCXv5VdAs+cnIT47xBQQKBgQC9JizzZvV+piXNTmstVK3uZNVVcQN9D6QeZMqGNpvEyn7/gT6tFH+hHTvLeDcX1wEfX9IZ4NyRv/Flr4t6xkgLmjyDvcWnZ7zalICCUFHHD9QwYpA+wkuN/witx8m1KHdOs34n00v4a+UbfgnBRviSRC7GJPmzGNE7+Iw/qhdWhwKBgQC7j4HGzWF8wz6o+jdp40lMSTDJhb2Tx+vo+nCpgIeI4tY9w7B1ECE/DjK5JAAO2qUI1WErov4y5Qy4xNVKcoA69z8e9iS9BhZGImseU/fDDtt0tQ6k178mWDXWEVz2j0az3PPLVxNAMlhMe+DPW3BFY9kgJwyk8yorSOxrdNl5twKBgQCevaAx8jGLxbKp9+sY0x1ZmgQ0PbF4zpyk6V/SfZgC8xLcKcLJDRADzf31yAEsn8OQaiFwmHdkVpsoBMhhFHE4U4v/4E82LGihZMnpE7FeB5nDtaRrFzLDi8rj1W0h/UELqrXwhHMYnKxdg0x6ia5pSpGat0NcHDLVSsWhVIVblwKBgFzbeYaxG7im+RizeEfGLP3Fpo++1NKbQeKAStLAPVm55BOEFJKAP9V19ArRFe5EtTwgWBFAitUrrRa07FwFQBLxYaC0gA/NOa3TUHEdZSZ+7otjMDLQVWRoe47V3c57tKdLlq9vFqrLwgdrtSszu+u+uTo/2vS3JoNzgQjaOukVAoGARkxgIZhalCEKa7O0Zjwku7SA9kT7BaSy5of2vsp2cvk3IMC6BaL+VybWMHNkIvDUdUhvPTjW8e6dG+AECoQtdwRUGGFolTOquZT6eitfOgXNYmaaIyVTcqGVmiA6ttmBkDPFmfpZrsTKxaKo19nFbbc1fXDZlh9jYKTpMlxCHcA=";

    public static void main(String[] args) throws ApiException {
        NotaSignClient client = getNotaSignClient();
        //获取accessToken

        String jwtStr = OauthJwtUtil.generateAccessTokenJwt(privateKey, APP_ID, USER_CODE, "band.Nota.com", 10000L, null);
        AccessTokenReq accessTokenReq = new AccessTokenReq();
        accessTokenReq.setAssertion(jwtStr);
        accessTokenReq.setGrantType(OauthGrantTypeEnum.JWT.getCode());
        ApiResponse<GetAccessTokenResp> result = client.execute(accessTokenReq);
        System.out.println(JacksonUtil.toJson(result));
        String accessToken = result.getData().getAccessToken();

//        创建签署任务
        CreateEnvelopeReq createEnvelopeReq = new CreateEnvelopeReq();
        createEnvelopeReq.setAccessToken(accessToken);
        createEnvelopeReq.setSubject("测试签署");
        createEnvelopeReq.setRemark("测试签署1111");
        createEnvelopeReq.setSignatureLevel(SignatureLevelEnum.SES.getCode());
        createEnvelopeReq.setAutoSend(false);

        List<DocumentReqDTO> documentReqDTOS = new ArrayList<>();
        DocumentReqDTO documentReqDTO = new DocumentReqDTO();
        documentReqDTO.setDocumentId("doc_001");
        documentReqDTO.setDocumentName("测试签署文档");
        documentReqDTO.setDocumentFileId("1931228266551394306");

        List<DocumentFieldReqDTO> documentFieldReqDTOList = new ArrayList<>();
        DocumentFieldReqDTO documentFieldReqDTO = new DocumentFieldReqDTO();
        documentFieldReqDTO.setFieldId("field_001");
        documentFieldReqDTO.setFieldName("个人签名");
        documentFieldReqDTO.setFieldType(FieldTypeEnum.SIGNATURE.getCode());

        PositionDTO positionDTO = new PositionDTO();
        positionDTO.setPositionMode(PositionModeEnum.PIXEL.getCode());
        positionDTO.setPositionPageNo(1);
        positionDTO.setPositionX("399");
        positionDTO.setPositionY("500");
        documentFieldReqDTO.setPosition(positionDTO);
        documentFieldReqDTOList.add(documentFieldReqDTO);
        documentReqDTO.setDocumentFields(documentFieldReqDTOList);

        documentReqDTOS.add(documentReqDTO);

        createEnvelopeReq.setDocuments(documentReqDTOS);

        List<ParticipantReqDTO> participantReqDTOS = new ArrayList<>();
        ParticipantReqDTO participantReqDTO = new ParticipantReqDTO();
        participantReqDTO.setParticipantId("participant_001");
        participantReqDTO.setParticipantName("测试签署人");
        participantReqDTO.setEmail("xxxxx@fadada.com");

        List<ParticipantReqDTO.SignField> signFields = new ArrayList<>();
        ParticipantReqDTO.SignField signField = new ParticipantReqDTO.SignField();
        signField.setFieldDocId("doc_001");
        signField.setFieldId("field_001");
        signField.setFieldName("个人签名");
        signFields.add(signField);
        participantReqDTO.setSignFields(signFields);
        participantReqDTOS.add(participantReqDTO);
        createEnvelopeReq.setParticipants(participantReqDTOS);
        ApiResponse<CreateEnvelopeResp> createResult = client.execute(createEnvelopeReq);
        System.out.println(JacksonUtil.toJson(createResult));
        if (createResult.isSuccess()) {
            GetEnvelopeReq getEnvelopeReq = new GetEnvelopeReq();
            getEnvelopeReq.setAccessToken("48c73647-3015-40fd-b34c-0188f1169fe7");
            getEnvelopeReq.setEnvelopeId("175040355659214");
            ApiResponse<EnvelopeDetailResp> detail = client.execute(getEnvelopeReq);
            System.out.println(JacksonUtil.toJson(detail));
        }

//        GetEnvelopeReq getEnvelopeReq = new GetEnvelopeReq();
//        getEnvelopeReq.setAccessToken("48c73647-3015-40fd-b34c-0188f1169fe7");
//        getEnvelopeReq.setEnvelopeId("175040355659214");
//        ApiResponse<EnvelopeDetailResp> detail = client.execute(getEnvelopeReq);
//        System.out.println(JacksonUtil.toJson(detail));
//
//        GetEnvelopesReq getEnvelopesReq = new GetEnvelopesReq();
//        getEnvelopesReq.setAccessToken("48c73647-3015-40fd-b34c-0188f1169fe7");
//        getEnvelopesReq.setPageNumber(1);
//        getEnvelopesReq.setPageSize(10);
//        ApiResponse<GetEnvelopesResp> list = client.execute(getEnvelopesReq);
//        System.out.println(JacksonUtil.toJson(list));
//
//        DeleteEnvelopeReq req = new DeleteEnvelopeReq();
//        req.setAccessToken("48c73647-3015-40fd-b34c-0188f1169fe7");
//        req.setEnvelopeId("175040355659214");
//        ApiResponse<EmptyResp> deleteResult = client.execute(req);
    }

    //获取NotaSignClient实例
    public static NotaSignClient getNotaSignClient() throws ApiException {
        try {
            return new NotaSignClient(APP_ID, privateKey, API_URL, USER_CODE);
        } catch (Exception e) {
            throw new ApiException("Failed to create NotaSignClient: " + e.getMessage(), e);
        }
    }

}
