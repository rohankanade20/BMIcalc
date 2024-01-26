package com.example.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);


        Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        txt1.setAnimation(move);

        Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        txt2.setAnimation(rotate);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {



                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);

                    finish();


            }
                },4000);


    }
}
