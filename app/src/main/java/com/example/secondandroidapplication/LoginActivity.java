package com.example.secondandroidapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    TextView textViewAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textViewAbout = findViewById(R.id.text_view_about);
        textViewAbout.setVisibility(View.GONE);
        toggleButton = findViewById(R.id.toggle_button);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((ToggleButton)v).isChecked()){
                    textViewAbout.setVisibility(View.VISIBLE);
                }
                else{
                    textViewAbout.setVisibility(View.GONE);
                }
            }
        });

        Button buttonLogin = findViewById(R.id.button_login);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG","Hej!");
                Intent intent = new Intent(com.example.secondandroidapplication.LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}