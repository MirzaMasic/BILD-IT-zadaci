package zadaci_05_08_2016;

import java.util.Scanner;

public class ObrnutiRedoslijed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Pravimo niz da  spremimo nasih 10 vrijednosti
		int[] array = new int[10];
		
		System.out.println("Unesite 10 vrijednosti");
		//Pisemo petlju da unesemo 10 vrijednosti u nas niz
		for(int i = 0; i < array.length; i++){
			array[i] = input.nextInt();
		}
		//Pisemo petlju  da ispisemo nase vrijednosti u obrnutom redoslijedu
		for(int i = array.length -1; i >= 0; i--){
			System.out.print(array[i] + " ");
		}

	}

}
