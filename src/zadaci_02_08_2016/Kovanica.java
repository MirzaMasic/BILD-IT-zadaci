package zadaci_02_08_2016;

import java.util.Scanner;

public class Kovanica {
	// Kreiranje metode
	public static void kovanica(int n) {
		// Dodijeljivanje pocetnih vrijednosti na:
		int brojacGlava = 0;
		int brojacPisama = 0;

		// Kreiranje for petlje da broji sikog bacanja kovanice
		for (int i = 0; i < n; i++) {
			int kovanica = (int) (Math.random() * 2);
			// broj 0 je glava
			if (kovanica == 0)
				brojacGlava++;

			// broj 1 je pismo
			if (kovanica == 1)
				brojacPisama++;

		}
		System.out.println();
		System.out.println("Kovanice je bacena " + n + " put "
				+ " Glava je ispala " + brojacGlava + " puta " + " a pismo je "
				+ brojacPisama);
	}

	public static void main(String[] args) {
		// Kreiranje Scannera i dodavanaje vrijednosti
		Scanner input = new Scanner(System.in);

		System.out
				.println("Molimo Vas unesite broj koliko puta zelite da se kovanica baci");
		int brojBacanjaKovanice = input.nextInt();

		kovanica(brojBacanjaKovanice);

	}
}
