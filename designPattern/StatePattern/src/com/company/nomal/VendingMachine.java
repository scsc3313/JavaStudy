package com.company.nomal;

public class VendingMachine {

    private int coin;

    public static enum State{ NOCOIN, SELECTABLE}

    private State state = State.NOCOIN;

    public void insertCoin(int coin){
        switch (state){
            case NOCOIN:
                increaseCoin(coin);
                state = State.SELECTABLE;
                break;
            case SELECTABLE:
                increaseCoin(coin);

        }
    }

    private void increaseCoin(int coin) {

    }

    public void select(int productId){
        switch (state){
            case NOCOIN:
                break;
            case SELECTABLE:
                provideProduct(productId);
                decreaseCoin();
                if(hasNoCoin())
                    state = State.NOCOIN;
        }
    }

    private boolean hasNoCoin() {
        return false;
    }

    private void decreaseCoin() {
        coin--;
    }

    private void provideProduct(int productId) {

    }
}
