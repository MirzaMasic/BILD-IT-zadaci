package zadaci_20_08_2016;

import java.util.Scanner;

public class IdenticalArray {
	public static boolean equals(int[][] m1, int[][] m2) {
		// Petlja koja prolazi kroz prvi niz i poredi vrijendosti prvog niza sa
		// vrojednostima drugog niza , ako vrijednosti nisu identicne vraca
		// false a ako su identicne vraca true
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unos korsinika koliko zeli da nizovi budu veliki
		System.out.println("Umesite broj redova vaseg prvog  niza");
		int firstArrayRow = input.nextInt();
		System.out.println("Unesite broj koloni u vasem prvom nizu");
		int firstArrayColumn = input.nextInt();
		int[][] array1 = new int[firstArrayRow][firstArrayColumn];
		System.out.println("-------------------------------------");
		System.out.println("Umesite broj redova vaseg drugog  niza");
		int secondArrayRow = input.nextInt();
		System.out.println("Unesite broj koloni u vasem drugom nizu");
		int secondArrayColumn = input.nextInt();
		int[][] array2 = new int[secondArrayRow][secondArrayColumn];

		// Unos vrijednosti korisnika u prvi niz
		System.out.println("---------------------------------------");
		System.out.println("Unesite vrijednosti u prvi niz");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = input.nextInt();
			}
		}
		// Unos vrijednosti korisnika u drugi niz
		System.out.println("----------------------------------");
		System.out.println("Unesite vrijednosti u drugi niz");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = input.nextInt();
			}
		}
		// Ispisivanje unesenih vrijednosti u prvom nizu
		System.out.println(" ############ Vas prvi niz ############");
		System.out.println("---------------------------------------");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		// Ispisivanje unesenih vrijednosti u drugom nizu
		System.out.println("########### Vas drugi niz ############");
		System.out.println("----------------------------------");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}

		// Pozivanje metode i ispisivanje rezultata dali su nizovi identicni ili ne
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		if (equals(array1, array2) == true) {
			System.out.println("Vasa dva niza su identicna");
		} else {
			System.out.println("Vasa 2 niza nisu identicna");
		}
	}

}
