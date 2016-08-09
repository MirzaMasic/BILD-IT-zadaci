package zadaci_08_08_2016;

import java.util.Scanner;

public class Password {
	public static boolean provjera(String s) {
		int brojac = 0;
		int brojac2 = 0;
		// Brojac brojeva
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				brojac++;
			}
			// Brojac slova
			if (Character.isLetter(s.charAt(i))) {
				brojac2++;
			}
		}

		// Postavljanje uslova za password ako je ispunjen vraca true

		if ((brojac >= 2) && (brojac2 >= 6)
				&& ((brojac + brojac2) == s.length())) {

			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite svoj password");
		System.out
				.println("Note: Password mora da ima 8 ili vise slova i mora u sebi imati minimalno 2 broja");
		String str = input.next();

			if (provjera(str) == true) {
				System.out.println("Password je ispravno unesen");
			} else {
				System.out
						.println("Password ne zadovoljava molimo pokusajte ponovo");
				str = input.next();
		}
	}
}
