package com.company;

import java.math.BigInteger;

public class Main {
    private int sum;

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        BigInteger number = BigInteger.valueOf(1);
        for(int i = 1; i < 101 ; i++){
            number = number.multiply(BigInteger.valueOf(i));
        }
        String numberString = String.valueOf(number);
        char[] numbers = numberString.toCharArray();
        for(int i = 0; i < numbers.length ; i++){
            sum += numbers[i] - 48;
        }
        System.out.println(sum);
    }
}
