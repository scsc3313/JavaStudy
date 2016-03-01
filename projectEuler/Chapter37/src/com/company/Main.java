package com.company;

import java.util.ArrayList;

public class Main {

    private int maxNumber;
    private ArrayList<Integer> arrayList;


    public Main() {
        maxNumber = 1000;
        arrayList = new ArrayList<>();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
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

        print(arrayList);
    }

    private void print(ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
