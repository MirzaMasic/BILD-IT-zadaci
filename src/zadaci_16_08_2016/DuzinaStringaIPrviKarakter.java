package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DuzinaStringaIPrviKarakter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			// Kreiranje stringa koji korisnik mora unijet
			System.out.println("Unesite neki string");
			String str = input.nextLine().toLowerCase();
			if (Character.isLetter(str.charAt(0))) {

				// Ispisivanje duzine stringa i prvog karatkera u stringu
				System.out.println("Duzina stringa je " + str.length());
				System.out.println("Prvi karakter je: " + str.charAt(0));
			} else {
				System.out.println("Molim u string unosite slova ");
			}
		} catch (InputMismatchException e) {
			System.out.println("ERROR");
		}
	}

}
