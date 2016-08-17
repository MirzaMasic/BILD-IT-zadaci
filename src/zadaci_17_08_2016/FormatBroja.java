package zadaci_17_08_2016;

import java.util.Scanner;

public class FormatBroja {
	public static String format(int number, int width) {

		// Metoda koja vraca string broja sa prfixom broja nula onoliko koliko
		// je korisnik zelio
		String str = String.format("%0" + width + "d", number);

		return str;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj ");
		int br = input.nextInt();
		System.out.println("Unesite sirinu stringa");
		int sirina = input.nextInt();

		// Pozivanje metode 
		System.out.println(format(br, sirina));
	}

}
