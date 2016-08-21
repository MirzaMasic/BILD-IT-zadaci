package zadaci_20_08_2016;

public class Stopwatch {
	// Kriranje data fields
	private long startTime;
	public long endTime;

	// Kriranje no args kontruktora
	public Stopwatch() {
		startTime = System.currentTimeMillis();
	}

	// Kreiranje gettera i settera na nase 2 data fielda
	public long getStartTime() {
		return startTime = System.currentTimeMillis();
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime = System.currentTimeMillis();
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	// Ovom metodom zapocinjemo rad nase stoperice
	public void start(long startTime) {
		setStartTime(System.currentTimeMillis());
	}

	// Sada zaustavljamo nasu stopericu
	public void stop(long endTime) {
		setEndTime(System.currentTimeMillis());
	}

	// Sada ovdje oduzimamo vrijeme kada je stoperica prestala s radom sa
	// vremenom kada je nasa stoperica krenula s radom , tako cemo dobiti
	// vrijeme koliko je vremena programu trebalo da uradi ono sto smo mu zadali
	// da uradi
	public long getElapsedTime() {
		long elapsedTime = endTime - startTime;
		return elapsedTime;
	}

}
