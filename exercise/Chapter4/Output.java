package com.company;

/**
 * Created by HSH on 15. 11. 5..
 */
public class Output {


    private String[] lottoNumberLine;

    public void setLottoNumberLine(String[] lottoNumberLine) {
        this.lottoNumberLine = lottoNumberLine;
    }

    public void printHowManyNubmer(){
        System.out.println("랜덤 숫자를 몇개 뽑을까요?");
    }


    public void printLottoNumber() {
        for(int i = 0; i < lottoNumberLine.length ; i++){
            System.out.println((i+1)+"번째 로또 : "+lottoNumberLine[i]);
        }
    }





}
