package com.wen_wen.okhttp3demo;

import com.wen_wen.okhttp3demo.impl.BaseRequest;
import com.wen_wen.okhttp3demo.impl.OkHttpClientImpl;

import org.junit.Test;

/**
 * Created by wen_wen on 2018/4/10.
 */

public class TestOkHttp3 {
    @Test
    public void testOkHttp3() {

        final OkHttpClientImpl httpClient = new OkHttpClientImpl();
        final IRequest request = new BaseRequest("https://github.com/");
        IResponse response = httpClient.get(request, false);
        System.out.println("响应数据：" + response.getData());

    }
}
