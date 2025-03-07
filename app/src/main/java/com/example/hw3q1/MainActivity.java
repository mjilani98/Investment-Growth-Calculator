package com.example.hw3q1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void calculate(View view)
    {
        //get the current principal
        EditText edtTxtCurrentPrincipal = findViewById(R.id.InputPrincipal);
        String strCurrentPrincipal = edtTxtCurrentPrincipal.getText().toString();
        int currentPrincipal;
        try
        {
             currentPrincipal = Integer.parseInt(strCurrentPrincipal);
        }
        catch (NumberFormatException e)
        {
            currentPrincipal = 0;
        }

        //get the annual addition
        EditText edtTxtAnnualAddition = findViewById(R.id.InputAnnualAddition);
        String strAnnualAddition = edtTxtAnnualAddition.getText().toString();
        int annualAddition ;
        try
        {
            annualAddition = Integer.parseInt(strAnnualAddition);
        }
        catch (NumberFormatException e)
        {
            annualAddition =0;
        }

        //get number of years
        EditText edtTxtNumberOfYears = findViewById(R.id.inputNumberYears);
        String strNumberYears = edtTxtNumberOfYears.getText().toString();
        int numberOfYears ;
        try
        {
             numberOfYears = Integer.parseInt(strNumberYears);
        }
        catch (NumberFormatException e)
        {
            numberOfYears= 0;
        }


        //get the investment rate
        EditText edtTxtInvestmentRate = findViewById(R.id.InputInvestmentRate);
        String strInvestmentRate = edtTxtInvestmentRate.getText().toString();
        int investmentRate ;
        try
        {
            investmentRate = Integer.parseInt(strInvestmentRate);
        }
        catch (NumberFormatException e)
        {
            investmentRate= 0;
        }


        //create a second activity
        Intent secondActivity = new Intent(this,secondActivity.class);

        //put current principal , annual addition, number of years, and investment rate as extras
        //to the second activity
        secondActivity.putExtra("currentPrincipal",currentPrincipal);
        secondActivity.putExtra("annualAddition",annualAddition);
        secondActivity.putExtra("numberOfYears",numberOfYears);
        secondActivity.putExtra("investmentRate",investmentRate);

        //call the second activity
        startActivity(secondActivity);
    }
}