package com.company;

import java.util.ArrayList;

/**
 * Created by HSH on 2016. 1. 6..
 */
public class Output {

    private ArrayList<Integer> primeNumbers;
    private int inputNumber;

    private String printCalc(){
        String primeNumString = ""; //소수들을 문자열로 바꾸는 작업
        int enterCount = 0; //10개단위로 끊기 위한 카운트
        for(int i = 0; i < primeNumbers.size(); i++){
            primeNumString += primeNumbers.get(i);
            if(i != primeNumbers.size() - 1) //마지막 소수에는 콤마를 안붙임
                primeNumString += ", ";
                enterCount++;
            if(enterCount == 10){  //10개단위가 되면 줄바꿈
                primeNumString += "\n";
                enterCount =0;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        String printString = stringBuilder
                .append("입력한 숫자 n은 : ")
                .append(inputNumber)
                .append("\n")
                .append("소수들은 : ")
                .append(primeNumString)
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
