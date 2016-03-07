package com.company;

import java.util.ArrayList;

/**
 * Created by HSH on 2016. 3. 7..
 */
public class Print {

    public void print(ArrayList<String> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

}
