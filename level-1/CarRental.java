import java.util.Scanner;
public class CarRental
{
	private String customerName;
	private String carModel;
	private int rentalDays; 	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		String model=input.nextLine();
		int days=input.nextInt();
		CarRental c1=new CarRental(name,model,days);
		c1.display();
	}
	
	public CarRental(String customerName,String carModel,int rentalDays )
	{
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
	}
	
	public void display()
	{
		System.out.println("customer name:"+customerName);
		System.out.println("car Model:"+carModel);
		System.out.println("rental Days:"+rentalDays);
		System.out.println("total rent:"+(rentalDays*5000));
	}
}