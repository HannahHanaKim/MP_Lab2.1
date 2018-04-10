package com.example.user.lab2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Age;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.editText1);
        Age = findViewById(R.id.editText2);
        button1 = findViewById(R.id.btnAdd);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String stuName = Name.getText().toString(); //change the editText to String
                String stuAge = Age.getText().toString(); //change the editText to String
                Intent intent = new Intent(getApplicationContext(), NewActivity.class); //explicit

                intent.putExtra("loginName", stuName); //pass student's name by loginName
                intent.putExtra("loginAge", stuAge); //pass student's age by loginAge
                startActivity(intent);
            }
        });

    }
}