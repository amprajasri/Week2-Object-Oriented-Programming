public class Patient
{
	
	private  static String hospitalName="Appolo";
	private static int totalPatients=0;
	private String name;
	private int age;
	private final int  patientID;
	private String ailment;
	
	public Patient(int patientID,String name, int age,String ailment)
	{
		
		this.patientID=patientID;
		this.name=name;
		this.age=age;
		this.ailment=ailment;
		totalPatients++;
	}
	
	public void display()
	{
		
			System.out.println("name:"+name);	
			System.out.println("patient ID:"+patientID);	
			System.out.println("age:"+age);
			System.out.println("ailment:"+ailment);
	}
	
	public static void getTotalPatients()
	{
		System.out.println("total Patients:"+totalPatients);
	}
	
	public static void main(String[] args)
	{
		Patient p1=new Patient(11,"ram",12 ,"cold");
		Patient p2=new Patient(25,"ravi",40 ,"fever");
		getTotalPatients();
		System.out.println("p1 is object of the class:"+(p1 instanceof Patient));
		System.out.println("p2 is object of the class:"+(p2 instanceof Patient));
		if(p1 instanceof Patient) p1.display();
		if(p2 instanceof Patient) p2.display();

	}
}
