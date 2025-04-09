import java.util.Scanner;
public class Person
{
	private String name;
	private int age;
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String personName=input.nextLine();
		int personAge=input.nextInt();
		Person p1=new Person(personName,personAge);
		Person p2=new Person(p1);
		p1.display();
		p2.display();
		
	}
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public Person(Person x)
	{
		this.name=x.name;
		this.age=x.age;
	}
	
	public void display()
	{
			System.out.println("person name:"+name);
			System.out.println("person age:"+age);
			
	}
}