public class Vehicle
{
	
	private  static int registrationFee=1000;
	private String ownerName;
	private final int  registrationNumber;
	private String vehicleType;
	
	public Vehicle(int registrationNumber,String ownerName, String vehicleType)
	{
		
		this.registrationNumber=registrationNumber;
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;

	}
	
	public void display()
	{
		
			System.out.println("ownerName:"+ownerName);	
			System.out.println("registration Number:"+registrationNumber);	
			System.out.println("vehicle Type:"+vehicleType);
			System.out.println("registration Fee:"+registrationFee);
	}
	
	public static void updateRegistrationFee()
	{
		registrationFee+=500;
	}
	
	public static void main(String[] args)
	{
		Vehicle v1=new Vehicle(1,"mukunda","2 wheeler");
		Vehicle v2=new Vehicle(2,"priya","4 wheeler");
		updateRegistrationFee();
		System.out.println("v1 is object of the class:"+(v1 instanceof Vehicle));
		System.out.println("v2 is object of the class:"+(v2 instanceof Vehicle));
		if(v1 instanceof Vehicle) v1.display();
		if(v2 instanceof Vehicle) v2.display();

	}
}
