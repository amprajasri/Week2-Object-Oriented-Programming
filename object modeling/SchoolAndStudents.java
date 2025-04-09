import java.util.ArrayList;

class School
{
	private String name;
	private ArrayList<Student> students;
	
	public School(String name)
	{
		this.name=name;
		students=new ArrayList <>();
	}
	
	public void joinStudent(Student s)
	{
		students.add(s);
	}
	
	public void displayList()
	{
		System.out.println("School name:"+name);
		for(Student s:students)
		{
			s.display();
		}
	}
}

class Student
{
	private String name;
	private ArrayList<Course> courses;
	
	public Student(String name)
	{
		this.name=name;
		courses=new ArrayList<>();
	}
	
	public void display()
	{
		System.out.println("student name:"+name);
	}
	
	public void enrollCourse(Course c)
	{
		if(!courses.contains(c))
		courses.add(c);
		c.enrollStudent(this);
	}
	
	public void displayCourses()
	{
		System.out.println("courses "+name+" enrolled are:");
		for(Course c:courses)
		{
			c.display();
		}
	}
	
}

class Course
{
	private String name;
	private ArrayList<Student> students;
	
	public Course(String name)
	{
		this.name=name;
		students=new ArrayList<>();
	}
	
	public void display()
	{
		System.out.println("course name:"+name);
	}
	
	public void displayStudents()
	{
		System.out.println("students enrolled in course "+name+" are:");
		for(Student s:students)
		{
			s.display();
		}
	}
	
	public void enrollStudent(Student s)
	{
		if(!students.contains(s))
		students.add(s);
		
		
	}
	
	
}

public class SchoolAndStudents
{
	public static void main(String[] args)
	{
		School sch=new School("Ratnam");
		Student s1=new Student("mukunda");
		Student s2=new Student("pavithra");
		Student s3=new Student("Sukanya");
		Course c1=new Course("Maths");
		Course c2=new Course("Social");
		Course c3=new Course("Science");
		sch.joinStudent(s1);
		sch.joinStudent(s2);
		sch.joinStudent(s3);
		s1.enrollCourse(c1);
		s2.enrollCourse(c2);
		s3.enrollCourse(c1);
		s2.enrollCourse(c3);
		sch.displayList();
		c1.displayStudents();
		c2.displayStudents();
		s1.displayCourses();
		s2.displayCourses();
		s3.displayCourses();
		}
}