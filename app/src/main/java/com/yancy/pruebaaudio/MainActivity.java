package com.yancy.pruebaaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnEspañol, btnIngles;
    MediaPlayer musica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEspañol = findViewById(R.id.btnSpanish);
        btnEspañol.setOnClickListener(this);
        btnIngles = findViewById(R.id.btnEnglish);
        btnIngles.setOnClickListener(this);
        musica = MediaPlayer.create(MainActivity.this, R.raw.fondo);
        musica.start();
        musica.getCurrentPosition();


    }

    public void onClick(View view) {
        int id = view.getId();
        if (id==R.id.btnEnglish) {
            Intent intent = new Intent(MainActivity.this, English.class);
            startActivity(intent);
        }else if(id==R.id.btnSpanish){
            Intent intent = new Intent(MainActivity.this, Spanish.class);
            startActivity(intent);
        }
    }
}