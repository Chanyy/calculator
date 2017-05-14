package com.calculator.chany.calculatortest;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    // Global Variables
    Float firstNumber;
    Float secondNumber;
    String currentOperator;
    Boolean lastButtonWasOperator = false;
    Boolean operatorPresent = false;

    // Where the view starts to be created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Buttons
        final TextView numberTextView = (TextView) findViewById(R.id.number_text_view);
        final Button buttonOne = (Button) findViewById(R.id.button_one);
        final Button buttonTwo = (Button) findViewById(R.id.button_two);
        final Button buttonFour = (Button) findViewById(R.id.button_four);
        final Button buttonFive = (Button) findViewById(R.id.button_five);
        final Button buttonThree = (Button) findViewById(R.id.button_three);
        final Button buttonSix = (Button) findViewById(R.id.button_six);
        final Button buttonSeven = (Button) findViewById(R.id.button_seven);
        final Button buttonEight = (Button) findViewById(R.id.button_eight);
        final Button buttonNine = (Button) findViewById(R.id.button_nine);
        final Button buttonZero = (Button) findViewById(R.id.button_zero);
        final Button buttonDecimal = (Button) findViewById(R.id.button_decimal);
        final Button buttonEquals  = (Button) findViewById(R.id.button_equals);
        final Button buttonClear = (Button) findViewById(R.id.button_clear);
        final Button buttonDivide = (Button)findViewById(R.id.button_divide);
        final Button buttonMultiply = (Button) findViewById(R.id.button_multiply);
        final Button buttonSubtraction = (Button) findViewById(R.id.button_subtraction);
        final Button buttonAddition = (Button) findViewById(R.id.button_addition);

        // On Click Listeners
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonOne);
                numberPressed(1, numberTextView);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonTwo);
                numberPressed(2, numberTextView);
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                delayButton(buttonThree);
                numberPressed(3, numberTextView);
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonFour);
                numberPressed(4, numberTextView);
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonFive);
                numberPressed(5, numberTextView);
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonSix);
                numberPressed(6, numberTextView);
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonSeven);
                numberPressed(7, numberTextView);
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonEight);
                numberPressed(8, numberTextView);
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonNine);
                numberPressed(9, numberTextView);
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonOne);
                numberPressed(1, numberTextView);
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonZero);
                numberPressed(0, numberTextView);
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonDecimal);
                numberPressed(10, numberTextView);
            }
        });

        buttonClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                delayButton(buttonClear);
                numberClear(numberTextView);
                return true;
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonClear);
                numberBack(numberTextView);
            }
        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonAddition);
                operatorPressed("+", numberTextView);
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonSubtraction);
                operatorPressed("-", numberTextView);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonMultiply);
                operatorPressed("\u00D7", numberTextView);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonDivide);
                operatorPressed("\u00F7", numberTextView);
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayButton(buttonEquals);
                equalsPressed(numberTextView);
            }
        });
    }

    // puts the number that was pressed onto the screen
    void numberPressed (int numberPushed, TextView numberTextView){
        String currentDisplay = numberTextView.getText().toString();

        // Portrait text size changes
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            if (currentDisplay.length() == 10) {
                numberTextView.setTextSize(45);
            }
            if (currentDisplay.length() == 12) {
                numberTextView.setTextSize(35);
            }
            if (currentDisplay.length() == 15) {
                numberTextView.setTextSize(30);
            }
            if (currentDisplay.length() == 18) {
                numberTextView.setTextSize(25);
            }
        }
        else {
            // Landscape text size changes
            if (currentDisplay.length() == 17) {
                numberTextView.setTextSize(45);
            }
            if (currentDisplay.length() == 21) {
                numberTextView.setTextSize(35);
            }
            if (currentDisplay.length() == 27) {
                numberTextView.setTextSize(30);
            }
            if (currentDisplay.length() == 31) {
                numberTextView.setTextSize(25);
            }
        }
        // Gets rid of zero once you push a button
        if(currentDisplay.equals("0")) {
            currentDisplay = "";
        }

        // Handle Decimal Case
        if (numberPushed == 10) {
            numberTextView.setText(currentDisplay + ".");
        }
        else {
            numberTextView.setText(currentDisplay + numberPushed);
            lastButtonWasOperator = false;
        }
    }

    //resets screen to zero and 55 text size once cleared
    void numberClear (TextView numberTextView){
        numberTextView.setBackground(getDrawable(R.drawable.clear_rectangle));
        delayTextView(numberTextView);
        numberTextView.setText( "");
        numberTextView.setTextSize(55);
        lastButtonWasOperator = false;
        operatorPresent = false;
    }

    // Backspace feature for clear key
    void numberBack (TextView numberTextView) {

        if (lastButtonWasOperator == true) {
            lastButtonWasOperator = false;
            operatorPresent = false;
        }

        String currentDisplay = numberTextView.getText().toString();
        if (currentDisplay.length() > 1) {

            char letterToBeRemoved = currentDisplay.charAt(currentDisplay.length() -1);
            if (letterToBeRemoved == '+' || letterToBeRemoved == '-' || letterToBeRemoved == '\u00D7' || letterToBeRemoved == '\u00F7') {
                operatorPresent = false;
                lastButtonWasOperator = false;
                currentOperator = null;
            }
            char oneLetterBack = currentDisplay.charAt(currentDisplay.length() -2);
            if (oneLetterBack == '+' || oneLetterBack == '-' || oneLetterBack == '\u00D7' || oneLetterBack == '\u00F7') {
                lastButtonWasOperator = true;
            }
            currentDisplay = currentDisplay.substring(0, currentDisplay.length()-1);
            numberTextView.setText(currentDisplay);
        }
        else {
            numberTextView.setText("0");
            numberTextView.setTextSize(55);
        }

    }

    //puts operation symbol on the screen
    void operatorPressed (String operatorPushed, TextView numberTextView){
        // Checks to see if an operator is currently on screen.r
        if (operatorPresent == false) {
            if (lastButtonWasOperator == false) {
                String currentDisplay = numberTextView.getText().toString();

                currentOperator = operatorPushed;

                // Adding operator to view
                numberTextView.setText(currentDisplay + operatorPushed);
                lastButtonWasOperator = true;
                operatorPresent = true;
            }
        }
        else {
            // Finds the answer, and then adds the new operator to the screen.
            if (lastButtonWasOperator == false) {

                equalsPressed(numberTextView);
                String currentDisplay = numberTextView.getText().toString();
                numberTextView.setText(currentDisplay + operatorPushed);
                // Set global variables.
                lastButtonWasOperator = true;
                operatorPresent = true;
                currentOperator = operatorPushed;
            }
        }
    }

    // Equals Button
    void equalsPressed (TextView numberTextView) {
        String fullExpression = numberTextView.getText().toString();

        // number without operator or second number crash fix
        if (currentOperator != null ) {
            Float answer;

            // number and operator without second number crash fix
            if (lastButtonWasOperator == false) {

                //split view at operator
                StringTokenizer tokens = new StringTokenizer(fullExpression, currentOperator);
                firstNumber = Float.parseFloat(tokens.nextToken());
                secondNumber = Float.parseFloat(tokens.nextToken());

                // does math
               if (currentOperator == "+") {
                   answer = firstNumber + secondNumber;
               }
               else if (currentOperator == "-") {
                   answer = firstNumber - secondNumber;
               }
               else if (currentOperator == "\u00D7") {
                   answer = firstNumber * secondNumber;
               }
               else {
                   answer = firstNumber / secondNumber;
               }

               // formats answer to get rid of decimals and adds commas
               String finalAnswer = NumberFormat.getInstance().format(answer);

                //displays the final answer
                numberTextView.setText(finalAnswer);

                // reset all global numbers
                firstNumber = null;
                secondNumber = null;
                lastButtonWasOperator = false;
                operatorPresent = false;
                currentOperator = null;
           }

        }
    }

    // Delayed Button Color
    void delayButton(final Button pushedButton) {
        pushedButton.setBackground(getDrawable(R.drawable.pressed_button));
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        pushedButton.setBackground(getDrawable(R.drawable.number_background));
                    }
                });
            }
        }, 125);
    }

    // Delayed TextView Color when cleared
    void delayTextView(final TextView numberTextView) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        numberTextView.setBackground(getDrawable(R.drawable.rectangle));
                        numberTextView.setText("0");
                    }
                });
            }
        }, 225);
    }

}
