package com.company;

public class Main {

    private int[] numbers = {
            75,
            95, 64,
            17, 47, 82,
            18, 35, 87, 10,
            20, 04, 82, 47, 65,
            19, 01, 23, 75, 03, 34,
            88, 02, 77, 73, 07, 63, 67,
            99, 65, 04, 28, 06, 16, 70, 92,
            41, 41, 26, 56, 83, 40, 80, 70, 33,
            41, 48, 72, 33, 47, 32, 37, 16, 94, 29,
            53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14,
            70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57,
            91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48,
            63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31,
            04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23
    };
    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control() {
        int count = 1;
        int maxNumber = 0;
        for(int i = 0; i < i+count; i++){

            //숫자 크기 비교를 위한 temp 변수
            int num1 = numbers[i+count] + numbers[i];
            int num2 = numbers[i+count+1] + numbers[i];

            //숫자 크기를 비교해서 num1과 num2가 커야 그 배열의 숫자로 대치!
            if(num1 > numbers[i+count])
                numbers[i+count] = num1;
            if(num2 > numbers[i+count+1])
                numbers[i+count+1] = num2;

            //각 줄마다 숫자 갯수가 증가하기 때문에!
            if(count < 14)
            count++;
            //104 + 14는 118이고 이 숫자가 마지막 배열을 만든다.
            if(i == 104)
                break;
        }

        //마지막 줄에서 MAX값을 찾는 알고리즘
        for(int i = 105 ; i < 120 ; i++){
            if(numbers[i] > maxNumber)
                maxNumber = numbers[i];
        }
        System.out.println(maxNumber);
    }
}
