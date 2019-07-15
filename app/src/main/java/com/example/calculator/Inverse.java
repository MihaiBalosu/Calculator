package com.example.calculator;

import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.MathContext;

public class Inverse implements IAction {

    EditText textField;
    AppCompatActivity app;

    private BigDecimal element;

    @Override
    public void action() {

        MathContext mc = new MathContext(10);
        BigDecimal result = element.multiply(new BigDecimal(-1.0), mc);
        textField.setText(String.valueOf(result));
    }

    @Override
    public void setAppCompactActivity(AppCompatActivity activity) {
        this.app = activity;
        textField = app.findViewById(R.id.textField);
        element = BigDecimal.valueOf(Double.parseDouble(textField.getText().toString()));
    }
}
