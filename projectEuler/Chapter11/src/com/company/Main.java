package com.company;

public class Main {

    private InputNumber inputNumber;
    private Convert convert;
    private Calc calc;
    private int[][] intNumbers;

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    Main(){
        inputNumber = new InputNumber();
        convert = new Convert();
        calc = new Calc();
    }

    private void control() {
        intNumbers = convert.convert(inputNumber.getInputNumber());
        calc.setInputNumbers(intNumbers);
        calc.findCol();
        calc.findRow();
        calc.findDiagonally();
        calc.findReverseDiagonally();
        System.out.println("MAX multiple Number is " + calc.getMaxMultiple());
    }

}
