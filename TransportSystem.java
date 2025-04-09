class Vehicle
{
	private int maxSpeed;
	private String fuelType;
	
	public Vehicle(int maxSpeed, String fuelType)
	{
		this.maxSpeed=maxSpeed;
		this.fuelType=fuelType;
	}
	public void displayInfo()
	{
		System.out.println("maximum speed:"+maxSpeed);
		System.out.println("fuel Type:"+fuelType);
	}
}

class Car extends Vehicle
{
	private int seatCapacity;
	
	public Car(int maxSpeed, String fuelType,int seatCapacity)
	{
		super(maxSpeed,fuelType);
		this.seatCapacity=seatCapacity;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("seat Capacity:"+seatCapacity);
	}
}

class Truck extends Vehicle
{
	private int wheels;
	
	public Truck(int maxSpeed, String fuelType, int wheels)
	{
		super(maxSpeed,fuelType);
		this.wheels=wheels;
	}
	
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("number of wheels:"+wheels);
	}
}

class Motorcycle extends Vehicle
{
	private int cc;
	
	public Motorcycle(int maxSpeed, String fuelType, int cc)
	{
		super(maxSpeed,fuelType);
		this.cc=cc;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("cc:"+cc);
	}
}


public class  TransportSystem
{
	public static void main(String[] args)
	{
		Vehicle v=new Vehicle(200,"pretrol");
		Car c=new Car(200,"desiel",4);
		Truck t=new Truck(200,"petrol",6);
		Motorcycle m=new Motorcycle(120,"petrol",150);
		v.displayInfo();
		c.displayInfo();
		t.displayInfo();
		m.displayInfo();
	}
}