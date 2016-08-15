package zadaci_15_08_2016;

import java.util.Scanner;

public class KamenPapirMakaze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int racunar = (int) (Math.random() * 3);

		System.out
				.println("Unesite vas izbor u igri(0 - Predstavlja kamen / 1 - Predstavlja papir / 2 - Predstavlja makaze)");
		int korisnikovUnos = input.nextInt();
		
		//Uslovi igre 
		if(korisnikovUnos == racunar){
			System.out.println("Zavrsilo je nerjeseno: Vi ste izabrali"
					+ korisnikovUnos + " a racunar: " + racunar);
		}else if ((korisnikovUnos == 0 && racunar == 1)) {
			System.out.println("Racunar je pobijedio: Vi ste izabrali"
					+ korisnikovUnos + " a racunar: " + racunar);
		}else if(korisnikovUnos == 1 && racunar == 2){
			System.out.println("Racunar je pobijedio: Vi ste izabrali"
					+ korisnikovUnos + " a racunar: " + racunar);
		}else if(korisnikovUnos == 2 && racunar == 0){
			System.out.println("Racunar je pobijedio: Vi ste izabrali"
					+ korisnikovUnos + " a racunar: " + racunar);
		}else if ((korisnikovUnos == 0 && racunar == 2)) {
			System.out.println("Korisnik je pobijedio: Vi ste izabrali"
					+ korisnikovUnos + " a racunar: " + racunar);
		}else if(korisnikovUnos == 2 && racunar == 1){
			System.out.println("Korisnik je pobijedio: Vi ste izabrali"
					+ korisnikovUnos + " a racunar: " + racunar);
		}else if(korisnikovUnos == 1 && racunar == 0){
			System.out.println("Korisnik je pobijedio: Vi ste izabrali"
					+ korisnikovUnos + " a racunar: " + racunar);
		}
		
	}

}
