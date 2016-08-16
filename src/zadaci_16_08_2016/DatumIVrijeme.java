package zadaci_16_08_2016;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatumIVrijeme {

	public static void main(String[] args) throws ParseException {
		//Metoda za ispisivanje trenutnog datuma i vremena Koja ispisuje sljedecim redoslijedom
		//16-08-2016  12:16:19
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss");
		Date date = new Date();
		System.out.println("Trenutni datum i vrijeme su: "  + dateFormat.format(date));
	}

}
