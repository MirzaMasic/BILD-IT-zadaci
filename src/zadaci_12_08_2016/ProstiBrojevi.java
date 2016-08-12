package zadaci_12_08_2016;

import java.util.ArrayList;

public class ProstiBrojevi {
	public static int isPrime(int n){
		//Dodavanje pocetnih vrijednosti na slj. varijable:
		int broj =0;
		int brojac = 0;
		//Racunanje koji je broj prost a koji ne
		for(int i = n; i >= 1; i--){
			if(n % i == 0){
				brojac++;
			}
		}
		if(brojac == 2){
			broj = n;
		}
		return broj;
	}

	public static void main(String[] args) {
		//Kreiranje liste tako da mozemo u nju spremati brojeve
		ArrayList<Integer> list = new ArrayList<>();
		
		//Petlja koja ide od 0 do 100000 i sprema brojeve koji su veci od nule u listu
		for(int i = 0; i < 100000; i++){
			if(isPrime(i) > 0){
				list.add(isPrime(i));
			}
		}
		//ispisivanje prostih brojeva
		int brojac = 0;
		for(int i = 0; i < list.size(); i++){
			
			System.out.print(list.get(i).intValue() + " ");
			brojac++;
			
			if(brojac == 10 ){
				System.out.println();
				brojac = 0;
			}
		}
		
	

	}

}
