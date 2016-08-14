package zadaci_13_08_2016;

import java.util.Scanner;

public class Cijene2Artikla {

	public static void main(String[] args) {
		/*
		 * Korisnik mora unijeti tezinu i cijenu prvog proizvoda pa, poslije to
		 * isto mora uraditi i za drugi proizvod Kada to uradi cijena i tezina
		 * oba proizvoda se podijele i na karju uporede da se vidi koji proizvod
		 * ima bolju cijenu
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Molim unesite cijenu prvog proizvoda");
		double cijenaPrvogProizvoda = input.nextDouble();
		System.out.println("Molim unesite tezinu prvog proizvoda");
		double tezinaPrvogPriozvoda = input.nextDouble();
		System.out.println();
		System.out.println("Molim unesite cijenu drugog proizvoda");
		double cijenaDrugogProizvoda = input.nextDouble();
		System.out.println("Molim unesite tezinu drugog proizvoda");
		double tezinaDrugogPriozvoda = input.nextDouble();
		
		double prviPriozvod = cijenaPrvogProizvoda / tezinaPrvogPriozvoda;
		double drugiProizvod = cijenaDrugogProizvoda / tezinaDrugogPriozvoda;
		
		if(prviPriozvod == drugiProizvod){
			System.out.println("Priozvodi imaju istu cijenu");
		}else if(prviPriozvod < drugiProizvod){
			System.out.println("Prvi proizvod ima bolju cijenu");
		}else{
			System.out.println("Drugi proizvod ima bolju cijenu");
		}
	}

}
