package com.juanjomorcillo.actpersonajesjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class vega extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vega);
        this.setTitle("Vega");
    }

    public void funcionCerrar(View view) {

        finish();
    }
}