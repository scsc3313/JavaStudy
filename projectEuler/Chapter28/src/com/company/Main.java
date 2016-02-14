package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        int count = 0;
        long sum = 1;
        int currentNumber = 1;
        int howMany = 0;
        while(howMany < 500){
            count += 2;
            for(int i = 1; i < 5; i ++){
                currentNumber += count;
                sum += currentNumber;
            }
            howMany++;
        }
        System.out.println("Sum is "+sum);
    }
}
