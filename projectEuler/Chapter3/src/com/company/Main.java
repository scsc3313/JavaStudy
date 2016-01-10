package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int inputNum;
        ArrayList<Integer> primeFactorNum = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        for(int i = 2; i < inputNum ; i++){
            if(inputNum % i == 0){
                primeFactorNum.add(i);
                inputNum /= i;
                i = 2;
            }
        }
        StringBuilder primeFactorNums = new StringBuilder();
        primeFactorNums.append("primeFactors : ");
        for(int i = 0; i < primeFactorNum.size() ; i++){
            primeFactorNums
                    .append(primeFactorNum.get(i))
                    .append(" ");
        }
        System.out.println(primeFactorNums.toString());

    }
}
