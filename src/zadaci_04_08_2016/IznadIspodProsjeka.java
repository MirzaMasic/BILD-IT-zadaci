package zadaci_04_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class IznadIspodProsjeka {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] list = new int[100];
		int brojac = 0;
		int suma = 0;
		int prosjek = 0;
		int brojacIznadProsjeka = 0;
		int brojacIspodProsjeka = 0;
		System.out.println("Molimo unesite vase brojeve , nula prekida unos");
		
		for(int i = 0; i < list.length; i++){
			//Unose se se brojevi sve dok uns nije nula
			list[i] = input.nextInt();
			
			if(list[i] == 0){
				break;
			}
			brojac++;
			
			suma = suma + list[i];
			
			if(brojac == 100){//Ako korisnik unese 100 brojeva program se prekida 
				break;
			}
			
		}
		//Sada racunamo prsojek tako sto podjelimo zbir svih brojeva sa brojacem(koliko smo brojeva unijeli)
		prosjek = suma / brojac;
		
		
		//Sada pisemo petlju kojom cemo izracunati koliko je brojeva bilo iznad a koliko ispod prosjeka
		
		for(int i = 0; i < brojac ; i++){
			if(list[i] > prosjek){//Broji koliko ima brojeva iznad prosjeka
				brojacIznadProsjeka++;
			}else{
				brojacIspodProsjeka++; //Broji koliko ima brojeva ispod prosjeka
			}
		}
		
		System.out.println("Prosjek brojeva je: " + prosjek);
		System.out.println("Brojeva iznbad prosjeka je bilo: " + brojacIznadProsjeka);
		System.out.println("Brojeva ispod prosjeka je bilo: " + brojacIspodProsjeka);
	}

}
