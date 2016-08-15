package zadaci_15_08_2016;

import java.util.Scanner;

public class SumaBrojeva {
	public static int sumDigits(long n) {
		int sum = 0;
		while (n != 0 && n > 0) {
			// Ovako dobijamo zadnju znamenku naseg broja
			sum = (int) (sum + (n % 10));
			// sada nastavljamo sa dijeljenjem broja sve dok ne postane 0
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Molim unesite vas broj");
		long broj = input.nextLong();
		//Pozivanje metode i ispisivanje
		System.out.println(sumDigits(broj));
	}
}
