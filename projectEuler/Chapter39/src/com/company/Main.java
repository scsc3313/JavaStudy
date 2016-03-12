package com.company;

import java.util.ArrayList;

public class Main {

    private int totalSize;
    private ArrayList<int[]> arrayList;

    Main(){
        totalSize = 1000;
        arrayList = new ArrayList<>();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control() {
        calculator();
        print();
    }

    private void print() {
        for(int i = 0; i < arrayList.size(); i++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int j = 0 ; i < arrayList.get(i).length; i++){
                stringBuilder.append(arrayList.get(i)[j]).append(" ");
            }
            System.out.println(stringBuilder.toString());
        }
    }

    private boolean find(int total) {
        for(int i = 0; i < arrayList.size(); i++){
            if(total == arrayList.get(i)[3])
                return true;
        }
        return false;
    }

    private void calculator() {
        for(int a = 3; a < totalSize; a++){
            for(int i = 1 ; i < totalSize-2 ; i++){
                for(int j = i ; j < totalSize -2 ; j++){
                    int k = a - i - j;
                    if(k <= j)
                        break;
                    if(check(i, j, k)){
                        int[] temp = {i, j, k, i+j+k};
                        arrayList.add(temp);
                    }
                }
            }
        }
    }

    private boolean check(int i, int j, int k) {
        if(k*k == i*i + j*j)
            return true;
        return false;
    }
}
