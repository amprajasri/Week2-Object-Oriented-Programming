import java.util.Scanner;
import java.lang.Math;
public class Circle
{
	private float radius;
	
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		float r=input.nextFloat();
		Circle c=new Circle(r);
		c.area();
		c.circumference();
	}
	
	public Circle(float radius )
	{
		this.radius=radius;
	}
	
	public void area()
	{
		double area=Math.PI*Math.pow(radius,2);
		System.out.println("area of circle:"+area);
		
	}
	
	public void circumference()
	{
		double circum=2*(Math.PI)*radius;
		System.out.println("perimeter of circle:"+circum);
	}
}