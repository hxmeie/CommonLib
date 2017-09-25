package com.hxm.httplib_rxjava2.library.converter;

import com.google.gson.TypeAdapter;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by hxm on 2017/4/13.
 * 数据转换
 */
public class ResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final TypeAdapter<T> adapter;

    ResponseBodyConverter(TypeAdapter<T> adapter) {
        this.adapter = adapter;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        //如果数据需要处理，在这里进行（如对数据的解密）
        String result = value.toString();
        return adapter.fromJson(result);
    }
}
