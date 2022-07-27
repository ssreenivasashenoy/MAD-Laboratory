package com.example.a5_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mcounter;
    Button mreset,mstart,mstop;
    int i=0;
    Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcounter=findViewById(R.id.counter);
        mreset=findViewById(R.id.reset);
        mstart=findViewById(R.id.start);
        mstop=findViewById(R.id.stop);

        mstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(Timer,1000);
            }
        });

        mstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.removeCallbacks(Timer);
            }
        });

        mreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcounter.setText("0");
                i=0;
            }
        });
    }

    private Runnable Timer=new Runnable() {
        @Override
        public void run() {
            mcounter.setText(String.valueOf(i));
            i++;
            handler.postDelayed(this,1000);
        }
    };
}