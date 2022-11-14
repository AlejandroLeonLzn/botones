package com.example.botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class botones extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn1.setOnClickListener(new View.OnClickListener() {
            int color = 1;

            public void onClick(View v) {
                switch (color) {
                    case 0:
                        btn1.setTextColor(Color.parseColor("#4286f4"));
                        color++;
                        break;
                    case 1:
                        btn1.setTextColor(Color.parseColor("#0f9e3c"));
                        color++;
                        break;
                    case 2:
                        btn1.setTextColor(Color.parseColor("#e88e2e"));
                        color++;
                        break;
                    case 3:
                        btn1.setTextColor(Color.parseColor("#e82ea0"));
                        color = 0;
                        break;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            int color = 1;

            public void onClick(View v) {
                switch (color) {
                    case 0:
                        btn2.setBackgroundColor(Color.parseColor("#4286f4"));
                        color++;
                        break;
                    case 1:
                        btn2.setBackgroundColor(Color.parseColor("#0f9e3c"));
                        color++;
                        break;
                    case 2:
                        btn2.setBackgroundColor(Color.parseColor("#e88e2e"));
                        color++;
                        break;
                    case 3:
                        btn2.setBackgroundColor(Color.parseColor("#e82ea0"));
                        color = 0;
                        break;
                }
            }
        });
    }
        public void regresar (View view){
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
}