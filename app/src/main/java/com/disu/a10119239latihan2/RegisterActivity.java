package com.disu.a10119239latihan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

//      Set Toolbar dengan back button bertitle "Register"
        Toolbar registerToolbar = (Toolbar) findViewById(R.id.toolbar_register);
        setSupportActionBar(registerToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Register");

//      Set Dropdown untuk "Blood Type"
        Spinner dropdown_blood = findViewById(R.id.spinner_blood);
        String[] blood = new String[]{"Blood Type", "A", "B", "AB", "O"};
        ArrayAdapter<String> blood_adapter = new ArrayAdapter<String>(this, R.layout.spinner,blood);
        dropdown_blood.setAdapter(blood_adapter);

//      Set Dropdown untuk "Rhesus"
        Spinner dropdown_rhesus = findViewById(R.id.spinner_rhesus);
        String[] rhesus = new String[]{"Rhesus", "+", "-"};
        ArrayAdapter<String> rhesus_adapter = new ArrayAdapter<String>(this, R.layout.spinner,rhesus);
        dropdown_rhesus.setAdapter(rhesus_adapter);

//      Set Dropdown untuk "Job"
        Spinner dropdown_job = findViewById(R.id.spinner_job);
        String[] job = new String[]{"Job", "Civil Engineer", "IT Manager"};
        ArrayAdapter<String> job_adapter = new ArrayAdapter<String>(this, R.layout.spinner,job);
        dropdown_job.setAdapter(job_adapter);

//      Set Button "Register" dengan kondisi terms and conditions harus bernilai true untuk dapat pindah activity
        Button regisButton = findViewById(R.id.button_finish_register);
        CheckBox agreement = findViewById(R.id.checkbox);
        regisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AlmostThereIntent = new Intent(RegisterActivity.this, AlmostThereActivity.class);

                if(agreement.isChecked() == false) {
                    Toast.makeText(RegisterActivity.this, "Anda belum menyetujui terms dan conditions", Toast.LENGTH_LONG).show();
                } else {
                    startActivity(AlmostThereIntent);
                }
            }
        });
    }
}

/*
    Tanggal     : Selasa, 26 April 2022
    Deskripsi   : Set class RegisterActivity untuk form Register
    NIM         : 10119239
    Nama        : Dea Inesia Sri Utami
    Kelas       : IF6
*/