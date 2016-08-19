package zadaci_18_08_2016;

import java.util.Scanner;

public class UzastopniBrojevi {
	public static String consecutive(int[] numbers) {
		// Kreiranje 2 stringa da nam kasnjie ispisu poruku da li niz brojeva
		// koje je korsinik unio ima 4 uzastopna
		String tacno = "Vas niz sadrzi 4 uzastopna broja";
		String netacno = " Vas niz ne sadrzi 4 uzastopna broja";
		int brojac = 1;// postavljanje brojaca
		// Petlja koja prolazi kroz duzinu niza ,provjeraje i broji uzastopne
		// brojeve
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] - numbers[i - 1] == 0) {
				brojac++;
			}
		}
		// Ovdje ispisujemo poruku dali u korisnikovom nizu ima/nema uzastopnih
		// brojeva
		if (brojac >= 4) {
			return tacno;
		} else {
			return netacno;
		}
	}

	public static void main(String[] args) {
		//Pozivanje korsinika da unese duzinu niza i vrijednosti u taj isti niz
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite duzinu vaseg niza");
		int duzina = input.nextInt();
		int[] niz = new int[duzina];
		System.out.println("Unesite vrijednosti u niz");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = input.nextInt();
		}
		//Potivanje i ispisivanje metode
		System.out.println(consecutive(niz));
	}
}
