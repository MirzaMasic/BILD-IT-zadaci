package zadaci_20_08_2016;

import java.util.Scanner;

public class LocaationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Korisnikov unos broja redova i koloni
		System.out.println("Unesite broj redova u avsem nizu");
		int row = input.nextInt();
		System.out.println("Unesite broj kolona u vasem nizu");
		int column = input.nextInt();
		
		//Kreiranje niza i postavljanje petlji tako da se mogu unijeti vrojednosti u niz
		double[][] array = new double[row][column];
		System.out.println("Molim unesite vrijendosti u  vas niz");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		//Ispisivanje naseg 2D niza
		System.out.println("Vas 2D niz izgleda ovako: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		//Pozivanje nase "Location" classe i proslijðivanje naseg 2D niza istoj
		Location max = Location.locateLargest(array);
		
		//Ispisivanje naseg  najveceg elementa i lokacije na kojoj se isti nalazi
		System.out.println("Najveca vrijednost je: " + max.getMaxValue()
				+ " a nalazi se na redu broju: " + max.getRow()
				+ " i koloni broj: " + max.getColumn());
		input.close();
	}

}
