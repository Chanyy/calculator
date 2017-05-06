package com.calculator.chany.calculatortest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Buttons
        final TextView numberTextView = (TextView) findViewById(R.id.number_text_view);
        Button buttonOne = (Button) findViewById(R.id.button_one);
        Button buttonTwo = (Button) findViewById(R.id.button_two);
        Button buttonThree = (Button) findViewById(R.id.button_three);
        Button buttonFour = (Button) findViewById(R.id.button_four);
        Button buttonFive = (Button) findViewById(R.id.button_five);
        Button buttonSix = (Button) findViewById(R.id.button_six);
        Button buttonSeven = (Button) findViewById(R.id.button_seven);
        Button buttonEight = (Button) findViewById(R.id.button_eight);
        Button buttonNine = (Button) findViewById(R.id.button_nine);
        Button buttonZero = (Button) findViewById(R.id.button_zero);
        Button buttonDecimal = (Button) findViewById(R.id.button_decimal);
        Button buttonEquals  = (Button) findViewById(R.id.button_equals);
        Button buttonClear = (Button) findViewById(R.id.button_clear);
        Button buttonDivide = (Button)findViewById(R.id.button_divide);
        Button buttonMultiply = (Button) findViewById(R.id.button_multiply);
        Button buttonSubtraction = (Button) findViewById(R.id.button_subtraction);
        Button buttonAddition = (Button) findViewById(R.id.button_addition);

        // On Click Listeners
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(1, numberTextView);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(2, numberTextView);
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                numberPressed(3, numberTextView);
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(4, numberTextView);
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(5, numberTextView);
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(6, numberTextView);
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(7, numberTextView);
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(8, numberTextView);
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(9, numberTextView);
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(1, numberTextView);
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(0, numberTextView);
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(10, numberTextView);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClear(numberTextView);
            }
        });
    }

    void numberPressed (int numberPushed, TextView numberTextView){
        //float currentDisplay = Float.valueOf(numberTextView.getText().toString());
        String currentDisplay = numberTextView.getText().toString();
        if(currentDisplay.equals("0")) {
            currentDisplay = "";
        }
        numberTextView.setText(currentDisplay + numberPushed);
    }

    void numberClear (TextView numberTextView){
        numberTextView.setText( "0");
    }

}
