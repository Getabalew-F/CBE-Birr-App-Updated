package com.example.navdrawerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash extends AppCompatActivity {
    private static int SPLASH_SCREEN = 3000;

    ImageView logo, appName, splashImg;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);


        logo = findViewById(R.id.logo);
        lottieAnimationView = findViewById(R.id.lottie);

        logo.animate().translationY(-1600).setDuration(1000).setStartDelay(2000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, OnBoarding.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);
    }
}