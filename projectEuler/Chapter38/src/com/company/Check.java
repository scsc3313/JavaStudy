package com.company;

/**
 * Created by HSH on 2016. 3. 7..
 */
public class Check {

    public boolean check(String totalString) {
        boolean result = false;
        char[] numbers = totalString.toCharArray();
        int[] k = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < 9; j++){
                if((numbers[i] - 48) == k[j]){
                    result = true;
                    k[j] = -1;
                    break;
                }
                else {
                    result = false;
                }
            }
        }
        for(int i = 0; i < 9; i++){
            if(k[i] == -1){
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}
