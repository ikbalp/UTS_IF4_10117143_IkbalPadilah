package com.ikbalp.introscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

/*
     Selasa, 5 Mei 2020
     Ikbal Padilah
     10117143 - IF4
*/

public class SplashScreen extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent SplashScreen=new Intent(SplashScreen.this, IntroActivity.class);
                startActivity(SplashScreen);
                finish();

            }
        },waktu_loading);

        // hide the action bar

        getSupportActionBar().hide();

    }
}

