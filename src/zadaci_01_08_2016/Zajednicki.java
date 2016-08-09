package zadaci_01_08_2016;

import java.util.Scanner;

public class Zajednicki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pronalazenje najveceg zajednickog

				// Kreiranje skenera
				Scanner input = new Scanner(System.in);

				System.out.println("Enter first integer ");
				int number1 = input.nextInt();
				System.out.println("Enter Second integer ");
				int number2 = input.nextInt();

				int p = 1; // pocetni najveci zajednicki
				int m = 2; // moguci najveci zajednicki

				while (m <= number1 && m <= number2) {
					if (number1 % m == 0 && number2 % m == 0)
						p = m; // Update najveceg zajednickog
					m++;
				}
				System.out.println("Najmanji zajednicki od brojeva:" + number1 + " i "
						+ number2 + " iznosi  " + p);
				input.close();


	}

}
