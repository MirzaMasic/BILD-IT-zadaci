package zadaci_06_08_2016;

import java.util.Scanner;

public class NeparniKarakteri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Kreiranje stringa 
		System.out.println("Molimo unesite neki string");
		String s = input.nextLine();
		//Pravljenje petlje tako da nam isprina sve neparne karaktere
		for(int i = 0; i < s.length(); i+=2){
			System.out.print(s.charAt(i));
		}

	}

}
