package zadaci_18_08_2016;

import java.util.Scanner;

public class RandomNumberChooser {
	public static int getRandom(int[] numbers) {
		// Metoda kojom generisemo jedan nasumican broj
		int random = (int) ((Math.random() * 53) + 1);
		for (int i = 0; i < numbers.length; i++) {
			// Sada provjerajemo ako je izabrani broj jedan od koji je korisnik
			// unio ponovo trazimo random broj i vracamo petju na povetak
			if (numbers[i] == random) {
				random = (int) ((Math.random() * 53) + 1);
				i = 0;
			}
		}
		return random;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Kreiranje niza da spremimo brojeve koje je korsinik unio
		int[] niz = new int[10];
		System.out
				.println("Unesite 10 brojeva koje treba izuzeti iz random generatora brojeva");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = input.nextInt();
		}
		//Ispisivanje poruke i pozivanje metode
		System.out.println("Random generisani broj je: "  + getRandom(niz));
	}
}
