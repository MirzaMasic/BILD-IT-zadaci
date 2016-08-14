package zadaci_13_08_2016;

import java.util.Scanner;

public class Emrip {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int brojac = 0;
		int r;
		int n2 = 0;
		int c1 = 0;
		System.out.println("Unesite vas broj: ");
		int n = input.nextInt();
		
		//Racunanje dali je broj prost
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				brojac++;
		}
		//Ispisivanje broja unazad
		if (brojac == 2) {
			r = n % 10;
			n2 = (n2 * 10) + r;
			n = n / 10;
		}
		//Provjera dali je broj "Emrip" Odnosno dali je prost i kada ga ispisemo naopako
		for (int i = 1; i <= n2; i++) {
			if (n2 % i == 0)
				c1++;
		}
		//Ispisivanje rezultata
		if (brojac == 2 && c1 == 2) {
			System.out.println("Broj je Emrip\n");
		} else {
			System.out.println("Broj nije Emrip\n");
		}

	}
}
