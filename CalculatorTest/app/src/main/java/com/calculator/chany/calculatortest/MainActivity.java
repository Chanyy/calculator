package com.calculator.chany.calculatortest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

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


            }
        });
    }

    // puts the number that was pressed on the screen
    void numberPressed (int numberPushed, TextView numberTextView){
        //float currentDisplay = Float.valueOf(numberTextView.getText().toString());
        String currentDisplay = numberTextView.getText().toString();
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
        if(currentDisplay.equals("0")) {
            currentDisplay = "";
        }

        // Handle Decimal Case
        if (numberPushed == 10) {
            numberTextView.setText(currentDisplay + ".");
        }
        else {
            numberTextView.setText(currentDisplay + numberPushed);
        }
    }

    //resets screen to zero
    void numberClear (TextView numberTextView){
        numberTextView.setBackground(getDrawable(R.drawable.clear_rectangle));
        delayTextView(numberTextView);
        numberTextView.setText( "");
        numberTextView.setTextSize(55);
    }

    // Back Space
    void numberBack (TextView numberTextView) {
        String currentDisplay = numberTextView.getText().toString();
        if (currentDisplay.length() > 1) {
            currentDisplay = currentDisplay.substring(0, currentDisplay.length()-1);
            numberTextView.setText(currentDisplay);
        }
        else {
            numberTextView.setText("0");
            numberTextView.setTextSize(55);
        }

    }

    //puts addition or subtraction symbol on the screen
    void operatorPressed (String operatorPushed, TextView numberTextView){
        String currentDisplay = numberTextView.getText().toString();
        numberTextView.setText(currentDisplay + operatorPushed);
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

    // Delayed TextView Color (Clear)
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
