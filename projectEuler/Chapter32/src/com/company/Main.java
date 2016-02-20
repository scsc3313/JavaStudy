package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        int totalSum = 0;
        long result;

        for(int a = 1; a < 987; a ++){
            for(int b = 12; b < 9876; b++){
                result = a * b;
                String length = String.valueOf(a) + String.valueOf(b) + String.valueOf(result);
                if(length.length() != 9 )
                    break;

                int count = 0;
                char[] c = length.toCharArray();
                for(int i = 1; i <= 9 ; i++){
                    for(int j = 0; j < 9; j++){
                        if(i == (c[j] - 48)){
                            count++;
                            i++;
                            j = -1;
                        }
                    }
                }

                if(count == 9){
                    System.out.println(a +" * "+ b + " = " +result);
                    totalSum += result;
                }
            }
        }
        System.out.print("totalSum is " + totalSum);
    }
}
