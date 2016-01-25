package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 40;
        int r = 1;
        int count = 1;

        while(number >= 20){
            count *= number;
            count /= r;
            number--;
            r++;
        }
        System.out.println(count);
    }
}
