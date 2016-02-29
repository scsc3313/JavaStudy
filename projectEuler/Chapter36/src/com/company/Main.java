package com.company;

import java.util.ArrayList;

public class Main {

    private int maxNumber;
    private ArrayList<Integer> arrayList;
    private int totalSum;

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    Main(){
        maxNumber = 1000000;
        arrayList = new ArrayList<>();
        totalSum = 0;
    }

    private void control(){
        for(int i = 1; i < maxNumber ; i++){
            String tempNumber = String.valueOf(i);
            if(check(tempNumber) && check(makeBinaryNumber(i))){
                arrayList.add(i);
                System.out.println(i);
            }
        }
        for(int i = 0; i < arrayList.size(); i++){
            totalSum += arrayList.get(i);
        }
        System.out.println("Total Sum is " + totalSum);
    }

    private boolean check(String tempNumber) {
        char[] numbers = tempNumber.toCharArray();
        int j = numbers.length - 1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == numbers[j]){
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    private String makeBinaryNumber(int i) {
        return Integer.toBinaryString(i);
    }

}
