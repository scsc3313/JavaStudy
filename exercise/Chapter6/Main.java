package com.company;

public class Main {

    private DrinkManager drinkManager;
    private Input input;
    private DrinkMachine drinkMachine;

    public static void main(String[] args) throws Exception {
        Main start = new Main();
        start.control();
    }

    Main(){
        drinkMachine = new DrinkMachine();
        drinkManager = new DrinkManager(drinkMachine);
        input = new Input();
    }

    private void control() throws Exception {
        Drink coke = new Drink("콜라", 800, 10);
        Drink cider = new Drink("사이다", 700, 5);
        Drink juice = new Drink("오렌지쥬스", 600, 15);

        drinkManager.injectionDrink(coke);
        drinkManager.injectionDrink(cider);
        drinkManager.injectionDrink(juice);

        System.out.println(drinkMachine.toString());
        input.inputMoney();

        drinkManager.saleDrink(input.getInputDrink(), input.getInputCount(), input.getInputMoney());
        System.out.println("총 구매한 가격 : " + drinkManager.getTotalPrice() + "원");
        System.out.println(drinkMachine.toString());
    }
}
