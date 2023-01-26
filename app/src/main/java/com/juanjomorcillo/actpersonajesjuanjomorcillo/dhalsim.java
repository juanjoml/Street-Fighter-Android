package com.juanjomorcillo.actpersonajesjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class dhalsim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhalsim);
        this.setTitle("Dhalsim");
    }

    public void funcionCerrar(View view) {

        finish();
    }
}