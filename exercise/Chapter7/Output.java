package com.company;

import java.util.ArrayList;

/**
 * Created by HSH on 2016. 1. 6..
 */
public class Output {

    private ArrayList<Integer> primeNumbers;
    private int inputNumber;

    private String printCalc(){
        String s = "";
        for(int i = 0; i < primeNumbers.size(); i++){
            s += primeNumbers.get(i);
            if(i != primeNumbers.size() - 1)
                s += ", ";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String printString = stringBuilder
                .append("입력한 숫자 n은 : ")
                .append(inputNumber)
                .append(" 소수들은 : ")
                .append(s)
                .toString();

        return printString;

    }
    public void print(){
        System.out.println(printCalc());
    }

    public void setPrimeNumbers(ArrayList<Integer> primeNumbers) {
        this.primeNumbers = primeNumbers;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }
}
