package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChunks {

	public static void main(String[] args) {
		int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int chunkSize = 3;
		List<int[]> result = splitIntoChunks(input, chunkSize);
		for (int[] chunk: result) {
			System.out.println(Arrays.toString(chunk));
		}
	}

	private static List<int[]> splitIntoChunks(int[] input, int chunkSize) {
		int n = input.length;
		List<int[]> result = new ArrayList<int[]>();
		int fixed = n / chunkSize;
		int reminder = n % chunkSize;
		int counter = 0;
		for (int i=0; i<fixed; i++) {
			int[] chunk = new int[chunkSize];
			for (int j=0; j<chunkSize; j++) {
				chunk[j] = input[counter++];
			}
			result.add(chunk);
		}
		if (reminder!=0) {
			int[] chunk = new int[reminder];
			for (int i=0; i<reminder; i++) {
				chunk[i] = input[counter++];
			}
			result.add(chunk);
		}
		return result;
	}

}
