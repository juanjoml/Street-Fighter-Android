package com.juanjomorcillo.actpersonajesjuanjomorcillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivLogo;
    ImageView ivLogo2;
    ImageView ivRyu;
    ImageView ivVega;
    ImageView ivBison;
    ImageView ivChunLi;
    ImageView ivDhalsim;
    float escalaX = 0.1f;
    float escalaY =0.1f;
    int contColor=0;
    int contPersonajes=0;
    HorizontalScrollView hsview2;
    View vPrincipal;
    Drawable dfondo;
    int contFondo=0;
    int contEscalas=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Street Fighter II");
        ivLogo = (ImageView)findViewById(R.id.imageViewLogo);
        ivLogo2 = (ImageView)findViewById(R.id.imageViewLogo2);
        ivRyu = (ImageView)findViewById(R.id.imageViewRyu);
        ivVega = (ImageView)findViewById(R.id.imageViewVega);
        ivBison = (ImageView)findViewById(R.id.imageViewBison);
        ivChunLi = (ImageView)findViewById(R.id.imageViewChunLi);
        ivDhalsim = (ImageView)findViewById(R.id.imageViewDhalsim);
        hsview2 = (HorizontalScrollView)findViewById(R.id.horizontalScrollView2);
        vPrincipal = (View)findViewById(R.id.viewPrincipal);
    }


    public void funcionRyu(View view) {

        ivLogo.setImageResource(R.drawable.ryu);
        contPersonajes=1;
    }

    public void funcionVega(View view) {

        ivLogo.setImageResource(R.drawable.vega);
        contPersonajes=2;
    }

    public void funcionBison(View view) {

        ivLogo.setImageResource(R.drawable.bison);
        contPersonajes=3;
    }

    public void funcionChunLi(View view) {

        ivLogo.setImageResource(R.drawable.chunli);
        contPersonajes=4;
    }

    public void funcionDhalsim(View view) {

        ivLogo.setImageResource(R.drawable.dhalsim);
        contPersonajes=5;
    }

    public void funcionLogo(View view) {

        ivLogo.setImageResource(R.drawable.logo);
    }

    public void funcionOriginal(View view) {

        switch(contEscalas){

            case 0:
                ivLogo.setScaleType(ImageView.ScaleType.FIT_START);
                Toast.makeText(this, "Fit Start", Toast.LENGTH_SHORT).show();
                contEscalas++;
                break;
            case 1:
                ivLogo.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Toast.makeText(this, "Fit Center", Toast.LENGTH_SHORT).show();
                contEscalas++;
                break;
            case 2:
                ivLogo.setScaleType(ImageView.ScaleType.FIT_END);
                Toast.makeText(this, "Fit End", Toast.LENGTH_SHORT).show();
                contEscalas++;
                break;
            case 3:
                ivLogo.setScaleType(ImageView.ScaleType.FIT_XY);
                Toast.makeText(this, "Fit XY", Toast.LENGTH_SHORT).show();
                contEscalas=0;
                break;
        }
    }

    public void funcionAumentarAlto(View view) {

        if (escalaY>=2.0f){
            escalaY=2.0f;
            ivLogo.setScaleY(escalaY);
        }else{
            escalaY +=0.1f;
            ivLogo.setScaleY(escalaY);
            Toast.makeText(this, "Escala: "+escalaY, Toast.LENGTH_SHORT).show();
        }
    }

    public void funcionDisminuirAlto(View view) {

        if (escalaY<=0.0f){
            escalaY=0.0f;
            ivLogo.setScaleY(escalaY);
        }else{
            escalaY -=0.1f;
            ivLogo.setScaleY(escalaY);
            Toast.makeText(this, "Escala: "+escalaY, Toast.LENGTH_SHORT).show();
        }
    }

    public void funcionAumentarAncho(View view) {

        if (escalaX>=2.0f){
            escalaX=2.0f;
            ivLogo.setScaleX(escalaX);
        }else{
            escalaX +=0.1f;
            ivLogo.setScaleX(escalaX);
            Toast.makeText(this, "Escala: "+escalaX, Toast.LENGTH_SHORT).show();
        }
    }

    public void funcionDisminuirAncho(View view) {

        if (escalaX<=0.0f){
            escalaX=0.0f;
            ivLogo.setScaleX(escalaX);
        }else{
            escalaX -=0.1f;
            ivLogo.setScaleX(escalaX);
            Toast.makeText(this, "Escala: "+escalaX, Toast.LENGTH_SHORT).show();
        }
    }


    public void funcionOcultarPersonajes(View view) {

        ivRyu.setVisibility(View.GONE);
        ivVega.setVisibility(View.GONE);
        ivBison.setVisibility(View.GONE);
        ivChunLi.setVisibility(View.GONE);
        ivDhalsim.setVisibility(View.GONE);
        ivLogo2.setVisibility(View.GONE);
        hsview2.setVisibility(View.VISIBLE);
    }

    public void funcionMostrarPersonajes(View view) {

        ivRyu.setVisibility(View.VISIBLE);
        ivVega.setVisibility(View.VISIBLE);
        ivBison.setVisibility(View.VISIBLE);
        ivChunLi.setVisibility(View.VISIBLE);
        ivDhalsim.setVisibility(View.VISIBLE);
        ivLogo2.setVisibility(View.VISIBLE);
        hsview2.setVisibility(View.GONE);
    }

    public void funcionCambiarFondo(View view) {

        if (contFondo==0){

            dfondo = getResources().getDrawable(R.drawable.fondonuevo);
            vPrincipal.setBackground(dfondo);
            contFondo++;
        }
        else{

            dfondo = getResources().getDrawable(R.drawable.fondo);
            vPrincipal.setBackground(dfondo);
            contFondo=0;
        }
    }

    public void funcionGaleria(View view) {

        Intent cargarGaleria = new Intent(this,  galeria.class);
        startActivity(cargarGaleria);
    }

    public void funcionColor(View view) {

        switch(contColor){

            case 0:
                ivLogo.setColorFilter(Color.argb(0, 255, 255, 255));
                contColor++;
                break;
            case 1:
                ivLogo.setColorFilter(Color.argb(120, 255, 255, 0));
                contColor++;
                break;
            case 2:
                ivLogo.setColorFilter(Color.argb(120, 255, 0, 0));
                contColor++;
                break;
            case 3:
                ivLogo.setColorFilter(Color.argb(120, 0, 255, 0));
                contColor++;
                break;
            case 4:
                ivLogo.setColorFilter(Color.argb(120, 87, 91, 245));
                contColor=0;
                break;
        }
    }

    public void funcionInformacionPersonajes(View view) {

        switch (contPersonajes){

            case 1:
                Intent cargarRyu = new Intent (this, ryu.class);
                startActivity(cargarRyu);
                break;

            case 2:
                Intent cargarVega = new Intent (this, vega.class);
                startActivity(cargarVega);
                break;

            case 3:
                Intent cargarBison = new Intent (this, bison.class);
                startActivity(cargarBison);
                break;

            case 4:
                Intent cargarChunLi = new Intent (this, chunli.class);
                startActivity(cargarChunLi);
                break;

            case 5:
                Intent cargarDhalsim = new Intent (this, dhalsim.class);
                startActivity(cargarDhalsim);
                break;
        }
    }
}