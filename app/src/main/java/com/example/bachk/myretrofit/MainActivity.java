package com.example.bachk.myretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.widget.TextView;

import com.example.bachk.myretrofit.octuan.DataList;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtShow = findViewById(R.id.txtShow);
        final StringBuilder strBD = new StringBuilder();
        retrofit2.Call<List<DataList>> getAllData = ApiUtils.getApiServer().getAllData("public/userLogin?user_name=benzamil&password=123456&udid=123456");
        getAllData.enqueue(new Callback<List<DataList>>() {
            @Override
            public void onResponse(retrofit2.Call<List<DataList>> call, Response<List<DataList>> response) {
                List<DataList> exampleList = response.body();
                for (DataList dataList : exampleList) {
                    Log.d(TAG, "onResponse: meta = " + dataList.getMeta().toString());
                    Log.d(TAG, "onResponse: response = " + dataList.getResponse().toString());
                }
            }

            @Override
            public void onFailure(retrofit2.Call<List<DataList>> call, Throwable t) {
            }
        });
    }
}
