package zadaci_19_08_2016;

import java.util.Scanner;

public class EmployeeWeeklyHours {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj zaposlenika");
		int zaposlenici = input.nextInt();
		int[][] satiUSedmici = new int[zaposlenici][7];
		
		//Ispisivanje "Imena" zaposlenika i korisnikov unos koliko je sati uradio zaposlenik
		for(int i = 0; i < satiUSedmici.length; i++){
			System.out.println("Zaposlenik " + (i + 1));
			for(int j = 0; j < satiUSedmici[i].length; j++){
				satiUSedmici[i][j] = input.nextInt();
			}
		}
		//Ispisivanje koliko je sati dnevno krosinik odradio
		System.out.println("Sati zaposlenika dnevno: ");
		System.out.println("              P |U |S |È |P |S |N");
		for(int i = 0; i < satiUSedmici.length; i++){
			System.out.print("Zaposlenik " + (i + 1) + "| ");
			for(int j = 0; j < satiUSedmici[i].length; j++){
			System.out.print(satiUSedmici[i][j] + "  ");
			}
			System.out.println();
		}
		//Ispisivanje koliko je sati ukupno zaposlenik odradio u sedmici
		System.out.println("\n");
		for(int i = 0; i <satiUSedmici.length; i++){
			int brojac = 0;
			for(int j = 0; j < satiUSedmici[i].length; j++){
				brojac+= satiUSedmici[i][j];
			}
			System.out.println("Zaposlenik " + ( i + 1) +  " je ukupno  radio " + brojac + " sati u sedmici \n");
		}

	}

}
