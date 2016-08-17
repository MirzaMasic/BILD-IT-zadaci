package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Unesite svoj broj od 0 - 127");
			int broj = input.nextInt();
			// Uzimamo korisnikov unos i ispisuhemo odgovarajuci ASCII kod
			switch (broj) {
			case 0:
				System.out.println("NULL (null value) ");
				break;
			case 1:
				System.out.println("SOH (start of heading) ");
				break;
			case 2:
				System.out.println("STX (start of text) ");
				break;
			case 3:
				System.out.println("ETX (end of text) ");
				break;
			case 4:
				System.out.println("EOT (end of transmission)");
				break;
			case 5:
				System.out.println("ENQ (enquiry)");
				break;
			case 6:
				System.out.println("ACK (aknowlege)");
				break;
			case 7:
				System.out.println("BEL (bell)");
				break;
			case 8:
				System.out.println("BS (backspace)");
				break;
			case 9:
				System.out.println("TAB (horizontal tab)");
				break;
			case 10:
				System.out.println("LF (NL line feed , new line)");
				break;
			case 11:
				System.out.println("VT (vertical tab)");
				break;
			case 12:
				System.out.println("FF (NP from feed, new page)");
				break;
			case 13:
				System.out.println("CR (carriage return)");
				break;
			case 14:
				System.out.println("SO (shift out)");
				break;
			case 15:
				System.out.println("SI (shift in)");
				break;
			case 16:
				System.out.println("DLE ( data link escape)");
				break;
			case 17:
				System.out.println("DC1 ( device control 1)");
				break;
			case 18:
				System.out.println("DC2 ( device control 2)");
				break;
			case 19:
				System.out.println("DC3 ( device control 3)");
				break;
			case 20:
				System.out.println("DC4 ( device control 4)");
				break;
			case 21:
				System.out.println("NAK (negative aknowlage)");
				break;
			case 22:
				System.out.println("SYN ( synchronous idle");
				break;
			case 23:
				System.out.println("ETB (end of transmition block)");
				break;
			case 24:
				System.out.println("CAN (cancel)");
				break;
			case 25:
				System.out.println("EM (end of medium)");
				break;
			case 26:
				System.out.println("SUB (subtitle)");
				break;
			case 27:
				System.out.println("ESC (escape)");
				break;
			case 28:
				System.out.println("FS (file separator");
				break;
			case 29:
				System.out.println("GS (group separator)");
				break;
			case 30:
				System.out.println("RS (record separator)");
				break;
			case 31:
				System.out.println("US (unit separator)");
				break;
			case 32:
				System.out.println("SPACE (space)");
				break;
			case 127:
				System.out.println("DEL");
				break;
			// Ispisivanje sve ostale odgovarajuce karaktere
			default:
				System.out.println((char) broj);
			}
		} catch (InputMismatchException error) {
		}
	}
}
