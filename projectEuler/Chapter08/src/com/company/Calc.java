package com.company;

/**
 * Created by HSH on 2016. 1. 18..
 */
public class Calc {

    private int count = 0;
    private int multiplyNumber = 1;
    private int maxNumber = 0;

    public void calc(int[] numbers){
        for(int i = 0; i < numbers.length ; i++){

            multiplyNumber *= numbers[i];
            count++;
            if(count == 4){
                if(maxNumber < multiplyNumber)
                    maxNumber = multiplyNumber;
                count = 0;
                multiplyNumber = 1;
            }
        }
    }

    public int getMaxNumber() {
        return maxNumber;
    }
}
