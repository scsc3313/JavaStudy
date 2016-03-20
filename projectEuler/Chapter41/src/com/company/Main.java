package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control() {
        System.out.println("The biggest PandigitalNumber" + findPandigitalNumber());
    }

    //Find FirstBig Pandigital and Prime Number
    private int findPandigitalNumber() {
        for(int i = 987654321; i > 0; i--){
            if(isPandigital(i)){
                return i;
            }
        }
        return 0;
    }
    //Check PrimeNum && PandigitalNum
    private boolean isPandigital(int num) {
        int count = 0;
        for(int i = 1 ; i < num; i ++){
            if(num % i == 0)
                count++;
            if(count > 2)
                return false;
        }
        String numStr = String.valueOf(num);
        char[] nums = numStr.toCharArray();
        for(int i = 1; i <= nums.length; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if((nums[j] - 48) == i){
                    nums[j] = 64;
                    break;
                }
            }
        }
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != 64)
                return false;
        }
        return true;
    }
}
