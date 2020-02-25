package com.example.coffeeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MakeOrder extends AppCompatActivity {
    private String coffeeType;
    private String addToCoffee;
    private CheckBox cre;
    private CheckBox sug;
    private Button btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_order);

        cre = (CheckBox) findViewById(R.id.Cream);
        sug = (CheckBox) findViewById(R.id.Sugar);
        btnOrder = (Button) findViewById(R.id.Order);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToCoffee ="";
                if(cre.isChecked())
                    addToCoffee = "....Cream added";

                if(sug.isChecked())
                    addToCoffee += "....Sugar added";
                Intent returnIntent = new Intent();
                returnIntent.putExtra("coffee_Type",coffeeType);
                returnIntent.putExtra("addTo_Coffee",addToCoffee);
                setResult(RESULT_OK,returnIntent);
                finish();


            }
        });
    }
    public void selectCoffee(View V){

        switch(V.getId()){

            case R.id.Decaf:
                coffeeType = "Decaf";
                break;

            case R.id.Espresso:
                coffeeType = "Espresso";
                break;

            case R.id.Colombian:
                coffeeType = "Colombian";
                break;

        }
    }
}


