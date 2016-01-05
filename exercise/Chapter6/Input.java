package com.company;

import java.util.Scanner;

/**
 * Created by HSH on 2016. 1. 4..
 */
public class Input {
    private int inputMoney;
    private String inputDrink;
    private int inputCount;


    public void inputMoney() {
        System.out.println("얼마를 넣으시겠습니까?");
        Scanner scanner = new Scanner(System.in);
        inputMoney = scanner.nextInt();

        System.out.println("무엇을 사시겠습니까? 이름을 적으세요");
        Scanner scanner1 = new Scanner(System.in);
        inputDrink = scanner1.next();

        System.out.println("몇 개를 구매하시겠습니까?");
        inputCount = scanner.nextInt();
    }

    public int getInputMoney() {
        return inputMoney;
    }

    public String getInputDrink() {
        return inputDrink;
    }

    public int getInputCount() {
        return inputCount;
    }
}
