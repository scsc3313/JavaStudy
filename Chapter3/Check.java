package com.company;

/**
 * Created by HSH on 15. 11. 3..
 */
public class Check {

    private int number;
    private String ack;


    public void setNumber(int number) {
        this.number = number;
    }

    public void setAck(String ack) {
        this.ack = ack;
    }


    public void checkIsInteger() throws Exception{
        if(!isInteger())
            throw new Exception("1~9 사이의 정수를 입력하세요!");
    }

    private boolean isInteger(){
        if(number > 0 && number < 10){
            return true;
        }
        return false;
    }

    public boolean checkInYorN() throws Exception{
        if(!isYesorNo())
            throw new Exception("y나 n를 입력하세요!");

        if(ack.equals("y")){
            return true;
        }
        return false;
    }

    private boolean isYesorNo(){
        if(ack.equals("y")|| ack.equals("n")){
            return true;
        }
        return false;
    }

}
