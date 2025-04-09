import java.util.Scanner;
import java.lang.Math;
public class Book
{
	private String title;
	private String author;
	private float price; 
	
	public static void main(String[] args)
	{
		Book b=new Book();
		b.getDetails();
		b.display();
	}
	
	public void getDetails()
	{
		Scanner input=new Scanner(System.in);
		title=input.nextLine();
		author=input.nextLine();
		price=input.nextInt();
	}
	
	public void display()
	{
		System.out.println("book name:"+title);
		System.out.println("author name:"+author);
		System.out.println("book price:"+price);
	}
}