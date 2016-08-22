package MiniProjekt3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConnecFour {
	// Slova "R" i "Y" oznacavaju boju plocica u igri slovo "R" oznacaje crvenu
	// boji a slovo "Y" oznacaje žutu boju

	// Ovom metodom stavljamo plocicu na odredjenop mijesto
	// Vraca true ako je jesto koje smo oznacili prazno i false ako je mjesto
	// popunjeno
	public static boolean unosIgraca(char[][] ploca, int kolona, char boja) {
		// Ako je prva plocica tu, kolona se punu, i vraca false.
		if (ploca[0][kolona] != ' ')
			return false;

		// Petljom provjerajemo sve elemente kolone
		for (int row = 0; row < 7; ++row) {
			// Ako je petlja nasla neki karaktet a da nije nula,
			if (ploca[row][kolona] != ' ') {
				// Novu plocicu postavlja povis koja je vec na igracoj tabli
				ploca[row - 1][kolona] = boja;
				return true;
			}
		}
		// Ako nema nikakve plocice u toj koloni, novu plocicu stavljamo na dno.
		ploca[6][kolona] = boja;
		return true;
	}

	// Metoda provjeraje redove, ako u redu imaju 4 ili vise plocica iste boje
	// metoda vraca koja je pobjednicka boja
	private static char provjeraRedova(char[][] ploca) {
		// Pregled redova radi provjere dali tu imaju iste 4 boje
		for (int row = 0; row < 7; ++row) {
			int count = 0;
			// Uporedit cemo zadnji uneseni element sa onim prethodnim
			for (int column = 1; column < 7; ++column) {
				if (ploca[row][column] != ' '
						&& ploca[row][column] == ploca[row][column - 1])
					++count;
				else
					count = 1;

				// Provjera da li se 4 ista nalaze u jendom redu.
				if (count >= 4) {
					// Vracanje pobjednicke boje
					return ploca[row][column];
				}
			}
		}
		// Ako nema pobjednika u redu vraca samo prazan karakter
		return ' ';
	}

	// Metoda provjeraje kolone, ako u redu imaju 4 ili vise plocica iste boje
	// metoda vraca koja je pobjednicka boja
	private static char provjeraKolone(char[][] ploca) {
		// Pregled koloni radi provjere da li imaju 4 plocice iste boje za redom
		for (int column = 0; column < 7; ++column) {
			int count = 0;
			// Uporedit cemo trenutni element sa pethodnim
			for (int row = 1; row < 7; row++) {
				if (ploca[row][column] != ' '
						&& ploca[row][column] == ploca[row - 1][column])
					count++;
				else
					count = 1;

				// provjera ako imaju 4 ista za redom
				if (count >= 4) {
					// Ako imaju vraca se boja pobjednika
					return ploca[row][column];
				}
			}
		}
		// Ako nista vraca se prazan karakter
		return ' ';
	}

	// Provjera dijagonale ako imaji 4 iste boje petlja vraca boju pobjednika
	private static char provjeraDijagonali(char[][] ploca) {
		// Dijagonale mogu ici u dva smijera
		// Sada cemo provjeriti dijagonale koje idu od navjvise tacke lijevo
		// pa sve do najmanje tacke desno
		for (int column = 0; column < 7; ++column) {
			int count = 0;
			// Prva dijagonala nam krece od [0][column]
			// Dijagonalu cemo provjeriti tako sto provjerajemo svaku prethodnu
			// unesenu plocicu
			for (int row = 1; row < 7; ++row) {

				if (column + row >= 7)
					break;
				if (ploca[row][column + row] != ' '
						&& ploca[row - 1][column + row - 1] == ploca[row][column
								+ row])
					++count;
				else
					count = 1;
				if (count >= 4)
					return ploca[row][column + row];
			}
		}

		for (int row = 0; row < 7; ++row) {
			int count = 0;
			// Ova dijagonala krece od [0][column]
			// Provjerajemo prethodne kao i prosloj dijagonali
			for (int column = 1; column < 7; ++column) {
				// Program staje s radom kada se pokusa unijet prevelik broj
				if (column + row >= 7)
					break;
				if (ploca[row + column][column] != ' '
						&& ploca[row + column - 1][column - 1] == ploca[row
								+ column][column])
					++count;
				else
					count = 1;
				if (count >= 4)
					return ploca[row + column][column];
			}
		}

		// Sada idu dijagonale koje idu od najvise tacke desno do namlnaje tacle
		// lijevo
		for (int column = 0; column < 7; ++column) {
			int count = 0;
			// Ova dijagonala krece od [0][column] zato sto provjerajemo svaki
			// pethodni kao u ranijim slucajevima
			for (int row = 1; row < 7; ++row) {

				if (column - row < 0)
					break;
				if (ploca[row][column - row] != ' '
						&& ploca[row - 1][column - row + 1] == ploca[row][column
								- row])
					++count;
				else
					count = 1;
				if (count >= 4)
					return ploca[row][column - row];
			}
		}

		// Sada cemo provjeriti dijagonale lijevo od svakog reda
		for (int row = 0; row < 7; ++row) {
			int count = 0;
			// provjera pocinje od [row][0] i radi na istom principu kao
			// prethonda tj,
			// radi provjeru svakog prethodnog
			for (int column = 5; column >= 0; --column) {

				if (column - row < 0)
					break;
				if (ploca[column - row][column] != ' '
						&& ploca[column - row - 1][column + 1] == ploca[column
								- row][column])
					++count;
				else
					count = 1;
				if (count >= 4)
					return ploca[column - row][column];
			}
		}
		// A ako nema pobjednika vraca se prazan string
		return ' ';
	}

	public static char rezultat(char[][] ploca) {
		char winner = provjeraRedova(ploca);
		if (winner != ' ')
			return winner;
		winner = provjeraKolone(ploca);
		if (winner != ' ')
			return winner;
		winner = provjeraDijagonali(ploca);
		if (winner != ' ')
			return winner;

		// Provjera programa ako nema praznih mjesta a nema ni pobjednika igra
		// je nerjesena
		for (int i = 0; i < ploca.length; ++i)
			for (int j = 0; j < ploca[i].length; ++j)
				if (ploca[i][j] == ' ')
					return ' ';

		return 'D';
	}

	// Ovom metodom radimo ispis nase igraæe ploèe
	public static void ispisIgracePloce(char[][] c) {
		for (int row = 0; row < 7; ++row) {
			System.out.print("| ");
			for (int col = 0; col < 7; ++col)
				System.out.print(c[row][col] + "| ");
			System.out.println();
		}

		for (int col = 0; col < 7; ++col)
			System.out.print("---");
		System.out.println();
	}

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			// Sada cemo kreirati nas 2D niz
			char[][] ch = new char[7][7];

			// Sada u nas niz ubacujemo prazne karaktere
			for (int i = 0; i < 7; ++i)
				for (int j = 0; j < 7; ++j)
					ch[i][j] = ' ';

			// Metoda za ispis igrace ploce
			ispisIgracePloce(ch);

			// Sada cemo odrediti ko je na potezu odnosno cij je red za igru
			boolean prviIgrac = true;
			while (true) {
				if (prviIgrac)
					System.out.println("Sada je red na prvog igraca");
				else
					System.out.println("Sada je red na drugog igraca");
				System.out
						.print("Unesite broj koji zelite odigrazi mlim izaberite broj od 1 - 7");
				// Sadea cemo provjeriti unos korsinika.
				int column = input.nextInt();
				if (column < 1 || column > 7) {
					System.out
							.println("Molim unesite brojeve izmedju 1 - 7 . Pokusajte ponovo");
					column = input.nextInt();
					continue;
				}
				// Sada cemo unos korisnika pokusati ubaciti na mjesto koje je
				// odabrao ako ne uspije to je mejsto popunjeno i Igrac ce
				// pokusati ponovo
				if (!unosIgraca(ch, column - 1, prviIgrac ? 'R' : 'Y')) {
					System.out
							.println("Mijesto koje ste odabrali je popujeno molim pokusajte ponovo");
					column = input.nextInt();
					continue;
				}

				ispisIgracePloce(ch);

				// Sada slijedi provjera rezultata i ispis istog
				char result = rezultat(ch);
				if (result == 'D') {
					System.out.println("Rezultat je nerijesen!");
					break;
				} else if (result == 'R') {
					System.out.println("Red player has won");
					break;
				} else if (result == 'Y') {
					System.out.println("Yellow player  has won!");
					break;
				}
				// ako nema rezultata igra se samo nastavlja
				prviIgrac = !prviIgrac;
				input.close();
			}
		} catch (InputMismatchException ex) {
			System.out.println("Pogresan unos");
		}
		
	}

}
