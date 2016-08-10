package zadaci_10_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		// Obican array lista koja prima integre i sprema nase proste brojeve
		ArrayList<Integer> list = new ArrayList<>();
		int brojac1 = 0;
		
		// Kreiranje prve petlje za dodavanje vrijednosti od koliko do koliko ce
		// petlja da ide
		for (int i = 2; i <= 10000; i++) {
			// Petlja koja racuna proste brojeve
			int brojac2 = 0;
			for (int j = i; j >= 1; j--) {
				
				if (i % j == 0) {
					brojac2++;
				}
			}

			if (brojac2 == 2) {
				list.add(i);
			}

		}
		int susjedni = 0;

		for (int i = 1; i < list.size(); i++) {

			susjedni = list.get(i).intValue() + 2;// Racunanje susjednog
													// broja(twin prime)
			if (list.contains(susjedni)) {
				// Sada ispisujemo sve brojeve
				System.out.print(list.get(i).intValue() + " / " +  susjedni + " | "
						+ " ");
				brojac1++;
				if (brojac1 % 10 == 0) {
					System.out.println();
				}
			}
		}

	}

}
