package io.hzg.demo1.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class BlockControllerTest2 {
    @Test
    public void getRecentBlocks() throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://localhost:8080/block/getRecentBlocks")
                .build();
        Response response = okHttpClient.newCall(request).execute();
        String string = response.body().string();
        JSONArray jsonArray = JSON.parseArray(string);
        assertEquals(5,jsonArray.size());


    }
}
