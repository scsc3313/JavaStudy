package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        String[] numbers = new String[354294];
        ArrayList<String> arrayList = new ArrayList<>();
        int totalSum = 0;
        for(int i = 2; i < 354294 ; i++){
            numbers[i] = String.valueOf(i);
            char[] dividedNumber = numbers[i].toCharArray();
            int sum = 0;
            for(int j = 0; j < dividedNumber.length; j++){
                 sum += (dividedNumber[j]-48) * (dividedNumber[j]-48) * (dividedNumber[j]-48) * (dividedNumber[j]-48) * (dividedNumber[j]-48);
            }
            if(numbers[i].equals(String.valueOf(sum)))
                arrayList.add(numbers[i]);
        }

        for(int i = 0 ; i < arrayList.size(); i++){
            totalSum += Integer.valueOf(arrayList.get(i));
        }
        System.out.println(totalSum);
    }
}
