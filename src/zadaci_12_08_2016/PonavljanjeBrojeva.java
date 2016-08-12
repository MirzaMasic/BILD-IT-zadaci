package zadaci_12_08_2016;

import java.util.Scanner;

public class PonavljanjeBrojeva {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Niz u koji cemo smjestiti nase brojeve
		int[] array = new int[100];
		int brojac = -1;
		System.out.println("Unesite brojeve(Nula prekida unos) : ");
		while (brojac != 0) {
			brojac = input.nextInt();
			// Kada unesemo 0 unos se prekida te brojimo brojeve koji su se
			// ponovili
			if (brojac > 0) {
				array[brojac - 1]++;
			}
		}
		//Ispisivanje broja ponavljanja brojeva
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				System.out.printf("Broj %d se ponovio %d put\n", i + 1,
						array[i], array[i]);
			}

		}
	}

}
