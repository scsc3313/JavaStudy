package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        int sum = 0; //각 자리 수를 더한 값
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 1000; //자리수! 1000으로 바꿀것.
        numbers.add(2); //처음 시작하는 숫자
        for(int j = 1; j < number ; j++){

            for(int i = numbers.size() - 1; i >= 0; i--){
                int tempNumber = numbers.get(i)*2;
                if(tempNumber > 9){
                    tempNumber -= 10;
                    if(numbers.size() -1 == i){
                        numbers.add(1);
                    }
                    else {
                        numbers.set(i+1, numbers.get(i+1)+1);
                    }
                }
                numbers.set(i, tempNumber);
            }
        }


        for(int i = 0 ; i < numbers.size(); i++){
            System.out.println("number.get : " + numbers.get(i));
            sum += numbers.get(i);
        }
        System.out.println("sum : " + sum);
    }
}
