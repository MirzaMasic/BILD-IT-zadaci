package MiniProjekt2;

public class CrapsGame {
	public static void main(String[] args) {
		// Dodavanje random vrijednosti na kockice kojima cemo igrati
		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;
		// Racunanje sume kockica da se izracuna rezultat
		int roll = dice1 + dice2;
		System.out.println();
		/*
		 * Sada ide postavljanje uslova za igru(Po pravilima igr kako se igra)
		 * Pravilo br1- ako je suma kockica koje je korisnik dobio jednaka, 2 ,
		 * 3 ili 12 korisnik gubi igru,a ako je suma vrijednost kocikca jednaka
		 * 7 ili 11 korisnik je pobijedio. br2- Ako je suma kockica bilo koja
		 * druga vrijednost npr(4, 5, 6, 8, 9) ili druge broj poena se postavlja
		 * na tu vrijednost i kockice nastavljaju da se bacaju sve dok se opet
		 * ne dobija da vrijednost ili dok se ne dobije 7. Ako je ishod kockica
		 * 7 korisnik gubi a ako je druga vrijednost korisnik je pobijedio
		 */

		// Postavljanje prvog ulova odnosno pravila
		System.out.print(" You rolled " + dice1 + " + " + dice2 + " = " + roll);
		if (roll == 2 || roll == 3 || roll == 12) {
			System.out.println(" Craps! You Lose !");
		} else if (roll == 7 || roll == 11) {
			System.out.println(" You Win !");
		} else {
			// Kockice nisu dale niti jedan ishod iz pravila br1 i igra se dalje
			// nastavljai postavlja novi uslov(broj)
			System.out.println();
			System.out.println(" Point is " + dice1 + " + " + dice2 + " = "
					+ roll);
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			int roll2 = dice1 + dice2;
			System.out.print(" You rolled " + dice1 + " + " + dice2 + " = "
					+ roll);
			while (roll2 != 7) {
				if (roll == roll2) {
					System.out.println(" You Win !");
					break;
				} else {
					System.out.println(" Point is " + dice1 + " + " + dice2
							+ " = " + roll);
				}
				dice1 = (int) (Math.random() * 6) + 1;
				dice2 = (int) (Math.random() * 6) + 1;
				roll2 = dice1 + dice2;
				System.out.print(" You rolled " + dice1 + " + " + dice2 + " = "
						+ roll);
			}
			if (roll2 == 7) {
				System.out.println(" You Lose !");
			}
		}

	}
}
