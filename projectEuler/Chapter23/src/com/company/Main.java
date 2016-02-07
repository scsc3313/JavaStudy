package com.company;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {


    private ArrayList<Integer> overNumbers;
    private ArrayList<Integer> madeByOverNumbers;
    private BigInteger totalSum;
    private static final int maxNumber = 28123;


    Main(){
        overNumbers = new ArrayList<>();
        madeByOverNumbers = new ArrayList<>();
        totalSum = BigInteger.valueOf(0);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        init();
        makeIntegerByOverNumbers();

        calculator();
        System.out.print("TotalSum is " + totalSum);
    }

    private void calculator() {

        for(int i = 0; i <= maxNumber; i++){
            totalSum = totalSum.add(BigInteger.valueOf(i));
        }
        for(int i = 0; i < madeByOverNumbers.size() ; i++){
            totalSum = totalSum.subtract(BigInteger.valueOf(i));
        }

    }

    private void makeIntegerByOverNumbers() {
        for(int i = 0; i < overNumbers.size() ; i++){
            for(int j = 0; j < overNumbers.size() ; j++){
                int tempSum = overNumbers.get(i) + overNumbers.get(j);
                if(!madeByOverNumbers.contains(tempSum) && tempSum <= maxNumber){
                    madeByOverNumbers.add(tempSum);
                }
            }
        }
    }

    private void init() {
        for (int i = 0; i <= maxNumber; i++){
            if(i < findPrimeNumberSum(i))
                overNumbers.add(i);
        }
    }

    private int findPrimeNumberSum(int inputNumber){
        int sum = 0;
        for(int i = 1; i < inputNumber ; i++){
            if(inputNumber % i == 0)
                sum += i;
        }
        return sum;
    }

}
