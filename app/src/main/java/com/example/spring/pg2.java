package com.example.spring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg2);

        ImageButton button = findViewById(R.id.imageButton2);
        ImageButton hbutton = findViewById(R.id.imageButton);
        ImageButton sellbutton = findViewById(R.id.imageButton3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opener();
            }
        });
        hbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opener2();
            }
        });
        sellbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opener3();
            }
        });



    }
    public void opener(){
        Intent intent = new Intent(this,buy1.class);
        startActivity(intent);
    }
    public void opener2(){
        Intent intent = new Intent(this,abtus.class);
        startActivity(intent);
    }
    public void opener3(){
        Intent intent = new Intent(this,sell1.class);
        startActivity(intent);
    }
}

