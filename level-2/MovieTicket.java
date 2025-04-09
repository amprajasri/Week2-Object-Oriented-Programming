import java.util.Scanner;
public class MovieTicket
{
	private String movieName;
	private int seatNumber;
	private int price=150;
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter number of ticket to book:");
		int n=input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++)
		{
			MovieTicket ticket=new MovieTicket();
			ticket.book(input);
			ticket.display();
		}
		
	}
	public void book(Scanner input)
	{
		System.out.println("enter movie name and seat number");
		movieName=input.nextLine();
		seatNumber=input.nextInt();
		input.nextLine();
	}
	
	public void display()
	{
		System.out.println("movie Name:"+movieName);
		System.out.println("seat Number:"+seatNumber);
		System.out.println("price:"+price);
	}
	
	
}