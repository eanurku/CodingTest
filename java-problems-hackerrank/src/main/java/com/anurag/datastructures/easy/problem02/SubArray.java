package com.anurag.datastructures.easy.problem02;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int counter = 0; counter < n; counter++) {
            array[counter] = scan.nextInt();
        }

        int start;
        int end;
        int negativeSubArrayCounter = 0;

        for (start = 0; start < n; start++) {
            for (end = n - 1; end >= start; end--) {
                if (getArraySum(array, start, end) < 0) {
                    negativeSubArrayCounter++;
                }
            }
        }
        System.out.println(negativeSubArrayCounter);

    }

    private static int getArraySum(int[] array, int start, int end) {
        int sum = 0;
        for (int counter = start; counter <= end; counter++) {
            sum += array[counter];
        }

        return sum;
    }
}
