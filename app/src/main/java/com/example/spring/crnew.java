package com.example.spring;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class crnew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crnew);
    }

    public void start(View view) {
        Toast.makeText(this, "OTP send",Toast.LENGTH_LONG).show();
    }

    public void open(View view) {
        Intent in = new Intent(crnew.this,buycreatenew.class);
        startActivity(in);
    }
}