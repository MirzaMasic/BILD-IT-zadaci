package zadaci_13_08_2016;

import java.util.Scanner;

public class Napojnica {

	public static void main(String[] args) {
		// Kreiranje scannera i kreiranje varijabli da korisnik moze unijeti
		// iznos racuna i koliki postatak napojnice zeli da ostavi
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koliko je racun ");
		double racun = input.nextInt();
		System.out.println("Molim unesite napojnicu (procentno)");
		double procenatNapojnice = input.nextInt();
		// Formula za racunanje koliku je napojnicu korisnik ostavio
		double napojnica = (racun * procenatNapojnice) / 100;
		// Racunanje ukupno koliko je korisnik platio
		double ukupno = napojnica + racun;

		System.out.println("Racun  je bio " + racun
				+ " procentno napojnice je bilo " + procenatNapojnice + " %");
		System.out.println("Napojnica u KM-ovima je bila: " + napojnica
				+ " a sve ukupno je bilo: " + ukupno);

	}

}
