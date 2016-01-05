package com.company;

/**
 * Created by HSH on 15. 10. 26..
 */
public class Calculator {

    private int firstNum, secondNum;
    private int sum, sub, multiple, etc;
    private float divide;


    public void calculator(){
        sum = firstNum + secondNum;
        sub = firstNum - secondNum;
        multiple = firstNum * secondNum;
        divide = (float) firstNum / secondNum;
        etc = firstNum % secondNum;
    }

    public void setData(int firstNum, int secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int getSum() {
        return sum;
    }

    public int getSub() {
        return sub;
    }

    public int getMultiple() {
        return multiple;
    }

    public int getEtc() {
        return etc;
    }

    public float getDivide() {
        return divide;
    }
}
