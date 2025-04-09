import java.util.ArrayList;
interface GPS
{
	void getCurrentLocation();
	void updateLocation(double x,double y6);
}
abstract class Vehicle implements GPS
{
	private int vehicleId;
	private String driverName;
	private int ratePerKm;
	
	public Vehicle(int vehicleId,String driverName,int ratePerKm)
	{
		this.vehicleId=vehicleId;
		this.driverName=driverName;
		this.ratePerKm=ratePerKm;
	}
	
	abstract void calculateFare(double distance);
	
	public void getVehicleDetails()
	{
		System.out.println("vehicle Id:"+vehicleId);
		System.out.println("driver Name:"+driverName);
		System.out.println("rate Per Km:"+ratePerKm);
	}
	
	public int getRatePerKm()
	{
		return ratePerKm;
	}
	
}

class Car extends Vehicle
{
	int additonalCharge=300;
	double location[]={0,0};
	public Car(int vehicleId,String driverName,int ratePerKm,int x,int y)
	{
		super(vehicleId,driverName,ratePerKm);
		location[0]=x;
		location[1]=y;
	}
	
	public void calculateFare(double distance)
	{
		System.out.println("total fare for given "+distance+" for car:"+((distance*getRatePerKm())+additonalCharge));
	}
	public void updateLocation(double x,double y)
	{
		location[0]+=x;
		location[1]+=y;
	}
	
	public void getCurrentLocation()
	{
		System.out.println("location coords are "+location[0]+" , "+location[1]);
	}
	
	
}

class Bike extends Vehicle
{
	int additonalCharge=50;
	double location[]={0,0};
	public Bike(int vehicleId,String driverName,int ratePerKm,int x,int y)
	{
		super(vehicleId,driverName,ratePerKm);
		location[0]=x;
		location[1]=y;
	}
	
	public void calculateFare(double distance)
	{
		System.out.println("total fare for given "+distance+" for bike:"+((distance*getRatePerKm())+additonalCharge));
	}
	
	public void updateLocation(double x,double y)
	{
		location[0]+=x;
		location[1]+=y;
	}
	
	public void getCurrentLocation()
	{
		System.out.println("location coords are "+location[0]+" , "+location[1]);
	}
}

class Auto extends Vehicle
{
	int additonalCharge=150;
	double location[]={0,0};
	public Auto(int vehicleId,String driverName,int ratePerKm,int x,int y)
	{
		super(vehicleId,driverName,ratePerKm);
		location[0]=x;
		location[1]=y;
	}
	
	public void calculateFare(double distance)
	{
		System.out.println("total fare for given "+distance+" for auto:"+((distance*getRatePerKm())+additonalCharge));
	}
	public void updateLocation(double x,double y)
	{
		location[0]+=x;
		location[1]+=y;
	}
	
	public void getCurrentLocation()
	{
		System.out.println("location coords are "+location[0]+" , "+location[1]);
	}
}

public class RideHailing
{
	public static void main(String[] args)
	{
		ArrayList<Vehicle> vehicles=new ArrayList<>();
		vehicles.add(new Car(1,"ramu",100,23,35));
		vehicles.add(new Bike(2,"ramesh",50,20,25));
		vehicles.add(new Auto(3,"somu",70,53,45));
		
		for(Vehicle v:vehicles)
		{
			v.updateLocation(10,10);
			v.calculateFare(20);
			v.getVehicleDetails();
			v.getCurrentLocation();
			System.out.println();
		}
	}
}
