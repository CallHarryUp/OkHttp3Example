package com.wen_wen.okhttp3demo;

/**
 * Created by wen_wen on 2018/4/10.
 * 请求方式
 */

public interface IHttpClient {
    /**
     * 持有IRequest的依赖 ，是否使用缓存(可配置)
     * @param request
     * @param froceCache
     */
    IResponse get(IRequest request, boolean froceCache);

    IResponse post(IRequest request, boolean forceCache);
}
