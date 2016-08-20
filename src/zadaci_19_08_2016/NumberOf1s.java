package zadaci_19_08_2016;

public class NumberOf1s {
	// Petlja u kojoj provjeramo redove u 2D Nizu
	// Ako ima program vraca true ako ne vraca false
	public static boolean countRows(int[][] a) {
		int brojac = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 1) {
					brojac++;
				}
			}
			if (brojac % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	// Ovom petlom provjerajemo kolone u 2 D nizu i provjerajemo dali imaju siti
	// broj jedinica
	public static boolean countColumn(int[][] b) {
		int brojac = 0;

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (b[j][i] == 1) {
					brojac++;
				}
			}
			if (brojac % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// Ovdje kreiramo novi niz i unosimo mu vrijednosti koje su 0 i 1
		// Poslije toga postavjamo uslov u ispisujemo poruku
		int[][] array = new int[6][6];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 2);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		if (countRows(array) == true) {
			System.out.println("Redovi imaju isti broj jedinica");
		} else {
			System.out.println("Redovi nemaju isti broj jedinica");
		}
		if (countColumn(array) == true) {
			System.out.println("Kolone imaju isti broj jedinica");
		} else {
			System.out.println("Kolone nemaju isti broj jedinica");
		}

	}

}
