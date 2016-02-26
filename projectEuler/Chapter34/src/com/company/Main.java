package com.company;

public class Main {

    private int totalSum;

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        int maxNumber = 10000000;
        String[] numbers = new String[maxNumber];
        int sum;
        for(int i = 0; i < maxNumber; i++){
            numbers[i] = String.valueOf(i);
            sum = makeSum(numbers[i]); //총합을 구하는 함수
            if(i == sum && i > 2){
                System.out.println(i);
                totalSum += i;
            }
        }
        System.out.println("TotalSum is " +totalSum);
    }

    private int makeSum(String number) {  //총합을 구하는 함수
        int sum = 0;
        char[] numbers = number.toCharArray();

        for(int i = 0; i < numbers.length; i++){
            sum += factorial(numbers[i]); // 각 숫자 한 자리 수들을 팩토리얼로 구하는 함수
        }
        return sum;
    }

    private int factorial(char number) { // 각 숫자 한 자리 수들을 팩토리얼로 구하는 함수
        int sum = 1;
        for(int i = 1; i <= number - 48 ; i++){
            sum *= i;
        }
        return sum;
    }
}
