public class Student
{
	private static String universityName="SRM IST" ;
	private static int totalStudents=0;
	private String name;
	private final int rollNumber;
	private String grade;
	
	public Student(int rollNumber,String name, String grade)
	{
		
		this.rollNumber=rollNumber;
		this.name=name;
		this.grade=grade;
		totalStudents++;

	}
	
	public void display()
	{
		
			System.out.println("rollNumber:"+rollNumber);	
			System.out.println("name:"+name);	
			System.out.println("grade:"+grade);
			System.out.println("university Name:"+universityName);
	}
	
	public static void displayTotalStudents()
	{
		System.out.println("total Students:"+totalStudents);
	}
	
	public static void main(String[] args)
	{
		Student s1=new Student(1,"mukunda","A");
		Student s2=new Student(2,"priya","B");
		displayTotalStudents();
		System.out.println("s1 is object of the class:"+(s1 instanceof Student));
		System.out.println("s2 is object of the class:"+(s2 instanceof Student));
		if(s1 instanceof Student) s1.display();
		if(s2 instanceof Student) s2.display();

	}
}
