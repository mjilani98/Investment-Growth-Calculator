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
        int currentPrincipal = Integer.parseInt(strCurrentPrincipal);

        //get the annual addition
        EditText edtTxtAnnualAddition = findViewById(R.id.InputAnnualAddition);
        String strAnnualAddition = edtTxtAnnualAddition.getText().toString();
        int annualAddition = Integer.parseInt(strAnnualAddition);

        //get number of years
        EditText edtTxtNumberOfYears = findViewById(R.id.inputNumberYears);
        String strNumberYears = edtTxtNumberOfYears.getText().toString();
        int numberOfYears = Integer.parseInt(strNumberYears);

        //create a second activity
        Intent secondActivity = new Intent(this,com.example.hw3q1.secondActivity.class);

        //put current principal , annual addition, and number of years as extras
        //to the second activity
        secondActivity.putExtra("currentPrincipal",currentPrincipal);
        secondActivity.putExtra("annualAddition",annualAddition);
        secondActivity.putExtra("numberOfYears",numberOfYears);

        //call the second activity
        startActivity(secondActivity);
        
    }
}