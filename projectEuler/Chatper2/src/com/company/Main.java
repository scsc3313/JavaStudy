package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int fibonacciNum = 0;
        int inputNum;
        int index = 0;
        int sum = 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        numbers.add(1);
        numbers.add(2);

        while (fibonacciNum < inputNum){
            fibonacciNum = numbers.get(index) + numbers.get(++index);
            numbers.add(fibonacciNum);
            System.out.println(fibonacciNum);
        }

        for(int i = 0; i < numbers.size() ; i++){
            if(numbers.get(i) % 2 == 0)
                sum += numbers.get(i);
        }
        System.out.println("evenNumber's Total : " + sum);


    }
}
