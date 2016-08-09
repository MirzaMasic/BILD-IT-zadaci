package zadaci_05_08_2016;

import java.util.Scanner;

public class Ustedjevina {

	public static void main(String[] args) {
		// Prvo korsnik treba da unese broj mjeseci
		double racun =  0 ;
		Scanner input = new Scanner(System.in);

		System.out.println("Molimo vas unesite  iznos vase mjesecne stednje");
		int stednja = input.nextInt();

		// Sada korisnik treba da unese broj mjeseci nakon koliko zeli da vidi
		// koliko je ustedio
		System.out.println("Unesite broj mjeseci");
		int mjeseci = input.nextInt();
		
		//Petljom prolazimo  od prvog mjeseca do onog mjeseca koji korisnik unese
		for(int i = 0;  i < mjeseci; i++){
			racun = (mjeseci * stednja * (1 + 0.00417 ));
		}
		System.out.println("Stanje racuna  nakon  " +  mjeseci + " mjeseci "  + " iznosi " + racun);

	}

}
