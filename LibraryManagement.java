class Book
{
	private String title;
	private int publicationYear;
	
	public Book(String title,int publicationYear)
	{
		this.title=title;
		this.publicationYear=publicationYear;
	}
	
	public void displayInfo()
	{
		System.out.println("Book name:"+title);
		System.out.println("published Year:"+publicationYear);
	}
}

class Author extends Book
{
	private String name;
	private String bio;
	
	public Author(String title,int publicationYear,String name,String bio)
	{
		super(title,publicationYear);
		this.name=name;
		this.bio=bio;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("name:"+name);
		System.out.println("author bio:"+bio);
	}
}

public class LibraryManagement
{
	public static void main(String[] args)
	{
		Author a=new Author("C++",2016,"reema","professor");
		a.displayInfo();
	}
}