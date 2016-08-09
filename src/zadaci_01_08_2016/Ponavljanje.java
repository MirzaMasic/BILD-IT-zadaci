package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ponavljanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kreiranje novog niza i Scanner-a
				Scanner input = new Scanner(System.in);
				ArrayList<Integer> list = new ArrayList<>();

				// dodavanje pocetnih vrijednosti brojacu i max elementu
				int brojac = 0;
				int max = 0;

				System.out.println("Unesite niz brojeva s tim da nula prekida unos");
				int numbers = input.nextInt();

				// Postavljanje uslova da nula prekida unos i dodavanje vrijednosti u
				// niz
				while (numbers != 0) {
					list.add(numbers);
					numbers = input.nextInt();
				}

				// Pronalazenje najveceg elemnta u Nizu
				for (int i = 0; i < list.size(); i++) {
					Collections.max(list);
					max = Collections.max(list);// Update max varijable
				}
				// Brojac koliko je se puta najveci element u nizu ponovio
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).intValue() == max) {
						brojac++;
					}
				}
				// Ispisivanje svega onog sto smo uradili
				System.out.println("Najveci element u nizu je: " + max
						+ " Najveci elemnt u nizu se ponovio " + brojac + " puta ");
				input.close();


	}

}
