package com.example.calculator;

public class Result implements IResult {

    private String finalResult;

    @Override
    public String getResult(String result) {

        double resultDouble = Double.parseDouble(result);
        int resultInt = (int) resultDouble;

        if(resultDouble / resultInt > 1){
            finalResult = result;
        }else if( resultDouble / resultInt == 1){
            finalResult = String.valueOf(resultInt);
        }

        return this.finalResult;
    }


}
