package com.davidmcasas.juegosremotos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botonTetris(View view) {
        cargarWebActivity("https://davidmcasas.com/proyectos/Juegos/Tetris/tetris.html");
    }

    public void botonBuscaminas(View view) {
        cargarWebActivity("https://davidmcasas.com/proyectos/Juegos/Buscaminas/buscaminas.html");
    }

    public void botonSerpiente(View view) {
        cargarWebActivity("https://davidmcasas.com/proyectos/Juegos/Serpiente/serpiente.html");
    }

    private void cargarWebActivity(String url) {
        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra("url", url);
        this.startActivity(intent);
    }
}