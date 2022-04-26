package com.disu.a10119239latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

//  Ketika menekan "back", aplikasi akan langsung keluar
    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}

/*
    Tanggal     : Selasa, 26 April 2022
    Deskripsi   : Set Activity untuk form Home
    NIM         : 10119239
    Nama        : Dea Inesia Sri Utami
    Kelas       : IF6
*/