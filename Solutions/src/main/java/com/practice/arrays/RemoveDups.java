package com.practice.arrays;

import java.util.Arrays;

public class RemoveDups {
    public static void main(String[] args) {
        int[] input = {2, 4, 0, 3, 0, 1, 2, 0, 7, 5};
        int n = input.length;
        n = removeDups(input, n);
        for (int i=0; i<n; i++) {
            System.out.print(input[i]+" ");
        }
    }

    private static int removeDups(int[] input, int n) {
        int[] temp = new int[n];
        int j = 0;
        Arrays.sort(input);
        for (int i=0; i<n-1; i++) {
            if (input[i] != input[i+1]) {
                temp[j++] = input[i];
            }
        }
        temp[j++] = input[n-1];
        for (int i=0; i<j; i++) {
            input[i] = temp[i];
        }
        return j;
    }
}
