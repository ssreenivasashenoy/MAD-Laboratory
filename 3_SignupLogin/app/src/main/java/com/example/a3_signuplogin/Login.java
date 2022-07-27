package com.example.a3_signuplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button mlogin;
    private EditText muser,mpassword;
    private static String u,p;
    private static int i=0,remain=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mlogin=findViewById(R.id.login);
        muser=findViewById(R.id.user);
        mpassword=findViewById(R.id.password);

        Bundle bundle=getIntent().getExtras();
        u=bundle.getString("username");
        p=bundle.getString("password");
        
        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(muser.getText().toString().equals(u)&&mpassword.getText().toString().equals(p)){
                    startActivity(new Intent(Login.this,Success.class));
                    
                }
                else if(i>2){
                    Toast.makeText(Login.this, "Too many attempts", Toast.LENGTH_SHORT).show();
                    mlogin.setEnabled(false);
                }
                else{
                    remain-=1;
                    Toast.makeText(Login.this, "Atempts remaining"+remain, Toast.LENGTH_SHORT).show();
                    i++;
                }
            }
        });
    }
}