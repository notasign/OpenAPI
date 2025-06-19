package com.notasign.open.api.utils.json;

import com.notasign.open.api.bean.base.ApiResponse;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Nota
 * 2021/9/8 16:09:38
 */
public class ParameterizedTypeBaseRes implements ParameterizedType {
    Class clazz;

    public ParameterizedTypeBaseRes(Class clz) {
        clazz = clz;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{clazz};
    }

    @Override
    public Type getRawType() {
        return ApiResponse.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}
