package com.company.nomal;

import com.company.Item;

import java.util.List;
//전략 패턴을 지키지 않은 클래스
public class Calculator {

    public int calculate(boolean firstGuest, List<Item> items){
        int sum = 0;
        for (Item item : items){
            if(firstGuest)
                sum += (int) item.getPrice() * 0.9;
            else if(! item.isFresh())
                sum += (int) item.getPrice() * 0.8;
            else
                sum += item.getPrice();
        }

        return sum;
    }
}
