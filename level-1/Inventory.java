import java.util.Scanner;
import java.lang.Math;
public class Inventory
{
	private int itemCode;
	private String itemName;
	private float price; 
	
	public static void main(String[] args)
	{
		Inventory item=new Inventory();
		Scanner input=new Scanner(System.in);
		item.getDetails(input);
		item.display(input);
	}
	
	public void getDetails(Scanner input)
	{
		System.out.println("Enter Item Code, Name, and Price:");
		itemCode=input.nextInt();
		input.nextLine();
		itemName=input.nextLine();
		price=input.nextFloat();
	}
	
	public void display(Scanner input)
	{
		
		System.out.println("give quantity for items:");
		int quantity=input.nextInt();
		System.out.println("item name:"+itemName);
		System.out.println("item code:"+itemCode);
		System.out.println("items total  price:"+(price*quantity));
	}
}