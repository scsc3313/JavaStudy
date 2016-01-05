package com.company.state;

/**
 * Created by HSH on 2016. 1. 5..
 */
public class SelectableState implements State {
    @Override
    public void select(int productId, VendingMachine vendingMachine) {
        vendingMachine.provideProduct(productId);
        vendingMachine.decreaseCoin();

        if(vendingMachine.hasNoCoin())
            vendingMachine.changeState(new NoCoinState());
    }

    @Override
    public void increaseCoin(int coin, VendingMachine vendingMachine) {
        vendingMachine.increaseCoin(coin);
    }
}
