public class Book
{
	public int ISBN;
	protected String title;
	private String author;
	
	public Book(int ISBN,String title,String author)
	{
		this.ISBN=ISBN;
		this.title=title;
		this.author=author;
	}
	public void display()
	{
		System.out.println("ISBN:"+ISBN);	
		System.out.println("Title:"+title);	
		System.out.println("Author:"+author);	
	}
	
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String x)
	{
		author=x;
	}
	
	
public static void main(String[] args)
	{
		EBook e=new EBook(123,"sairam","ram",1200);
		e.setAuthor("rama rao");
		e.displayEBookDetails();
		
	}
 
	
}

class EBook extends Book
{
  private int price;
  
  public EBook(int ISBN,String title,String author,int price)
  {
	super(ISBN,title,author);
	this.price=price;
  }
  
  public void displayEBookDetails()
  {
	super.display();
	System.out.println("price:"+price);
  }
 
}

	
