package com.company;

import java.util.ArrayList;

/**
 * Created by HSH on 2016. 3. 7..
 */
public class MaxNumber {

    public int maxNumber(ArrayList<String> arrayList) {
        int maxNumber = 0;
        for(int i = 0; i < arrayList.size(); i++){
            int tempNumber = Integer.valueOf(arrayList.get(i));
            if(maxNumber < tempNumber){
                maxNumber = tempNumber;
            }
        }
        return maxNumber;
    }

}
