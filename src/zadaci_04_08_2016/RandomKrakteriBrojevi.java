package zadaci_04_08_2016;

public class RandomKrakteriBrojevi {
	public static void random(char[] a , int[] b){
		//Dodavanje pocetnih vrijednosti na sljedece varijable
		int brojacKraktera = 0;
		int brojacBrojeva = 0;
		
		//Kreiranje petlje za ispisivanje karaktera
		for(int i = 0; i < a.length; i++){
			brojacKraktera++;
			System.out.print(a[i] + " ");
			
			if(brojacKraktera % 10 == 0 ){//Ovime sam ogranicio ispisivanje samo 10 karaktera po liniji
				System.out.println();
			}
		}
		//Kreiranje petlje za ispisivanje brojeva  brojeva
		for(int i = 0; i < b.length; i++){
			brojacBrojeva++;
			System.out.print(b[i] + " ");
			
			if(brojacBrojeva % 10 == 0){//Ovom metodom  printam samo 10 brojeav po liniji
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		//Sada dodajem vrijednosti  na gore uradjenje petlje
		int[] numbers = new int[100]; //Niz za spremanje 100 brojeva 
		
		char[] chars = new char[100];//Niz za spremanje 100 karaktera
		
		for(int i = 0; i < chars.length; i++){
			chars[i] = (char) ((int) 'A' + Math.random() * ((int) 'Z' - (int) 'A' + 1));//Spremanje random karaktera u niz
		}
		for(int i = 0 ; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100);
		}
		
		random(chars, numbers);
	}

}
