package zadaci_09_08_2016;

import java.util.Scanner;

public class DanUBuducnosti {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Molim unesite broj danasnjeg dana od 0 do 6");
		int danasnjiDan = input.nextInt();
		System.out.println("Molim unesite dan u buducnosut koji zelite da znate od 0 do 6");
		int danUBuducnosti = input.nextInt();
		
		
		//Ispisujemo sadanji dan koji je korisnik unio
		switch(danasnjiDan){
		case 0:
			System.out.println("Danasji dan je Ponedjeljak");
			break;
		case 1:
			System.out.println("Danasnji dan je Utorak");
			break;
		case 2:
			System.out.println("Danasnji dan je Srijeda");
			break;
		case 3:
			System.out.println("Danasnji dan je Cetvrtak");
			break;
		case 4:
			System.out.println("Danasnji dan je Petak");
			break;
		case 5:
			System.out.println("Danasnji dan je Subota");
			break;
		case 6:
			System.out.println("Danasnji dan je Nedjelja");
			break;
		}
		
		//A ovdje ispisujemo dan u Buducnosti koji korisnik zeli znati
		switch(danUBuducnosti){
		case 0:
			System.out.println("Dan u buducnosti je Ponedjeljak");
			break;
		case 1:
			System.out.println("Dan u buducnosti je Utorak");
			break;
		case 2:
			System.out.println("Dan u buducnosti je Srijeda");
			break;
		case 3:
			System.out.println("Dan u buducnosti je Cetvrtak");
			break;
		case 4:
			System.out.println("Dan u buducnosti je Petak");
			break;
		case 5:
			System.out.println("Dan u buducnosti je Subota");
			break;
		case 6:
			System.out.println("Dan u buducnosti je Nedjelja");
			break;
		}
		

		
		
		
		
	}

}
