import java.util.ArrayList;



class Library
{
	private String name;
	private ArrayList<Book> books;
	
	public Library(String name)
	{
		this.name=name;
		books= new ArrayList <>();
	}
	
	public void addBook(Book b)
	{
		books.add(b);
	}
	
	public void display()
	{
		System.out.println("library name:"+name);
		for(Book b:books)
		{
			b.display();
		}
	}
	
}

class Book
{
	private String title;
	private String author;
	
	public Book(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
	
	public void display()
	{
		System.out.println("title:"+title);
		System.out.println("author:"+author);
	}
	
	
}

public class LibraryAndBooks
{
	public static void main(String[] args)
	{
		Library books=new Library("central");
		Book b1=new Book("me is me","mukunda");
		Book b2=new Book("mini me","priya");
		books.addBook(b1);
		books.addBook(b2);
		books.display();
	
	}
}
