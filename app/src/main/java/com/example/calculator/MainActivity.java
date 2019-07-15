package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText textField;

    private int additionClicked = 1;

    private IAction calc;

    private ILastPressed lastPressed = new NumberButton();

    private String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textField = findViewById(R.id.textField);

        Button button1 = findViewById(R.id.one);
        Button button2 = findViewById(R.id.two);
        Button button3 = findViewById(R.id.three);
        Button button4 = findViewById(R.id.four);
        Button button5 = findViewById(R.id.five);
        Button button6 = findViewById(R.id.six);
        Button button7 = findViewById(R.id.seven);
        Button button8 = findViewById(R.id.eight);
        Button button9 = findViewById(R.id.nine);
        Button button0 = findViewById(R.id.zero);
        Button dot = findViewById(R.id.dot);

        lastPressed.setAppCompactActivity(this);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastPressed.setText(text);
                text = lastPressed.build();
                Button button = (Button) view;
                text += button.getText().toString();
                textField.setText(text);
                lastPressed = new NumberButton();
            }
        };

        View.OnClickListener listenerDot = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastPressed.setText(text);
                text = textField.getText().toString();
                Button button = (Button) view;
                text += button.getText().toString();
                textField.setText(text);
                lastPressed = new NumberButton();
            }
        };

        button0.setOnClickListener(listener);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        dot.setOnClickListener(listener);
        dot.setOnClickListener(listenerDot);
    }

    public void solve(android.view.View solve){
        calc.action();
        lastPressed = new OperandButton();
    }

    public void addition(android.view.View addition){
        calc = new Addition();
        calc.setAppCompactActivity(this);
        lastPressed = new OperandButton();
    }

    public void subtraction(android.view.View addition){
        calc = new Subtraction();
        calc.setAppCompactActivity(this);
        lastPressed = new OperandButton();
    }

    public void multiplication(android.view.View addition){
        calc = new Multiplication();
        calc.setAppCompactActivity(this);
        lastPressed = new OperandButton();
    }

    public void division(android.view.View addition){
        calc = new Division();
        calc.setAppCompactActivity(this);
        lastPressed = new OperandButton();
    }

    public void clear(android.view.View clear){
        IAction action = new Clear();
        action.setAppCompactActivity(this);
        action.action();
        lastPressed = new OperandButton();
    }

    public void percent(android.view.View percent){
        IAction action = new Percent();
        action.setAppCompactActivity(this);
        action.action();
        lastPressed = new OperandButton();
    }

    public void inverse(android.view.View inverse){
        IAction action = new Inverse();
        action.setAppCompactActivity(this);
        action.action();
        lastPressed = new OperandButton();
    }

}
