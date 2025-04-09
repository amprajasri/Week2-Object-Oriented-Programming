public class Employee
{
	private static String companyName="Capgemini";
	private static int totalEmp=0;
	private final int id;
	private String name;
	private String designation;
	
	public Employee(int id,String name, String designation)
	{
		
		this.id=id;
		this.name=name;
		this.designation=designation;
		totalEmp++;
	}
	
	public void display()
	{
		
			System.out.println("emp id:"+id);	
			System.out.println("emp name:"+name);	
			System.out.println("emp designation:"+designation);
		
			
	}
	
	public static void displayTotalEmployees()
	{
		System.out.println("total employee count:"+totalEmp);
	}
	
	public static void main(String[] args)
	{
		Employee e1=new Employee(1,"rama","developer");
		Employee e2=new Employee(2,"ram","manager");
		System.out.println("e1 is object of the class:"+(e1 instanceof Employee));
		System.out.println("e2 is object of the class:"+(e2 instanceof Employee));
		if(e1 instanceof Employee) e1.display();
		if(e1 instanceof Employee) e2.display();
		displayTotalEmployees();
	}
}
