package com.company;

/**
 * Created by HSH on 2016. 1. 28..
 */
public class Date {
    private int totalDate;
    private int date;
    private int month;
    private int year;
    private int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void setDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public void totalCalc(){
        totalDate = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400; //윤년 포함 연도 계산
        for(int i = 0; i < month-1 ; i++){
            if((year % 4 == 0 && year % 100 == 0) || year % 400 == 0){ //윤년일 경우
                months[1] = 29;
            }
            months[1] = 28;
            totalDate += months[i];
        }
        totalDate += date;
    }

    public int getTotalDate() {
        return totalDate;
    }
}
