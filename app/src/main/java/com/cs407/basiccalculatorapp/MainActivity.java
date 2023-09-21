package com.cs407.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;

    public void setInputs(View view){
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
    }

    public void addClicked(View view){
        setInputs(view);
        int result = Integer.parseInt(input1.getText().toString()) + Integer.parseInt(input2.getText().toString());
        goToActivity(String.valueOf(result));
    }

    public void subtractClicked(View view){
        setInputs(view);
        int result = Integer.parseInt(input1.getText().toString()) - Integer.parseInt(input2.getText().toString());
        goToActivity(String.valueOf(result));
    }

    public void multiplyClicked(View view){
        setInputs(view);
        int result = Integer.parseInt(input1.getText().toString()) * Integer.parseInt(input2.getText().toString());
        goToActivity(String.valueOf(result));
    }

    public void divideClicked(View view){
        setInputs(view);
        int result = Integer.parseInt(input1.getText().toString()) / Integer.parseInt(input2.getText().toString());
        goToActivity(String.valueOf(result));
    }




    public void goToActivity(String s){
        Intent intent = new Intent(this, resultScreen.class);
        intent.putExtra("input1", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}