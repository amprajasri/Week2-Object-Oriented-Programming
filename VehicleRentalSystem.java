import java.util.ArrayList;

abstract class Vehicle implements Insurable
{
	protected int vehicleNumber;
	protected String type;
	protected int rentalRate;
	private int policyNum;
	
	public Vehicle(int vehicleNumber,String type,int rentalRate,int policyNum)
	{
		this.vehicleNumber=vehicleNumber;
		this.type=type;
		this.rentalRate=rentalRate;
		this.policyNum=policyNum;
	}
	
	public int getPolicy()
	{
		return policyNum;
	}
	
	abstract int calculateRentalCost(int days);
	
}

class Car extends Vehicle
{
	private int insuranceAmt=5;
	public Car(int vehicleNumber,int rentalRate,int policyNum)
	{
		super(vehicleNumber,"car",rentalRate,policyNum);
	}
	
	public int calculateRentalCost(int days)
	{
		return rentalRate*days;
	}
	
	public void calculateInsurance()
	{
		this.insuranceAmt=insuranceAmt*rentalRate;
	}
	
	public void getInsuranceDetails()
	{
		System.out.println("insurance Amount:"+insuranceAmt);
		System.out.println("policy Number:"+super.getPolicy());
	}
	
}

class Bike extends Vehicle
{
	private int insuranceAmt=4;
	public Bike(int vehicleNumber,int rentalRate,int policyNum)
	{
		super(vehicleNumber,"bike",rentalRate,policyNum);
	}
	
	public int calculateRentalCost(int days)
	{
		return rentalRate*days;
	}
	
	public void calculateInsurance()
	{
		this.insuranceAmt=insuranceAmt*rentalRate;
	}
	
	public void getInsuranceDetails()
	{
		System.out.println("insurance Amount:"+insuranceAmt);
		System.out.println("policy Number:"+super.getPolicy());
	}
}

class Truck extends Vehicle
{
	private int insuranceAmt=6;
	public Truck(int vehicleNumber,int rentalRate,int policyNum)
	{
		super(vehicleNumber,"truck",rentalRate,policyNum);
	}
	
	public int calculateRentalCost(int days)
	{
		return rentalRate*days;
	}
	
	public void calculateInsurance()
	{
		this.insuranceAmt=insuranceAmt*rentalRate;
	}
	
	public void getInsuranceDetails()
	{
		System.out.println("insurance Amount:"+insuranceAmt);
		System.out.println("policy Number:"+super.getPolicy());
	}
}

interface Insurable
{
	void calculateInsurance();
	
	void getInsuranceDetails();

}

public class  VehicleRentalSystem
{
	public static void main(String[] args)
	{
		ArrayList<Vehicle> vehicles=new ArrayList <>();
		
		vehicles.add(new Car(12,1000,1234));
		vehicles.add(new Bike(13,800,1235));
		vehicles.add(new Truck(14,1500,1293));
		
		for(Vehicle v:vehicles)
		{
			System.out.println("rent for 5 days"+v.calculateRentalCost(5));
			v.calculateInsurance();
			v.getInsuranceDetails();
			
		}
	}
}




