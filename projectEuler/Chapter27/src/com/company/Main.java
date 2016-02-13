package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        int n = 1, a = 0, b = 0;
        int calcuatoredNumber; //계산된 숫자
        int primeNumberCount = 0; //소수 갯수
        int maxCount = 0; //최대 소수 갯수
        int maxA = 0, maxB = 0;
        while(a < 1000){
            while(b < 1000){
                while(n < 100){
                    calcuatoredNumber = n*n - a*n + b;
                    if(check(calcuatoredNumber)){
                        primeNumberCount++;
                        n++;
                    }
                    else {
                        if(primeNumberCount > maxCount){
                            maxCount = primeNumberCount;
                            maxA = a;
                            maxB = b;
                        }
                        b++;
                        n = 1;
                        primeNumberCount = 0;
                        break;
                    }
                }
            }
            b = 0;
            a++;
        }


        System.out.println("maxCount is " + maxCount);
        System.out.println("maxA is " + maxA);
        System.out.println("maxB is " + maxB);
    }

    private boolean check(int calcuatoredNumber) {
        int count = 0;
        for(int i = 2; i <= calcuatoredNumber ; i++){
            if(calcuatoredNumber % i == 0)
                count++;
        }
        if(count == 1)
            return true;
        return false;
    }
}
