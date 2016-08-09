package zadaci_04_08_2016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NajmanjiFaktori {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  // command-line argument
		System.out.println("Unesite broj");
        long n = input.nextLong();

        System.out.print("Faktori ovog broja su:  " + n + " is: ");

        // fza svaki moguci faktor
        for (long faktor = 2; faktor*faktor <= n; faktor++) {

            // ako je faktor fakor od n(unosa) neprestano onda ih podjeli
            while (n % faktor == 0) {
                System.out.print(faktor + " "); 
                n = n / faktor;
            }
        }

        // if biggest factor occurs only once, n > 1
        if (n > 1) System.out.println(n);
        else       System.out.println();

	}

}
