package com.example.animaciones.automaticas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.animaciones.R;

public class Automaticas extends AppCompatActivity {
    Button btnSet;
    TextView txtSet;
    Boolean isVisitble= true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automaticas);
        btnSet = findViewById(R.id.button);
        txtSet = findViewById(R.id.textView);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isVisitble){
                    txtSet.setVisibility(View.GONE);
                }else{
                    txtSet.setVisibility(View.VISIBLE);
                }
                isVisitble =!isVisitble;
            }
        });
    }
}