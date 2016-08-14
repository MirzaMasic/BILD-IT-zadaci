package zadaci_13_08_2016;

import java.util.Scanner;

public class Reverse {
	public static void reverse(int number){
		int reverse = 0;
		//Petlja za obrnuto ispisivanje broja
		for(; number != 0; ){
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		//Ispisivanje broja
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj koji zelite da se ispise u obrnutom redoslijedu");
		int broj = input.nextInt();
		
		//Pozianje metode
		reverse(broj);
	}
}
