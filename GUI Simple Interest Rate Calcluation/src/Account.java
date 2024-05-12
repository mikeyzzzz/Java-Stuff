import java.util.*;

import javax.swing.JOptionPane;

public class Account 
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	//constructors
	public Account()
	{
		id=0;
		balance=0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	public Account(int idNumber,double startBalance)
	{
		id = idNumber;
		balance = startBalance;
		annualInterestRate = .045; //"assume all accounts have same interest rate"
		dateCreated = new Date();
	}
	
	//accessor methods
	public int getID()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public Date getDateCreated()
	{
		return dateCreated;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	//secondary attribute methods
	public double getMonthlyInterestRate()
	{
		return this.getAnnualInterestRate()/12;
	}
	
	//other methods
	public void withdraw(double amount)
	{
		this.balance -= amount;
	}
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	public String toString()
	{
		
		return "Account #" + this.getID() + "\n"
		+ "Date Created: " + this.getDateCreated() + "\n"
		+ "----------------" + "\n"
		+ "Annual Interest Rate: " + this.getAnnualInterestRate()*100 + "%" + "\n"
		+ "Monthly Interest: " + String.format("%.2f",this.getMonthlyInterestRate()*100) + "%" + "\n"
		+ "----------------" + "\n"
		+ "Balance = $" + this.getBalance() + "\n";
		
	}
}
