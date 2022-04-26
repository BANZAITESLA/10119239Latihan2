package com.disu.a10119239latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

//      Set Button Send pada form Verify untuk dapat mengalihkan user ke form Home
        Button sendButton = findViewById(R.id.button_send);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent(VerifyActivity.this,HomeActivity.class);
                startActivity(sendIntent);
            }
        });
    }
}

/*
    Tanggal     : Selasa, 26 April 2022
    Deskripsi   : Set class VerifyActivity untuk form Verify
    NIM         : 10119239
    Nama        : Dea Inesia Sri Utami
    Kelas       : IF6
*/