package zadaci_10_08_2016;

import java.util.Scanner;

public class BrojDanaUGodini {
	public static int brojDana(int year){
		int dani = 365;
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
			return dani = 366;
		}else{
			return dani;
		}
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Molim unesite godinu od koje zelite poceti");
		int pocetna = input.nextInt();
		
		System.out.println("Molim Unesite godinu na kojoj zelite zavrsiti");
		int  zavrsna = input.nextInt();
		
		for(int i = pocetna; i <= zavrsna; i++){
			System.out.println("Godina je:  " + i + " broj dana u gonini je:  " + brojDana(i));
		}

	}

}
