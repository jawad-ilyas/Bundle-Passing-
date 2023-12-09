package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btnMove;
    EditText etName , etTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MainActivity.this, SecondActity.class);
                String Name = etName.getText().toString();
                String Title = etTitle.getText().toString();

                intent.putExtra("name", Name);

                intent.putExtra("title", Title);
                startActivity(intent);
            }
        });
    }

     void init(){
         btnMove = findViewById(R.id.btnMove);
         etName = findViewById(R.id.etName);
         etTitle = findViewById(R.id.etTitle);

     }
}