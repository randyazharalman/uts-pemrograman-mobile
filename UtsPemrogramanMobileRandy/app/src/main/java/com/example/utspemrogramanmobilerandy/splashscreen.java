package com.example.utspemrogramanmobilerandy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {
    private static int DELAY_TIME = 4000;

    Animation topAnim, botAnim;
    ImageView imageView;
    TextView mobi, le, arning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        botAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        imageView = findViewById(R.id.imgsplash);
        mobi = findViewById(R.id.mobi);
        le = findViewById(R.id.le);
        arning = findViewById(R.id.arning);

        imageView.setAnimation(topAnim);
        mobi.setAnimation(botAnim);
        le.setAnimation(botAnim);
        arning.setAnimation(botAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent main = new Intent(splashscreen.this,MainActivity.class);
                startActivity(main);
                finish();
            }
        },DELAY_TIME);

    }
}