package com.company;

public class Main {

    private SumSquare sumSquare;
    private SquareSum squareSum;

    Main(){
        sumSquare = new SumSquare();
        squareSum = new SquareSum();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        int inputNumber = 100;
        long gapSumSquareAndSquareSum = sumSquare.sumSquare(inputNumber) - squareSum.squareSum(inputNumber);
        System.out.println("1부터 " + inputNumber+"까지 자연수에 대해 합의 제곱과 제곱의 합의 차는 " + gapSumSquareAndSquareSum);
    }
}
