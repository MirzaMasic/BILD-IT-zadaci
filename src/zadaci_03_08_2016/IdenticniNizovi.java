package zadaci_03_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class IdenticniNizovi {
	public static boolean equals(int[ ] niz1, int[ ] niz2){
		//Kreiranje metode/petlje za provjeru jednakosti nizova
		for(int i = 0; i < niz1.length; i++){
			if(Arrays.equals(niz1, niz2)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		//Kreiranje scanner-a
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite 10 vrijednosti u prvi niz niz");
		int[] niz1 = new int[10];
		for(int i = 0; i < niz1.length; i++){
			niz1[i] = input.nextInt();
		}
		System.out.println("Unesite 10 vrijednosti u drugi niz");
		int[] niz2 = new int[10];
		for(int j = 0; j< niz2.length; j++){
			niz2[j] = input.nextInt();
		}
		System.out.println(equals(niz1, niz2));
	}


}
