package com.tictac;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent next=new Intent(Splash.this,MainActivity.class);
                startActivity(next);
                finish();

            }
        },4000);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }



}