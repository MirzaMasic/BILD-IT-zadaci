package zadaci_06_08_2016;

import java.util.Scanner;

public class ReverseIPalindrom {
	
	public static boolean isPalindrom(int number) {
		//Postavljanje  varijeable isPalindrom  na true
		boolean isPalindrom = true;
		//Dodavanje pocetnih vrijednosti na slj varijable
		String obrnut = "";
		int reverse = 0;
		int broj = number;
		//Racunanje broja u obrnutom redoslijedu
		while (broj != 0) {
			obrnut += broj % 10;
			broj = broj / 10;
		}
		//Provjeravanje dali jepalidrom ili ne
		reverse = Integer.valueOf(obrnut);
		if (number == reverse) {
			return true;

		}
		return false;
	}
	
	public static int reverse(int number){
		int ostatak = 0;
		int rezultat = 0;
		
		while(number != 0){
			//Racunanje zadnje cifre 
			ostatak = number % 10;
			
			//varijabla rezultat ovako dobija cifre ispisane u obrnuto redoslijedu
			rezultat = rezultat * 10 + ostatak;
			
			//Smanjuje se broj cifri
			number = number / 10;		
		}
		return rezultat;
	}
	
	public static void main(String[] args) {
		//Kreiranje scanner-a i dodjeljivanje vrijednosti  i pozivanje metode
		Scanner input = new  Scanner(System.in);
		
		System.out.println("Molimo unesite vas broj.");
		int unos = input.nextInt();
		
		System.out.println("Da li je vas broj palindrom " + isPalindrom(unos));
		System.out.println("Vas broj u obrnutom redoslijedu " + reverse(unos));
	}
}



