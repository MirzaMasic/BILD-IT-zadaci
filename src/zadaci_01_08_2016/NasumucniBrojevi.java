package zadaci_01_08_2016;

public class NasumucniBrojevi {

	public static void main(String[] args) {
				//Kreiranje novog niza duzine 100
				int[] niz = new int[100];
				//Dodavanje vrijednosti nizu
				for(int i = 0; i < niz.length; i++){
					niz[i] = (int)(Math.random() * 10);
				}
				//Kreiranje novog niza za brojanje povaljanja brojeva
				int[] brojac = new int[10];
				for (int i : niz) {
					brojac[i]++;
				}
				//Ispisavanje broja ponavljanja svakog broja
				for(int z = 0; z < brojac.length; z++){
					if(brojac[z] != 0){
					System.out.println("Broj " + z + " ponovio se " + brojac[z] + " puta ");
					}
				}

	}

}
