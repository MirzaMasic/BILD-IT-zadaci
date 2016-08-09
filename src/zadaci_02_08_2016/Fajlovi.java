package zadaci_02_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Fajlovi {
	public static void main(String[] args) throws IOException {
		// kreiranje novog file-a
		try {
			File files = new File("text.txt");

			files.createNewFile();
			// Pretrazivanje file-a
			Scanner input = new Scanner(files);

			// Dodavanje pocetne vrijednosti na :
			int brojac = 0;
			int sum = 0;
			int rijeci = 0;

			// Kreiranje brojaca za stringove i karaktere u file-u
			while (input.hasNext()) {
				String s = input.next();
				brojac = s.length();
				if (brojac > 0) {
					sum += brojac;
					rijeci++;
				}

			}
			// Brojanje linija u File-u

			LineNumberReader linije = new LineNumberReader(
					new FileReader(files)); // metoda za brojanje

			String l = null;// inicijaliziranje stringa
			try {
				while ((l = linije.readLine()) != null) {
					// Ispisivanje broja linija u file-u i sadrzaj istih
					System.out.println("Linija " + linije.getLineNumber()
							+ ": " + l);
				}
			} catch (Exception ex) {
				// hvatanje gresaka
				System.out.println("Greska");
			} finally {

				System.out.println("Broj stringova je " + rijeci);
				System.out.println("Linija ima: " + linije.getLineNumber()
						+ ": ");
				System.out.println("Broj karaktera u fajlu je " + sum);

				linije.close();

			}
		} catch (FileNotFoundException ex) {
			System.out
					.println("Nazalost  program nije moga da pronadje vas file");
		}

	}
}
