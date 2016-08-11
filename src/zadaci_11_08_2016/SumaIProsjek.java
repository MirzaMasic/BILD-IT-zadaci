package zadaci_11_08_2016;

import java.util.Scanner;

public class SumaIProsjek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[100];
		int brojac = 0;
		int suma = 0;
		int prosjek = 0;
		int brojacPozitivnih = 0;
		int brojacNegativnih = 0;
		System.out.println("Molimo unesite vase brojeve , nula prekida unos");

		for (int i = 0; i < list.length; i++) {
			// Unose se se brojevi sve dok uns nije nula
			list[i] = input.nextInt();

			if (list[i] == 0) {
				break;
			}
			brojac++;

			suma = suma + list[i];

			if (list[i] > 0) {
				brojacPozitivnih++;
			} else {
				brojacNegativnih++;
			}
		}
		// Sada racunamo prsojek tako sto podjelimo zbir svih brojeva sa
		// brojacem(koliko smo brojeva unijeli)
		prosjek = suma / brojac;
		System.out.println("Suma unesenih brojeva je: " + suma
				+ " Prosjek brojeva je: " + prosjek);
		System.out.println("Pozitivnih brojeva je bilo: " + brojacPozitivnih
				+ " Negativnih brojeva je bilo: " + brojacNegativnih);

	}

}
