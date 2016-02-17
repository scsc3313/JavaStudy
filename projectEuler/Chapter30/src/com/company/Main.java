package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        String[] numbers = new String[90000];
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < 90000 ; i++){
            numbers[i] = String.valueOf(i + 10000);
            char[] dividedNumber = numbers[i].toCharArray();
            int sum = 0;
            for(int j = 0; j < dividedNumber.length; j++){
                 sum += (dividedNumber[j]-48) * (dividedNumber[j]-48) * (dividedNumber[j]-48) * (dividedNumber[j]-48);
            }
            if(numbers[i].equals(String.valueOf(sum)))
                arrayList.add(numbers[i]);
        }
        System.out.println(arrayList.get(0));
    }
}
