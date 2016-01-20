package com.company;

/**
 * Created by HSH on 2016. 1. 20..
 */
public class Convert {

    public int[][] convert(String inputNumber){

        String[] charNumbers = inputNumber.split(" ");
        int[][] intNumbers = new int[20][20];

        for(int i = 0 ; i < 20; i++){
            for(int j = 0; j < 20; j++){
                intNumbers[i][j] = Integer.parseInt(charNumbers[i*10 + j]);
            }
        }

        return intNumbers;
    }
}
