package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control() {
        String total = "";
        for(int i = 0 ; i < 200000; i++){
            total += String.valueOf(i);
        }
        System.out.println(total);
        char[] numbers = total.toCharArray();
        System.out.println(numbers.length);
        int result = (numbers[1]-48) * (numbers[10]-48) * (numbers[100]-48) * (numbers[1000]-48) * (numbers[10000]-48) * (numbers[100000]-48) * (numbers[1000000]-48);
        System.out.println(result);
    }
}
