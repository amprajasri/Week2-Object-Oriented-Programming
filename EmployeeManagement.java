class Employee
{
	private String type;
	private String name;
	private int id;
	private int salary;
	
	public Employee(String type,String name,int id, int salary)
	{
		this.type=type;
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void displayDetails()
	{
		System.out.println("type:"+type);
		System.out.println("name:"+name);
		System.out.println("id:"+ id);
		System.out.println("salary:"+salary);
	}
	
}

class Manager extends Employee
{
	private int teamSize;
	
	public Manager(String type,String name,int id, int salary,int teamSize)
	{
		super(type,name,id,salary);
		this.teamSize=teamSize;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("team Size:"+teamSize);
	}
}


class Developer extends Employee
{
	private String programmingLanguage;
	public Developer(String type,String name,int id, int salary,String programmingLanguage)
	{
		super(type,name,id,salary);
		this.programmingLanguage=programmingLanguage;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("programming Language:"+programmingLanguage);
	}
}

class Intern extends Employee
{
	private int duration;
	
	public Intern(String type,String name,int id,int salary,int duration)
	{
		super(type,name,id,salary);
		this.duration=duration;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("duration:"+duration);
	}
}

public class EmployeeManagement
{
	public static void main(String[] args)
	{
		Employee e=new Employee("employee","ram",1,12000);
		Manager m=new Manager("manager","shyam",2,12000,12);
		Developer d=new Developer("developer","rama",3,12000,"java");
		Intern i=new Intern("Intern","sita",4,10000,6);
		e.displayDetails();
		m.displayDetails();
		d.displayDetails();
		i.displayDetails();
	}
} 