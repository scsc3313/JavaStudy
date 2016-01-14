package com.company;

/**
 * Created by HSH on 2016. 1. 14..
 */
public class Output {

    private int[] counts;
    private StringBuilder stringBuilder;

    public Output() {
        stringBuilder = new StringBuilder();
    }

    public void print(int[] counts) {
        this.counts = counts;
        stringBuilder
                .append("출력 결과물 : ");
        for (int i = 0; i < counts.length ; i++){
            if(counts[i] != 0){
            stringBuilder
                    .append(i)
                    .append(counts[i]);
            }
        }
        System.out.println(stringBuilder.toString());
    }


}
