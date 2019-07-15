package com.example.calculator;

import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class Percent implements IAction {

    EditText textField;
    AppCompatActivity app;

    private BigDecimal element;

    @Override
    public void action() {
        BigDecimal result = element.divide(new BigDecimal(100));
        textField.setText(String.valueOf(result));
    }

    @Override
    public void setAppCompactActivity(AppCompatActivity activity) {
        this.app = activity;
        textField = app.findViewById(R.id.textField);
        element = BigDecimal.valueOf(Double.parseDouble(textField.getText().toString()));
    }
}
