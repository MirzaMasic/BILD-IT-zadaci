package zadaci_17_08_2016;

import java.util.Scanner;

public class JedinstveniBrojevi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ovdje kreiramo 2 niza u koja cemo spremati brojeve kojie smo unijeli
		// i jedinstvene brojeve
		int[] brojevi = new int[10];
		boolean[] jedinstveniBrojevi = new boolean[10];
		System.out.println("Unesite 10 vrijednosti(brojeva) ");
		// Ovom prvom petljom spremamo brojeve u niz i provjerajemo koji brojevi
		// su uneseni jednom(odnosno koji su brojevi jedistevi) i koje smo
		// brojeve unijeli vise puta
		for (int i = 0; i < 10; i++) {
			brojevi[i] = input.nextInt();
			jedinstveniBrojevi[i] = true;
			for (int j = 0; j < 10; j++) {
				if (brojevi[i] == brojevi[j] && i != j) {
					jedinstveniBrojevi[i] = false;
				}
			}
		}
		// Druga petlja nam ispisuje koje brojeve smo unijeli u niz radi
		// provjere tacnosti naseg programa
		System.out.println("Brojevi koje ste unijeli su: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(brojevi[i] + " ");
		}
		System.out.println();
		System.out
				.println("Jedninstveni brojevi u nizu vasih brojeva koje ste unijeli je: ");
		// Sada zadnjom petljom opet provjerajemo koji su brojevi jedinstevi i
		// poslije provjere ispisujemo sve jedinstvene brojeve
		for (int i = 0; i < 10; i++) {
			if (jedinstveniBrojevi[i]) {
				System.out.print(brojevi[i] + " ");
			}
		}

	}

}
