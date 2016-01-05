package com.company;

/**
 * Created by HSH on 15. 11. 11..
 */
public class Calc {


    private int howManyNumber;
    private int[] lottoNumber;
    private String[] lottoNumberLine;


    public void setLottoNumber(int[] lottoNumber) {
        this.lottoNumber = lottoNumber;
    }

    public void setHowManyNumber(int howManyNumber) {
        this.howManyNumber = howManyNumber;
        lottoNumberLine = new String[howManyNumber];
    }

    public void calculator(){
        for (int j = 0; j < howManyNumber; j++) {  // 입력한 숫자만큼 반복한다!
            lottoNumberLine[j] = "";
            for(int i = 0; i < 6 ; i++){  //6번 반복한다! 로또니깐 ㅎㅎ
                int random = (int) (Math.random() * 44) + 1;
                if(lottoNumber[random] != 0){
                    String s = "0";
                    if(lottoNumber[random] < 10){  //숫자가 10보다 작으면
                        lottoNumberLine[j] += s;
                    }
                    lottoNumberLine[j] += lottoNumber[random] + " ";
                    lottoNumber[random] = 0;
                 }
                else{  //lottoNumber[random] == 0
                    i--;
                }
            }
            new Lotto().initLottoNumber();
        }
    }

    public String[] getLottoNumberLine(){
        return lottoNumberLine;
    }



}
