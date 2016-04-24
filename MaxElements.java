package com.joyce.august.sourceit.dz5;

public class MaxElements {

	public static void main(String[] args) {
		int[] array = { 4, 521, 5, 46, 74, 521, 43, 317, 257, 521 };
		int sum = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				sum = 1;
			} else if (max == array[i]) {
				sum++;
			}
		}

		System.out.println("Сумма максимальных эелементов: " + sum);

	}

}
