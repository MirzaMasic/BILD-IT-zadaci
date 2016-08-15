package zadaci_15_08_2016;

public class NasumicniMjesec {

	public static void main(String[] args) {
		// Ovdje trazimo random broj od 0 do 12(metoda ne ukljucuje 12)zato
		// sabiramo sa brojem jedan da brojevi variraju izmedju 1 i
		// 12(ukljucujuci 12)
		int mjesec = (int) (Math.random() * 12) + 1;
		// Sada samo provjerajemo koji je broj racunar izabrao i ispisujemo ga
		// zajedno sa provjerom
		switch (mjesec) {
		case 1:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Januar");
			break;
		case 2:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Februar");
			break;
		case 3:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Mart");
			break;
		case 4:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec April");
			break;
		case 5:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Maj");
			break;
		case 6:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Juni");
			break;
		case 7:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Juli");
			break;
		case 8:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Avgust");
			break;
		case 9:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Septembar");
			break;
		case 10:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Oktobar");
			break;
		case 11:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Novembar");
			break;
		case 12:
			System.out.println("Random broj koji je program ispisao je: "
					+ mjesec + " Taj broj predstavlja mjesec Decembar");
			break;
		}

	}

}
