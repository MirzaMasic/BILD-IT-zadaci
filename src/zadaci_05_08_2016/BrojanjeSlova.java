package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.corba.se.impl.orbutil.RepositoryIdUtility;

public class BrojanjeSlova {
	public static int countLetters(String s){
		//Dodavanje pocetne vrijednosti na brojac slova
		int brojacSlova = 0;
		//Petlja za racunanje koliko slova ima u stringu
		for(int i = 0; i < s.length(); i++){
			if(Character.isLetter(s.charAt(i))){//Izdvajanje slova od ostalih karaktera u stringu
				brojacSlova++;//Brojanje slova
			}
		}
		//Ispisivanje koliko slova  ima u stringu
		System.out.println("Broj slova je: " + brojacSlova);
		return brojacSlova;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try{
		System.out.println("Unesite svoj string");
		String str = input.nextLine();
		
		countLetters(str);
		}catch(InputMismatchException ex){
			System.out.println("Pogresan unos");
		}
		
	}

}
