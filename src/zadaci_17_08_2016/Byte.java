package zadaci_17_08_2016;

import java.util.Scanner;

public class Byte {

	public static void main(String[] args) {
		// Unos korisnika
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite neku vrijendost");
		short broj = input.nextShort();
		
		//Ispis short vrijednsoti korisniku
		System.out.print(String.format("%016d", Integer.parseInt(Integer.toBinaryString(broj))));
		

	}

}
