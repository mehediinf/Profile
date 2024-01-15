package com.example.practic_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button Previous_button,Next_Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Previous_button = findViewById(R.id.Previous_button_Id);
        Next_Button = findViewById(R.id.Next_button_Id);

        Previous_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);

                startActivity(intent);


            }
        });

        Next_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Third_Activity.class);

                intent.putExtra("tag","My Personal Photo ");

                startActivity(intent);


            }
        });



    }
}