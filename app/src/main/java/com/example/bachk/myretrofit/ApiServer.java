package com.example.bachk.myretrofit;

import android.provider.SyncStateContract;

import com.example.bachk.myretrofit.octuan.DataList;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by bachk on 1/31/2018.
 */

public interface ApiServer {
    @GET
    Call<List<DataList>> getAllData(@Url String url);

//    @GET
//    Call<ResponseBody> getAllData(@Url String url);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constants.URL_HOME)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
