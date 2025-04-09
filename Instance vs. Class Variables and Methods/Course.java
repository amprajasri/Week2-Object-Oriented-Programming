public class Course
{
	private String courseName;
	private int  duration;
	private int fee;
	private static String instituteName="SRM"; 
	
	public static void main(String[] args)
	{
		Course c1=new Course("OOPS",90,10000);
		Course c2=new Course("BDMS",90,10000);
		Course c3=new Course("DSA",90,10000);
		c1.displayCourseDetails();
		c2.displayCourseDetails();
		updateInstituteName();
		c2.displayCourseDetails();
		c3.displayCourseDetails();
	
	}
	
	public 	Course(String courseName, int duration, int fee)
	{
		this.courseName=courseName;
		this.duration=duration;
	    this.fee=fee;
	}
	public void displayCourseDetails()
	{
		System.out.println("course name:"+courseName);
		System.out.println("course duration:"+duration);
		System.out.println("course fee:"+fee);
		System.out.println("university:"+instituteName);
	}
	
	public static void updateInstituteName()
	{
		instituteName="SRM IST";
	}
}