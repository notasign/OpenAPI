package com.notasign.open.api.stratey;

import com.notasign.open.api.exception.ApiException;
import com.notasign.open.api.utils.json.JacksonUtil;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author Nota
 * 2021/9/8 16:32:01
 */
public class DefaultJsonStrategy implements JsonStrategy {

    @Override
    public String toJson(Object object) throws ApiException {
        return JacksonUtil.toJson(object);
    }

    @Override
    public <T> T toJavaBean(String json, ParameterizedType parameterizedType) throws ApiException {
        return JacksonUtil.toJavaBean(json, parameterizedType);
    }

    @Override
    public <T> T toJavaBean(String json, Class<T> clzz) throws ApiException {
        return JacksonUtil.toJavaBean(json, clzz);
    }

    @Override
    public <T> List<T> toList(String json, Class<T> clzz) throws ApiException {
        return JacksonUtil.toList(json, clzz);
    }
}
