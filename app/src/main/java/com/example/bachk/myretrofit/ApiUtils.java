package com.example.bachk.myretrofit;

/**
 * Created by bachk on 1/31/2018.
 */

public class ApiUtils {
    public static ApiServer getApiServer() {
        return ApiServer.retrofit.create(ApiServer.class);
    }
}
