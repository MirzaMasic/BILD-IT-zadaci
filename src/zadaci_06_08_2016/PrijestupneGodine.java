package zadaci_06_08_2016;

import java.util.Scanner;

public class PrijestupneGodine {
	public static void godine(int pocetnaGodina , int zavrsnaGodina){
		int brojac = 0;
		for(int i = pocetnaGodina; i < zavrsnaGodina; i++){
			if((i % 4 ==0) && (i % 100 != 0) || (i % 400 == 0)){
				brojac++;
				System.out.print(i +  " ");
				
				if(brojac % 10 == 0){
					System.out.println();
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Molim unesite pocetnu godinu");
		int pocetnaGodina = input.nextInt();
		System.out.println("Molim sada unesite zavrsnu godinu");
		int zavrsnaGodina = input.nextInt();
		
		//Pozivanje metode
		godine(pocetnaGodina, zavrsnaGodina);

	}

}
