package zadaci_10_08_2016;

import java.util.Scanner;

public class BrojPonavljanjaKaraktera {
	public static int brojKaraktera(String s , char c){
		int brojac = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == c){
				brojac++;
			}
		}
		return brojac;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Molim unesite svoj string");
		String s = input.nextLine();
		System.out.println("Uneiste karakter koji zelite da izbrojite");
		String c = input.nextLine();
		if(c.length() == 0){
			System.out.println("Nema karaktera u stringu. Pokusajte ponovo");
			c =input.nextLine();
		}else if(c.length() > 1){
			System.out.println("Unijeli ste previse karaktera.Pokusajte ponovo ");
			c = input.nextLine();
		}
		char c2 = c.charAt(0);
		System.out.println("Karakter se ponovio " +  brojKaraktera(s, c2) + " puta");
	}

}
