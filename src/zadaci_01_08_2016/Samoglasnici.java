package zadaci_01_08_2016;

import java.util.Scanner;

public class Samoglasnici {

	public static void main(String[] args) {
		// Kreiranje Scanner-a i stringa sa samoglasicima
				Scanner input = new Scanner(System.in);
				String s = "aeiou";

				System.out.println("Unesite neki string");
				// Kreiranje novog stringa(korisnikov unos) i prebacivanje istog na mala slova
				String recenica = input.nextLine().toLowerCase();
				int brojacSamoglasnika = 0;// brojac samoglasnika u stringu
				int brojacRazmaka = 0;// brojac razmaka u stringu
				int brojacSvihSLova = 0;//brojac svih slova u stringu

				for (int j = 0; j < recenica.length(); j++) {
					if(Character.isLetter(recenica.charAt(j)) ){
						brojacSvihSLova++;
					}
					// broji samoglasinike u unesenom stringu
					if (s.contains(recenica.charAt(j) + "")) {
						brojacSamoglasnika++;
					}
					// broji razmake u unesenom stringu
					if (Character.isWhitespace(recenica.charAt(j))) {
						brojacRazmaka++;
					}

				}
				int brojSuglasnika = brojacSvihSLova - brojacSamoglasnika;
				// Ispisavanje : broja samoglasnika u stringu koji smo unijeli,
							// ispisuje broj razmaka u stringu koji smo unijeli
							System.out.println("String koji ste unijeli " + recenica
									+ "  sadrzi " + brojacSamoglasnika + "  Samoglasnika " + " , "
									+ brojacRazmaka + "  razmaka  " + "  i  " + brojSuglasnika
									+ "  suglasnika  ");
				input.close();			


	}

}
