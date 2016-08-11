package zadaci_11_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class AbecedniRed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Kreiramo niz u koji cemo spremiti 3 stringa koje korisnik unese
		String[] str = new String[3];

		System.out.println("Molim unesite vasa 3 stringa");
		for (int i = 0; i < str.length; i++) {
			String str2 = input.nextLine().toLowerCase();// sva slova koja su
															// unesena se
															// autmatski
															// prebacuju u mala

			if (!Character.isLetter(str2.charAt(i))) {
				System.out
						.println("U string morate unijet samo slova pokusajte ponovo");
				str2 = input.nextLine();
			}
			str[i] = str2;
		}
		//Metoda za osrtiranje niza
		Arrays.sort(str);
		
		//Ispisivanje niza
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " | ");
		}

	}

}
