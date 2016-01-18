package com.company;

/**
 * Created by HSH on 2016. 1. 18..
 */
public class Convert {

    public int[] convert(String bigNumber){

        int[] intNumbers;
        char[] charNumbers;
        charNumbers = bigNumber.toCharArray();
        intNumbers = new int[charNumbers.length];
        for(int i = 0 ; i < charNumbers.length ; i++){
            intNumbers[i] = charNumbers[i] - 48;
        }

        return intNumbers;

    }
}
