package com.company;

/**
 * Created by HSH on 2016. 1. 14..
 */
public class CountInteger {

    private int[] counts;

    CountInteger(){
        counts = new int[10];
    }

    public void countInteger(int[] numbers){
        for(int i = 0; i < numbers.length ; i++){
            counts[numbers[i]]++;
        }
    }

    public int[] convert(String inputNubmer){
        char[] charNumbers = inputNubmer.toCharArray();
        int[] numbers = new int[charNumbers.length];
        for(int i = 0; i < charNumbers.length ; i++){
            numbers[i] = charNumbers[i] - 48;
        }
        return numbers;
    }

    public int[] getCounts() {
        return counts;
    }
}
