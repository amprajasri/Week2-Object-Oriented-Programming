public class  Vehicle
{
	private String ownerName;
	private String vehicleType;
	private static int registrationFee=500; 
	
	public static void main(String[] args)
	{
		Vehicle v1=new Vehicle("mukunda","BMW");
		Vehicle v2=new Vehicle("priya","maruthi");
		Vehicle v3=new Vehicle("rajasri","hundai");
		v1.displayVehicleDetails();
		v2.displayVehicleDetails();
		updateRegistrationFee();
		v1.displayVehicleDetails();
		v2.displayVehicleDetails();
		v3.displayVehicleDetails();
	
	}
	
	public 	Vehicle(String ownerName,String vehicleType)
	{
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
	}
	public void  displayVehicleDetails()
	{
		System.out.println("owner name:"+ownerName);
		System.out.println("vehicle Type:"+vehicleType);
		System.out.println("registration Fee:"+registrationFee);
	}
	
	public static void updateRegistrationFee()
	{
		registrationFee=registrationFee+100;
	}
}