package zadaci_19_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Sort2DArray {
	public static void sortingArray(int[][] array ,  int n) {
		int[][] array2 = new int[n][n];
		//Dodavanje vrijednosti u drugi niz koji cemo kasnije koristiti 
		 for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array2[i][j] = array[i][j];
			}
		}
		 System.out.println("Redovi");
		// Sada sortiramo redove nazeg 2D niza
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				Arrays.sort(array[i]);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		//Sortiranje drugog niza koji smo na pocetku kreirali i dali mu vrijednosti
		for(int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++) {
				Arrays.sort(array2[i]);
				array[j][i] = array2[i][j];
			}
		}
		System.out.println("Kolone");
		for(int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Korisnik bira koliki niz zeli da bude
		System.out.println("Unesite velicinu niza");
		int num = input.nextInt();
		int[][] array = new int[num][num];

		// Korisnikov unos elemenata u niz
		System.out.println("Unesite elemente u niz");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt();
			}
		}
		System.out.println();
		// Ispisivanje niza prije sortiranja
		System.out.println("Niz prije sortiranja");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		sortingArray(array, num);

	}
}
