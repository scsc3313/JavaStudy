package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> realArrayList = new ArrayList<>();

        makePrimeNumbers(arrayList);
        realArrayList = checkCirclePrimeNumber(arrayList);
        printPrimeNumbers(realArrayList);
    }

    private ArrayList<Integer> checkCirclePrimeNumber(ArrayList<Integer> arrayList) {

        ArrayList<Integer> realArrayList = new ArrayList<>();
        for(int i = 0; i < arrayList.size(); i++){
            int temp = 0;
            if(arrayList.get(i) > 10){
                while(temp != arrayList.get(i)){
                    String tempString = String.valueOf(arrayList.get(i)%10) + String.valueOf(arrayList.get(i)/10);
                    temp = Integer.valueOf(tempString);
                    if(!checkPrimeNumber(temp, arrayList))
                        break;
                }
                realArrayList.add(arrayList.get(i));

            }
        }
        return realArrayList;
    }

    private boolean checkPrimeNumber(int temp, ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            if(temp == arrayList.get(i))
                return true;
        }
        return false;
    }

    private void printPrimeNumbers(ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    private void makePrimeNumbers(ArrayList<Integer> arrayList) {
        for(int i = 1; i <= 100; i++){
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
