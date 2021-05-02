package com.example.e_rec;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class thankyou extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        getSupportActionBar().hide();
 //timming
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {

            public void run() {

                //here you can start your Activity B.
                startActivity(new Intent(com.example.e_rec.thankyou.this, signup.class));

            }

        }, 5000);
    }
}
