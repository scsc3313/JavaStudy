package com.company;

/**
 * Created by HSH on 15. 11. 2..
 */
public class Output {


    private int[] coocoodan;
    private int number;

    public void setPrint(int number, int[] coocoodan) {
        this.number = number;
        this.coocoodan = coocoodan;
    }

    public void print() {
        for(int i = 0; i < 9 ; i++){
            System.out.println(number + " * " + (i+1) + " = " + coocoodan[i]);
        }
    }

    public void printQuestion(){
        System.out.println("다시하시겠습니까? (y or n)");
    }
}
