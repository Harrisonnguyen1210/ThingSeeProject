package com.example.android.thingseeproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    EditText e1,p1,pc;
    Button btn1,btn2;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        db = new DatabaseHelper(this);
        e1 = (EditText)findViewById(R.id.email1);
        p1 =(EditText)findViewById(R.id.pass1);
        pc =(EditText)findViewById(R.id.cpass);
        btn1 =(Button)findViewById(R.id.btn1);
        btn2 =(Button)findViewById(R.id.btnSignIn);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this,SigninActivity.class);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = p1.getText().toString();
                String s3 =pc.getText().toString();
                if (s1.equals("")|| s2.equals("")|| s3.equals("")){
                    Toast.makeText(getApplicationContext(), "filed are empty",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (s2.equals(s3)){
                        Boolean checkEmail = db.checkEmail(s1);
                        if (checkEmail==true){
                            Boolean insert = db.insert(s1,s2);
                            if (insert==true) {
                                Toast.makeText(getApplicationContext(), "Registered successfully ", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "email already exists",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Password do not match", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }
}
