package com.company;

import java.util.ArrayList;

/**
 * Created by HSH on 2016. 1. 6..
 */
public class Calc {

    private ArrayList<Integer> primeNumbers;

    private void addPrimeNumber(int number){
        int count = 0;
        for(int i = 1; i <= number ; i++){
            if(number % i == 0)
                count++;
        }
        if(count == 2)
            primeNumbers.add(number);
        count = 0;
    }

    public void calculator(int inputNumber){
        for(int i = 1; i <= inputNumber ; i++){
            addPrimeNumber(i);
        }
    }

    public ArrayList<Integer> getPrimeNumbers() {
        return primeNumbers;
    }
}
