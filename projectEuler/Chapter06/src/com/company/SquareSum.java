package com.company;

/**
 * Created by HSH on 2016. 1. 17..
 */
public class SquareSum {

    public long squareSum(int inputNumber){
        long squareSum = 0;
        for(int i = 0; i <= inputNumber ; i++){
            squareSum += i*i;
        }
        return squareSum;
    }

}
