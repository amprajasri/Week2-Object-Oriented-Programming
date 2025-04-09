import java.util.Scanner;
public class Book
{
	private String title;
	private String author;
	private float price; 
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String bookName=input.nextLine();
		String authorName=input.nextLine();
		float bookPrice=input.nextInt();
		Book b1=new Book();
		Book b2=new Book(bookName,authorName,bookPrice);
		b1.display();
		b2.display();
	}
	
	public Book()
	{
		this.title="";
		this.author="";
		this.price=0.0f;
	}
	
	public Book(String title,String author,float price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void display()
	{
		System.out.println("book name:"+title);
		System.out.println("author name:"+author);
		System.out.println("book price:"+price);
	}
}