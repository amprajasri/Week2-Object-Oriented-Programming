import java.util.ArrayList;

class University
{
	private String name;
	private ArrayList<Department> departments;
	
	public University(String name)
	{
		this.name=name;
		departments=new ArrayList <>();
	}
	
	public void addFaculty(String dept,Faculty f)
	{
		int index=findDept(dept);
		if(index==-1)
			{
				Department d=new Department(dept);
					d.addFaculty(f);
					departments.add(d);
			}
		else
			{
				(departments.get(index)).addFaculty(f);
			}
	}
	
	
	
	public void displayDepartments()
	{
		System.out.println("University name:"+name);
		for(Department d:departments)
		{
			d.displayFaculties();
		}
	}
	
	public int findDept(String dept)
	{
		
		int index=-1;
		
		for(Department d:departments)
		{
			if(dept.equals(d.getName()))
			{
				
				index=departments.indexOf(d);
				break;
			}
			
		}
		return index;
	}

}

class Department 
{
	private int departmentId;
	private String name;
	private static int id=1;
	private ArrayList<Faculty> faculties;
	
	public Department(String name)
	{
		this.departmentId=id;
		this.name=name;
		faculties=new ArrayList<>();
		id++;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addFaculty(Faculty f)
	{
		faculties.add(f);
	}
	
	public void displayFaculties()
	{
		System.out.println("department Id:"+departmentId);
		System.out.println("name:"+name);
		for(Faculty f:faculties)
		{
			f.display();
		}
		
	}
	
	
}

class Faculty
{
	private String facultyName;
	private String subjectName;
	
	public Faculty(String facultyName, String subjectName)
	{
		this.facultyName=facultyName;
		this.subjectName=subjectName;
	}
	
	public void display()
	{
		System.out.println("faculty Name:"+facultyName);
		System.out.println("subject name:"+subjectName);
	}
	
	
	
}

public class  UniversityWithFaculties
{
	public static void main(String[] args)
	{
		University u=new University("SRM");
		

		Faculty f1=new Faculty("rama","AIML");
		Faculty f2=new Faculty("sita","Maths");
		Faculty f3=new Faculty("mukunda","CN");
		Faculty f4=new Faculty("lalitha","ADE");
		
		u.addFaculty("CSE core",f1);
		u.addFaculty("CSE specilization",f2);
		u.addFaculty("CSE core",f3);
		u.addFaculty("CSE specilization",f4);
		
		u.displayDepartments();
		u=null;
		f1.display();
	}
}