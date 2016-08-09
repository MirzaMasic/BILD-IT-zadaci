package zadaci_05_08_2016;

public class Karte {

	public static void main(String[] args) {
		try{
		//U prvi nize spremamo karte
		String[] karte  = {"K",  "Q",  "J" , "10", "9", "8", "7" , "6" , "5", "4" , "3" , "2" ,"A"};
		//u drug niz znakove
		String[] znakovi = {"Mak" , "Srce" , "List" , "Kocka "};
		
		
		int brojkarte = (int)(Math.random() * 14);
		
		int znakKarte = (int)(Math.random() * 5);
		
		System.out.println("Vasa karta je "  + karte[brojkarte] + " " + znakovi[znakKarte]);
		}catch(IndexOutOfBoundsException ex){
			System.out.println("Greska");
		}
		
	}

}
