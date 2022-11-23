package com.example.utspemrogramanmobilerandy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class Kata_Kunci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_kunci);
        getSupportActionBar().setTitle("Kata Kunci");
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