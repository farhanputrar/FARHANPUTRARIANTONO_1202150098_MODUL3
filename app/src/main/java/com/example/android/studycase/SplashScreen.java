package com.example.android.studycase;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private static int Splash=4000; //menentukan berapa lama splash di home screen akan berlangsung (4000ms = 4 detik)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Login.class);//
                startActivity(intent);
                finish(); //pindah ke activity lain
            }
        },Splash);
    }
}
