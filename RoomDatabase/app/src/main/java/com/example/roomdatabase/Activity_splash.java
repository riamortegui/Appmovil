package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Activity_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                    Intent intent = new Intent(Activity_splash.this, Activity_Menu.class);
                    startActivity(intent);
                    finish();
                }
            };

            Timer tiempo = new Timer();
            tiempo.schedule(tarea, 4000);


        }
    }
