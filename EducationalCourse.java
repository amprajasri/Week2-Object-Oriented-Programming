class  Course
{

	private String courseName;
	private int duration;
	
	public Course(String courseName,int duration)
	{
		this.courseName=courseName;
		this.duration=duration;
	}
	
	
	public void display()
	{
		System.out.println("Course name:"+courseName);
		System.out.println("duration:"+duration);
	}
}

class OnlineCourse extends Course
{
	private String platform;
	private boolean isRecorded;
	
	public OnlineCourse(String courseName,int duration,String platform,boolean isRecorded)
	{
		super(courseName,duration);
		this.platform=platform;
		this.isRecorded=isRecorded;
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("platform:"+platform);
		System.out.println("is recorded:"+isRecorded);
	}
}

class PaidOnlineCourse extends OnlineCourse
{
	private int fee;
	private int discount;
	
	public PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,int fee,int discount)
	{
		super(courseName,duration,platform,isRecorded);
		this.fee=fee;
		this.discount=discount;
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("fee:"+fee);
		System.out.println("discount:"+discount);
	}
}

public class EducationalCourse
{
	public static void main(String[] args)
	{
		Course c=new Course("OOPS",3);
		OnlineCourse o=new OnlineCourse("OOPS",3,"Zoom",true);
		PaidOnlineCourse p=new PaidOnlineCourse("OOPS",3,"Zoom",true,1200,5);
		c.display();
		o.display();
		p.display();
	}
}