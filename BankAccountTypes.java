class BankAccount
{
	private int accountNumber;
	private int balance;
	
	public BankAccount(int accountNumber,int balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void displayAccountType()
	{
		System.out.println("account type:not defined");
	}
	
	public void displayInfo()
	{
		System.out.println("accountNumber:"+accountNumber);
		System.out.println("balance:"+balance);
	}
	
}

class SavingsAccount extends BankAccount
{
	private int interestRate;
	
	public SavingsAccount(int accountNumber,int balance,int interestRate)
	{
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	
	@Override
	public void displayAccountType()
	{
		System.out.println("account type:Savings");
	}
	
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("interestRate:"+interestRate);
	}
	
}

class CheckingAccount extends BankAccount
{
	private int withdrawalLimit;
	
	public CheckingAccount(int accountNumber,int balance,int withdrawalLimit)
	{
		super(accountNumber,balance);
		this.withdrawalLimit=withdrawalLimit;
	}
	
	@Override
	public void displayAccountType()
	{
		System.out.println("account type:checking");
	}
	
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("withdrawalLimit:"+withdrawalLimit);
	}
}

class FixedDepositAccount extends BankAccount
{
	private int duration;
	
	public FixedDepositAccount(int accountNumber,int balance,int duration)
	{
		super(accountNumber,balance);
		this.duration=duration;
	}
	
	@Override
	public void displayAccountType()
	{
		System.out.println("account type:fixedDeposit");
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("duration:"+duration);
	}
}

public class  BankAccountTypes
{
	public static void main(String[] args)
	{
		SavingsAccount s=new SavingsAccount(12,1200003,4);
		CheckingAccount c=new CheckingAccount(13,12300,5);
		FixedDepositAccount f=new FixedDepositAccount(14,100000,2);
		s.displayAccountType();
		s.displayInfo();
		c.displayAccountType();
		c.displayInfo();
		f.displayAccountType();
		f.displayInfo();
	}
} 