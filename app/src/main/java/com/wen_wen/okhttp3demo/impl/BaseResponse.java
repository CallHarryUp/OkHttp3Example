package com.wen_wen.okhttp3demo.impl;

import com.wen_wen.okhttp3demo.IResponse;

/**
 * Created by wen_wen on 2018/4/10.
 */

public class BaseResponse implements IResponse {
    public static final int UNKNOW_ERROR = 0000001;
    //响应码
    private int code;
    //响应数据
    private String data;

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getData() {
        return data;
    }
}
