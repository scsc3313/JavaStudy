package com.company;

import java.util.Scanner;

/**
 * Created by HSH on 2016. 1. 6..
 */
public class Input {

    private int inputNum;

    public void inputNum(){
        System.out.println("정수 n을 입력하면 n보다 작은 소수를 출력합니다.");
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
    }

    public int getInputNum() {
        return inputNum;
    }
}
