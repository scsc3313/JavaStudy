package com.company;

/**
 * Created by HSH on 2016. 1. 4..
 */
public class DrinkManager {

    private DrinkMachine drinkMachine;
    private int totalPrice;

    DrinkManager(DrinkMachine drinkMachine){
        this.drinkMachine = drinkMachine;
    }

    public void injectionDrink(Drink drink){
        drinkMachine.addDrink(drink);
    }

    public void saleDrink(String inputDrink, int inputCount, int inputMoney) throws Exception {
        totalPrice = drinkMachine.minusDrink(inputDrink, inputCount);
        if(inputMoney < totalPrice)
            throw new Exception("돈이 부족해요!");
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
