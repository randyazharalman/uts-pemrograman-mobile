package com.example.utspemrogramanmobilerandy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toolbar;

public class Tentang_Aplikasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_aplikasi);
//        getActionBar().setTitle(Html.fromHtml("<font color=\"red\">"+"getString(R.string.app_name)" + "</font>"));
        getSupportActionBar().setTitle("Tentang Aplikasi");
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