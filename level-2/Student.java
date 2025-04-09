import java.util.Scanner;
public class Student
{
	private String name;
	private int rollNo;
	private int[] marks=new int[3];
	private String grade;
	public static void main(String[] args)
	{
		Student s=new Student();
		Scanner input=new Scanner(System.in);
		s.getDetails(input);
		s.calculate();
		s.display();
	}
	public void getDetails(Scanner input)
	{
		name=input.nextLine();
		rollNo=input.nextInt();
		System.out.println("enter marks in math,physics and chemistry");
		for(int i=0;i<3;i++)
		{
			marks[i]=input.nextInt();
		}
	}
	
	public void calculate()
	{
		int percent=(marks[0]+marks[1]+marks[2])/3;
		if(percent>=80){
					grade="A" ;
				}
			else if(percent>=70){
				grade="B";
				}
				else if (percent>=60){
					grade="C";
				}
				else if(percent>=50){
					grade="D";
					}
				else if(percent>=40){
				grade="E";
					}
				else{
				grade="R";
				}
	}
	
	public void display()
	{
		System.out.println("Student name:"+name);
		System.out.println("Student rollNo:"+rollNo);
		System.out.println("Student marks in MPC:"+marks[0]+","+marks[1]+","+marks[2]);
		System.out.println("Student grade:"+grade);
	}
}