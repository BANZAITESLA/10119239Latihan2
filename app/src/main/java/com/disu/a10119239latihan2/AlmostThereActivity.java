package com.disu.a10119239latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);

//      Set Button Verify pada form Almost There untuk dapat mengalihkan user ke form Verify
        Button verifyButton = findViewById(R.id.button_verify);
        verifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verifyIntent = new Intent(AlmostThereActivity.this,VerifyActivity.class);
                startActivity(verifyIntent);
            }
        });
    }
}

/*
    Tanggal     : Selasa, 26 April 2022
    Deskripsi   : Set Activity untuk form Almost There
    NIM         : 10119239
    Nama        : Dea Inesia Sri Utami
    Kelas       : IF6
*/