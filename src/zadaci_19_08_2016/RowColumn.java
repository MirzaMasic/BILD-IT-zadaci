package zadaci_19_08_2016;

public class RowColumn {
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		//Dodavanje pocetnih vrijednosti na:
		int biggestRow = 0;
		int biggestColumn = 0;
		int row = 0;
		int column = 0;
		int brojac1 = 0;
		int brojac2 = 0;
		//Dodacanje random jedninica i nula u matricu
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		//Brojanje jedinica u redu i koloni
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					brojac1++;
				}
				if (matrix[j][i] == 1) {
					brojac2++;
				}
			}
			//Trazenje reda sa najvise jedinica u sebi
			if (brojac1 > biggestRow) {
				biggestRow = brojac1;
				row = i;
			}
			brojac1 = 0;
			
			//Trazenje kolone sa najvise  jedinica u sebi
			if (brojac2 > biggestColumn) {
				biggestColumn = brojac2;
				column = i;
			}
			brojac2 = 0;

			if (row == column) {
				System.out.println("Red " + row + " i Kolona " + column
						+ " imaji isti broj jedinica u sebi \n");
			}
			System.out.println();
		}
		//Ispisivanje  najveceg reda i kolone
		System.out.println("Red sa najvise jedinica u sebi je: " + row);
		System.out.println("Kolona sa najvise jedinica u sebi je: " + column);
	}

}
