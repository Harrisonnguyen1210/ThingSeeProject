package com.example.android.thingseeproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity {
    EditText email,pass;
    Button btn1;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        db = new DatabaseHelper(this);
        email = (EditText) findViewById(R.id.email1);
        pass = (EditText)findViewById(R.id.pass1);
        btn1 = (Button) findViewById(R.id.buttonSignIn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String em= email.getText().toString();
                String pa = pass.getText().toString();
                Boolean checkEmailPassword = db.checkEmailPassword(em,pa);
                if (checkEmailPassword ==true){
                    Toast.makeText(getApplicationContext(), "Login successful",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SigninActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Incorrect Email or Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
