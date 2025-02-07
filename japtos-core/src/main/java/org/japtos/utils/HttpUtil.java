package org.japtos.utils;

import okhttp3.*;
import org.japtos.enums.ModeEnum;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * @Author happyboy
 * @Description this http util
 * @Date 2024/7/8 09:39
 **/
public class HttpUtil {

    private static enum RequestModeEnum {
        GET("get"), POST("post");
        private String method;

        RequestModeEnum(String method) {
            this.method = method;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }
    }

    private static OkHttpClient client = new OkHttpClient();

    /**
     * get request
     *
     * @param url request url
     */
    public static Response get(String url, HashMap<String, String> requestParams) {
        return request(RequestModeEnum.GET, url, requestParams);
    }

    /**
     * get request
     *
     * @param url           request url
     * @param requestParams request params
     */
    public static Response post(String url, HashMap<String, String> requestParams) {
        return request(RequestModeEnum.POST, url, requestParams);
    }


    /**
     * send http request
     *
     * @param requestModeEnum request method enum
     * @param url             url
     * @param params          parameters
     * @return result
     */
    private static Response request(RequestModeEnum requestModeEnum, String url, HashMap<String, String> params) {

        if (requestModeEnum == null) {
            throw new RuntimeException("method must not be null");
        }
        if (url == null) {
            throw new RuntimeException("url must not be null");
        }
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        if (params != null) {
            params.entrySet().stream().forEach(entry -> {
                httpBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            });
        }
        Request request = new Request.Builder()
                .url(httpBuilder.build())
                .method(requestModeEnum.method, new FormBody.Builder().build())
                .build();
        try {
            OkHttpClient client = new OkHttpClient.Builder()
                    .readTimeout(20, TimeUnit.SECONDS)
                    .build();
            Response response = client.newCall(request).execute();
            return response;
        } catch (IOException e) {
            return null;
        }
    }

}
