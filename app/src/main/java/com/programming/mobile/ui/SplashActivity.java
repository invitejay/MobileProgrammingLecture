package com.programming.mobile.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent;
        if (checkFirstTime()) {
            intent = new Intent(SplashActivity.this, MainActivity.class);
        } else {
            intent = new Intent(SplashActivity.this, InputActivity.class);
        }
        startActivity(intent);
        finish();
    }

    private Boolean checkFirstTime() {
        /*String shared = "howTo";
        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        return sharedPreferences.getBoolean("firstTime", false);*/
        return true;
    }

    //뒤로가기 안눌리게
    @Override
    public void onBackPressed() {

    }
}