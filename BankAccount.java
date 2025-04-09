public class BankAccount
{
	private static String  bankName="canara";
	private static int noOfAccount=0;
	private String accountHolderName;
	private final int accountNumber;
	private double balance;
	
	public BankAccount(String accountHolderName,int accountNumber,double balance)
	{
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		noOfAccount++;
	}
	
	public void display()
	{
		System.out.println("account Number:"+accountNumber);
		System.out.println("account Holder:"+accountHolderName);
		System.out.println("balance:"+balance);
		System.out.println("name:"+bankName);
		
	}
	public static void  getTotalAccounts()
	{
		System.out.println("total accounts created:"+noOfAccount);
	}
	
	public static void main(String[] args)
	{
		BankAccount acc1=new BankAccount("mukunda",123,1200000);
		if(acc1 instanceof BankAccount)
		{
			System.out.println("accout belongs to this bank:"+(acc1 instanceof BankAccount));
			acc1.display();
		}
		else
		{
			System.out.println("accout belongs to this bank:"+(acc1 instanceof BankAccount));
		}
		BankAccount acc2=new BankAccount("mukunda priva",124,1200000);
		if(acc2 instanceof BankAccount)
		{
			System.out.println("accout belongs to this bank:"+(acc2 instanceof BankAccount));
			acc2.display();
		}
		else
		{
			System.out.println("accout belongs to this bank:"+(acc2 instanceof BankAccount));
		}
		getTotalAccounts();
	}
}