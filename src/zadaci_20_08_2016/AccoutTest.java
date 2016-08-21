package zadaci_20_08_2016;

import java.util.Scanner;

public class AccoutTest {

	public static void main(String[] args) {
		// Kreiranje scanner-a tako da korisnik moze da unese  svoje vrijednsoti
		Scanner input = new Scanner(System.in);
		//Pozivanje nase account class
		Accout racun = new Accout();
		double krosinikSprema;
		double korisnikPodize ;
		//Ispisivanje poruka i pozivanje slj: metoda.
		System.out.println("Racun je kreiran: \n " + racun.getDateCreated());
		System.out.println("Stanje na racunu je: " + racun.getBalance());
		System.out.println("Godisnja kamatna stopa na racunu je: ");
		racun.setAnnualInterestRate(5);
		System.out.println("Korsinik je odluco da spremi novac na racun unesite svoju cifu");
		System.out.println("Korisnik je na racun sprenio:  "+ racun.deposit(krosinikSprema = input.nextDouble()));
		System.out.println();	
		System.out.println("Stanje na racunu je sada: " + racun.getBalance());
		
		System.out.println("Mjesecna kamatna stopa na racunu je: ");
		System.out.println(racun.getMonthyInterest() + " % ");
		System.out.println();
		
		System.out.println("Korisnik je sad odluci da podigne novac : Unesite cifru koliko novca zelite podici \n");
		korisnikPodize = input.nextDouble();
		System.out.println("Korisnik je podigao: " + korisnikPodize + " \n");
		racun.withdraw(korisnikPodize);
		System.out.println("Korisnik sada na racunu ima " + racun.getBalance());
		input.close();
	}

}
