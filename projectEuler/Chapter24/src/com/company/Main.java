package com.company;

public class Main {

    private static final int[] staticNumbers = {0,1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        System.out.println(new Main().control());
    }

    private String control() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = i;

        for (int i = 0; i < 999999; i++) {
            if (!nextPermutation(array))
                throw new AssertionError();
        }

        String number = "";
        for (int i = 0; i < array.length; i++)
            number += array[i];
        return number;
    }

    public static boolean nextPermutation(int[] a) {
        int n = a.length, i, j;
        for (i = n - 2; ; i--) {
            if (i < 0)
                return false;
            if (a[i] < a[i + 1])
                break;
        }
        for (j = 1; i + j < n - j; j++) {
            int tp = a[i + j];
            a[i + j] = a[n - j];
            a[n - j] = tp;
        }
        for (j = i + 1; a[j] <= a[i]; j++);
        int tp = a[i];
        a[i] = a[j];
        a[j] = tp;
        return true;
    }

}
