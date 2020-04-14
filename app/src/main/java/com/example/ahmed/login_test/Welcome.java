package com.example.ahmed.login_test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;


public class Welcome extends AppCompatActivity {


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

    }
//this is on Click function number 1 for go to login Form Arabic
    public void loginForm1(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    //this is on Click function number 2 for go to login Form English
    public void loginForm2(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}