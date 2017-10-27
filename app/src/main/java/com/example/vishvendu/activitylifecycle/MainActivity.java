package com.example.vishvendu.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Lifecycle onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Lifecycle onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Lifecycle onStop");
        //when I call finish here onDestroy gets called otherwise it will get call only
        //when device is out of memory and wants to release some resources
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Lifecycle onDestroy");
    }


    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Lifecycle onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Lifecycle onResume");
    }
}
