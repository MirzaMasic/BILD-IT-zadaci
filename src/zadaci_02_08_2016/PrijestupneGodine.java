package zadaci_02_08_2016;

public class PrijestupneGodine {
	public static void main(String[] args) {
		//Krecem sa pravljenjem petlje koja racuna i broji koliko je bilo prijestupnih godina
				int brojacGodina = 0;
				for(int i = 101; i < 2100; i++){
					if((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
						brojacGodina++;
						
						//Sada idem sa ispisivanjem godina 10 u jendom redu
						System.out.print(i + " ");
						if(brojacGodina % 10 == 0){
							System.out.println();
						}
					}
				}
				System.out.println();
				System.out.println( " Prijestupnih godina je ukupno bilo " + brojacGodina);

	}

}
