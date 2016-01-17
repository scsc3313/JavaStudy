package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int inputNum = 2;
        int count =0;
        int howMany = 0;
        ArrayList<Integer> primeFactorNum = new ArrayList<>();

        for(int i = 2; i <= inputNum ; i++){
            for(int j = 2; j <= i ; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 1){
                primeFactorNum.add(i);
                howMany++;
            }
            count = 0;
            if(howMany != 10001){
                inputNum++;
            }
        }

        StringBuilder primeFactorNums = new StringBuilder();
        primeFactorNums.append("primeFactors : ");
            if(howMany == 10001){
                primeFactorNums
                        .append(primeFactorNum.get(primeFactorNum.size()-1))
                        .append(" ");
            }
        System.out.println(primeFactorNums.toString());

    }
}
