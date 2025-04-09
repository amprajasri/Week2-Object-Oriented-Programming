import java.util.Scanner;
public class BankAccount
{
	private String accountHolder;
	private int accountNumber;
	private double balance;
	public static void main(String[] args)
	{
		BankAccount account=new BankAccount();
		Scanner input=new Scanner(System.in);
		account.getDetails(input);
		account.depost(input);
		account.display();
		account.withDrawing(input);
		account.display();
	}
	public void getDetails(Scanner input)
	{
		accountHolder=input.nextLine();
		accountNumber=input.nextInt();
		balance=input.nextDouble();
	}
	
	public void depost(Scanner input)
	{
		System.out.print("enter amount:");
		double amt=input.nextInt();
		balance=amt+balance;
		
	}
	
	public void withDrawing(Scanner input)
	{
		System.out.print("enter amount:");
		double amt=input.nextInt();
		if(balance>=amt) 
		balance=balance-amt;
		else 
		System.out.print("insuffecient balance");
	}
	
	public void display()
	{
		System.out.println("name:"+accountHolder);
		System.out.println("account Number:"+accountNumber);
		System.out.println("balance:"+balance);
	}
}