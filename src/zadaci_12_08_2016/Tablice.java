package zadaci_12_08_2016;

public class Tablice {
	public static void main(String[] args) {
		//Kreiranje 2 niza u koja cemo spremati vrijednosti
		char[] slova = new char[3];
		int[] brojevi = new int[4];
		
		//Pronalazenje 3 radnom slova koja ce ciniti prvi dio Registarske tablice
		for(int i =0; i < slova.length;i++){
			slova[i] = (char)((int)'A' + Math.random() * ((int) 'Z' - (int) 'A' + 1));
			System.out.print(slova[i] );
		}
		//Pronalazenje 4 random broja Koji ce biti drugi dio registarske tablice
		System.out.print("-");
		for(int j = 0; j < brojevi.length; j++){
			brojevi[j] = (int)(Math.random() * 10);
			System.out.print( brojevi[j] );
		} 
	}

}
