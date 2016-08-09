package zadaci_08_08_2016;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite mjesec");
		int mjesec = input.nextInt();
		System.out.println("Unesite godinu ");
		int godina = input.nextInt();
		
		//Sada provjerajemo sta je korisnik unio i ispisujemo koji je mjesec izabro i koliko dana ima
		if (mjesec == 1) {
			System.out.println("Januar " + godina + " ima 31 dan");

		} else if ((godina % 4 == 0) && (mjesec == 2)) {// Ovdje provjerajemo
														// dali je prijestupna
														// godina
		System.out.println("Februar " + godina + " ima 29 dana");// Ako jeste februar ima 29 dana																															
		} else if (mjesec == 2) {//Ako je obicna godina februar ima 28 dana
			System.out.println("Februar " + godina + " ima 28 dana ");
		} else if (mjesec == 3) {
			System.out.println("Mart " + godina + " ima 31 dan");
		} else if (mjesec == 4) {
			System.out.println("April " + godina + " ima 30 dana");
		} else if (mjesec == 5) {
			System.out.println("Maj " + godina + " ima 31 dan");
		} else if (mjesec == 6) {
			System.out.println("Juni " + godina + " ima 30 dana");
		} else if (mjesec == 7) {
			System.out.println("Juli " + godina + " ima 31 dan");
		} else if (mjesec == 8) {
			System.out.println("Avgust " + godina + " ima 31 dan");
		} else if (mjesec == 9) {
			System.out.println("Septembar " + godina + " ima 30 dana");
		} else if (mjesec == 10) {
			System.out.println("Oktobar " + godina + " ima 31 dan");
		} else if (mjesec == 11) {
			System.out.println("Novembar " + godina + " ima 30 dana");
		} else if (mjesec == 12) {
			System.out.println("Decembar " + godina + " ima 31 dan");
		} else {
			System.out.println("Invalid month");
		}
	}

}
