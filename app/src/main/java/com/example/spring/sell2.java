package com.example.spring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sell2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell2);
    }

    public void start(View view) {
        Intent intent = new Intent(this, prodlist.class);
        startActivity(intent);

    }
}