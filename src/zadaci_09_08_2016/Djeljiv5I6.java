package zadaci_09_08_2016;

public class Djeljiv5I6 {

	public static void main(String[] args) {
		// Pravimo petje koje idu od broja 100 do 1000 i ispisuju sve brojeve
		// dijeljive sa 5 i sa 6
		int brojac1 = 0;
		int brojac2 = 0;
		
		//Racunanje brojeva djeljivih sa 5
		System.out.println("Brojevi djeljivi sa 5 su");
		for (int i = 100; i < 1000; i++) {
			if ((i % 5 == 0)) {
				System.out.print(i + " ");
				brojac1++;
			}
			if (brojac1 == 10) {
				System.out.println();
				brojac1 = 0;
			}

		}
		System.out.println();
		//racunanje brojeva djeljivih sa 6
		System.out.println("Brojevi djeljivi sa 6 su");
		for( int j = 100; j < 1000; j++){
			if(j % 6 == 0){
				System.out.print(j + " ");
				brojac2++;
			}
			if(brojac2 == 10){
				System.out.println();
				brojac2 = 0;
			}
		}

	}
}