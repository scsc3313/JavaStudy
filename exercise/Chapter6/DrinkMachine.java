package com.company;

import java.util.ArrayList;

/**
 * Created by HSH on 2016. 1. 4..
 */
public class DrinkMachine {

    private ArrayList<Drink> drinkList;
    private int totalPrice;

    DrinkMachine(){
        drinkList = new ArrayList<Drink>();
    }

    public void addDrink(Drink drink){
        drinkList.add(drink);
    }

    public String toString(){
        StringBuilder drinkMachineInfo = new StringBuilder("");
        for(int i = 0; i < drinkList.size() ; i++){
            drinkMachineInfo.append(drinkList.get(i).printDrinkInfo());
        }

        return drinkMachineInfo.toString();
    }

    public int minusDrink(String drinkName, int drinkCount) throws Exception {

        for(int i = 0; i < drinkList.size(); i++){
            if(drinkName.equals(drinkList.get(i).getDrinkName())){
                if(drinkList.get(i).getDrinkCount() < drinkCount)
                    throw new Exception("음료수 갯수가 부족합니다!");
                drinkList.get(i).setDrinkCount(
                drinkList.get(i).getDrinkCount() - drinkCount);
                totalPrice = drinkList.get(i).getDrinkPrice() * drinkCount;
            }
        }
        return totalPrice;
    }

}
