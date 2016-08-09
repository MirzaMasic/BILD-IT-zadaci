package zadaci_03_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeRedova {
	//Kreiranje metode za sortiranje  2D niza
	public static double[ ][ ] sortRows(double[ ][ ] array){
		//Kreiranje petlje za sortiranje niza
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length; j++){
				Arrays.sort(array[i]); //Metoda za sortiranje niza
				//Ispisivanje niza
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		return array;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Molim unesite velicinu vaseg 2D niza");
		int s = input.nextInt();
		//Kreiranje  2D niza
		System.out.println("Molimo unesite vrijednosti u vas niz");
		double[][] niz = new double[s][s]; 
		for(int i = 0;i < niz.length; i++ ){
			for(int j = 0; j < niz[i].length; j++){
				niz[i][j] = input.nextDouble();
			}
		}
		sortRows(niz);
	}

}
