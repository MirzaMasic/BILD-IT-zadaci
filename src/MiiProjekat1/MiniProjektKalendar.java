package MiiProjekat1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class MiniProjektKalendar {
	/*
	 * The main program asks users for month and years, then it evaluates the
	 * weekday of the first day of that month as well as the number of days in
	 * that month.
	 */
	public static void main(String[] args) throws IOException {
		Calendar cal = new GregorianCalendar();

		// represents the month (1-12)
		int month = 0;

		// represents the year
		int year = 0;
		int choice = 0;

		// ask month and year from user
		Scanner in1 = new Scanner(System.in);
		System.out.print("Enter month and year: ");

		// read them as string
		String monthText = in1.next();
		String yearText = in1.next();

		try {

			// convert month and year to integer.
			// throws NumberFormatException if not convertible.
			// It would be caught below:
			month = Integer.parseInt(monthText);
			year = Integer.parseInt(yearText);

			// check if it is a valid month
			while (month < 1 || month > 12)
				throw new Exception("Invalid index for month: " + month);

			// print the calendar for the given month/year.
			printCalendarMonthYear(month, year);

		} catch (NumberFormatException e) {
			// handles NumberFormatException
			System.err.println("Numberat Error: " + e.getMessage());
		} catch (Exception e) {
			// handles any other Exception
			System.err.println(e.getMessage());
		}

		do {
			// Ponudimo opcije
			System.out.println("Imate sljedece opcije:");
			System.out.println("1: Prikaz mjeseca u kalendaru");
			System.out
					.println("2: Napraviti napomenu za odredeni dan u prikazanom mjesecu");
			System.out.println("3: Pregledati postojece napomene");
			System.out.println("4: Izlaz");
			System.out.println("Unesite broj:");
			choice = in1.nextInt();

		} while (choice < 1 || choice > 4);
		// kreiramo datoteku koja čuva napomene
		java.io.File reminder = new java.io.File("podsjetnik.txt");
		reminder.createNewFile();
		// Formiramo listu stringova koja uzima datume i napomene
		ArrayList<String> lista = new ArrayList<>();
		// Ako datoteka sa napomenama postoji pročitamo je i smjestimo u niz
		if (reminder.exists()) {
			Scanner citanje = new Scanner(reminder);
			while (citanje.hasNextLine()) {
				String n = citanje.nextLine();
				lista.add(n);
			}
			// Stringove koji predstavljaju datume pretvaramo u datum i poredimo
			// sa današnjim danom
			// Zamišljeno je da ide linija datum a druga linija napomena

		}
		// Ako odaberemo opciju 2 unosimo nove napomene i dodajemo ih u niz i
		// datume
		cal.clear();
		cal.set(year, month - 1, 1);
		int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		while (choice == 2) {
			Scanner sc = new Scanner(System.in);
			int dan;
			do {
				System.out.println("Unijeti dan:");
				dan = in1.nextInt();
				// Ako unesemo pogrešan broj za dan u mjesecu program odnosno
				// nepostojeći datum
				if (dan > numberOfMonthDays || (dan < 1))
					System.out.println("Nepostojeci datum!");
			} while (dan > numberOfMonthDays || (dan < 1));
			System.out.println("Napomena:");
			String zapis = sc.nextLine();
			lista.add(dan + "-" + month + "-" + year);
			lista.add(zapis);
			do {
				System.out.println("2: Unosenje jos napomena");
				System.out.println("0: Potvrda svih unosa");
				choice = sc.nextInt();
			} while (choice != 2 && choice != 0);
			if (choice == 0) {
				// Kreiramo stampac za stampanje
				java.io.PrintWriter stampac = new java.io.PrintWriter(
						reminder);
				for (int i = 0; i < lista.size(); i++)
					stampac.println(lista.get(i));
				stampac.close();
			}
		}
		// Ako je opcija 3 procitamo napomene iz niza
		if (choice == 3) {
			// Ako je niz prazan pišemo da nema napomena
			if (lista.size() == 0)
				System.out.println("Nemate napomena!");
			for (int i = 0; i < lista.size(); i++)
				System.out.println(lista.get(i));
		}
		// Ako datoteka postoji stampamo u nju niz
		if (reminder.exists()) {
			// Kreiramo stampac za stampanje
			java.io.PrintWriter stampac = new java.io.PrintWriter(reminder);
			for (int i = 0; i < lista.size(); i++)
				stampac.println(lista.get(i));
			stampac.close();
		}
		// Izlazimo iz programa
		if (choice == 4)
			System.exit(0);
		// Ako je opcija 1 vracamo se da prkažemo kalendar za jos neki mjesec
		while (choice == 1)
			;
	}

	/*
	 * prints a calendar month based on month / year info
	 */
	private static void printCalendarMonthYear(int month, int year) {
		// create a new GregorianCalendar object
		Calendar cal = new GregorianCalendar();

		// set its date to the first day of the month/year given by user
		cal.clear();
		cal.set(year, month - 1, 1);

		// print calendar header
		System.out.println("            "
				+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US)
				+ " " + cal.get(Calendar.YEAR));

		// obtain the number of days in month.
		int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// obtain the weekday of the first day of month.
		int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);

		// print anonymous calendar month based on the weekday of the first
		// day of the month and the number of days in month:
		printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
	}

	/*
	 * prints an anonymous calendar month based on the weekday of the first day
	 * of the month and the number of days in month:
	 */
	private static void printCalendar(int numberOfMonthDays,
			int firstWeekdayOfMonth) {

		// reset index of weekday
		int weekdayIndex = 0;

		// print calendar weekday header
		System.out.println("_____________________________________");
		System.out.println(" Ned  Pon  Uto  Sri  Cet  Pet  Sub ");

		// leave/skip weekdays before the first day of month
		for (int day = 1; day < firstWeekdayOfMonth; day++) {
			System.out.print("     ");
			weekdayIndex++;
		}

		// print the days of month in tabular format.
		for (int day = 1; day <= numberOfMonthDays; day++) {
			// print day
			System.out.printf("%3d", day);

			// next weekday
			weekdayIndex++;
			// if it is the last weekday
			if (weekdayIndex == 7) {
				// reset it
				weekdayIndex = 0;
				// and go to next line
				System.out.println();
			} else { // otherwise
				// print space
				System.out.print("  ");
			}
		}

		// print a final new-line.
		System.out.println();
	}

}