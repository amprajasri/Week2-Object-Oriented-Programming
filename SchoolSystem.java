class Person
{
	private String name;
	private int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayRole()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}

class Teacher extends Person
{
	private String subject;
	
	public Teacher(String name,int age,String subject)
	{
		super(name,age);
		this.subject=subject;
	}@Override
	public void displayRole()
	{
		super.displayRole();
		System.out.println("role:teacher");
		System.out.println("subject:"+subject);
	}
	
}

class Student extends Person
{
	private String grade;
	
	public Student(String name,int age,String grade)
	{
		super(name,age);
		this.grade=grade;
	}
	@Override
	public void displayRole()
	{
		super.displayRole();
		System.out.println("role:student");
		System.out.println("grade:"+grade);
		
	}
}

class Staff extends Person
{
	private String role;
	public Staff(String name,int age,String role)
	{
		super(name,age);
		this.role=role;
	}
	
	@Override
	public void displayRole()
	{
		super.displayRole();
		System.out.println("role:"+role);
		
	}
	
}

public class  SchoolSystem
{
	public static void main(String[] args)
	{
		Teacher t=new Teacher("rama",35,"hindi");
		t.displayRole();
		Student s=new Student("priya",12,"A");
		s.displayRole();
		Staff staff=new Staff("ramsha",40,"cleaning");
		staff.displayRole();
	}
}