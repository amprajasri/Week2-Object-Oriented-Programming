import java.util.Scanner;
public class PalindromeChecker
{
	private String text;
	public static void main(String[] args)
	{
		PalindromeChecker p=new PalindromeChecker();
		Scanner input=new Scanner(System.in);
		p.getPalindrome(input);
		p.display();
	}
	public void getPalindrome(Scanner input)
	{
		text=input.nextLine();
	}
	
	public void display()
	{
		boolean isPalindrome=true;
		int start=0;
		int end=text.length()-1;
		while(start<end)
		{
			if(text.charAt(start)!=text.charAt(end))
			{
				isPalindrome=false;
				break;
			}
			else 
			{
				start++;
				end--;
			}
		}
		if(isPalindrome) System.out.println("it is a palindrome");
		else System.out.println("it is not a palindrome");
		
	}
	
	
}