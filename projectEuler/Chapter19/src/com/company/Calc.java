package com.company;

/**
 * Created by HSH on 2016. 1. 29..
 */
public class Calc {

    private int basicTotalDate;
    private int count = 0;

    public void setBasicTotalDate(int basicTotalDate) {
        this.basicTotalDate = basicTotalDate;
    }

    public void check(int totalDate){
        totalDate -= basicTotalDate;
            if(totalDate % 7 == 6) //1900년 1월 7일이 일요일 이기때문에 나머지가 6이면 일요일이다.
                count++;
    }

    public int getCount() {
        return count;
    }
}
