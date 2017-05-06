package com.calculator.chany.calculatortest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Buttons
        TextView numberTextView = (TextView) findViewById(R.id.number_text_view);
        Button buttonOne = (Button) findViewById(R.id.button_one);
        Button buttonTwo = (Button) findViewById(R.id.button_two);
        Button buttonThree = (Button) findViewById(R.id.button_three);
        Button buttonFour = (Button) findViewById(R.id.button_four);
        Button buttonFive = (Button) findViewById(R.id.button_five);
        Button buttonSix = (Button) findViewById(R.id.button_six);
        Button buttonSeven = (Button) findViewById(R.id.button_seven);
        Button buttonEight = (Button) findViewById(R.id.button_eight);
        Button buttonNine = (Button) findViewById(R.id.button_nine);
        Button buttonDecimal = (Button) findViewById(R.id.button_decimal);
        Button ButtonEquals  = (Button) findViewById(R.id.button_equals);
        Button ButtonClear = (Button) findViewById(R.id.button_clear);
        Button ButtonDivide = (Button)findViewById(R.id.button_divide);
        Button ButtonMultiply = (Button) findViewById(R.id.button_multiply);
        Button ButtonSubtraction = (Button) findViewById(R.id.button_subtraction);
        Button ButtonAddition = (Button) findViewById(R.id.button_addition);


        whyThis()
    }

    public void whyThis() {

        int yunaAge = 99;
        String yunaName = "Yuna the Cat";
        yunaAge = yunaAge+1;
        yunaName = "fatty";
    }

}
