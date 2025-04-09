import java.util.Scanner;
import java.lang.Math;
public class MobilePhone
{
	private String brandName;
	private String modelName; 
	private float price;
	
	public static void main(String[] args)
	{
		MobilePhone mobile=new MobilePhone();
		Scanner input=new Scanner(System.in);
		mobile.getDetails(input);
		mobile.display();
	}
	
	public void getDetails(Scanner input)
	{
		System.out.println("Enter mobile phone brand,model and price:");
		brandName=input.nextLine();
		modelName=input.nextLine();
		price=input.nextFloat();
	}
	
	public void display()
	{
		System.out.println("brand Name:"+brandName);
		System.out.println("model Name:"+modelName);
		System.out.println("mobile price:"+price);
	}
}