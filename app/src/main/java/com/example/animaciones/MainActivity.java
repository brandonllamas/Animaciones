package com.example.animaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.animaciones.automaticas.Automaticas;
import com.example.animaciones.crossfade.CrossfadeActivity;
import com.example.animaciones.drawables.DrawablesActivity;
import com.example.animaciones.lottie.LottieActivity;

public class MainActivity extends AppCompatActivity {
    Button animacionAut,animationDrawables,animationCrossfade,animacionLottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animacionAut = findViewById(R.id.button1);
        animationDrawables = findViewById(R.id.button2);
        animationCrossfade = findViewById(R.id.button2);
        animationCrossfade = findViewById(R.id.button3);
        animacionLottie = findViewById(R.id.button4);

        animacionAut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Automaticas.class);
                startActivity(intent);
            }
        });
        animationDrawables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), DrawablesActivity.class);
                startActivity(intent);
            }
        });
        animationCrossfade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), CrossfadeActivity.class);
                startActivity(intent);
            }
        });
        animacionLottie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), LottieActivity.class);
                startActivity(intent);
            }
        });
    }
}