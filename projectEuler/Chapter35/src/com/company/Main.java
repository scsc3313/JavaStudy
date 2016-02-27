package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        makePrimeNumbers(arrayList);
        printPrimeNumbers(arrayList);

    }

    private void printPrimeNumbers(ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    private void makePrimeNumbers(ArrayList<Integer> arrayList) {
        for(int i = 1; i <= 1000000; i++){
            int count = 0;
            for(int j = 1; j <= i ; j++){
                if(i % j == 0)
                    count++;
                if(count == 3)
                    break;
            }
            if(count == 2)
                arrayList.add(i);
        }
    }
}
