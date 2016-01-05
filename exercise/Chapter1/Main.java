package com.company;

import java.util.Scanner;

public class Main {

    private int firstNum, secondNum;
    private int sum, sub, multiple, etc;
    private float divide;
    private Scanner scan;

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    public void control(){

        System.out.println("사친연산 계산기! 두 수를 입력하세요.");
        scan = new Scanner(System.in);
        firstNum = scan.nextInt();
        secondNum = scan.nextInt();

        sum = firstNum + secondNum;
        sub = firstNum - secondNum;
        multiple = firstNum * secondNum;
        divide = (float) firstNum / secondNum;
        etc = firstNum % secondNum;

        System.out.println("첫번째 수  : " + firstNum);
        System.out.println("두번째 수  : " + secondNum);
        System.out.println("합 : " + sum);
        System.out.println("차 : " + sub);
        System.out.println("곱 : " + multiple);
        System.out.println("나누기 : " + divide);
        System.out.println("나머지 : " + etc);
    }
}
