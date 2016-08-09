package zadaci_02_08_2016;

import java.util.Scanner;

public class Kviz {
	// Kreiranje metode
	public static void kviz(int n) {
		/*
		 * Dodavanje pocetnih vrijednosti na: brojacTacnihOdgovora ,
		 * brojacNetacnihOdgovora , i privremenu
		 */
		Scanner input = new Scanner(System.in);
		int brojacTacnihOdgovora = 0;
		int brojacNetacnihOdgovora = 0;
		int privremena = 0;
		// Kreiranje petlje i dodavanje random vrijednosti na umanjenik i
		// umanjitelj
		for (int i = 0; i < n; i++) {
			int umanjenik = (int) (Math.random() * 10);
			int umanjitelj = (int) (Math.random() * 10);
			/*
			 * sada slijedi zamjena mjest radi, jednostavnijeg igranja kviza
			 * odnosno da razlika ne bude negativan rezultat
			 */
			if (umanjenik < umanjitelj) {
				privremena = umanjenik;
				umanjenik = umanjitelj;
				umanjitelj = privremena;
			}
			/*
			 * Sada slijedi ispisivanje pitanja , a potom provjera odgovora i
			 * bilježenje rezultata
			 */
			System.out.println("Koliko je " + umanjenik + " - " + umanjitelj);
			int odgovor = input.nextInt();
			if (odgovor == (umanjenik - umanjitelj)) {
				brojacTacnihOdgovora++;
			} else {
				brojacNetacnihOdgovora++;
			}
		}
		// Sada slijedi ispisivanje rezultata
		System.out.println("Korisnik je imao " + brojacTacnihOdgovora
				+ " tacnih odgovora");
		System.out.println("Korisnik je imao " + +brojacNetacnihOdgovora
				+ " netacnih odgovora");

	}

	public static void main(String[] args) {
		// Sada slijedi slijedi dodavanje scanner-a i odreðivanje broja pitanja
		Scanner input = new Scanner(System.in);

		System.out
				.println("Molimo vas odredite na koliko pitanja zelite da odgovorite");
		int brojPitanja = input.nextInt();

		kviz(brojPitanja);

	}
}
