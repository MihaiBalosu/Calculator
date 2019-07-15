package com.example.calculator;

import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.MathContext;

public class Addition implements IAction {

    EditText textField;
    AppCompatActivity app;

    private BigDecimal element1;
    private BigDecimal element2;
    private IResult finalResult;
    private BigDecimal result;


    @Override
    public void action() {
        finalResult = new Result();
        textField = app.findViewById(R.id.textField);
        element2 = BigDecimal.valueOf(Double.parseDouble(textField.getText().toString()));
        MathContext mc = new MathContext(10);
        result = element1.add(element2, mc);
        textField.setText(finalResult.getResult(String.valueOf(result)));
    }

    @Override
    public void setAppCompactActivity(AppCompatActivity activity) {
        this.app = activity;
        textField = app.findViewById(R.id.textField);
        element1 = BigDecimal.valueOf(Double.parseDouble(textField.getText().toString()));
    }


}
