package com.example.coffeeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MoveToFrstAct(View v) {

        Intent i = new Intent(getApplicationContext(), MakeOrder.class);
        startActivityForResult(i, 1);
    }

    public void MoveToScndAct(View v) {

        Intent i = new Intent(getApplicationContext(), RateService.class);
        startActivityForResult(i, 2);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // output a toast notification showing what the order made by the user is
        if (resultCode == RESULT_OK && requestCode == 1) {

            String order = "Order is: " + data.getStringExtra("coffee_Type") + data.getStringExtra("addTo_Coffee");
            Toast.makeText(
                    getApplicationContext(), // Context
                    order, // Message
                    Toast.LENGTH_SHORT // Short Duration
            ).show();
        } else if (resultCode == RESULT_OK && requestCode == 2) {

            String Name = "thank you  " + data.getStringExtra("name_Rate");
            Toast.makeText(
                    getApplicationContext(), // Context
                    Name, // Message
                    Toast.LENGTH_SHORT // Short Duration
            ).show();

        }


    }
}
