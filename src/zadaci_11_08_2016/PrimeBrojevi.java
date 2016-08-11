package zadaci_11_08_2016;

import java.util.ArrayList;

public class PrimeBrojevi {

	public static void main(String[] args) {
		//Lista u koju cemo spremiti proste brojeve
		ArrayList<Integer> primes = new ArrayList<>();
		int brojac = 0;
		// first loop with start value and end value
		for (int i = 2; i <= 1000; i++) {
			// second counter
			int brojac2 = 0;
			//Petlja koja provjeraje dali je broj prost
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					brojac2++;
				}
			}
			//Dodacanje brojeva u listu
			if (brojac2 == 2) {
				primes.add(i);
			}
		}
		// Ispisivanje brojeva
		for (int i = 0; i < primes.size(); i++) {
			System.out.print(primes.get(i).intValue() + " ");
			brojac++;
			if (brojac % 8 == 0) {
				System.out.println();
			}
		}
	}

}
