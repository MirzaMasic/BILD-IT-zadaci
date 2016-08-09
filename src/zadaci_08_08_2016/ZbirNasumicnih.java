package zadaci_08_08_2016;

import java.util.Scanner;

public class ZbirNasumicnih {

	public static void main(String[] args) {
		// Prvo kreiramo 3 varijable koje daju 3 nasumicna broja
		int broj1 = (int) (Math.random() * 11);
		int broj2 = (int) (Math.random() * 11);
		int broj3 = (int) (Math.random() * 11);
		int zbir = broj1 + broj2 + broj3;

		System.out
				.println("Koliko je " + broj1 + " + " + broj2 + " + " + broj3);
		Scanner input = new Scanner(System.in);
		System.out.println("Molimo unesite vas odgovor");
		int odgovor = input.nextInt();

		while (odgovor != zbir) {
			System.out
					.println("Nazalost odgovor nije tacan molim pokusajte ponovo");
			System.out.println();
			System.out.println("Koliko je " + broj1 + " + " + broj2 + " + "
					+ broj3);
			odgovor = input.nextInt();

			if (odgovor == zbir) {
				System.out.println("Cestitamo tacan odgovor");
				break;

			}

		}

	}
}
