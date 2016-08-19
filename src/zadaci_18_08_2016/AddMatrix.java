package zadaci_18_08_2016;

import java.util.Scanner;

public class AddMatrix {
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] matrix = new double[3][3];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = a[i][j] + b[i][j];
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unos vrijednsoti u prvi 2D niz (matricu
		System.out.println("Unesite matricu br1 : matrica  je formata 3x3 ");
		double[][] matrix1 = new double[3][3];
		for (int i = 0; i < matrix1.length; i++)
			for (int j = 0; j < matrix1[i].length; j++)
				matrix1[i][j] = input.nextDouble();
		// Unos vrijednosti u drugi 2D (matricu)
		System.out.println("Unesite matricu br2 : Matrica je formata 3x3 ");
		double[][] matrix2 = new double[3][3];
		for (int i = 0; i < matrix2.length; i++)
			for (int j = 0; j < matrix2[i].length; j++)
				matrix2[i][j] = input.nextDouble();
		//Pozivamo nasu metodu i tu vrijednost dodajemo nasoj novoj amtrici "sum"
		double[][] sum = addMatrix(matrix1, matrix2);

		for (int i = 0; i < matrix1.length; i++) {
			//Postaljanje i ispisivanje uslova i ispisivanje nasih matrica
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print("  " + matrix1[i][j]);
				if (i == 1 && j == 2)
					System.out.printf("%2s ", " + ");
				else
					System.out.printf("%3s ", " ");
			}
			// Ispisiavanje matrice broj2
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print( matrix2[i][j]);
				if (i == 1 && j == 2)
					System.out.printf("%2s ", " = ");
				else
					System.out.printf("%3s ", " ");

			}
			// Printamo sumu nase 2 nove matrice
			for (int j = 0; j < sum[i].length; j++) {
				System.out.print(" "  + sum[i][j]);
			}
			System.out.println("");
		}
	}
}
