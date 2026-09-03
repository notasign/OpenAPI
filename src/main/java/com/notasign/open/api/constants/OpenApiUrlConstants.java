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
    public static final String CREATE_SELF_SIGN_DOCS =  "POST /api/envelope/self-sign-docs";
    public static final String UPDATE_ENVELOPE = "PUT /api/envelope/%s";
    public static final String PUBLISH_ENVELOPE = "POST /api/envelope/%s/send";
    public static final String REVOKE_ENVELOPE = "POST /api/envelope/%s/revoke";
    public static final String DELETE_ENVELOPE = "DELETE /api/envelope/%s";
    public static final String GET_ENVELOPE_EDIT_URL = "POST /api/envelope/edit-url";
    public static final String GET_ENVELOPE_PREVIEW_URL = "POST /api/envelope/preview-url";
    public static final String REMIND_ENVELOPE = "POST /api/envelope/%s/remind";

    public static final String GET_ENVELOPE_DETAIL = "GET /api/envelope/%s";
    public static final String GET_ENVELOPES = "GET /api/envelopes";
    public static final String GET_ENVELOPE_DOWNLOAD_URL = "POST /api/envelope/%s/download-url";
    public static final String GET_ENVELOPE_REPORT_URL = "POST /api/envelope/%s/report-url";
    public static final String GET_RECIPIENT_SIGN_URL = "POST /api/envelope/%s/participant/sign-url";


    /*DOCUMENT*/
    public static final String GET_FILE_UPLOAD_URL = "GET /api/file/upload-url";
    public static final String FILE_UPLOAD = "POST /api/file/upload";
    public static final String FILE_CONVERSION = "POST /api/file/process";


    /*TEMPLATE*/
    public static final String GET_TEMPLATE = "GET /api/template/%s";


    /*XML*/
    public static final String XML_SIGN = "POST /api/tsp/xml-sign";
    public static final String DOWNLOAD_XML_SIGNED = "POST /api/tsp/%s/download-url";


    /*TSP*/
    public static final String GET_CREDENTIAL = "GET /api/tsp/credentials";
    public static final String GET_CERTIFICATE = "POST /api/tsp/certificate";
    public static final String SIGN_HASH = "POST /api/tsp/signHash";

    /*ENVELOPE CORRECTION*/
    public static final String START_CORRECTION = "POST /api/envelope/%s/correct/start";
    public static final String CLOSE_CORRECTION = "POST /api/envelope/%s/correct/close";

    /*ENVELOPE PARTICIPANTS*/
    public static final String ADD_PARTICIPANTS = "POST /api/envelope/%s/participants";
    public static final String REMOVE_PARTICIPANT = "DELETE /api/envelope/%s/participants/%s";
    public static final String UPDATE_PARTICIPANT = "PUT /api/envelope/%s/participants/%s";
    public static final String UNBLOCK_PARTICIPANT = "POST /api/envelope/%s/participants/%s/unblock";

    /*ENVELOPE FIELDS*/
    public static final String ADD_FIELDS = "POST /api/envelope/%s/documents/%s/fields";
    public static final String REMOVE_FIELDS = "DELETE /api/envelope/%s/documents/%s/fields";

    /*MEMBER*/
    public static final String GET_MEMBER_LIST = "GET /api/members/list";
    public static final String GET_OAUTH_CODE = "POST /api/oauth/code";


    /*XML VALIDATION*/
    public static final String CREATE_XML_VALIDATION = "POST /api/tsp/xml-validations";
    public static final String GET_XML_VALIDATION_STATUS = "GET /api/tsp/xml-validations/%s";
    public static final String GET_XML_VALIDATION_ITEMS = "GET /api/tsp/xml-validations/%s/items";
    public static final String GET_XML_VALIDATION_ITEM_DETAIL = "GET /api/tsp/xml-validations/%s/items/%s";
    public static final String GET_XML_VALIDATION_ITEM_ISSUES = "GET /api/tsp/xml-validations/%s/items/%s/issues";
    public static final String RERUN_XML_VALIDATION = "POST /api/tsp/xml-validations/%s/rerun";

    /*XML SIGN EXT*/
    public static final String XML_DIRECT_SIGN = "POST /api/tsp/xml-sign/direct";
    public static final String GET_XML_SIGN_RESULT = "POST /api/tsp/xml-sign/%s/result";
    public static final String GET_XML_SIGN_ITEMS = "POST /api/tsp/xml-sign/%s/items";
    public static final String GET_XML_SIGN_ITEM_DETAIL = "POST /api/tsp/xml-sign/%s/items/query";

    /*ENVELOPE BASIC INFO*/
    public static final String UPDATE_ENVELOPE_BASIC_INFO = "PUT /api/envelope/%s/basic-info";

    /*BULK SEND TASK*/
    public static final String BULK_TASK_CREATE = "POST /api/bulk-envelopes/task/create";
    public static final String BULK_TASK_START = "POST /api/bulk-envelopes/task/start";
    public static final String BULK_TASK_LIST = "GET /api/bulk-envelopes/task/list";
    public static final String BULK_TASK_DETAIL = "GET /api/bulk-envelopes/task/%s/detail";
    public static final String BULK_TASK_GET = "GET /api/bulk-envelopes/task/%s";
    public static final String BULK_TASK_STATISTICS = "GET /api/bulk-envelopes/task/%s/statistics";
    public static final String BULK_TASK_VOID = "POST /api/bulk-envelopes/task/%s/void";
    public static final String BULK_TASK_CANCEL = "POST /api/bulk-envelopes/task/%s/cancel";
    public static final String BULK_TASK_DELETE = "POST /api/bulk-envelopes/task/delete";
    public static final String BULK_TASK_REMIND = "POST /api/bulk-envelopes/task/%s/remind";
    public static final String BULK_TASK_UPDATE = "POST /api/bulk-envelopes/task/%s/update";
    public static final String BULK_TASK_EDIT_URL = "POST /api/bulk-envelopes/task/edit-url";

    /*BULK SEND LIST*/
    public static final String BULK_LIST_CREATE = "POST /api/bulk-envelopes/list/create";
    public static final String BULK_LIST_TEMPLATE_DOWNLOAD = "GET /api/bulk-envelopes/list/template";
    public static final String BULK_LIST_UPDATE = "POST /api/bulk-envelopes/list/update";
    public static final String BULK_LIST_DELETE = "POST /api/bulk-envelopes/list/delete";
    public static final String BULK_LIST_DETAIL = "POST /api/bulk-envelopes/list/detail";
    public static final String BULK_LIST_TEMPLATE_URL = "POST /api/bulk-envelopes/list/template";

    /*STAMP*/
    public static final String STAMP_LIST = "GET /api/stamps";
    public static final String STAMP_CREATE = "POST /api/stamps";
    public static final String STAMP_UPDATE = "PUT /api/stamps/%s";
    public static final String STAMP_DELETE = "DELETE /api/stamps/%s";
    public static final String STAMP_USER_LIST = "GET /api/stamps/%s/users";
    public static final String STAMP_USER_ADD = "POST /api/stamps/%s/users";
    public static final String STAMP_USER_REMOVE = "POST /api/stamps/%s/users/delete";

}
