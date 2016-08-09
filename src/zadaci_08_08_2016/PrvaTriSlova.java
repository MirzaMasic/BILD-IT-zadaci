package zadaci_08_08_2016;

import java.util.Scanner;

public class PrvaTriSlova {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Molim unesite prva tri slova mjeseca. Prvo slovo mora obavezno da bude veliko");
		String month = input.nextLine();
		System.out.println("Molim vas unesite godinu koju zelite");
		int year = input.nextInt();

		switch (month) {
		case "Jan":
			System.out.println("Januar godine " + year + " ima 31 dan");
			break;
			
		case "Feb":
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("Februrar godine " + year +  " ima 29 dana");
			} else {
				System.out.println("Februrar godine " + year +  " ima 28 dana");
			}	
			break;
		case "Mar":
			System.out.println("Mart godine " + year +  " ima 31 dana");
			break;
		case "Apr":	
			System.out.println("April godine" + year + " ima 30 dana");
			break;
		case "May":
			System.out.println("Maj godine " + year + " ima 31 dana");
			break;
		case "Jun":
			System.out.println("Juni godine " + year + " ima 30 dana");
			break;
		case "Jul":
			System.out.println("Juli godine " + year + " ima 31 dan");
			break;
		case "Aug":
			System.out.println("August godine " + year + " ima 31 dan");
			break;
		case "Sep":
			System.out.println("Septembar godine " + year + " ima 30 dana");
			break;
		case "Oct":
			System.out.println("Oktobar godine " + year + " ima 31 dan");
			break;
		case "Nov":
			System.out.println("Novembar godine " + year + " ima 30 dana");
			break;
		case "Dec":
			System.out.println("Decembar godine " + year + " ima 31 dan");
			break;	
	}

	}

}
