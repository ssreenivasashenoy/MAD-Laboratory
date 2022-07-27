package com.example.a2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText min1,min2;
    TextView manswer;
    Button madd,msubtract,mmultiply,mdivide,mreset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        min1=findViewById(R.id.in1);
        min2=findViewById(R.id.in2);
        manswer=findViewById(R.id.answer);
        madd=findViewById(R.id.add);
        msubtract=findViewById(R.id.subtract);
        mmultiply=findViewById(R.id.multiply);
        mdivide=findViewById(R.id.divide);
        mreset=findViewById(R.id.reset);

        madd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1=Double.parseDouble(min1.getText().toString());
                double v2=Double.parseDouble(min2.getText().toString());
                double ans=v1+v2;
                manswer.setText(""+ans);
            }
        });

        msubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1=Double.parseDouble(min1.getText().toString());
                double v2=Double.parseDouble(min2.getText().toString());
                double ans=v1-v2;
                manswer.setText(""+ans);
            }
        });

        mmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1=Double.parseDouble(min1.getText().toString());
                double v2=Double.parseDouble(min2.getText().toString());
                double ans=v1*v2;
                manswer.setText(""+ans);
            }
        });

        mdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1=Double.parseDouble(min1.getText().toString());
                double v2=Double.parseDouble(min2.getText().toString());
                double ans=v1/v2;
                manswer.setText(""+ans);
            }
        });

        mreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                min1.setText(null);
                min2.setText(null);
                manswer.setText("0");
            }
        });
    }
}