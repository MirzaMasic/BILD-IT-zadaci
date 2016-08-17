package zadaci_17_08_2016;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Unos korisnika
		System.out.println("Unesite karatker za koji zelite vidjeti unicode");
		String s = input.nextLine();
		
		//Ispisivanje unicoda  za akratkter koji je korisnik izbarao
		char[] c = new char[s.length()];
		for(int i = 0; i  < s.length(); i++){
			c[i] = s.charAt(i);
			System.out.print("Unicode za vas karatkter je: " + (int) c[i]);
		}
	}

}
