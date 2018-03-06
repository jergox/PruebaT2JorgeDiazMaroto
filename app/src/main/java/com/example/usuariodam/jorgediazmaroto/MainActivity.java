package com.example.usuariodam.jorgediazmaroto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = (ImageView) findViewById(R.id.imageView2);
        Animation animate = AnimationUtils.loadAnimation(this, R.anim.rotate_animatio1);
        imagen.startAnimation(animate);

        Thread timerTread = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(MainActivity.this, LogingActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerTread.start();
    }
    }
