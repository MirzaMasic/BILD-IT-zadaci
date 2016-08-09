package zadaci_09_08_2016;

import java.util.Scanner;

public class Udaljenost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = 6371.01;
		// Trazimo od korisnika da unese sljedece vrijednosti
		System.out.println("Unesite sirinu za tacku 1");
		double x1 = Math.toRadians(input.nextDouble());
		System.out.println();
		System.out.println("Unesite duzni za tacku 1");
		double y1 = Math.toRadians(input.nextDouble());
		System.out.println();
		System.out.println("Unesite sirinu za tacku 2 ");
		double x2 = Math.toRadians(input.nextDouble());
		System.out.println();
		System.out.println("Unesite duzinu za tacku 2");
		double y2 = Math.toRadians(input.nextDouble());

		// d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 -y2)) Formula
		double d = radius
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1)
						* Math.cos(x2) * Math.cos(y1 - y2));
		
		//Ispisujemo vrijednost
		System.out.printf("Distanca iznosi :  %7.3f" , d);
	}

}
