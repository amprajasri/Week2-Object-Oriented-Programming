import java.util.ArrayList;
interface Reservable
{
	void reserveItem();
	boolean checkAvailability();
}

abstract class LibraryItem implements Reservable
{
	protected int itemId;
	protected String title;
	protected String author;
	
	public LibraryItem(int itemId,String title,String author)
	{
		this.itemId=itemId;
		this.title=title;
		this.author=author;
	}
	
	abstract void getLoanDuration(int n);
	
	public void getItemDetails()
	{
		System.out.println("itemId:"+itemId);
		System.out.println("title:"+title);
		System.out.println("author:"+author);
	}

}

class Book extends LibraryItem
{
	private boolean isAvailabe=true;
	private String name;
	
	public Book(int itemId,String title,String author,String name)
	{
		super(itemId,title,author);
		this.name=name;
	}
	public void getLoanDuration(int days)
	{
		System.out.println("the number of days Book is taken:"+days);
	}
	
	public void reserveItem()
	{
		isAvailabe=false;
		System.out.println("item is reversed");
	}
	
	public boolean checkAvailability()
	{
		return isAvailabe;
	}
	
}

class Magazine extends LibraryItem
{
	private boolean isAvailabe=true;
	private String name;
	
	public Magazine(int itemId,String title,String author,String name)
	{
		super(itemId,title,author);
		this.name=name;
	}
	
	public void getLoanDuration(int days)
	{
		System.out.println("the number of days magzine is taken:"+days);
	}
	public void reserveItem()
	{
		isAvailabe=false;
		System.out.println("item is reversed by "+"name");
	}
	
	public boolean checkAvailability()
	{
		return isAvailabe;
	}

}

class DVD extends LibraryItem
{

	private boolean isAvailabe=true;
	private String name;
	
	public DVD(int itemId,String title,String author,String name)
	{
		super(itemId,title,author);
		this.name=name;
	}
	
	public void getLoanDuration(int days)
	{
		System.out.println("the number of days DVD is taken:"+days);
	}
	
	public void reserveItem()
	{
		isAvailabe=false;
		System.out.println("item is reversed");
	}
	
	public boolean checkAvailability()
	{
		return isAvailabe;
	}
}

public class LibraryManagementSystem
{
	public static void main(String[] args)
	{
		ArrayList <LibraryItem> items=new ArrayList<>();
		items.add(new Book(12,"beauty and the beast","john","mukunda"));
		items.add(new Magazine(13,"Vouge", "juli","lalitha"));
		items.add(new DVD(14,"worrior","tim","rao"));
		items.add(new Magazine(15,"times","leela","amr"));
		items.add(new DVD(16,"vasu","traveling","priya"));
		
		for(LibraryItem a:items)
		{
			a.getItemDetails();
			if(a.checkAvailability()) 
			{
				a.getLoanDuration(3);
				a.reserveItem();
			}
		}
		
	}
}