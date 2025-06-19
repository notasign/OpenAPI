package com.notasign.open.api.constants;

/**
 * @author Nota
 * 2021/9/8 15:24:46
 */
public class OpenApiUrlConstants {
    /*ServiceClient*/
    public static final String SERVICE_GET_ACCESS_TOKEN = "POST /api/oauth/token";

    /*envelopeClient*/
    public static final String CREATE_ENVELOPE = "POST /api/envelope/create";
    public static final String UPDATE_ENVELOPE = "PUT /api/envelope/%s";
    public static final String PUBLISH_ENVELOPE = "POST /api/envelope/%s/send";
    public static final String REVOKE_ENVELOPE = "POST /api/envelope/%s/revoke";
    public static final String DELETE_ENVELOPE = "DELETE /api/envelope/%s";
    public static final String GET_ENVELOPE_EDIT_URL = "POST /api/envelope/edit-url";

    public static final String GET_ENVELOPE_DETAIL = "GET /api/envelope/%s";
    public static final String GET_ENVELOPES = "GET /api/envelopes";
    public static final String GET_ENVELOPE_DOWNLOAD_URL = "POST /api/envelope/%s/download-url";
    public static final String GET_ENVELOPE_REPORT_URL = "POST /api/envelope/%s/report-url";
    public static final String GET_RECIPIENT_SIGN_URL = "POST /api/envelope/%s/participant/sign-url";


    /*DOCUMENT*/
    public static final String GET_FILE_UPLOAD_URL = "GET /api/file/upload-url";
    public static final String FILE_UPLOAD = "POST /api/file/upload";
    public static final String FILE_CONVERSION = "POST /api/file/conversion";



}
