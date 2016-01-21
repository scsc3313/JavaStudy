package com.company;

import java.util.ArrayList;

public class Main {

    private static boolean isGoing = true;

    public static void main(String[] args) {

        int number = 1;
        int tripleNumber = 0; //삼각수

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        do{
            for(int i = 1; i <= number; i++){
                tripleNumber += i;
            }
            for(int i = 1; i <= tripleNumber ; i++){
                if(tripleNumber % i == 0)
                    primeNumbers.add(i);
            }
            if(primeNumbers.size() >= 500){
                isGoing = false;
            }
            else {
                tripleNumber = 0;
                primeNumbers = new ArrayList<>();
                number++;
            }
        } while (isGoing);

        System.out.println(tripleNumber);
    }
}
