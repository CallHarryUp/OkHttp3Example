package com.wen_wen.okhttp3demo;

/**
 * Created by wen_wen on 2018/4/10.
 * 接收网络实现层的返回结果
 */

public interface IResponse {
    /**
     * 状态码
     * @return
     */
    int  getCode();
    /**
     * 数据
     */
    String  getData();
}
