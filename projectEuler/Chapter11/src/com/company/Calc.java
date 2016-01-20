package com.company;

/**
 * Created by HSH on 2016. 1. 20..
 */
public class Calc {

    private int[][] inputNumbers;
    private long maxMultiple = 0;

    public void setInputNumbers(int[][] inputNumbers){
        this.inputNumbers = inputNumbers;
    }

    public void findRow(){
        long mutiple;
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 17; j++){
                mutiple = inputNumbers[i][j] * inputNumbers[i][j+1] * inputNumbers[i][j+2] * inputNumbers[i][j+3];
                if(mutiple > maxMultiple)
                    maxMultiple = mutiple;
            }
        }

    }

    public void findCol(){
        long mutiple;
        for(int i = 0; i < 17; i++){
            for(int j = 0; j < 20; j++){
                mutiple = inputNumbers[i][j] * inputNumbers[i+1][j] * inputNumbers[i+2][j] * inputNumbers[i+3][j];
                if(mutiple > maxMultiple)
                    maxMultiple = mutiple;
            }
        }
    }

    public void findDiagonally(){
        long mutiple;
        for(int i = 0; i < 17; i++){
            for(int j = 0; j < 17; j++){
                mutiple = inputNumbers[i][j] * inputNumbers[i+1][j+1] * inputNumbers[i+2][j+2] * inputNumbers[i+3][j+3];
                if(mutiple > maxMultiple)
                    maxMultiple = mutiple;
            }
        }
    }

    public void findReverseDiagonally(){
        long mutiple;
        for(int i = 0; i < 17; i++){
            for(int j = 3; j < 20; j++){
                mutiple = inputNumbers[i][j] * inputNumbers[i+1][j-1] * inputNumbers[i+2][j-2] * inputNumbers[i+3][j-3];
                if(mutiple > maxMultiple)
                    maxMultiple = mutiple;
            }
        }
    }

    public long getMaxMultiple() {
        return maxMultiple;
    }
}
