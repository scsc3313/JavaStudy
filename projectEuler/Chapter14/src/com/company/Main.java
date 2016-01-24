package com.company;

import java.util.HashMap;

public class Main {

    private HashMap<Integer, Integer> hashNumbers;
    private int number;
    private int maxCount = 0;
    private int maxNumber = 0;

    Main(){
        hashNumbers = new HashMap<>();
        number = 1000000;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        while(number > 0){
            calc(number);
            number--;
        }
        System.out.println(maxCount);
        System.out.println(maxNumber);
    }

    private void calc(int number){

        Integer count = 0;
        int tempNumber = number;
        if(hashNumbers.get(number) == null){
            while(tempNumber != 1){
                if(tempNumber % 2 == 0){
                    tempNumber /= 2;
                }
                else {
                    tempNumber = 3 * tempNumber + 1;
                }
                count++;
            }
            hashNumbers.put(number, count);
            if(count > maxCount){
                maxCount = count;
                maxNumber = number;
            }
            count = 0;
        }
    }
}
