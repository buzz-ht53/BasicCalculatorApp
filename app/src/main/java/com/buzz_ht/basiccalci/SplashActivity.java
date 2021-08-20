package com.buzz_ht.basiccalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        music= MediaPlayer.create(SplashActivity.this,R.raw.bell);
        music.start();

        Thread t= new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);

                } catch (Exception e) {
                    //message
                } finally {

                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
                }
            }
        };
        t.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        music.stop();
    }
}