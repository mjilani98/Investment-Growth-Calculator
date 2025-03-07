package com.example.hw3q1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity
{

    //set second screen
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //display the second screen
        setContentView(R.layout.activity_second);

        //update the screen
//        updateView();
    }

    public void updateView()
    {
        //get the inputs from extras
        Intent intent = getIntent();
        int currentPrincipal = intent.getIntExtra("currentPrincipal",0);
        int annualAddition = intent.getIntExtra("annualAddition",0);
        int numberOfYears = intent.getIntExtra("numberOfYears",0);
        int investmentRate = intent.getIntExtra("investmentRate",0);

        String line="here";
        int total = currentPrincipal;
        //do calculation
        for(int x = 0 ; x < numberOfYears ; x++ )
        {
            line += (x+1)+"     " + total+"\n";
            total+= annualAddition;
            int investRetur = total*(investmentRate/100);
            total +=investRetur;
        }

        //display the result of calculation
        TextView output = findViewById(R.id.outputResults);
        output.setText(line);
    }

    //even handler to destroy the current screen
    public void back(View v)
    {
        //destroy the screen
        finish();
    }
}
