package com.example.calculator;

import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Clear implements IAction {

    EditText textField;
    AppCompatActivity app;

    @Override
    public void action() {
        textField = app.findViewById(R.id.textField);
        textField.setText("0");
    }

    @Override
    public void setAppCompactActivity(AppCompatActivity activity) {
        this.app = activity;
    }
}
