package com.company.state;

/**
 * Created by HSH on 2016. 1. 5..
 */
public interface State {
    void select(int productId, VendingMachine vendingMachine);

    void increaseCoin(int coin, VendingMachine vendingMachine);
}
