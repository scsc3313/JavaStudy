package com.company;

public class Main {

    private int totalSum;
    private int[] numbers =    {3, 3, 5, 4, 4, 3, 5, 5, 4}; // 0, one two three four five six seven eight nine ten
    private int[] tenNumbers = {3, 6, 6, 8, 8, 7, 7, 9, 8, 8};
    private int[] twentyNumbers = {6, 6, 5, 5, 5, 7, 6, 6};
    private int hundred = 6; // "hundred" length is 9
    private int and = 3;
    Main(){
        totalSum = 0;
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        for(int i = 1 ; i <=1000 ; i++){
            totalSum += check(i);
            System.out.println("i : " + i + " totalSum : " +totalSum);
        }
        System.out.println(totalSum);
    }

    private int check(int number) {
        if (number == 1000)
            return 9;
        if (number >= 100) {
            if (number % 100 == 0)
                return numbers[number / 100 - 1] + hundred;
            int tenNumber = number - number / 100 * 100; // 10자리 수
            if (tenNumber < 20){
                if(tenNumber < 10){
                    return hundred + and + numbers[number / 100 - 1] + numbers[tenNumber - 1];
                }
                return tenNumbers[tenNumber - 10] + hundred + and + numbers[number / 100 - 1];
            }
            if(tenNumber % 10 == 0){
                return twentyNumbers[(tenNumber / 10) - 2];
            }
            int twentyNumber = tenNumber / 10; // 10자리 숫자의 수
            return twentyNumbers[twentyNumber - 2] + numbers[tenNumber - twentyNumber*10 - 1] + hundred + and + numbers[number / 100 - 1];
        }
        if(number >= 10){
            if(number % 10 == 0){
                if(number == 10){
                    return tenNumbers[0];
                }
                return twentyNumbers[(number / 10) - 2];
            }
            if(number < 20){
                return tenNumbers[number - 11];
            }
            int tenOverNumber = number - number / 10 * 10;
            return numbers[tenOverNumber - 1] + twentyNumbers[number/10 - 2];
        }
        return numbers[number - 1];
    }

}
