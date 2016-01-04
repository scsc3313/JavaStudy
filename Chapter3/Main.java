package com.company;

public class Main {

    private Input input;
    private Calc calc;
    private Output output;
    private Check check;

    Main(){
        input = new Input();
        calc = new Calc();
        output = new Output();
        check = new Check();
    }

    public static void main(String[] args) throws Exception {
	// write your code here
        Main main = new Main();
        main.control();
    }

    public void control() throws Exception {

      do{

        input.inputData();
        check.setNumber(input.getNumber());
        check.checkIsInteger();

        calc.setCalc(input.getNumber());
        calc.calculator();

        output.setPrint(input.getNumber(), calc.getCoocoodan());
        output.print();
        output.printQuestion();
        input.inputYorN();
        check.setAck(input.getAck());
      } while (check.checkInYorN());

    }
}
