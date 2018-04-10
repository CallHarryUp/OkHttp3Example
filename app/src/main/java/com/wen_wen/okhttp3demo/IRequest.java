package com.wen_wen.okhttp3demo;

import java.util.Map;

/**
 * Created by wen_wen on 2018/4/10.
 * 请求数据封装方式
 */

public interface IRequest {
    String POST = "POST";
    String GET = "GET";

    /**
     * 请求方式
     *
     * @param method
     */
    void setMethod(String method);

    /**
     * 请求头
     *
     * @param key
     * @param value
     */
    void setHeader(String key, String value);

    /**
     * 请求体
     *
     * @param key
     * @param value
     */
    void setBody(String key, String value);

    /**
     * 执行URL
     *
     * @return
     */
    String getUrl();

    Map<String,String>  getHeader();

    /**
     * 提供执行库请求参数
     */

    Object getBody();
}
