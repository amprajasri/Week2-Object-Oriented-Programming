abstract class Employee implements Department
{
	private int employeeId;
	private String name;
	private int baseSalary;
	private String department;
	
	public Employee(int employeeId,String name,int baseSalary)
	{
		this.employeeId=employeeId;
		this.name=name;
		this.baseSalary=baseSalary;
	}
	abstract int calculateSalary();
	
	public int getBaseSalary()
	{
		return baseSalary;
	}

	public void displayDetails()
	{
		System.out.println("id:"+employeeId);
		System.out.println("name:"+name);
		System.out.println("baseSalary:"+baseSalary);
		
	}
	
	public void assignDepartment(String department)
	{
		this.department=department;
	}
	
	public void getDepartmentDetails()
	{
		System.out.println("department:"+department);
	}
	
	
}

interface Department
{
	void assignDepartment(String department);
	void getDepartmentDetails();
}

class FullTimeEmployee extends Employee
{
	
	public FullTimeEmployee(int employeeId,String name,int baseSalary)
	{
		super(employeeId,name,baseSalary);
	}
	
	public int calculateSalary()
	{
		return (super.getBaseSalary()*30);
	}
}

class  PartTimeEmployee extends Employee
{
	private int workHours;
	
	public PartTimeEmployee(int employeeId,String name,int baseSalary, int workHours )
	{
		super(employeeId,name,baseSalary);
		this.workHours=workHours;
	}
	
	
	public int calculateSalary()
	{
		return (workHours*super.getBaseSalary());
	}
}


public class EmployeeManagement
{

    public static void main(String[] args)
	{
        Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee(1, "Mukunda", 5000);
        employees[1] = new PartTimeEmployee(2, "Priya", 300, 5);

        employees[0].assignDepartment("IT");
        employees[1].assignDepartment("Sales");

        for (Employee emp : employees) {
            emp.displayDetails();
            emp.getDepartmentDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            System.out.println("-----------------------------");
        }
    
}

}