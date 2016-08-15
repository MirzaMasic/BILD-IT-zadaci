package zadaci_15_08_2016;

public class SabiranjeSerijeBrojeva {

	public static void main(String[] args) {
		double sum = 0;
		//sabiranje razlomaka 1/3,3/5,5/7... 97/99
		for(double i =1 ; i <= 99; i+=2){
			sum += i/(i+2);
		}
		//Ispisivanje sume
		System.out.printf("Rezultat je: %.2f  " , sum);
	}

}
