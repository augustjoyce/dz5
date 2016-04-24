package com.joyce.august.sourceit.dz5;

import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		Random rand = new Random();
		int r = rand.nextInt(30 - 5) + 5;
		int[][] array = new int[Math.abs(r)][Math.abs(r)];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt();
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}

	}

}
