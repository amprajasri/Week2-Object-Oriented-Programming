import java.util.ArrayList;
abstract class BankAccount implements Loanable
{
	protected int accountNumber;
	protected String holderName;
	protected double balance;
	
	public BankAccount(int accountNumber,String holderName,double balance)
    {
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	
	public void withdraw(double amount)
	{
		balance=balance-amount;
	}
	
	abstract void calculateInterest();
	
	public void display()
	{
		
		System.out.println();
		System.out.println("account holder Name:"+holderName);
		System.out.println("account Number:"+accountNumber);
		System.out.println("balance:"+balance);
		System.out.println();
	}
	
}

class SavingsAccount extends BankAccount
{
	private double interestRate=0.02;
	
	
	public SavingsAccount(int accountNumber,String holderName,double balance)
	{
		super(accountNumber,holderName,balance);
	}
	
	public boolean calculateLoanEligibility()
	{
		if(balance>300000) return true;
		else return false;
	}
	
	public void applyForLoan(double amount)
	{
	
		System.out.println("loan intrest amount for Savings Account:"+interestRate*amount);
	}
	
	public void calculateInterest()
	{
		System.out.println("intrest earned on amount for Savings Account:"+balance*interestRate);
	}
	
	
	
}

class CurrentAccount extends BankAccount
{
	private double interestRate=0.05;
	
	public CurrentAccount(int accountNumber,String holderName,double balance)
	{
		super(accountNumber,holderName,balance);
	}
	
	public boolean calculateLoanEligibility()
	{
		if(balance>400000) return true;
		else return false;
	}
	
		public void applyForLoan(double amount)
	{
	
		System.out.println("loan intrest amount for current Account:"+interestRate*amount);
	}
	
	public void calculateInterest()
	{
		System.out.println("intrest earned on amount for current Account:"+balance*interestRate);
	}
	
}



interface Loanable
{
	void applyForLoan(double amount);
	boolean calculateLoanEligibility();
}

public class BankingSystem
{
	public static void main(String[] args)
	{
		ArrayList<BankAccount> accounts=new ArrayList<>();
		accounts.add(new SavingsAccount(12,"mukunda",1205674.45));
		accounts.add(new CurrentAccount(12,"mukunda",7452674.45));
		accounts.add(new SavingsAccount(12,"priya",420674.57));
		accounts.add(new SavingsAccount(12,"rajesh",789274.5));
		for(BankAccount a:accounts)
		{
			a.withdraw(1234.5);
			a.deposit(2456.6);
			if(a.calculateLoanEligibility()) 
			a.applyForLoan(50000);
			else
			System.out.println("not eligible to apply");
		    a.display();
		}
	}
}