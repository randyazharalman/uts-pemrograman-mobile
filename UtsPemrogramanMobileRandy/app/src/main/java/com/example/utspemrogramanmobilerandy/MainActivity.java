package com.example.utspemrogramanmobilerandy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);

        Button btn_tujuan_pembelajaran = findViewById(R.id.btnTujuanPembelajaran);
        Button btn_pertanyaan_pemantik = findViewById(R.id.btnPertanyaanPemantik);
        Button btn_peta_konsep = findViewById(R.id.btnPetaKonsep);
        Button btn_apersepsi = findViewById(R.id.btnApersepsi);
        Button btn_materi = findViewById(R.id.btnMateri);
        Button btn_kata_kunci = findViewById(R.id.btnKataKunci);
        Button btn_tentang_aplikasi = findViewById(R.id.btnTentangAplikasi);

        btn_tujuan_pembelajaran.setOnClickListener(this);
        btn_pertanyaan_pemantik.setOnClickListener(this);
        btn_peta_konsep.setOnClickListener(this);
        btn_apersepsi.setOnClickListener(this);
        btn_kata_kunci.setOnClickListener(this);
        btn_materi.setOnClickListener(this);
        btn_tentang_aplikasi.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnTujuanPembelajaran:
                moveToTujuanPembelajaran();
                break;
            case R.id.btnPertanyaanPemantik:
                moveToPertanyaanPemantik();
                break;
            case R.id.btnPetaKonsep:
                moveToPetaKonsep();
                break;
            case R.id.btnApersepsi:
                moveToApersepsi();
                break;
            case R.id.btnKataKunci:
                moveToKataKunci();
                break;
            case R.id.btnMateri:
                moveToMateri();
                break;
            case R.id.btnTentangAplikasi:
                moveToTentangAplikasi();
                break;
        }
    }
    public void moveToTujuanPembelajaran(){
        Intent intent = new Intent(MainActivity.this,Tujuan_Pembelajaran.class);
        startActivity(intent);
    }
    public void moveToPertanyaanPemantik(){
        Intent intent = new Intent(MainActivity.this,Pertanyaan_Pemantik.class);
        startActivity(intent);
    }
    public void moveToPetaKonsep(){
        Intent intent = new Intent(MainActivity.this,Peta_Konsep.class);
        startActivity(intent);
    }
    public void moveToApersepsi(){
        Intent intent = new Intent(MainActivity.this,Apersepsi.class);
        startActivity(intent);
    }
    public void moveToKataKunci(){
        Intent intent = new Intent(MainActivity.this,Kata_Kunci.class);
        startActivity(intent);
    }
    public void moveToMateri(){
        Intent intent = new Intent(MainActivity.this,Materi.class);
        startActivity(intent);
    }
    public void moveToTentangAplikasi(){
        Intent intent = new Intent(MainActivity.this,Tentang_Aplikasi.class);
        startActivity(intent);
    }
}