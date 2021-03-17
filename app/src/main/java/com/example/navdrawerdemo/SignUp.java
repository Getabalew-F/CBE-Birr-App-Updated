package com.example.navdrawerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class SignUp extends AppCompatActivity {


    Button callForRegistor;
    Button callforBack;
    AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        autoCompleteTextView = findViewById(R.id.gender);
        String[] option = {"please select","Male", "Female"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.option_item, option);
        autoCompleteTextView.setText(arrayAdapter.getItem(0).toString(), false);
        autoCompleteTextView.setAdapter(arrayAdapter);

//        Spinner mySpinner = (Spinner)findViewById(R.id.spinner);
//        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(SignUp.this,
//                android.R.layout.simple_list_item_1,
//                getResources().getStringArray(R.array.names));
//        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        mySpinner.setAdapter(myAdapter);

        callForRegistor = findViewById(R.id.register);
        callForRegistor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, OTP.class);
                startActivity(intent);
            }
        });

        callforBack = findViewById(R.id.backk);
        callforBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });

    }
}