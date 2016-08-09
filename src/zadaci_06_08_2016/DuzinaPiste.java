package zadaci_06_08_2016;

import java.util.Scanner;

public class DuzinaPiste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite brzinu pri kojoj uzlijece");
		double v = input.nextDouble();
		
		//Ubrzanje aviona 
		System.out.println("Unesite ubrzanje aviona");
		double ubrzanje = input.nextDouble();
		
		//Formula za racunanje minimalne duzine piste
		double minimalnaDuzina = (v * v) / (2 * ubrzanje);
		
		
		System.out.printf("Minimalna duzina piste je:  %7.3f" , minimalnaDuzina);

	}

}
