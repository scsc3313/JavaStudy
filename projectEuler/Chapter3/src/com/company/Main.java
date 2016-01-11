package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //600851475143 is inputNum;
        long inputNum;
        ArrayList<Integer> primeFactorNum = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextLong();

        for(int i = 2; i <= inputNum ; i++){
            if(inputNum % i == 0){
                primeFactorNum.add(i);
                inputNum /= i;
                i = 1;
            }
        }
        StringBuilder primeFactorNums = new StringBuilder();
        primeFactorNums.append("primeFactors : ");
        for(int i = 0; i < primeFactorNum.size() ; i++){
            if(primeFactorNum.size()-1 == (i))
                primeFactorNums.append("MAX primeNumber is ");
            primeFactorNums
                    .append(primeFactorNum.get(i))
                    .append(" ");
        }
        System.out.println(primeFactorNums.toString());

    }
}
