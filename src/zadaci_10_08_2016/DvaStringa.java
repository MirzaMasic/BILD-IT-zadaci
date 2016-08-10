package zadaci_10_08_2016;

import java.util.Scanner;

public class DvaStringa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Kreiramo dva stringa i jednostavnom metodom provjerimo dali se jedan
		// sadrzi u drugom
		
		System.out.println("Molim unesite prvi string");
		String s = input.nextLine().toLowerCase();
		System.out.println("Unesite drugi string");
		String s2 = input.nextLine().toLowerCase();
		
		//Mijenjamo mijesta ako je 2 string veci od prvog
		String temp = "";
		if(s.length() < s2.length()){
			temp = s;
			s = s2;
			s2 = temp;
		}
		//Ovdje ide provjera i ispisivanje poruke
		if(s.contains(s2)){
			System.out.println("String " + s  + " U sebi sadrzi drugi string "  + s2);
		}else {
			System.out.println("String " + s + " U sebi ne sadrzi drugi string " + s2);
		}
	}

}
