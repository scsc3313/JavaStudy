package com.company;

import java.util.Scanner;

/**
 * Created by HSH on 15. 11. 2..
 */
public class Input {


    private int number;
    private Scanner scanner;
    private Scanner scanner2;



    private String ack;

    Input(){
        scanner = new Scanner(System.in);
        scanner2 = new Scanner(System.in);
    }

    public void inputData(){
        number = scanner.nextInt();
    }

    public void inputYorN(){
        ack = scanner2.nextLine();
    }




    public int getNumber() {
        return number;
    }
    public String getAck() {
        return ack;
    }
}
