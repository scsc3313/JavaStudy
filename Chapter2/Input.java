package com.company;

import java.util.Scanner;

/**
 * Created by HSH on 15. 10. 26..
 */
public class Input {

    private Scanner scan;
    private int firstNum, secondNum;

    //Scanner같이 한번선언하고 여러곳에서 사용할경우에는
    //(이번 코드는 inputData메소드에서만 사용하지만 프로그램이 커진다면..)
    //생성자에서 선언하고 사용하는게 효율적!
    
    public Input(){
        scan = new Scanner(System.in);
    }

    public void inputData(){
        firstNum = scan.nextInt();
        secondNum = scan.nextInt();
    }

    public int getSecondNum() {
        return secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }
}
