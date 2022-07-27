package com.example.a4_wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button mbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbutton=findViewById(R.id.button);

        WallpaperManager wallpaperManager=WallpaperManager.getInstance(this);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                try {
                    wallpaperManager.setResource(R.drawable.a);
                    Thread.sleep(5000);
                    wallpaperManager.setResource(R.drawable.b);
                    Thread.sleep(5000);
                    wallpaperManager.setResource(R.drawable.c);
                    Thread.sleep(5000);
                    wallpaperManager.setResource(R.drawable.d);
                    Thread.sleep(5000);
                    wallpaperManager.setResource(R.drawable.e);
                    return;

                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
        });
    }
}