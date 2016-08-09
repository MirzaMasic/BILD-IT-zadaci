package zadaci_05_08_2016;

import java.util.Scanner;

public class ZajednickiPrefix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Molimo unesite prvi string");
		String s1 = input.nextLine();
		System.out.println("Molimo unesite sada drugi string");
		String s2 = input.nextLine();
		
		int temp = s1.length();
		if(temp > s2.length()){
			temp = s2.length();
		}
		//Provjeravanje prvog stringa i poredjenje istog sa drugin stringom kroz petlju
		for(int i = 0; i < s1.length(); i++){
			if(s1.charAt(i) == s2.charAt(i)){//Poredjenje karaktera u stringu da vidimo koji su im zajednicki
				System.out.print(s1.charAt(i)); // Ispisivanje zajednocking stringa
			}
		}
	}

}
