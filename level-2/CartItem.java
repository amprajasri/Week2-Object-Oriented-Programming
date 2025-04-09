import java.util.Scanner;
public class CartItem
{
	private String itemName;
	private int  price;
	private int quantity;
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		CartItem items[]=new CartItem[100];
		int index=0, itemNo;
		String status;
		while(true)
		{
			System.out.println("enter add,remove,display or end");
			status=input.nextLine();
			if(status.equalsIgnoreCase("add"))
			{
				CartItem item=new CartItem();
				item.add(input);
				items[index]=item;
				index++;
			}
			else if(status.equalsIgnoreCase("remove"))
			{
				System.out.println("enter item number that should be deleted");
				itemNo=input.nextInt();
				input.nextLine();
				for(int i=itemNo-1;i<index-1;i++)
					items[i]=items[i+1];
				index--;
				
			}
			else if(status.equalsIgnoreCase("display"))
			{
				display(items,index);
			}
			else
			{
				break;
			}
			
		}
		
	}
	public void add(Scanner input)
	{
		System.out.println("enter item name,price and quantity:");
		itemName=input.nextLine();
		price=input.nextInt();
		quantity=input.nextInt();
		input.nextLine();
	}
	
	public static void display(CartItem items[],int count)
	{
		int total=0;
		for(int i=0;i<count;i++)
		{
		System.out.println("item Name:"+items[i].itemName);
		System.out.println("item price:"+items[i].price);
		System.out.println("item quantity:"+items[i].quantity);
		total+=items[i].price*items[i].quantity;
		}
		
		System.out.println("total price:"+total);
	}
	
	
}