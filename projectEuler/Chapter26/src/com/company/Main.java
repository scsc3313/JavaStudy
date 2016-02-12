package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        for(int i = 1; i < 10; i++){
            findCircleNumber(i);
        }
    }

    private void findCircleNumber(int d){
        double number = (double) 1 / d ;
        String numberString = String.valueOf(number);
        char[] numbers = numberString.toCharArray();
        for(int i = 2; i < numbers.length ; i++){
            String circleNumber = "";
            if(i < numbers.length -1){
                if(numbers[i] != numbers[i+1]){
                    circleNumber += numbers[i];
                }
                char[] tempNumbers = circleNumber.toCharArray();
            }
            System.out.print(circleNumber);
        }
        System.out.println(numberString);
    }
}
