package com.company;

public class Main {

    private Input input;
    private Output output;
    private Calc calc;

    Main(){
        input = new Input();
        output = new Output();
        calc = new Calc();
    }

    private void control(){
        input.inputNum();

        calc.calculator(input.getInputNum());

        output.setInputNumber(input.getInputNum());
        output.setPrimeNumbers(calc.getPrimeNumbers());
        output.print();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }
}
