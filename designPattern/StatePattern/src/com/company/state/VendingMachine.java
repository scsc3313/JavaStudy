package com.company.state;

/**
 * Created by HSH on 2016. 1. 5..
 */
public class VendingMachine {

    private State state;
    private int coin;
    private boolean hasNoCoin;

    public VendingMachine(){
        state = new NoCoinState();
    }

    public void increaseCoin(int coin){
        state.increaseCoin(coin, this);
    }

    public void select(int productId){
        state.select(productId, this);
    }

    public void changeState(State newState){
        this.state = newState;
    }

    public void provideProduct(int productId) {
    }

    public void decreaseCoin() {
        coin--;
    }

    public boolean hasNoCoin() {
        return hasNoCoin;
    }
}
