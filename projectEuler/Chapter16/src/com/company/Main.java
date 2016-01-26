package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        int result = 1;
        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 10;

        for(int j = 0; j < number ; j++){
            String resultString = String.valueOf(result);
            char[] resultCharArray = resultString.toCharArray();

            for(int i = resultCharArray.length - 1; i >= 0; i--){
                int tempNumber = (resultCharArray[i] - 48)*2;
                if(tempNumber > 9){
                    tempNumber -= 10;
                    resultCharArray[i+1]++;
                }
                numbers.add(tempNumber);
            }
        }


        for(int i = 0 ; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
