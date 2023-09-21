package com.cs407.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;

    public void setInputs(View view){
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
    }

    public void checkInputs(View view) throws InputMismatchException{
        try {
            Integer.parseInt(input1.getText().toString());
            Integer.parseInt(input2.getText().toString());
        }

        catch (Exception e){
            throw new InputMismatchException();
        }
    }

    public void addClicked(View view){
        setInputs(view);
        try {
            checkInputs(view);
        }
        catch (InputMismatchException e){
            Toast.makeText(MainActivity.this, "integers only", Toast.LENGTH_LONG).show();
            return;
        }

        int result = Integer.parseInt(input1.getText().toString()) + Integer.parseInt(input2.getText().toString());
        goToActivity(String.valueOf(result));
    }

    public void subtractClicked(View view){
        setInputs(view);
        try {
            checkInputs(view);
        }
        catch (InputMismatchException e){
            Toast.makeText(MainActivity.this, "integers only", Toast.LENGTH_LONG).show();
            return;
        }
        int result = Integer.parseInt(input1.getText().toString()) - Integer.parseInt(input2.getText().toString());
        goToActivity(String.valueOf(result));
    }

    public void multiplyClicked(View view){
        setInputs(view);
        try {
            checkInputs(view);
        }
        catch (InputMismatchException e){
            Toast.makeText(MainActivity.this, "integers only", Toast.LENGTH_LONG).show();
            return;
        }
        int result = Integer.parseInt(input1.getText().toString()) * Integer.parseInt(input2.getText().toString());
        goToActivity(String.valueOf(result));
    }

    public void divideClicked(View view){
        setInputs(view);
        try {
            checkInputs(view);
        }
        catch (InputMismatchException e){
            Toast.makeText(MainActivity.this, "integers only", Toast.LENGTH_LONG).show();
            return;
        }
        int secondDiv = Integer.parseInt(input2.getText().toString());
        if (secondDiv == 0){
            Toast.makeText(MainActivity.this, "can't divide by zero", Toast.LENGTH_LONG).show();
            return;
        }

        int result = Integer.parseInt(input1.getText().toString()) / secondDiv;
        goToActivity(String.valueOf(result));
    }


    public void goToActivity(String s){
        Intent intent = new Intent(this, resultScreen.class);
        intent.putExtra("input", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}