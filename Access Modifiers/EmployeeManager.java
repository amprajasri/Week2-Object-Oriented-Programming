class Employee
{
	public int employeeID ;
	protected String department;
	private int salary ;
	
	public Employee(int employeeID,String department,int salary)
	{
		this.employeeID=employeeID;
		this.department=department;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("employee ID:"+employeeID);
		System.out.println("department:"+department);
		System.out.println("salary:"+salary);
	}
	
	public void setSalary()
	{
		salary+=10000;
	}
}

class Manager extends Employee
{
	private String managerName;
	
	public Manager(int employeeID,String department,int salary,String managerName)
	{
		super(employeeID,department,salary);
		this.managerName=managerName;
	}
	public void displayManager()
	{
		System.out.println("manager Name:"+managerName);
		System.out.println("employee ID:"+employeeID);
		System.out.println("department:"+department);
	}
	
}

public class EmployeeManager
{
	public static void main(String[] args)
	{
		Employee e=new Employee(1,"IT",100000);
		e.setSalary();
		Manager m=new Manager(10,"HR",100000,"reema");
		m.displayManager();
	}
}