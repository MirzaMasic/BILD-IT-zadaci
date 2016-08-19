package zadaci_18_08_2016;

public class CountSingleDigits {

	public static void main(String[] args) {
		//Kreiranje niza za spremanje jednocifrenih brojeva
		int[] array = new int[10];
		//Racunanje random brojeva i generisanje sitih
		for (int i = 0; i < 100; i++) {
			int broj = (int) (Math.random() * 10);
			array[broj]++;
		}
		//Ispisivanje koliko se puta koji broj ponovio
		for (int i = 0; i < 10; i++) {
			System.out
					.println("Broj " + i + "se ponovio " + array[i] + " puta");
		}
	}

}
