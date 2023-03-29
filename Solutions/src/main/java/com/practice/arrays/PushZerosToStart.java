package com.practice.arrays;

import java.util.Arrays;

public class PushZerosToStart {
    public static void main(String[] args) {
        int[] input = {2, 4, 0, 3, 0, 1, 0, 0, 7, 5};
        pushZeros(input);
        System.out.println(Arrays.toString(input));
    }

    private static void pushZeros(int[] input) {
        int n = input.length;
        int nonZeroCount = n-1;
        for (int i=n-1; i>=0; i--) {
            if (input[i]!=0) {
                input[nonZeroCount--] = input[i];
            }
        }

        for (int i=nonZeroCount; i>=0; i--) {
            input[i] = 0;
        }
    }
}
