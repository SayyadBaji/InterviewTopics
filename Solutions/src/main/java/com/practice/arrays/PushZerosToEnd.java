package com.practice.arrays;

import java.util.Arrays;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] input = {2, 4, 0, 3, 0, 1, 0, 0, 7, 5};
        pushZeros(input);
        System.out.println(Arrays.toString(input));
    }

    private static void pushZeros(int[] input) {
        int n = input.length;
        int nonZeroCount = 0;
        for (int i=0; i<n; i++) {
            if (input[i]!=0) {
                input[nonZeroCount++] = input[i];
            }
        }

        for (int i=nonZeroCount; i<n; i++) {
            input[i] = 0;
        }
    }
}
