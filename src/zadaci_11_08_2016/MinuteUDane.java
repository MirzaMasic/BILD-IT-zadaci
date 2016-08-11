package zadaci_11_08_2016;

import java.util.Scanner;

public class MinuteUDane {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Molimo unesite broj minuta");
		long minute = input.nextLong();

		// Racunamo broj minuta
		long sati = minute / 60;
		// racunamo preostali broj minuta
		minute = minute % 60;

		// Racunamo broj dana
		long dani = sati / 24;
		// Racunamo prostali broj sati;
		sati = sati % 24;

		// Racunamo broj godina
		long godine = dani / 365;
		// Racunamo prostali broj dana
		dani = dani % 365;

		// Ispisivanje svega sto smo uradili
		System.out.println("Broj godina je: " + godine  + "  broj dana je: "
				+ dani + "broj sati je: " + sati);
	}

}
