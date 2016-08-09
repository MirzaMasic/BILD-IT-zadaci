package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArayLista {
	public static Integer max(ArrayList<Integer> list) {
		// Ispisivanje null vrijednosti ako je lista prazna
		if (list.size() == 0) {
			System.out.println("null");
			System.exit(0);
		}
		// Nalazenje njaveceg elementa u listi
		for (int i = 0; i < list.size(); i++) {
			Collections.max(list);
		}
		System.out.println("Najveci element u lsiti je: "
				+ Collections.max(list));
		return Collections.max(list);
	}

	public static void main(String[] args) {
		// Kreiranje scanner-a i array liste
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Dodajte brojeve u Listu  ");
		try {
			while (input.hasNext()) {
				int numbers = input.nextInt();
				list.add(numbers); // Dodavanje elemenata u listu
				// ako je unos 0 nize se prekida u ispisuje se max element u
				// listi
				if (numbers == 0) {
					max(list);
					break;
				}
			}
		} catch (InputMismatchException exeption) {
			// U slucaju greske pri unosu
			System.out.println("Unesite brojeve ");
			max(list);
		}
		input.close();

	}

}
