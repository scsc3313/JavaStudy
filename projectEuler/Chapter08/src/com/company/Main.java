package com.company;

public class Main {

    private Input input;
    private Convert convert;
    private String bigNumber;
    private int[] intNumbers;
    private Calc calc;
    private int maxNumber;

    Main(){
        input = new Input();
        convert = new Convert();
        calc = new Calc();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){

        bigNumber = input.getBigNumber();
        intNumbers = convert.convert(bigNumber);

        calc.calc(intNumbers);
        maxNumber = calc.getMaxNumber();
        System.out.println("Max number is " + maxNumber);
    }
}
