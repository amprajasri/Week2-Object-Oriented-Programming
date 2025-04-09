class Vehicle
{
	private int maxSpeed;
	private String model;
	
	public Vehicle(int maxSpeed,String model)
	{
		this.maxSpeed=maxSpeed;
		this.model=model;
	}
	
	public void display()
	{
		System.out.println("maxSpeed:"+maxSpeed);
		System.out.println("model:"+model);
	}
}

interface Refuelable
{
	void refuel();
} 

class ElectricVehicle extends Vehicle
{
	public ElectricVehicle(int maxSpeed,String model)
	{
		super(maxSpeed,model);
	}
	
	@Override
	public void display()
	{
		super.display();
	}
	public void charge()
	{
		System.out.println("works by charge");
	}
}

class PetrolVehicle extends Vehicle implements Refuelable
{
	public PetrolVehicle(int maxSpeed,String model)
	{
		super(maxSpeed,model);
	}
	
	@Override
	public void refuel()
	{
		System.out.println("works by fuel");
	}
	
	@Override
	public void display()
	{
		super.display();
	}
}

public class VehicleManagementHydrid
{
	public static void main(String[] args)
	{
		PetrolVehicle p=new PetrolVehicle(200,"A51S2");
		p.display();
		p.refuel();
		ElectricVehicle e=new ElectricVehicle(150,"A5129");
		e.display();
		e.charge();
	}
}