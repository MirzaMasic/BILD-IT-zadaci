package zadaci_15_08_2016;

import java.util.Scanner;

public class NxNMatrica {
	public static void matrica(int n , int n2){
		//Kreiranje 2D niza(Matrice)
		int[][] matrix = new int[n][n2];
		//Dodavanje vrijednosti matrici
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				matrix[row][column] = (int)(Math.random() * 2);
			}
		}
		//Ispisivanje matrice
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koliko ce rodeva imati matrica");
		int n = input.nextInt();
		System.out.println("Unesite koliko ce kolona imati matrica");
		int n2 = input.nextInt();
		
		matrica(n , n2);

	}

}
