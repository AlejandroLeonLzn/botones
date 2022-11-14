package com.example.botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botones (View view){
        Intent i = new Intent(this,botones.class);
        startActivity(i);
    }

    public void edit (View view){
        Intent i = new Intent(this,editTexts.class);
        startActivity(i);
    }
}