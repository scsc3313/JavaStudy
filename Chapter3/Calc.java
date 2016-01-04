package com.company;

/**
 * Created by HSH on 15. 11. 2..
 */
public class Calc {


    private int number;
    private int[] coocoodan;

    public Calc(){
        coocoodan = new int[9];
    }

    public void calculator() {
        for(int i = 0; i < 9 ; i++){
            coocoodan[i] = number * (i+1);
        }
    }

    public void setCalc(int number) {
        this.number = number;
    }

    public int[] getCoocoodan() {
        return coocoodan;
    }
}
