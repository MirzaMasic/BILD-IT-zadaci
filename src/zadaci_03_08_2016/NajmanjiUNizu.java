package zadaci_03_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class NajmanjiUNizu {
	//Kreiranje metode
	public static double min(double[] array){
		
		//Dodavanje bocetne frijednosti  u niz , a to bio bio takodje i prvi elemnt u nizu
		double min = 0;
		//Sortiranje niza
		Arrays.sort(array);
		min = array[0]; //Stavljanje najmanje vrijednosti na prvo mjesto u nizu
		
		
		return min;
	}
	
	public static void main(String[] args) {
		//Kreiranje scanner-a i dodavanje vijednosti u niz
		Scanner input = new Scanner(System.in);
		
		
		double[] ar = new double[10];
		
		System.out.println("Molimo vas  unesite 10 vrijednosti  vas niz");
		for(int i = 0; i < ar.length; i++){
			double a = input.nextDouble();
			ar[i] = a;
			
		}
		//Pozivanje metode i ispisivanje najmanjeg elementa  u nizu
		System.out.println( "Najmanji elemnt u nize je"  + min(ar));
		
	}

}
