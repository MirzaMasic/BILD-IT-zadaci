package zadaci_11_08_2016;

import java.util.Date;

public class Datum {

	public static void main(String[] args) {
		//Koristimo dvije metode da dodjemo do danasnjeg datum a to su:
		
		long mili = System.currentTimeMillis();
		Date datum= new Date(mili);
		
		System.out.println(datum);
	
	}
}
