package com.company;

public class Main {

    private Date date;
    private Calc calc;

    public static void main(String[] args) {
        Main main = new Main();
        main.control();

    }

    Main(){
        calc = new Calc();
        date = new Date();
    }
    private void control() {
        init();
        int year = 1901; //처음년도
        for(int i = 1; i < 13; i++){
            if(year == 2001) //2001년이 되면 반복문 종료
                break;
            date.setDate(1, i, year);
            date.totalCalc();
            calc.check(date.getTotalDate());
            System.out.println("year : " + year+ "month : " + i );
            if(i == 12){ //12월이되면 년도를 증가시키고 1월부터 재실행
                year++;
                i = 1;
            }
        }
        System.out.println(calc.getCount());
    }

    private void init(){
        date.setDate(1, 1, 1900);
        date.totalCalc();
        calc.setBasicTotalDate(date.getTotalDate());
    }
}
