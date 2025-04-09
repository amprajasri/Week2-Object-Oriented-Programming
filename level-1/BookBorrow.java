import java.util.Scanner;
public class BookBorrow
{
	private String title;
	private String author;
	private float price; 
	private boolean availability=true;
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String booktitle=input.nextLine();
		String bookAuthor=input.nextLine();
		float bookPrice=input.nextInt();
		BookBorrow b1=new BookBorrow(booktitle,bookAuthor,bookPrice);
		BookBorrow b2=new BookBorrow(booktitle,bookAuthor,bookPrice);
		b1.borrow();
		b1.display();
		b2.display();
	}
	
	public BookBorrow(String title,String author,float price )
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void borrow()
	{
		availability=false;
	}
	public void display()
	{
		System.out.println("book name:"+title);
		System.out.println("author name:"+author);
		System.out.println("book price:"+price);
		if(availability) System.out.println("book is available");
		else System.out.println("book is not available");
	}
}