package com.company.strategy;

import com.company.Item;

/**
 * Created by HSH on 2016. 1. 5..
 */
public class FirstGuestDisCountStrategy implements DisCountStrategy {
    @Override
    public int getDisCountPrice(Item item) {
        return (int) (item.getPrice() * 0.9);
    }
}
