package com.example.a7_texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText mtextarea;
    Button mconvert;
    TextToSpeech tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextarea=findViewById(R.id.textarea);
        mconvert=findViewById(R.id.convert);

        tt=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==TextToSpeech.SUCCESS){
                    tt.setLanguage(Locale.ENGLISH);
                }
            }
        });

        mconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tt.speak(mtextarea.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(MainActivity.this, mtextarea.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}