package com.example.dell.r_view_demo.model;

/**
 * Created by DELL on 12/5/2016.
 */

//The JSON response has a only JSON object “android” with child JSON array.
// This child JSON array can be stored in AndroidVersion model class.
// In our JSONResponse model class create a AndroidVersion array variable named “android” and generate getter.

public class JSONResponse {

    private AndroidVersion[] android;

    public AndroidVersion[] getAndroid() {
        return android;
    }
}
