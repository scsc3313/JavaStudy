package com.company;

public class Main {

    private int palindrome;
    private String palindromeString;
    private boolean isPalindrome =false;
    private int maxPalindrome = 0;


    public static void main(String[] args) {

        Main main = new Main();
        main.control();
    }

    private void control(){

        for(int i = 999; i >= 100; i--){
            for(int j = 999; j >= 100; j--){
                palindrome = i * j;
                if(checkNumber(palindrome)){
                    System.out.println("Palindrome Number is " + palindrome);
                    checkIsMax(palindrome);
                }
            }
        }
        System.out.println("Max palindrome Number is " + maxPalindrome);
    }

    private boolean checkNumber(int inputNumber){

        palindromeString = String.valueOf(inputNumber);
        int last = palindromeString.length() - 1;
        for(int i = 0 ; i <= last; i++){
            if (palindromeString.toCharArray()[i] ==  palindromeString.toCharArray()[last]) {
                last--;
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private void checkIsMax(int palindrome){
        if(maxPalindrome < palindrome){
            maxPalindrome = palindrome;
        }
    }
}
