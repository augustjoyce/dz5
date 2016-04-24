package com.joyce.august.sourceit.dz5;

public class Invert {

	public static void main(String[] args) {
		char[] array = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; array.length / 2 > i; i++) {
			char tmp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = tmp;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
