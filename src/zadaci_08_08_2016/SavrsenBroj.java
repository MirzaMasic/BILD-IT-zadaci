package zadaci_08_08_2016;


public class SavrsenBroj {
	public static void main(String[] args) {
		int sum = 0;
		// Prvo kreiramo petju sa  vrijednost od koliko do koliko se petlja proteze
		for (int i = 1; i <= 10000; i++) {
			// Petja za dijeljenike
			for (int j = 1; j < i; j++) {
				// Sada pronalazimo dijeljenike i sabiramo ih
				if (i % j == 0) {
					sum += j;
				}
			}
			// Sada pronalazimo savsreni broj i ispisujemo ga
			if (sum == i) {

				System.out.print(i + " ");
			}
			// Sada vracamo sumu na nulu
			sum = 0;

		}
	

	}

}
