package zadaci_12_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class RastuciRedoslijed {
	public static int[] rastuciRedoslijed(int broj1 , int broj2, int broj3){
		//Kreiramo niz u koje spremamo brojeve
		int[] niz = new int[3];

		niz[0] = broj1;
		niz[1] = broj2;
		niz[2] = broj3;
		//Metoda za sortiranje niza
		Arrays.sort(niz);
		
		return niz;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Dodacanje vrijednosti 
		System.out.println("Unesite brvi broj");
		int broj1 = input.nextInt();
		System.out.println("Unesite drugi broj");
		int broj2 = input.nextInt();
		System.out.println("Unesite treci broj");
		int broj3 = input.nextInt();
		
		//Ispisivanje poruke i  pozivanje metode
		System.out.println("Brojevi poredani po rastucem redoslijedu su: ");
		for(int i =0 ; i < 3; i++){
			System.out.print(rastuciRedoslijed(broj1, broj2, broj3)[i] + " ");
		}

	}

}
