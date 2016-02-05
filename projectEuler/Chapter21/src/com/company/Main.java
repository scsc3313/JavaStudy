package com.company;

import java.util.ArrayList;

public class Main {

    private ArrayList<Integer> sumNumbers;
    private ArrayList<Integer> dSumNumbers;
    private int totalSum;

    Main(){
        sumNumbers = new ArrayList<>();
        dSumNumbers = new ArrayList<>();
        totalSum = 0;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){

        for(int i = 0; i <= 10000; i++){
            int tempSum = sumPrimeNumber(i);
            sumNumbers.add(i, tempSum);
        }

        for (int i = 0; i< 10000; i++){
            findD(sumNumbers.get(i), i);
        }
        System.out.println("Total Sum is " + totalSum);
    }

    private int sumPrimeNumber(int inputNumber){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        for(int i = 1; i < inputNumber ; i++){
            if(inputNumber % i == 0)
                sum += i;
        }
        return sum;
    }

    private void findD(int sum, int index){
            if(sum <= 10000){
                if(index == sumNumbers.get(sum) && sum != index){
                    dSumNumbers.add(index);
                    dSumNumbers.add(sum);
                    System.out.println("index : " + index + " sum : " + sum);
                    totalSum += sum;
                }
            }

    }
}
