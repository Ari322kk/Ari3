package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] arr = new double[15];
        arr[0] = 2.1;
        arr[1] = -2.1;
        arr[2] = 3.5;
        arr[3] = 9.2;
        arr[4] = 2.1;
        arr[5] = -2.1;
        arr[6] = 6.1;
        arr[7] = -3.1;
        arr[8] = 4.1;
        arr[9] = -8.1;
        arr[10] = 7.1;
        arr[11] = -2.1;
        arr[12] = 2.1;
        arr[13] = -4.1;
        arr[14] = 9.1;
        boolean isNeg = false;
        double sum = 0;
        double counter = 0;

        for (double value : arr) {

            if (value < 0) {
                isNeg = true;
            }
            if (isNeg) {
                if (value > 0) {
                    sum += value;
                    counter++;
                }
            }
        }
        System.out.println("Среднее ариф " + sum / counter);
        System.out.println("-----------------");
        int[] arr2 = new int[]{6, 5, 4, 3, 2, 1,};

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr2.length - 1; i++) {
                if (arr2[i] > arr2[i + 1]) {
                    temp = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = temp;
                    sorted = false;
                }
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println("\n------------");
        SortNum.sortSecond();
    }
}

class SortNum {
    public static void sortSecond() {
        int[] arr3 = {8, 7, 6, 5, 4, 2, 1};
        Arrays.sort(arr3);
        for (int j = 0; j < arr3.length; j++) {
            System.out.println(j + " " + arr3[j]);
        }
    }
}








