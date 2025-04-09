import java.util.Scanner;
public class Employee
{
	private String empName;
	private int empId;
	private double empSalary;
	
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.getDetails();
		emp.display();
	}
	
	public void getDetails()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("give name,id and salary of employee:");
		empName=input.nextLine();
		empId=input.nextInt();
		empSalary=input.nextDouble();
	}
	
	public void display()
	{
		System.out.println("emp name:"+empName);
		System.out.println("emp Id:"+empId);
		System.out.println("emp Salary:"+empSalary);
	}
}