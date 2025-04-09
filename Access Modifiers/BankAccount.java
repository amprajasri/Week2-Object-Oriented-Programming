class BankAccount
{
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	public BankAccount(int accountNumber,String accountHolder,double balance)
	{
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
		
	}
	
	public void display()
	{
		System.out.println("account Number:"+accountNumber);
		System.out.println("account Holder:"+accountHolder);
		System.out.println("balance:"+balance);
		
	}
	
	public static void main(String[] args)
	{
		SavingsAccount s=new SavingsAccount(123,"mukunda",12000000,"fixed");
		s.displaySavingDetails();
	}
}

class  SavingsAccount extends BankAccount
{
	private String savingAccountType;
	
	public SavingsAccount(int accountNumber,String accountHolder,double balance, String savingAccountType)
	{
		super(accountNumber,accountHolder,balance);
		this.savingAccountType=savingAccountType;
	}
	
	public void displaySavingDetails()
	{
		System.out.println("account Number:"+accountNumber);
		super.display();
	}
}