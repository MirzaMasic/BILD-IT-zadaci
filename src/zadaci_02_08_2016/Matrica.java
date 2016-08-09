package zadaci_02_08_2016;

import java.util.Scanner;

public class Matrica {
	// Kreiranje metode za pravljenje novog 2D Niza
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];
		// Dodjeljivanje vrijednosti 2D nizu/Matrici
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		// Ispisivanje 2D niza / matrice
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// Kreiranje Scanner-a i Dodjeljivanje vrijednost2D nizu / matrici

		Scanner input = new Scanner(System.in);
		System.out.println("Molimo vas unesite velicinu matrice koju zelite");
		int velicinaMatrice = input.nextInt();

		printMatrix(velicinaMatrice);

	}
}