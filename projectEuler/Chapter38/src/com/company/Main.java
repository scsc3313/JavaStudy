package com.company;

import java.util.ArrayList;

public class Main {

    private ArrayList<String> arrayList;
    private ArrayList<String> realArrayList;
    private Check check;
    private MaxNumber maxNumber;
    private Print print;
    private PandigitalNumber pandigitalNumber;

    Main(){
        check = new Check();
        maxNumber = new MaxNumber();
        print = new Print();
        pandigitalNumber = new PandigitalNumber();
        arrayList = new ArrayList<>();
        realArrayList = new ArrayList<>();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }
    private void control(){
        arrayList = pandigitalNumber.makePandigitalNumber(1, 20000);
        for(int i = 0; i < arrayList.size(); i++){
            String tempString = arrayList.get(i);
            char[] numbers = tempString.toCharArray();
            if(check.check(tempString) && numbers.length == 9){
                realArrayList.add(tempString);
            }
        }
        print.print(realArrayList);
        System.out.println("Max Number is " + maxNumber.maxNumber(realArrayList));
    }


}
