import java.util.ArrayList;

class Bank
{
	 String name;
	 ArrayList<Customer> customers;
	
	public Bank(String name)
	{
		this.name=name;
		customers=new ArrayList<>();
	}
	
	public void openAccount(Customer c,int balance)
	{
		Account acc=new Account(balance);
		c.addAccount(acc);
		if(!customers.contains(c)) customers.add(c);
		
		System.out.println("new account is created for "+c.name+" in "+name);
	}
	
	public void displayCustomers()
	{
		System.out.println("Bank name:"+name);
		for(Customer cus:customers)
		{
			
			cus.displayAccounts();
		}
	}
}

class Customer
{
	String name;
	ArrayList<Account> accounts;
	
	public Customer(String name)
	{
		this.name=name;
		accounts=new ArrayList<>();
	}
	
	public void addAccount(Account a)
	{
		accounts.add(a);
	}
	
	public void displayAccounts()
	{
		System.out.println("customer name:"+name);
		System.out.println("accounts of the customer:");
		for(Account a:accounts)
		{
			a.displayBalance();
		}
	}
}

class 	Account
{
	public static int accountNo=0;
	int balance;
	
	public Account(int balance )
	{
		this.balance=balance;
		accountNo++;
	}
	
	public void displayBalance()
	{
		System.out.println("balance:"+balance);
	}
}

public class  BankandAccount
{
	public static void main(String[] args)
	{
		Bank b1= new Bank("canara");
		Bank b2= new Bank("axis");
		Customer mukunda=new Customer("mukunda");
		Customer lalitha=new Customer("lalitha");
		b1.openAccount(mukunda,1200000);
		b2.openAccount(lalitha,19000000);
		b1.openAccount(mukunda,123456);
		b2.openAccount(lalitha,654321);
		b1.displayCustomers();
		b2.displayCustomers();
		
	}
} 