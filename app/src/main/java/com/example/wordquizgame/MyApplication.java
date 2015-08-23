package com.example.wordquizgame;

import android.app.Application;

/**
 * Created by promlert on 22/8/2558.
 */
public class MyApplication extends Application {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String d) {
        data = d;
    }
}
