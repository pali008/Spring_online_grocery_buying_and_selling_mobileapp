package com.example.spring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class prodlist extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText pr;
    String st1;
    String st2;
    String st3;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prodlist);

        bt = findViewById(R.id.button8);
        et1 =findViewById(R.id.editTextTextPersonName8);
        et2 =findViewById(R.id.editTextTextPersonName9);
        pr =findViewById(R.id.editTextTextPersonName10);

        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                st1 = et1.getText().toString();
                st2 = et2.getText().toString();
                st3 = pr.getText().toString();
                Intent i = new Intent(prodlist.this ,  salelist.class);
                i.putExtra("value1",st1);
                i.putExtra("value2",st2);
                i.putExtra("value3",st3);
                startActivity(i);

                finish();

            }
        });

    }

    public void cam(View view) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }


}