package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Plaindrome {
	public static String isPalindorme(int number) {
		//Dodacanje pocetnih vrijednosti na slj varijable:
		int result = 0;
		int num = number;
		// Kreiranje 2 stringa koji ce nam poslije posluziti kao poruka potvrde
		// dali je broj koji korisnik unese palindrom ili ne
		String str1 = "Broj je palindrom";
		String str2 = "Broj nije palindrom";

		while (number > 0) {//Petlja ce se izvrsiti ako je broj veci od 0(nule)
			//Racunanje dali je broj palindrome ili ne
			int zadnjaCifra = number % 10;
			result = result * 10 + zadnjaCifra;
			number = number / 10;
		}
		//Ispisivanje poruke
		if (num == result) {
			return str1;
		} else {
			return str2;
		}
	}

	public static void main(String[] args) {
		try{
		//Unos korisnika i nakon toga pozivanje metode
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite broj koji zelite probjeriti dali je palindrom");
		int broj = input.nextInt();

		System.out.println(isPalindorme(broj));
		}catch(InputMismatchException error){
			System.out.println("Molim unesite broj");
		}
	}

}
