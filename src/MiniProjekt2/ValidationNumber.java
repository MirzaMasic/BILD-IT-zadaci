package MiniProjekt2;

import java.util.Scanner;

public class ValidationNumber {
	public static int getDigit(int number) {
		// Return this number if it is a single digit, otherwise,
		// return the sum of the two digits
		if (number <= 9) {
			return number;
		} else {
			int firstDigit = number % 10;
			int secondDigit = (number / 10);
			return firstDigit + secondDigit;
		}
	}

	// Return the number of digits in d
	public static int getSize(long d) {
		int brojac = 0;
		while (d > 0) {
			d = d / 10;
			brojac++;
		}
		return brojac;
	}

	// Return the first k number of digits from number. If the
	// number of digits in number is less than k, return number
	public static long getPrefix(long number, int k) {
		if (getSize(number) < k) {
			return number;
		} else {
			int size = getSize(number);
			for (int i = 0; i < (size - k); i++) {
				number = number / 10;
			}
			return number;
		}
	}

	// Return sum of odd-place digits in number
	public static int sumOfOddPlace(long number) {
		int result = 0;
		while (number > 0) {
			result = (int) (result + (number % 10));
			number = number / 100;
		}
		return result;
	}

	// Get the result from Step 2
	public static int sumOfDoubleEvenPlace(long number) {
		int result = 0;
		long temp = 0;
		while (number > 0) {
			temp = number % 100;
			result = result + getDigit((int) ((temp / 10) * 2));
			number = number / 100;
		}
		return result;
	}

	// Return true if the digit d is a prefix for number
	public static boolean prefixMatched(long number, int d) {
		if (getPrefix(number, d) == 4) {
			System.out.println("Visa Card");
			return true;
		} else if (getPrefix(number, d) == 5) {
			System.out.println("Master Card");
			return true;
		} else if (getPrefix(number, d) == 3) {
			System.out.println("American Express Card");
			return true;
		} else if (getPrefix(number, d) == 6) {
			System.out.println("Discover Cards");
			return true;
		}
		return false;
	}

	// Return true if the card number is valid
	public static boolean isValid(long number) {
		int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		if ((total % 10 == 0) && (prefixMatched(number, 1) == true)
				&& (getSize(number) >= 13) && (getSize(number) <= 16)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// Now user inputs number of card and calling method isValid we chaeck
		// if number that user entered is valid to a card number
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj kreditne kartice");
		// 4388576018410707
		long broj = input.nextLong();

		if (isValid(broj) == true) {
			System.out.println("Broj kartice: " + broj + " je validan");
		} else {
			System.out.println("Broj kartice " + broj + " nije validan");
		}
	}
}
