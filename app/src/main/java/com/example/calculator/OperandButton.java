package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

class OperandButton implements ILastPressed {

    AppCompatActivity app;

    private String text;

    @Override
    public String build() {
        return "";
    }

    @Override
    public void setAppCompactActivity(AppCompatActivity activity) {
        this.app = activity;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
