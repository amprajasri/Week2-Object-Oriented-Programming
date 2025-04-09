import java.util.ArrayList;

class Student
{
	private String name;
	private int id;
	private ArrayList<Course> courses;
	public Student(String name,int id)
	{
		this.name=name;
		this.id=id;
		courses=new ArrayList<>();
	}
	
	public void display()
	{
		System.out.println("student name:"+name);
		System.out.println("student id:"+id);
		System.out.println("courses students enrolled are");
		for(Course c:courses)
		{
			c.display();
		}
		System.out.println();
	}
	
	public void enrollCourse(Course c)
	{
		if(!courses.contains(c))
		courses.add(c);
	}
	
}

class Professor
{
	private String name;
	private Course course;
	
	public Professor(String name)
	{
		this.name=name;
	
	}
	
	public void display()
	{
		System.out.println("Professor name:"+name);
		System.out.println("course professor teach is:");
		course.display();
		System.out.println();
	}
	
	public void assignProfessor(Course c)
	{
		course=c;
	}
}

class Course
{
	private String courseName;
	private int courseId;
	
	public Course(String courseName,int courseId)
	{
		this.courseName=courseName;
		this.courseId=courseId;
	}
	
	public void display()
	{
		System.out.println("course Name:"+courseName);
		System.out.println("course id:"+courseId);
	}
}

public class  UniversityManagement
{
	public static void main(String[] args)
	{
		Professor p1=new Professor("mahesh");
		Professor p2=new Professor("uma");
		Student s1=new Student("kavitha",1);
		Student s2=new Student("swathi",2);
		Student s3=new Student("vishnu",3);
		Course science=new Course("science",21);
		Course social=new Course("social",22);
		
		p1.assignProfessor(science);
		p2.assignProfessor(social);
		s1.enrollCourse(science);
		s1.enrollCourse(social);
		s2.enrollCourse(science);
		s3.enrollCourse(social);
		p1.display();
		p2.display();
		s1.display();
		s2.display();
		s3.display();
	}
}