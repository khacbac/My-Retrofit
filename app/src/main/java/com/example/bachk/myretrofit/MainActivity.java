package com.example.bachk.myretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.widget.TextView;

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
        retrofit2.Call<ResponseBody> getAllData = ApiUtils.getApiServer().getAllData("public/userLogin?user_name=benzamil&password=123456&udid=123456");
        getAllData.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(retrofit2.Call<ResponseBody> call, Response<ResponseBody> response) {
//                List<Data> dataList = response.body();
//                for (int i = 0; i < dataList.size(); i++) {
//                    strBD.append(dataList.get(i).getUserName()).append("\n");
//                }
//                txtShow.setText(strBD.toString());
                try {
                    Log.d(TAG, "onResponse: data = " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}
