package com.example.animaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.animaciones.automaticas.Automaticas;

public class MainActivity extends AppCompatActivity {
    Button animacionAut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animacionAut = findViewById(R.id.button1);
        animacionAut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Automaticas.class);
                startActivity(intent);
            }
        });
    }
}