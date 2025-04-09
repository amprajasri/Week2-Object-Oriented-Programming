public class Book
{
	private static String libraryName="Central Library";
	private final int ISBN;
	private String title;
	private String author;
	
	public Book(int ISBN,String title, String author )
	{
		
		this.ISBN=ISBN;
		this.title=title;
		this.author=author;
	}
	
	public void display()
	{
		if (this instanceof Book)
		{
			System.out.println("ISBN:"+ISBN);	
			System.out.println("Title:"+title);	
			System.out.println("Author:"+author);
		}
		else
			System.out.println("object is not the instance of class");
			
	}
	
	public static void displayLibraryName()
	{
		System.out.println("library Name:"+libraryName);
	}
	
	public static void main(String[] args)
	{
		Book b1=new Book(1,"good things","rama");
		Book b2=new Book(2,"bad things","ram");
		b1.display();
		b2.display();
		displayLibraryName();
	}
}
