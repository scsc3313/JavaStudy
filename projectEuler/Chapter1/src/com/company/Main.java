package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int inputNumber;
        int totalNumber = 0;
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();

        for(int i = 1 ; i < inputNumber ; i++){

            if(i % 3 == 0)
                totalNumber += i;
            if(i % 5 == 0)
                totalNumber += i;
            if(i % 15 ==0)
                totalNumber -= i;

        }

        System.out.println("입력한 숫자는 " + inputNumber + " 보다 작고 3과 5의 배수를 합한 총 숫자는 " +  totalNumber);

    }
}
