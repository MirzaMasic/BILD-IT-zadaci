package MiniProjekt3;

import java.util.Scanner;

public class TicTacToe {
	static int A1, A2, A3, B1, B2, B3, C1, C2, C3;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String prviIgrac = "";
		String drugiIgrac = "";
		boolean pobjeda = false;

		// Petljom prolazimo kroz igru i ucitajemo i udpate-amo nase potez na
		// igracu plocu
		for (int i = 1; i <= 9; i++) {
			// Ucitajemo poteze drugog igraca
			prviIgrac = potezPrvogIgraca("Sada igra igrac broj 1");
			updateBoard(prviIgrac, 1);
			ispisIgracePloce();
			if (rezultat()) {
				System.out.println("Igrac broj 1 je pobijedio!");
				pobjeda = true;
				break;
			}

			// Sada se ovdje ucitaju potezi drugog igraca
			drugiIgrac = potezDrugogIgraca("Sada igra igrac broj 2 ");
			updateBoard(drugiIgrac, 2);
			ispisIgracePloce();
			if (rezultat()) {
				System.out.println("Igrac broj 2 je pobijedio!");
				pobjeda = true;
				break;
			}
		}
		if (pobjeda == false)
			System.out.println("Nerjeseno!");
	}

	// Metoda kojom prvi igrac unosi svoj potez , taj potez se naknadno
	// provjeraje
	// i ako je validan ubacuje u igracu plocu
	public static String potezPrvogIgraca(String str) {
		String play;
		do {
			play = sc.nextLine();
			if (!provjeraUnosa(play)) {
				System.out.println("Unos nije u skladu s pravilima.");
			}
		} while (!provjeraUnosa(play));
		return play;
	}

	// Metoda kojom drugi igrac unosi svoj potez , taj potez se naknadno
	// provjeraje
	// i ako je validan ubacuje u igracu plocu
	public static String potezDrugogIgraca(String str) {
		String play;
		do {
			play = sc.nextLine();
			if (!provjeraUnosa(play)) {
				System.out.println("Unos nije u skladu s pravilima");
			}
		} while (!provjeraUnosa(play));
		return play;
	}

	// Provjera unosa korinisnika ako je validan vraca true ako nije vraca false
	public static boolean provjeraUnosa(String play) {
		if (play.equalsIgnoreCase("A1") & A1 == 0)
			return true;
		if (play.equalsIgnoreCase("A2") & A2 == 0)
			return true;
		if (play.equalsIgnoreCase("A3") & A3 == 0)
			return true;
		if (play.equalsIgnoreCase("B1") & B1 == 0)
			return true;
		if (play.equalsIgnoreCase("B2") & B2 == 0)
			return true;
		if (play.equalsIgnoreCase("B3") & B3 == 0)
			return true;
		if (play.equalsIgnoreCase("C1") & C1 == 0)
			return true;
		if (play.equalsIgnoreCase("C2") & C2 == 0)
			return true;
		if (play.equalsIgnoreCase("C3") & C3 == 0)
			return true;
		return false;
	}

	// Ubacivanje svih rezultata u igracu plocu tako da se prazna mjesta pune
	public static void updateBoard(String play, int player) {
		if (play.equalsIgnoreCase("A1"))
			A1 = player;
		if (play.equalsIgnoreCase("A2"))
			A2 = player;
		if (play.equalsIgnoreCase("A3"))
			A3 = player;
		if (play.equalsIgnoreCase("B1"))
			B1 = player;
		if (play.equalsIgnoreCase("B2"))
			B2 = player;
		if (play.equalsIgnoreCase("B3"))
			B3 = player;
		if (play.equalsIgnoreCase("C1"))
			C1 = player;
		if (play.equalsIgnoreCase("C2"))
			C2 = player;
		if (play.equalsIgnoreCase("C3"))
			C3 = player;
	}

	// Pomocu ove metode cemo ispisati nasu igracu plocu
	public static void ispisIgracePloce() {
		String line = "";
		System.out.println("-----------");
		line = " " + znakXO(A1) + " | " + znakXO(A2) + " | " + znakXO(A3);
		System.out.println(line);
		System.out.println("-----------");
		line = " " + znakXO(B1) + " | " + znakXO(B2) + " | " + znakXO(B3);
		System.out.println(line);
		System.out.println("-----------");
		line = " " + znakXO(C1) + " | " + znakXO(C2) + " | " + znakXO(C3);
		System.out.println(line);
		System.out.println();
	}

	// provjera broja igraca tako da ako unosi igrac igrac pod brojem 1 u nasu
	// plocu se dodaje znak X a ako je igrac broj 2 u nasu plocu ce se onda
	// dodati znak O
	public static String znakXO(int unos) {
		if (unos == 1)
			return "X";
		if (unos == 2)
			return "O";
		return " ";
	}
	//Metoda pomocu koje cemo provjeriti rezultat ako je 
	public static boolean rezultat() {
		if (provjeraPobjednika(A1, A2, A3))
			return true;
		if (provjeraPobjednika(B1, B2, B3))
			return true;
		if (provjeraPobjednika(C1, C2, C3))
			return true;
		if (provjeraPobjednika(A1, B1, C1))
			return true;
		if (provjeraPobjednika(A2, B2, C2))
			return true;
		if (provjeraPobjednika(A3, B3, C3))
			return true;
		if (provjeraPobjednika(A1, B2, C3))
			return true;
		if (provjeraPobjednika(A3, B2, C1))
			return true;
		return false;
	}

	public static boolean provjeraPobjednika(int a, int b, int c) {
		return ((a == b) & (a == c) & (a != 0));
	}

}