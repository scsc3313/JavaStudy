package com.company;

import java.util.ArrayList;

/**
 * Created by HSH on 2016. 3. 7..
 */
public class PandigitalNumber {

    private ArrayList<String> arrayList;

    PandigitalNumber(){
        arrayList = new ArrayList<>();
    }

    public ArrayList<String> makePandigitalNumber(int minNumber, int maxNumber) {
        for(int i = minNumber ; i < maxNumber ; i++){
            String totalString = "";
            char[] numbers = totalString.toCharArray();
            int j = 1;
            while(numbers.length < 9){
                totalString += String.valueOf(i * j);
                numbers = totalString.toCharArray();
                j++;
            }
            arrayList.add(totalString);
        }
        return arrayList;
    }
}
