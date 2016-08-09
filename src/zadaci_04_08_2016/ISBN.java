package zadaci_04_08_2016;

import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite 9 vrijednosti");
		int[] isbn = new int[9];
		int sum = 0;
		
		for(int i = 0; i < isbn.length; i++){
			isbn[i] = input.nextInt();
		}
		sum  = (isbn[0] * 1 + isbn[1] *2 + isbn[2] * 3 + isbn[3] * 4 + isbn[4] * 5 + isbn[5] * 6 + isbn[6] * 7 
				+ isbn[7] * 8 + isbn[8] * 9) % 11; 
		
		for(int i = 0; i < isbn.length; i++){
			System.out.print(isbn[i] + " ");
		}
		
		if(sum == 10){
			System.out.println("x");
		}else{
			System.out.print(sum);
		}
//013031997 
	}

}
