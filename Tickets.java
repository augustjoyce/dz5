package com.joyce.august.sourceit.dz5;

public class Tickets {

	public static void main(String[] args) {

		int[] tick = new int[999999];
		tick[0] = 000001;
		int sum = 0;

		for (int i = 1; i < tick.length; i++) {
			tick[i] = tick[i - 1] + 000001;
		}
		

		for (int i = 0; i < tick.length; i++) {
			int d1 = tick[i] % 1000000 / 100000;
			int d2 = tick[i] % 100000 / 10000;
			int d3 = tick[i] % 10000 / 1000;
			int d4 = tick[i] % 1000 / 100;
			int d5 = tick[i] % 100 / 10;
			int d6 = tick[i] % 10;

			if ((d1 + d2 + d3) == (d4 + d5 + d6)) sum++;

		}
		
		System.out.println("Количество счастливых билетов: " + sum);
		
	}

}
