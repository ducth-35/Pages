package com.realinet.fanpagemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT =5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, LoginActivity.class);
                Toast.makeText(Splash.this,"Wellcom", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}