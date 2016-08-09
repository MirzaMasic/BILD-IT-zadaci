package zadaci_06_08_2016;

import java.util.Scanner;

public class Investicija {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Korisnik unosi iznos investicije
		long iznosInvesticije = input.nextLong();
		//Racunanje interesne stope u porcentima
		double mjesecnaStopa = (input.nextDouble() / 12) / 100;
		//Korisnik unosi za koliko godina zeli provjeriti svoju investiciju
		int brojGodine = input.nextInt();
		
		//Racunanje  investicije u buducnosit(Ovisno kolkiko korisnik unese godina)
		double investicija = iznosInvesticije * Math.pow((1+ mjesecnaStopa) , (brojGodine * 12));
		
		//ispisivanje rezultata
		System.out.println("Investicija je:   "  + investicija);

	}

}
