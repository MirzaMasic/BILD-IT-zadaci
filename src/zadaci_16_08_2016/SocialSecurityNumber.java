package zadaci_16_08_2016;

import java.util.Scanner;

public class SocialSecurityNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ovaj program ce provjeravati dali je broj koji je korisnik unio
		// validan SSN(Social Security Number)
		// Korisnik broj mora unijetu u formatu NNN-NN-NNNN
		// 457-55-5462
		System.out.println("Molim unesite  SSN:"
				+ " Broj mora biti unesen u fromatu: DDD-DD-DDDD");
		String s = input.nextLine();
		//Provjeravanje  SSN-a koji je korisnik unio
		for (int i = 0; i < s.length(); i++) {
			if ((i == 3 || i == 6) && s.charAt(i) == '-') {
				continue;
			}
			if (!Character.isDigit(s.charAt(i))) {
				System.out.println(s + " |  Nije validan  social security number."
						+ " Molimo pokusajte ponovo");
				s = input.nextLine();
			}
		}

		System.out.println(s + " je validan social security number");
	}
}
