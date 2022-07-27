package com.example.a1_visitingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mtextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextView=findViewById(R.id.textView);
        mtextView.setText("Name:\nEmail:\nPhone Number:\nWebsite:\nAddress:\nFax:");
    }
}