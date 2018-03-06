package com.example.usuariodam.jorgediazmaroto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Usuario DAM on 06/03/2018.
 */

public class LogingActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loging);
        btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogingActivity.this, MainPrincipal.class);
                startActivity(intent);
                /*Thread timerTread = new Thread() {
                    public void run() {
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } finally {
                            Intent intent = new Intent(LogingActivity.this, MainPrincipal.class);
                            startActivity(intent);
                        }
                    }
                };
                timerTread.start();*/
            }
        });
    }

}
