package com.example.animaciones.drawables;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.animaciones.R;
/*
* Este tipo de animacion se trata de unir varias imagenes en un drawable animation para animar
* frame por frame
* */
public class DrawablesActivity extends AppCompatActivity {
    ImageView ivCheck;
    //esto va hacer la animacion
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawables);

        ivCheck = findViewById(R.id.imageView);
        //le metemos la animacion
        ivCheck.setBackgroundResource(R.drawable.animacion_chek);
//cogemos la animacion y la metemos aqui para tomar el control de la animacion
        animationDrawable = (AnimationDrawable) ivCheck.getBackground();
//tomamos el img que cuando le uncan click se va a animar
        ivCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.start();
            }
        });
    }
}