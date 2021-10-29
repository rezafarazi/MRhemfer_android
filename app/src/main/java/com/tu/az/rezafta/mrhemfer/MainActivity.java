package com.tu.az.rezafta.mrhemfer;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.CountDownLatch;

public class MainActivity extends AppCompatActivity {
CountDownTimer timer;
    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer=new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                a++;
                if(a==5)
                {
                    Intent intt=new Intent(MainActivity.this,Menu.class);
                    startActivity(intt);
                }
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
