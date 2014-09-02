package com.example.Demo;

import android.app.Activity;
import android.app.Service;
import android.os.Bundle;

import java.util.ServiceLoader;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
}
