package com.example.animaciones.crossfade;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.animaciones.R;
/*
* Animacion para poner contenido cuando se cargue
* */
public class CrossfadeActivity extends AppCompatActivity {
    TextView tvContenido;
    ProgressBar pbLoading;

    private int duracionAnimacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossfade);

        tvContenido = findViewById(R.id.textView2);

        pbLoading = findViewById(R.id.progressBar);
    //int de android para animaciones cortas
        duracionAnimacion =  getResources().getInteger(android.R.integer.config_shortAnimTime);

        //ocultar texto
        tvContenido.setVisibility(View.GONE);
        
        pbLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crossFadeAnimatio();
            }
        });

    }

    //metodo para animacion
    private  void crossFadeAnimatio(){
        //ponemos eso trasparente
        tvContenido.setAlpha(0f);
        //lo mostramos
        tvContenido.setVisibility(View.VISIBLE);
        //y lo mandamos a animar
        tvContenido.animate()
                .alpha(1f)
                .setDuration(duracionAnimacion);
        //ocuyltrar prograssbar
        pbLoading.animate()
                .alpha(0f)
                .setDuration(duracionAnimacion)
                //escuchar cuando la animacion termine
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        //super.onAnimationEnd(animation);
                        pbLoading.setVisibility(View.GONE);
                    }
                });
    }
}