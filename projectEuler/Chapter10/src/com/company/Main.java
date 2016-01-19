package com.company;

public class Main {

    public static void main(String[] args) {

        int startNumber = 2;
        int count =0;
        int maxPrimeNumber = 2000000;
        long sum = 0;

        for(int i = 2; i <= startNumber ; i++){
            for(int j = 2; j <= i ; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 1){
                sum += i;
            }
            count = 0;
            if(startNumber < maxPrimeNumber){
                startNumber++;
            }
        }

        StringBuilder totalIs = new StringBuilder();
        totalIs
                .append("total is : ")
                .append(sum)
                .append(" ");
        System.out.println(totalIs.toString());
    }
}
