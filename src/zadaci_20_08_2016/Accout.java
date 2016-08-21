package zadaci_20_08_2016;

import java.util.Date;

public class Accout {
	//Postavljanje sljdecih data fields : 
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//Kreiranje konstukotora koji ne prima nikave argumente
	public Accout() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	//Konstuktor koji za argumente prima broj racuna i  balans racuna(Koliko ima/nema novca na racunu)
	public Accout(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	//Postavljanje gettera i settera
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	//Dobivanje godisnje kamatne stope u procentima
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}
	//Dobivanje datuma kada je racun kreiran
	public Date getDateCreated() {
		return dateCreated = new Date();
	}
	//Postavljanje datuma kreiranja racuna
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	//Dobivnaje mjesecne kamatne stope
	public double getMonthlyInterestRate() {
		return getAnnualInterestRate() / 12;
	}
	//Dobivanje kamatne stope u procentima
	public double getMonthyInterest() {
		return getBalance() * getMonthlyInterestRate();
	}
	
	//Metoda kojom korisnik sprema odredjenu sumu na racun
	public double deposit(double number) {
		balance += number;
		return balance;
	}
	
	//Metoda kojom krosinik podize odredjenu sumu s racuna
	public double withdraw(double number) {
		balance -= number;
		return balance;

	}

	@Override
	public String toString() {
		return "Accout [id=" + id + ", balance=" + balance
				+ ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated + ", getId()=" + getId()
				+ ", getBalance()=" + getBalance()
				+ ", getAnnualInterestRate()=" + getAnnualInterestRate()
				+ ", getDateCreated()=" + getDateCreated()
				+ ", getMonthlyInterestRate()=" + getMonthlyInterestRate()
				+ ", getMonthyInterest()=" + getMonthyInterest()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
