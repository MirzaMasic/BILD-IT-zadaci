package zadaci_13_08_2016;

public class PalindromePrime {
	//Racunanje dali je broj palindrome ili ne
	public static boolean isPalindrome(int x) {
		int result = 0;
		int num = x;

		while (x != 0) {
			int zadnjiBroj = x % 10;
			result = result * 10 + zadnjiBroj;
			x = x / 10;
		}
		if (num == result) {
			return true;
		}
		return false;
	}
	//Racunanje daili je broj prost ili ne
	public static boolean isPrime(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		int count = 1, number = 2;
		String result = "";
		// Petljom ogranicavamo koliko ce nam brojeva biti ispisano
		while (count <= 100) {
			// Provjerava dali je broj palindrom i prost u isto vrijeme
			if (isPrime(number) && isPalindrome(number)) {
				if (count % 10 == 0) {
					result += " " + number + "\n";
				} else {
					result += " " + number;
				}
				count++;
			}
			number++;

		}
		// Ispisivanje brojeva
		System.out.print(result);

	}
}
