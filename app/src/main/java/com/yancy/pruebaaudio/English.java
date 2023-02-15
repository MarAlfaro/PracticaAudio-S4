package com.yancy.pruebaaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class English extends AppCompatActivity {
    MediaPlayer reproductor;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        img1 = findViewById(R.id.negro);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(English.this, R.raw.black);
                reproductor.start();
            }
        });

        img2 = findViewById(R.id.celeste);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(English.this, R.raw.blue);
                reproductor.start();
            }
        });

        img3 = findViewById(R.id.marron);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(English.this, R.raw.coffe);
                reproductor.start();
            }
        });

        img4 = findViewById(R.id.gris);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(English.this, R.raw.gray);
                reproductor.start();
            }
        });

        img5 = findViewById(R.id.verde);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(English.this, R.raw.green);
                reproductor.start();
            }
        });

        img6 = findViewById(R.id.anaranjado);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(English.this, R.raw.orange);
                reproductor.start();
            }
        });

        img7 = findViewById(R.id.rosado);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(English.this, R.raw.pink);
                reproductor.start();
            }
        });

        img8 = findViewById(R.id.rojo);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(English.this, R.raw.red);
                reproductor.start();
            }
        });
        img9 = findViewById(R.id.morado);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(English.this, R.raw.violet);
                reproductor.start();
            }
        });

        img10 = findViewById(R.id.amarillo);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproductor = MediaPlayer.create(English.this, R.raw.yelow);
                reproductor.start();
            }
        });
    }

}