class Device
{
	private int deviceId;
	private String status;
	
	public Device(int deviceId, String status)
	{
		this.deviceId=deviceId;
		this.status=status;
	}
	
	public displayStatus()
	{
		System.out.println("id:"+deviceId);
		System.out.println("status:"+status);
	}
}

class Thermostat extends Device
	
{
	private temperatureSetting;
	public Thermostat(int deviceId, String status, int temperatureSetting)
	{
		super(deviceId,status);
		this.temperatureSetting=temperatureSetting;
	}
	public void displayStatus()
	{
		super.displayStatus();
		System.out.println("temperature Setting:"+temperatureSetting);
	}
}

public class SmartHome
{
	public static void main(String[] args)
	{
		Thermostat t=new Thermostat();
		t.displayStatus(12,"Active",22.5);
	}
}