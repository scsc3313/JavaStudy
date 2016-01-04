package com.company;

/**
 * Created by HSH on 15. 11. 5..
 */
public class Lotto {

    private int[] lottoNumber;

    public Lotto() {

        lottoNumber = new int[45];
        initLottoNumber();
    }

    public void initLottoNumber(){
        for (int i = 0; i < 45 ; i ++){
            lottoNumber[i] = i+1;
        }
    }

    public int[] getLottoNumber() {
        return lottoNumber;
    }
}
