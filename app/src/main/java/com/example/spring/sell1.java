package com.example.spring;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class sell1 extends AppCompatActivity {

    private EditText ename;
    private EditText epassword;

    boolean isvalid = false;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell1);


        ename = findViewById(R.id.editTextTextPersonName3);
        epassword = findViewById(R.id.editTextTextPassword);
        Button elog = findViewById(R.id.button2);

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openerr();
            }
        });


        elog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputname = ename.getText().toString();
                String inputpassword = epassword.getText().toString();

                if(inputname.isEmpty() || inputpassword.isEmpty())
                {
                    Toast.makeText(sell1.this,"Please input a valid username and passcode!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    isvalid = validate(inputname,inputpassword);

                    if(!isvalid){
                        Toast.makeText(sell1.this,"Invalid Entry!",Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(sell1.this,"Login successful",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(sell1.this,sell2.class);
                        startActivity(intent);
                    }
                }
            }

        });
    }
    private boolean validate(String name,String kpassword)
    {
        String username = "Paliyath";
        String password = "12345678";
        return name.equals(username) && kpassword.equals(password);
    }
    public void openerr(){
        Intent intent = new Intent(this,crnew.class);
        startActivity(intent);
    }




}