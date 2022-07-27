package com.example.a3_signuplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private Button msignup;
    private EditText muser,mpassword;
    private static final String pp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$%@#&+=])(?=\\S+$).{8,}$";
    Pattern pattern=Pattern.compile(pp);
    private static String u,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msignup=findViewById(R.id.login);
        mpassword=findViewById(R.id.password);
        muser=findViewById(R.id.user);
        msignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                u=muser.getText().toString();
                p=mpassword.getText().toString();
                if(u==null||u.isEmpty()||p==null||p.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter username and password", Toast.LENGTH_SHORT).show();
                }
                else if(!pattern.matcher(p).matches()){
                    Toast.makeText(MainActivity.this, "• Password should contain \n" +
                            "uppercase and lowercase letters.\\n\" +\n" +
                            " \"• Password should contain letters and numbers.\\n\" +\n" +
                            "\"• Password should contain special characters.\\n\" +\n" +
                            "\"• Minimum length of the password (the default value \n" +
                            "is 8).", Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(new Intent(MainActivity.this,Login.class).putExtra("username",u).putExtra("password",p));
                }
            }
        });
    }
}