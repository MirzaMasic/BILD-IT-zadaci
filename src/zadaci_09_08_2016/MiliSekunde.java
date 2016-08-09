package zadaci_09_08_2016;

import java.util.Scanner;

public class MiliSekunde {
	public static void miliSekunde(long number) {
		long sekunde = number / 1000;// Pretvara milisekunde u sekunde
		long minute = sekunde / 60;// Sekunde u minute
		sekunde = sekunde % 60;// Ostatak od sekundi
		long sati = minute / 60;// Minute u sate
		minute = minute % 60;// Trazi se ostatak minuta

		System.out.println("Sati ima " + sati + "Minuta ima " + minute
				+ " Sekundi ima " + sekunde);
	}

	public static void main(String[] args) {
		// Sada samo unosimo vrijednost i ispisujemo poruku
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Molim unesite broj milisekundi");
		long number = input.nextLong();
		
		miliSekunde(number);

	}

}
