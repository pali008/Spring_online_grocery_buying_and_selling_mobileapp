package com.example.spring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class buypay extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button pay;
    Button confirm;
    ImageButton map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buypay);

        confirm = findViewById(R.id.button7);
        pay = findViewById(R.id.pay);
        map = findViewById(R.id.map);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUrl();
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gomap();
            }
        });

        Spinner spinner= findViewById(R.id.textView16);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.MOD, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);





        Spinner spinner1= findViewById(R.id.textView17);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.Payment, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(this);
    }

    private void gotUrl(){
        Uri uri =Uri.parse("https://paytm.com/");
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void gomap(){
        Uri uri =Uri.parse("https://googlemaps.com");
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    public void Start(View view) {
        Toast.makeText(this,"Purchase_saved",Toast.LENGTH_LONG).show();
    }
}