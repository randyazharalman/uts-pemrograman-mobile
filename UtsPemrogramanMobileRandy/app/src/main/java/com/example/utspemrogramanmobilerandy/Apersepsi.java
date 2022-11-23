package com.example.utspemrogramanmobilerandy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class Apersepsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apersepsi);
        getSupportActionBar().setTitle("Apersepsi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;

    }

}