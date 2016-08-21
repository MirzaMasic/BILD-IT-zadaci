package zadaci_20_08_2016;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortingRows {
	public static double[][] sortRows(double[][] m) {
		// Metoda koja sortira redove i ispisuje 2D niz
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				Arrays.sort(m[i]);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		return m;
	}

	public static void main(String[] args) {
		try{
		Scanner input = new Scanner(System.in);
		System.out.println("Molim unesite koliko ce redova imati vas 2D niz");
		int row = input.nextInt();
		System.out.println("Molim unesite koliko ce kolni imati vas 2D niz");
		int column = input.nextInt();
		double[][] m = new double[row][column];
		// Petlja koja prolazi kroz 2D niz i dopusta korisniku da unese
		// vrijednosti
		System.out.println("Moli unesite vrijednosti u vas 2D niz");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		System.out.println("Sorirani redovi u nizu: \n");
		sortRows(m);
		input.close();
		}catch(InputMismatchException error){
			System.out.println("Molim unosute brojeve u niz");
		}
	}

}
