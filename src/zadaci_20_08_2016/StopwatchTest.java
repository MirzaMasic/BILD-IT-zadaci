package zadaci_20_08_2016;

public class StopwatchTest {

	public static void main(String[] args) {
		// Pozivanje nase sStopwatch class
		Stopwatch time = new Stopwatch();
		// Kriranje niza koji sam sebi generise random brojeve od 1 do 10 is
		// sabira sve te brojeve
		int sum = 0;
		int[] array = new int[10000];

		// Sada pokrecemo nasu stopericu koja nam mjeri vrijeme koliko je
		// trebalo programu da odradi sto je bilo potrebno(da radnom generise
		// brojeve i potom ih sabere)
		time.getStartTime();

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
			sum += array[i];
		}

		int brojac = 0;
		for (int i = 0; i < array.length; i++) {
			brojac++;
			System.out.print(array[i] + " | ");
			if (brojac % 30 == 0) {
				System.out.println();
			}
		}
		time.getEndTime();
		// Sada smo zaustavili stopericu i ispod sada cemo ispisati kolika je
		// suma brojeva i koliko je programi trebalo da zavrsi s radom
		System.out.println(" Suma brojeva je: " + sum + " \n Elapsed time is: "
				+ time.getElapsedTime() + " milliSeconds");
	}

}
