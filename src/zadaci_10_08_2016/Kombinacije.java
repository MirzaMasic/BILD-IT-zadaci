package zadaci_10_08_2016;

public class Kombinacije {

	public static void main(String[] args) {
		int brojac = 0;
		// Petlja kojom pronalazimo prvi "red"Brojeva
		for (int i = 1; i <= 7; i++) {
			// Sada ide drugi "red" brojeva
			for (int j = i+1; j <= 7; j++) {
				brojac++;
				//Ispisivanje
				System.out.print(i + " , " + j + " | ");
				if(brojac == 10){
					System.out.println();
				}
			}

		}

		System.out.println("Number of combinations is " + (brojac));

	}

}
