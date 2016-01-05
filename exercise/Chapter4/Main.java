package com.company;

public class Main {

    private Input input;
    private Output output;
    private Lotto lotto;
    private Calc calc;

    Main(){
        input = new Input();
        output = new Output();
        lotto = new Lotto();
        calc = new Calc();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    public void control(){
        output.printHowManyNubmer();
        input.inputNumber();

        calc.setHowManyNumber(input.getHowManyNumber());
        calc.setLottoNumber(lotto.getLottoNumber());
        calc.calculator();

        output.setLottoNumberLine(calc.getLottoNumberLine());
        output.printLottoNumber();
    }



}
