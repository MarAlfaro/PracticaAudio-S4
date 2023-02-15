package com.yancy.pruebaaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Spanish extends AppCompatActivity {
    MediaPlayer reproductor;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish);

        img1 = findViewById(R.id.negro);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(Spanish.this, R.raw.negro);
                reproductor.start();
            }
        });

        img2 = findViewById(R.id.celeste);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(Spanish.this, R.raw.azul);
                reproductor.start();
            }
        });

        img3 = findViewById(R.id.marron);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(Spanish.this, R.raw.cafe);
                reproductor.start();

            }
        });

        img4 = findViewById(R.id.gris);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(Spanish.this, R.raw.gris);
                reproductor.start();
            }
        });

        img5 = findViewById(R.id.verde);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(Spanish.this, R.raw.verde);
                reproductor.start();
            }
        });

        img6 = findViewById(R.id.anaranjado);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(Spanish.this, R.raw.anaranjado);
                reproductor.start();
            }
        });

        img7 = findViewById(R.id.rosado);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(Spanish.this, R.raw.rosado);
                reproductor.start();
            }
        });

        img8 = findViewById(R.id.rojo);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(Spanish.this, R.raw.rojo);
                reproductor.start();
            }
        });

        img9 = findViewById(R.id.morado);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(Spanish.this, R.raw.violeta);
                reproductor.start();
            }
        });

        img10 = findViewById(R.id.amarillo);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(Spanish.this, R.raw.amarillo);
                reproductor.start();
            }
        });
    }
}