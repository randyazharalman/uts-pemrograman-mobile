package com.example.utspemrogramanmobilerandy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Tujuan_Pembelajaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuan_pembelajaran);
        getSupportActionBar().setTitle("Tujuan Pembelajaran");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
//        getSupportActionBar().hide(); // hide the title bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
////        toolbar.setTitleTextColor(getResources().getColor(R.color.black));


    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}