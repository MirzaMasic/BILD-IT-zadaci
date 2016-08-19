package zadaci_18_08_2016;

import java.util.Scanner;

public class SabiranjeKoloni {
	// Metoda pomocu koje racunamo sumu elemenata u svakoj koloni u 2D nizu
	public static double sumColumn(double[][] m, int columnIndex) {
		double suma = 0;
		for (int i = 0; i < m.length; i++) {
			suma += m[i][columnIndex];
		}

		return suma;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] array = new double[3][4];

		System.out
				.println("Unesite vrijednosti u 2D niz koji ima 3 reda i 4 kolone");
		// Sada spremamo brojeve koje je korsinik unio u 2D niz koji smo gore
		// kreirali
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				array[row][column] = input.nextDouble();
			}
		}
		// Pozivanje metode
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Suma brojeva u koloni broj: " + j
						+ " iznosi: " + sumColumn(array, j));
			}
		}

	}

}
