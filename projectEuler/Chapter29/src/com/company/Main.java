package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        int a = 2, b = 2;
        ArrayList<Double> numbers = new ArrayList<>();
        while(a < 100){
            while(b < 100){
                double tempNumber = a;
                for(int i = 2 ; i <= b; i++){
                    tempNumber *= a;
                }
                numbers.add(tempNumber);
                System.out.println(tempNumber);
                tempNumber = a;
                b++;
            }
            a++;
            b = 2;
        }
        //중복제거를 위해 HASHSET을 사용
        HashSet hs = new HashSet<>(numbers);

        ArrayList<Double> numbers2 = new ArrayList<>(hs);
        System.out.println("TotalCount is " + numbers2.size());
    }
}
