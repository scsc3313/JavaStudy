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
        int max = 0;
        int maxI  = 0;
        for(int i = 0; i < arrayList.size(); i++){
            int tempCount = findTotalSize(arrayList.get(i)[3]);
            if(max < tempCount){
                max = tempCount;
                maxI = arrayList.get(i)[3];
            }
        }
        System.out.println("최대 횟수는 : " + max + " 둘레는 " + maxI);
    }

    private int findTotalSize(int totalSize) {
        int count = 0;
        for(int i = 0 ; i < arrayList.size(); i++){
            if(totalSize == arrayList.get(i)[3])
                count++;
        }
        return count;
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
