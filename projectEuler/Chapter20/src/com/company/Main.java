package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){

        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        int maxNum = 99;
        int startNum = 1;
        int count = 0;
        numbers.add(1);
        for(int i = maxNum; i > 97; i--){
            for(int k = 0; k < numbers.size(); k++){
                startNum = numbers.get(k) * i;
                int restNumber = 0;
                int restNumber2 = 0;
                if(startNum > 9){
                    restNumber = startNum%10;
                    startNum = startNum/10;
                    count++;
                    if(startNum > 9){
                        restNumber2 = startNum%10;
                        startNum = startNum/10;
                        count++;
                    }
                }
                for(int j = 0; j < count; j++){
                    numbers.add(j, startNum);
                    if(restNumber != 0){
                        if(numbers.get(j+1) != null){
                            restNumber += numbers.get(j+1);
                            if(restNumber > 9){
                                restNumber -= 10;
                                restNumber2++;
                            }
                        }
                        numbers.add(j+1, restNumber);
                    }

                    if(restNumber2 != 0){
                        if(numbers.get(j+2) != null){
                            restNumber2 += numbers.get(j+2);
                            if(restNumber2 > 9){
                                restNumber2 -= 10;
                                numbers.add(j+3, 1);
                            }
                        }
                        numbers.add(j+2, restNumber2);
                    }
                    System.out.println(startNum);
                }
            }
        }
    }
}
