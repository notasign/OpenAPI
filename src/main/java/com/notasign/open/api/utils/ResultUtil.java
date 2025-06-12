package com.notasign.open.api.utils;


import com.notasign.open.api.bean.base.ApiResponse;
import com.notasign.open.api.exception.ApiException;
import com.notasign.open.api.stratey.JsonStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Fadada
 * 2021/9/8 16:09:38
 */
public class ResultUtil {

    private static final Logger log = LoggerFactory.getLogger(ResultUtil.class);

    private ResultUtil() {
    }

    /**
     * 打日志
     *
     * @param apiResponse      响应base
     * @param jsonStrategy 策率
     * @throws ApiException 异常
     */
    public static void printLog(ApiResponse apiResponse, JsonStrategy jsonStrategy) throws ApiException {
        String json = null;

        if (apiResponse != null) {
            json = jsonStrategy.toJson(apiResponse);
        }

        if (apiResponse != null && apiResponse.isSuccess()) {
            log.info("请求成功：{}", json);
        } else {
            log.info("请求失败：{}", json);
        }
    }

}
