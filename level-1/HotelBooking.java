import java.util.Scanner;
public class HotelBooking
{
	private String guestName;
	private String roomType;
	private int nights;
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String guest=input.nextLine();
		String room=input.nextLine();
		int  noOfNights=input.nextInt();
		HotelBooking b1=new HotelBooking();
		HotelBooking b2=new HotelBooking(guest,room,noOfNights);
		HotelBooking b3=new HotelBooking(b2);
		b1.display();
		b2.display();
		b3.display();
		
	}
	
	public HotelBooking()
	{
		guestName="";
		roomType="";
		nights=0;
	}
	
	public HotelBooking(String guestName,String roomType, int nights)
	{
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	
	public HotelBooking(HotelBooking x)
	{
		this.guestName=x.guestName;
		this.roomType=x.roomType;
		this.nights=x.nights;
	}
	
	public void display()
	{
			System.out.println("gust name:"+guestName);
			System.out.println("room Type:"+roomType);
			System.out.println("number of nights:"+nights);
			
	}
}