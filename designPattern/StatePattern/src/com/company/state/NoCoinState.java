package com.company.state;

/**
 * Created by HSH on 2016. 1. 5..
 */
public class NoCoinState implements State {
    @Override
    public void select(int productId, VendingMachine vendingMachine) {
        //작동
    }

    @Override
    public void increaseCoin(int coin, VendingMachine vendingMachine) {
        vendingMachine.changeState(new SelectableState());
        vendingMachine.increaseCoin(coin);
    }
}
