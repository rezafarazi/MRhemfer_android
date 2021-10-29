package com.tu.az.rezafta.mrhemfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mats extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mats);
        tv=(TextView)findViewById(R.id.textView);
        Intent oi=getIntent();
        tv.setText(oi.getExtras().getString("reza"));
    }
}
