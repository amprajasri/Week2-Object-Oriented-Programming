import java.util.ArrayList;

class Company
{
	private String name;
	private ArrayList<Department> departments;
	
	public Company(	String name)
	{
		this.name=name;
		departments =new ArrayList<>();
	}
	
	public int getDepartmentPos(String dept)
	{
		boolean ispresent=false;
		int i=0;
		for(Department d: departments)
		{
			if(dept.equals(d.getname())) 
			{
				ispresent=true;
				break;
			}
			i++;
		}
		if(!ispresent) return -1;
		else return i;
		
	}
	
	public void addDepartment(String dept,String emp)
	{
		Department d=new Department(dept);
		int index=getDepartmentPos(dept);
		if(index==-1)
		{
			departments.add(d);
			d.addEmployee(emp);
		}
		else
		{
			(departments.get(index)).addEmployee(emp);
		}
		
	}
	
	public void displayDetails()
	{
		System.out.println("the company name:"+name);
		for(Department d: departments)
		{
			d.displayDepartment();
		}
	}
	
	
	
	
	
}

class Department
{
	private String name;
	private ArrayList<Employee> employees;

	public Department(String name)
	{
		this.name=name;
		employees=new ArrayList<>();
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public void addEmployee(String emp)
	{
		Employee e=new Employee(emp);
		employees.add(e);
	}
	
	public void displayDepartment()
	{
		System.out.println("department name:"+name);
		for(Employee e:employees)
		{
			e.displayEmployee();
		}
	}
	
}

class Employee
{
	private int id;
	private String name;
	private static int i=0;
	
	public Employee(String name)
	{
		this.id=i;
		this.name=name;
		i++;
	}
	
	public void displayEmployee()
	{
		System.out.println("employee id:"+id);
		System.out.println("employee name:"+name);
	}
}

public class CompanyAndDepartments
{
	public static void main(String[] args)
	{
		Company c1=new Company("Capgemini");
		Company c2=new Company("BridgeLabz");
		c1.addDepartment("sales","rama");
		c1.addDepartment("marketing","shyam");
		c1.addDepartment("IT","mohan");
		c1.addDepartment("sales","singh");
		c1.addDepartment("marketing","rao");
		c1.addDepartment("IT","priya");
		c1.displayDetails();
		
	}
} 
