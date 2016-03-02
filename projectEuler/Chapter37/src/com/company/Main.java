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
        findRealPrimeNumbers(arrayList);
        print(realArrayList);
    }

    private void findRealPrimeNumbers(ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            boolean check = false;
            boolean check2 = false;
            int tempNumber = arrayList.get(i);
            int tempNumber2 = arrayList.get(i);
            while(tempNumber >= 10){
                tempNumber /= 10;
                check = false;
                if(!checkIsPrimeNumber(tempNumber))
                    break;
                check = true;
            }
            String stringNumber = String.valueOf(tempNumber2);
            char[] arrayNumber = stringNumber.toCharArray();
            while(tempNumber2 >= 10){
                int size = (int) Math.pow(10, arrayNumber.length - 1);
                tempNumber2 %= size;
                check2 = false;
                if(!checkIsPrimeNumber(tempNumber2))
                    break;
                check2 = true;
            }
            if(check && check2){
                realArrayList.add(arrayList.get(i));
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
        for(int i = 2; i < maxNumber ; i++){
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
