package com.example.spring;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class salelist extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    String st1;
    String st2;
    String st3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salelist);

        tv1 = findViewById(R.id.textView33);
        tv2 = findViewById(R.id.textView34);
        tv3 = findViewById(R.id.textView35);

        st1 = Objects.requireNonNull(getIntent().getExtras()).getString("value1");
        st2 = getIntent().getExtras().getString("value2");
        st3 = getIntent().getExtras().getString("value3");

        tv1.setText(st1);
        tv2.setText(st2);
        tv3.setText(st3);
    }
}