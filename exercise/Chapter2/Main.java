package com.company;

public class Main {

    private Input input;
    private Output output;
    private Calculator calculator;


    public Main(){
        input = new Input();
        output = new Output();
        calculator = new Calculator();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    public void control(){
        output.printFirst();
        input.inputData();

        calculator.setData(input.getFirstNum(), input.getSecondNum());
        calculator.calculator();

        output.setFirstNum(input.getFirstNum());
        output.setSecondNum(input.getSecondNum());
        output.setSum(calculator.getSum());
        output.setSub(calculator.getSub());
        output.setMultiple(calculator.getMultiple());
        output.setEtc(calculator.getEtc());
        output.setDivide(calculator.getDivide());

        output.print();
    }
}
