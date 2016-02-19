package com.company;

public class Main {
    private int money[] = {1,2,5,10,20,50,100,200};


    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }
    private void control(){
        int pence1 = 1;
        int pence2 = 2;
        int pence5 = 5;
        int pence10 = 10;
        int pence20 = 20;
        int pence50 = 50;
        int pound1 = 100;
        int pound2 = 200;
        int count = 0;

        calcualtor(count);

    }

    private void calcualtor(int count) {
        int money200 = 200;
        while(money200 == 0){
            money200 -= money[7];
        }
    }
}
