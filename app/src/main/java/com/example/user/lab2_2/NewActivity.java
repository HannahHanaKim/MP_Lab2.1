package com.example.user.lab2_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent passedIntent = getIntent();
        if(passedIntent != null) { //if it is not empty
            String loginName = passedIntent.getStringExtra("loginName"); //get Name from MainActivity by "loginName"
            String loginAge = passedIntent.getStringExtra("loginAge"); //get Age from MainActivity by "loginAge"

            Toast.makeText(getApplicationContext(), "Student Info: " + loginName + ", " + loginAge, Toast.LENGTH_LONG).show(); //toast message
        }

        Button button0 = (Button)findViewById(R.id.newBtn);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}

