package zadaci_04_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class RastuciRedoslijed {
	//Kreiranje metode
	public static void displaySortedNumbers(double num1, double num2, double num3){
		//Kreiranje niza tako da mogu spremiti sve brojeve u njega
		double[] niz = new double[3];
		//dodavanje vrijednosti na elemente u nizu
		niz[0] = num1;
		niz[1] = num2;
		niz[2] = num3;
		
		//Kreiranje petlje za sortiranje niza
		for(int i = 0; i < niz.length; i++){
			Arrays.sort(niz);
			//Ispisivanje niza 
			System.out.print(niz[i] + " ");
		}
	}

	public static void main(String[] args) {
		//Kreiranje scanner-a
		Scanner input = new Scanner(System.in);
		System.out.println("Molimo unesite neke 3 vrijednsoti");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		displaySortedNumbers(num1, num2, num3);

	}

}
