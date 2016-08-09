package zadaci_03_08_2016;

import java.util.Scanner;

public class LokacijaNajveceg {
	//Metoda za pronalazenje najveceg elementa u 2D nizu
	public static int[ ] locateLargest(double[ ][ ] a){
		double x = 0;
		//petlja za pronalazneje najvegeg elementa
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				if(x < a[i][j]){
					x= a[i][j];
				}
			}
		}
		int[] array = new int[2];
		//petlja za pronalazenje pozicije najveceg elementa
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				if(x == a[i][j]){
					array[0] = i;
					array[1] = j;
					
					//Ispisivanje pozicije najveceg elementa
					for(int y = 0; y < array.length; y++){
						System.out.print(array[y] + " ");
					}
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		//Kreiranje scanner-a
		Scanner input = new Scanner(System.in);
		//Kreiranje novog 2D niza i dodavanje vrijednosti u isti
		System.out.println("Unesite vrijednosti u 3x3 niz");
		double[][] niz = new double[3][3];
		for(int i =0;i<niz.length; i++){
			for(int j = 0; j < niz[i].length; j++){
				niz[i][j] = input.nextDouble();
			}
		}
		System.out.println("Najveci elemnt u nizu se nalazi na ovoj poziciji: ");
		locateLargest(niz);
	}

}
