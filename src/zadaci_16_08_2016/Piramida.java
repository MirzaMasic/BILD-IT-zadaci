package zadaci_16_08_2016;

import java.util.Scanner;

public class Piramida {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite broj za koji zelite da vidite piramidu brojeva");
		int broj = input.nextInt();
		System.out.println();
		//Prva petlja koja ucitaj broj korisnika i vrti se sve dok ne dodje to istog
		for (int i = 1; i <= broj; i++) {
			
			//Druga  petlja od jedinice do nas broj minus 1(i)
			for (int j = 1; j <= broj - i; j++) {
				System.out.print("  ");
			}
			//Sada ispisujemo nasu lijevu stranu piramide 
				for (int k = i; k >= 1; k--) {
					System.out.print((k >= 10) ? +k : "|" + k);
				}
				//Sada ide desna strana piramide
			for (int k = 2; k <= i; k++)
				System.out.print((k >= 10) ? +k : "|" + k);
			System.out.println("|");
			
		}
	}
}
