package com.example.switch_rg;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    LinearLayout LinearLayout;
    Switch sw;
    RadioGroup rg;
    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout = (LinearLayout) findViewById(R.id.dorel);
        sw = (Switch) findViewById(R.id.switch1);
        rg = (RadioGroup) findViewById(R.id.RadioGroup);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw.isChecked()) {
                        LinearLayout.setBackgroundColor(Color.RED);
                    }
                }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw.isChecked()) {
                    LinearLayout.setBackgroundColor(Color.BLUE);
                }
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw.isChecked()) {
                    LinearLayout.setBackgroundColor(Color.YELLOW);
                }
            }
        });
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw.isChecked()) {
                    LinearLayout.setBackgroundColor(Color.GREEN);
                }
            }
        });
    }


    public void change(View view) {
        if (!sw.isChecked()) {
            if (rb1.isChecked()) {
                LinearLayout.setBackgroundColor(Color.RED);
            }
            if (rb2.isChecked()) {
                LinearLayout.setBackgroundColor(Color.BLUE);
            }
            if (rb3.isChecked()) {
                LinearLayout.setBackgroundColor(Color.YELLOW);
            }
            if (rb4.isChecked()) {
                LinearLayout.setBackgroundColor(Color.GREEN);
            }
        }
    }
}