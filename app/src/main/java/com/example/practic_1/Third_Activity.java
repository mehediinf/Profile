package com.example.practic_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Third_Activity extends AppCompatActivity {

    private Button button2;
    private TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button2 = findViewById(R.id.Previous_button_Id_2);
        textView3 = findViewById(R.id.textView_Id_3);


        Bundle bundle = getIntent().getExtras();

        if (bundle != null){

           String view = bundle.getString("tag");
           textView3.setText(view);

        }


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Third_Activity.this,SecondActivity.class);

                startActivity(intent);

            }
        });

    }
}