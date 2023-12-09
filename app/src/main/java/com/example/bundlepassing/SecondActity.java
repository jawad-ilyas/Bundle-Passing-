package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_actity);


        Intent getIntent = getIntent();
        String title =  getIntent.getStringExtra("title");
        String name = getIntent.getStringExtra("name");

        TextView tvShowName = findViewById(R.id.tvShowName);

        tvShowName.setText(name);



        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        } else {
            // If the action bar is not available, show a toast
            Toast.makeText(this, "Action bar not available", Toast.LENGTH_SHORT).show();
        }
    }
}