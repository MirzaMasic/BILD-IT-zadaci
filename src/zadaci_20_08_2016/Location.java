package zadaci_20_08_2016;

public class Location {
	// Kreiranje sljedeci data field-ova:
	private int row;
	private int column;
	private static double maxValue;
	
	
	//Postavljanje gettera za slj. data fields row,column i maxvalue
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public static double getMaxValue() {
		return maxValue;
	}

	// Kriranje novog konstruktora kojemu smo proslijedili slj. argumente:
	// int row, int column , int maxvalue.
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	

	// Kreiranje metode koja prolazi kroz 2D niz i nalazi lokaciju najvecih
	// vrojednosti u istom
	public static Location locateLargest(double[][] a) {
		int row = 0;
		int column = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}

		}
		return new Location(row, column, maxValue);
	}
	//Generisanje svega sto smo unijeli u string
	@Override
	public String toString() {
		return "Location [row=" + row + ", column=" + column + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
