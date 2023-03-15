package com.zergivs.calculadora;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7,
            button8, button9, button0, buttonClear, buttonPlus, buttonMinus,
            buttonMultiply, buttonDivision, buttonEqual, buttonDecimal;

    TextView TextView1;

    float Value1, Value2;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @SuppressLint({"WrongViewCast", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button0 = findViewById(R.id.button0);
       button1 = findViewById(R.id.button1);
       button2 = findViewById(R.id.button2);
       button3 = (Button) findViewById(R.id.button3);
       button4 = (Button) findViewById(R.id.button4);
       button5 = (Button) findViewById(R.id.button5);
       button6 = (Button) findViewById(R.id.button6);
       button7 = (Button) findViewById(R.id.button7);
       button8 = (Button) findViewById(R.id.button8);
       button9 = (Button) findViewById(R.id.button9);
       buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
       buttonPlus = (Button) findViewById(R.id.buttonPlus);
       buttonMinus = (Button) findViewById(R.id.buttonMinus);
       buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
       buttonDivision = (Button) findViewById(R.id.buttonDivision);
       buttonClear = (Button) findViewById(R.id.buttonClear);
       buttonEqual = (Button) findViewById(R.id.buttonEqual);

        TextView1 = (TextView) findViewById(R.id.textView);

        button0.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"0"));


        button1.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"1"));


        button2.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"2"));


        button3.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"3"));

        button4.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"4"));


        button5.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"5"));


        button6.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"6"));


        button7.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"7"));


        button8.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"8"));


        button9.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"9"));


        buttonDecimal.setOnClickListener(v -> TextView1.setText(TextView1.getText()+"."));

        buttonPlus.setOnClickListener(v -> {
            Value1 = Float.parseFloat(TextView1.getText() + "");
            mAddition = true ;
            TextView1.setText(null);
        });

        buttonMinus.setOnClickListener(v -> {
            Value1 = Float.parseFloat(TextView1.getText() + "");
            mSubtract = true ;
            TextView1.setText(null);
        });

        buttonMultiply.setOnClickListener(v -> {
            Value1 = Float.parseFloat(TextView1.getText() + "");
            mMultiplication = true ;
            TextView1.setText(null);
        });

        buttonDivision.setOnClickListener(v -> {
            Value1 = Float.parseFloat(TextView1.getText() + "");
            mDivision = true ;
            TextView1.setText(null);
        });

        buttonEqual.setOnClickListener(v -> {
            Value2 = Float.parseFloat(TextView1.getText() + "");

            if (mSubtract){
                TextView1.setText(Value1 - Value2 +"");
                mSubtract=false;
            }

            if (mAddition){
                TextView1.setText(Value1 + Value2 +"");
                mAddition=false;
            }

            if (mMultiplication){
                TextView1.setText(Value1 * Value2 +"");
                mMultiplication=false;
            }

            if (mDivision){
                TextView1.setText(Value1 / Value2 +"");
                mDivision=false;
            }
        });

        buttonClear.setOnClickListener(v -> TextView1.setText(""));
    }

}