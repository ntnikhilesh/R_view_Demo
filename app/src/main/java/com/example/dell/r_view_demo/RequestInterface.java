package com.example.dell.r_view_demo;

/**
 * Created by DELL on 12/5/2016.
 */

import com.example.dell.r_view_demo.model.JSONResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}