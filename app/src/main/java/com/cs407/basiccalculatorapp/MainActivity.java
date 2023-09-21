package com.cs407.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addClicked(View view){
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        goToActivity(input1.getText().toString(), input2.getText().toString());

    }

    public void goToActivity(String s, String b){
        Intent intent = new Intent(this, resultScreen.class);
        intent.putExtra("input1", s);
        intent.putExtra("input2", b);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}