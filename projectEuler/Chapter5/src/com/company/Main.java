package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private int inputNum;
    private Scanner scanner;
    private long factorMinMultiplyNumber;

    Main(){
        scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        inputNumber();
        System.out.print(factorMinMultiply(inputNum));
    }

    private void inputNumber(){
        System.out.println("What number do you like?");
        inputNum = scanner.nextInt();
    }

    private long factorMinMultiply(int inputNum){
        ArrayList<Integer> firstArray;
        ArrayList<Integer> secondArray;
        factorMinMultiplyNumber = 1;
        for(int i = 2; i <= inputNum ; i++){
            firstArray = findFactor(factorMinMultiplyNumber);
            secondArray = findFactor(i);
            for(int j = 0; j < secondArray.size(); j++)
                factorMinMultiplyNumber *= secondArray.get(j);

            for(int j = 0; j < firstArray.size(); j++){
                System.out.println(i + " first " + j + " " + firstArray.get(j));
                for(int k = 0; k < secondArray.size(); k++){
                    System.out.println(i + " second " + k + " " + secondArray.get(k));
                    if(firstArray.get(j) == secondArray.get(k)){
                        factorMinMultiplyNumber /= firstArray.get(j);
                        firstArray.remove(j);
                        secondArray.remove(k);
                    }
                }
            }
        }
            return factorMinMultiplyNumber;
    }

    private ArrayList<Integer> findFactor(long number){

        ArrayList<Integer> primeFactorNum = new ArrayList<>();

        for(int i = 2; i <= number ; i++){
            if(number % i == 0){
                primeFactorNum.add(i);
                number /= i;
                i = 1;
            }
        }
        return primeFactorNum;
    }
}
