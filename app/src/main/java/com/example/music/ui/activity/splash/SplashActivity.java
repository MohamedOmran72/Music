package com.example.music.ui.activity.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.music.R;
import com.example.music.ui.activity.BaseActivity;
import com.example.music.ui.activity.home.HomeActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1500);
    }

    @Override
    public void onBackPressed() {
        superBackPressed();
    }
}
