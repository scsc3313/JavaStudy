package com.company;

public class Main {

    private int firstNum, secondNum;
    private int count;

    Main(){
        firstNum = 1;
        secondNum = 1;
        count = 0;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        System.out.println(firstNum);
        count++;
        System.out.println(secondNum);
        count++;
        while(firstNum + secondNum < 1000){
            firstNum = fibonachi(firstNum, secondNum);
            secondNum = fibonachi(firstNum, secondNum);
            System.out.println(firstNum);
            count++;
            System.out.println(secondNum);
            count++;
        }
        count++;
        System.out.println("First over 1000 is " + count);
    }

    private int fibonachi(int num1, int num2){
        return num1 + num2;
    }
}
