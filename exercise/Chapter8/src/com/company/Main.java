package com.company;

public class Main {

    private Input input;
    private Output output;
    private CountInteger countInteger;

    Main(){
        input = new Input();
        output = new Output();
        countInteger = new CountInteger();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        input.inputNumber();

        int[] numbers;
        numbers = countInteger.convert(input.getInputNumuber());
        countInteger.countInteger(numbers);

        output.print(countInteger.getCounts());
    }
}
