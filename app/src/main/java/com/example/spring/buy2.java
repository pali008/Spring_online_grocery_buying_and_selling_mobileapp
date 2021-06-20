package com.example.spring;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class buy2 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy2);

        ImageButton button = findViewById(R.id.imageButton6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opener();
            }
        });

        ImageButton button1 = findViewById(R.id.imageButton5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opener1();
            }
        });

        ImageButton button2 = findViewById(R.id.imageButton4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opener1();
            }
        });

        ImageButton button3 = findViewById(R.id.imageButton7);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opener1();
            }
        });

        ImageButton button4 = findViewById(R.id.imageButton8);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opener1();
            }
        });

        ImageButton button5 = findViewById(R.id.imageButton9);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opener1();
            }
        });



    }
    public void opener() {
        Intent intent = new Intent(this, buydetail.class);
        startActivity(intent);

        }

    public void opener1() {
        Intent intent = new Intent(this, buypay.class);
        startActivity(intent);

    }
}


