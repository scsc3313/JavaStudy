package com.company;

import java.util.ArrayList;

public class Main {

    private ArrayList<String> arrayList;

    Main(){
        arrayList = new ArrayList<>();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }
    private void control(){
        makePandigitalNumber(1, 20000);
        print(arrayList);
        System.out.println("Max Number is " + maxNumber(arrayList));
    }

    private int maxNumber(ArrayList<String> arrayList) {
        int maxNumber = 0;
        for(int i = 0; i < arrayList.size(); i++){
            int tempNumber = Integer.valueOf(arrayList.get(i));
            if(maxNumber < tempNumber){
                maxNumber = tempNumber;
            }
        }
        return maxNumber;
    }

    private void print(ArrayList<String> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    private void makePandigitalNumber(int minNumber, int maxNumber) {
        for(int i = minNumber ; i < maxNumber ; i++){
            String totalString = "";
            char[] numbers = totalString.toCharArray();
            int j = 1;
            while(numbers.length < 9){
                totalString += String.valueOf(i * j);
                numbers = totalString.toCharArray();
                j++;
            }
            if(check(totalString) && numbers.length == 9){
                arrayList.add(totalString);
            }
        }
    }

    private boolean check(String totalString) {
        boolean result = false;
        char[] numbers = totalString.toCharArray();
        int[] k = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < 9; j++){
                if((numbers[i] - 48) == k[j]){
                    result = true;
                    k[j] = -1;
                    break;
                }
                else {
                    result = false;
                }
            }
        }
        for(int i = 0; i < 9; i++){
            if(k[i] == -1){
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}
