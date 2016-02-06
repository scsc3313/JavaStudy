package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    private BufferedReader bufferedReader;
    private int totalSum;

    Main() throws FileNotFoundException {
        bufferedReader = new BufferedReader(new FileReader("names.txt"));
        totalSum = 0;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.control();
    }

    private void control() throws IOException {
        String string = bufferedReader.readLine();
        String[] names = string.split(",");

        int nameLen = names.length;

        int[] namesCount = new int[nameLen];
        String[] onlyNames = new String[nameLen];

        for(int i = 0; i < nameLen; i++){
            onlyNames[i] = names[i].replace("\"", "");
        }
        Arrays.sort(onlyNames);
        for(int i = 0; i < nameLen; i++){
            namesCount[i] = calcuator(onlyNames[i]);
        }
        for(int i = 0; i < nameLen; i++){
            totalSum += (i+1)*namesCount[i];
        }
        System.out.print("TotalSum is " + totalSum);
    }

    private int calcuator(String name){
        byte[] bytes = name.getBytes();
        int sum = 0;
        int[] ints = new int[bytes.length];
        for(int i = 0; i < bytes.length ; i++){
            ints[i] = bytes[i] - 64;
            sum += ints[i];
        }
        return sum;
    }

}
