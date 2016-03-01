package com.company;

import java.util.ArrayList;

public class Main {

    private int maxNumber;
    private ArrayList<Integer> arrayList;
    private ArrayList<Integer> realArrayList;


    public Main() {
        maxNumber = 1000;
        arrayList = new ArrayList<>();
        realArrayList = new ArrayList<>();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        makePrimeNumbers();
        print(arrayList);
        findRealPrimeNumbers(arrayList);
    }

    private void findRealPrimeNumbers(ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            int tempNumber = arrayList.get(i);
            while(tempNumber >= 10){
                tempNumber /= 10;
                if(checkIsPrimeNumber(tempNumber))
                    break;
            }
            String stringNumber = String.valueOf(tempNumber);
            char[] arrayNumber = stringNumber.toCharArray();
            while(arrayNumber.length != 1){
                stringNumber = "";
                for(int j = 0; j < arrayNumber.length; j++){
                    stringNumber += arrayNumber[j];
                }
            }
        }
    }

    private boolean checkIsPrimeNumber(int tempNumber) {
        for(int i = 0; i < arrayList.size(); i++){
            if(tempNumber == arrayList.get(i))
                return true;
        }
        return false;
    }


    private void makePrimeNumbers() {
        for(int i = 11; i < maxNumber ; i++){
            int count = 0;
            for(int j = 1 ; j <= i ; j++){
                if( i % j == 0 )
                    count++;
                if(count > 2)
                    break;
            }
            if(count == 2)
                arrayList.add(i);
        }
    }

    private void print(ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
