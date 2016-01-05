package com.company;

/**
 * Created by HSH on 2016. 1. 4..
 */
public class Drink {

    private String drinkName;
    private int drinkPrice;
    private int drinkCount;

    public Drink(String drinkName, int drinkPrice, int drinkCount) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkCount = drinkCount;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public int getDrinkCount() {
        return drinkCount;
    }

    public void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }

    public String printDrinkInfo(){
        return  "이름 : "
                + getDrinkName() + "\n"
                + "가격 : "
                + getDrinkPrice() + "\n"
                + "갯수 : "
                + getDrinkCount() + "\n";
    }
}
