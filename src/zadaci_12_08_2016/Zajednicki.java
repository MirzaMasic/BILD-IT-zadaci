package zadaci_12_08_2016;

import java.util.Scanner;

public class Zajednicki {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int broj1 = input.nextInt();
		int broj2 = input.nextInt();
		int min = 1;
		int max = 1;

		// Racunanje najmanjeg zajednickog
		for (int i = broj2; i >= 2; i--) {
			if (broj2 % i == 0 && broj1 % i == 0) {
				min = i;
			}

		}
		// Racunanje najveceg zajednickog
		for (int i = 1; i <= broj2; i++) {
			if (broj2 % i == 0 && broj1 % i == 0) {
				max = i;
			}
		}
		//Ispisivanje vrijednosti
		System.out.println("Najmanji zajednicki za: " + broj1 + " i " + broj2 + " je: " + min);
		System.out.println("Najveci zajednicki za: " + broj1 + " i " + broj2 + " je: " + max);
	}

}
