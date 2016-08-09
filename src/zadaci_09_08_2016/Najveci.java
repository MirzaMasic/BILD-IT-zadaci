package zadaci_09_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Najveci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Molim Unesite brojeve  nula prekida unos");
		int broj = input.nextInt();
		int brojac = 0;
		int max = 0;
		//Ova petlja ubacuje sve unesene brojeve u listu  sve dok unos nije nula
		while (broj != 0) {
			list.add(broj);
			broj = input.nextInt();

		}
		//Ovdje provjerajomo koji je broj najveci i dodajemo taj broj na varijablu max
		if (!list.isEmpty()) {
			
			
			for (int i = 0; i < list.size(); i++) {
				Collections.max(list);
				max = Collections.max(list);
			}
			
			//Sada brojimo koliko se puta najveca vrijednost ponovila
			
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).intValue() == max) {
					
					brojac++;
				}
			}
			
			// Ispisivanje poruke
			System.out.println("Najveci broj je" + max + " a ponovio se  "
					+ brojac + " puta");

		}

	}
}
