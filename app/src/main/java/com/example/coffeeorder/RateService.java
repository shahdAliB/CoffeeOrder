package com.example.coffeeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RateService extends AppCompatActivity {
    private String nameT;
    private Button submit;
    private EditText name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_service);

        submit = (Button) findViewById(R.id.submit);
        name = (EditText) findViewById(R.id.name);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameT = name.getText().toString();
                Intent returnIntent = new Intent();
                returnIntent.putExtra("name_Rate",nameT);
                setResult(RESULT_OK,returnIntent);
                finish();

            }
        });

    }
}
