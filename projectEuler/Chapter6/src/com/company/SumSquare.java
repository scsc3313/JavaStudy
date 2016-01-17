package com.company;

/**
 * Created by HSH on 2016. 1. 17..
 */
public class SumSquare {

    public long sumSquare(int inputNumber){
        long sumSquare = 0;
        for(int i = 0; i <= inputNumber ; i++){
            sumSquare += i;
        }
        return sumSquare*sumSquare;
    }
}
