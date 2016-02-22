package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control() {
        ArrayList<Integer> iList = new ArrayList<>();
        ArrayList<Integer> jList = new ArrayList<>();

        float result = 1;

        for(int i = 10; i < 100; i++){
            for(int j = i; j < 100; j++){
                String iStringInt = String.valueOf(i);
                char[] ints = iStringInt.toCharArray();
                String jStringInt = String.valueOf(j);
                char[] ints2 = jStringInt.toCharArray();
                float tempNumber = (float) i/j;
                if(check(ints, ints2, tempNumber)){
                    iList.add(i);
                    jList.add(j);

                }

            }
        }
        for(int i = 0 ; i < iList.size(); i++){
            System.out.println(iList.get(i) + " / " + jList.get(i) + " = " + (double) iList.get(i)/jList.get(i));
            result *= (double) iList.get(i)/jList.get(i);
        }

        System.out.println("RESULT = " + result);
        System.out.println("분모 " + 1/result);
    }

    private boolean check(char[] ints, char[] ints2, float tempNumber) {

        if(ints[0] == ints2[0] && ints[1] == ints2[1])
            return false;

        if(ints[1] == 48 && ints2[1] == 48)
            return false;

        if(ints[0] == ints2[0]){
            if(tempNumber == (float) (ints[1] - 48)/(ints2[1] - 48)){
                return true;
            }
        }
        if(ints[0] == ints2[1]){
            if(tempNumber == (float) (ints[1] - 48)/(ints2[0] - 48)){
                return true;
            }
        }
        if(ints[1] == ints2[0]){
            if(tempNumber == (float) (ints[0] - 48)/(ints2[1]-48)){
                return true;
            }
        }
        if(ints[1] == ints2[1]){
            if(tempNumber == (float) (ints[0] - 48)/(ints2[0] - 48)){
                return true;
            }
        }

        return false;
    }

}
