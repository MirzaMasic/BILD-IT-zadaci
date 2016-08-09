package zadaci_03_08_2016;

import java.util.Scanner;

public class ProstiBrojevi {
	// Kreiranje metode za racunanje prostih brojeva
	public static void prosti(int n, int a, int c) {
		int printCounter = 0; // brojac ispisa

		for (int i = n; i < a; i++) {

			if (n == 1) // Broj 1 ne moze biti pocetak zato sto je on prost broj
			{
				System.out.println("Ne mozete poceti sa brojem 1");
				break;
			}
			//Provjera dali je broj prost ili ne
			boolean prost = true;
			for (int x = i - 1; x > 1; x--) {
				if (i % x == 0) {
					prost = false;
				}
			}
			// Ispisivanje prostih brojeva
			if (prost) {
				System.out.print(i + " ");
				printCounter++;
				if (printCounter % c == 0) {
					System.out.println(); // prelazak u novi red
				}
			}
		}
	}

	public static void main(String[] args) {
		// Kreiranje scanner-a i dodavanje vrijednosti
		Scanner input = new Scanner(System.in);
		System.out.println("Molimo unesite prvi argument ");
		int n = input.nextInt();
		System.out.println("Molimo unesite drugi argument ");
		int a = input.nextInt();
		System.out
				.println("Molimo unesite granicu koliko ce brojeva biti ispisano u jednoj liniji");
		int c = input.nextInt();
		prosti(n, a, c);
	}

}
