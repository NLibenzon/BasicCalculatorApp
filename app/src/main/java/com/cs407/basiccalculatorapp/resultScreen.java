package com.cs407.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultScreen extends AppCompatActivity {


    public void backClicked(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

        TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        textView=(TextView) findViewById(R.id.result);
        Intent intent = getIntent();
        String str=intent.getStringExtra("input");
        textView.setText(str);
    }


}