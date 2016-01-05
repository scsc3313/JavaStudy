package com.company.strategy;

import com.company.Item;

import java.util.List;

/**
 * Created by HSH on 2016. 1. 5..
 */
public class CalculatorStrategy {

    private DisCountStrategy disCountStrategy;

    public CalculatorStrategy(DisCountStrategy disCountStrategy) {
        this.disCountStrategy = disCountStrategy;}

    public int calculate(List<Item> itemList){
        int sum = 0;
        for(Item item : itemList){
            sum += disCountStrategy.getDisCountPrice(item);
        }

        return sum;
    }
}
