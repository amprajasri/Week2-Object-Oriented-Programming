import java.util.Scanner;
import java.lang.Math;
public class Circle
{
	private float radius;
	
	
	public static void main(String[] args)
	{
		Circle c=new Circle();
		c.getRadius();
		c.area();
		c.circumference();
	}
	
	public void getRadius()
	{
		Scanner input=new Scanner(System.in);
		radius=input.nextFloat();
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