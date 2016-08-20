package zadaci_19_08_2016;

import java.util.Scanner;

public class MultiplyArray {
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		int aRows = a.length;
		int aColumns = a[0].length;
		int bRows = b.length;
		int bColumns = b[0].length;
		//Racunanje proizvoda ove dvije matrice
		double[][] matrix = new double[aRows][bColumns];
		for (int i = 0; i < aRows; i++) {
			for (int j = 0; j < bColumns; j++) {
				for (int z = 0; z < aColumns; z++) {
					matrix[i][j] = a[i][z] * b[z][j];
				}
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		//Unos vrijendosti u prvu matricu
		System.out.println("Unesite vrijendosti  prvu(3x3) matricu");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		//Unos u drugu matricu
		System.out.println("Unesite vrijednosti u drugu(3x3) matricu");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		System.out.println("\n");
		for (int i = 0; i < matrix1.length; i++) {
			// Ispisivanje prve matrice
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print("|" + matrix1[i][j]);
				if (i == 1 && j == 2)
					System.out.printf("%2s ", " * ");
				else
					System.out.printf("%3s ", " ");
			}
			// Ispisiavanje matrice broj2
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print( "|" +matrix2[i][j]);
				if (i == 1 && j == 2)
					System.out.printf("%2s ", " = ");
				else
					System.out.printf("%3s ", " ");

			}

			double[][] proizvod = multiplyMatrix(matrix1, matrix2);
			
			 
			// Printamo proizvoda nase 2 nove matrice
			for (int j = 0; j < proizvod[i].length; j++) {
				System.out.print("|" + proizvod[i][j]);
			}
			System.out.println("");
		}
	}
}
