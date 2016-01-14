package com.company;

import java.util.Scanner;

/**
 * Created by HSH on 2016. 1. 14..
 */
public class Input {

    private String inputNumuber;
    private Scanner scanner;

    Input(){
        scanner = new Scanner(System.in);
    }

    public void inputNumber() {
        System.out.println("정수를 입력해주세요!");
        inputNumuber = scanner.nextLine();
    }

    public String getInputNumuber() {
        return inputNumuber;
    }
}
