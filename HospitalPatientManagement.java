import java.util.ArrayList;

abstract class Patient
{
	protected int patientId;
	protected String name;
	protected int age;
	
	private String diagnosis;
	private ArrayList<String> medicalHistory=new ArrayList <>();
	
	abstract  void calculateBill();
	
	public Patient(int patientId,String name,int age,String diagnosis)
	{
		this.patientId=patientId;
		this.name=name;
		this.age=age;
		this.diagnosis=diagnosis;
	}
	
	public void getPatientDetails()
	{
		System.out.println("patient name:"+name);
		System.out.println("patient Id:"+patientId);
		System.out.println("age:"+age);
	}
	
	void addRecord(String record)
	{
		medicalHistory.add(record);
	}
	
	void viewRecords()
	{
		for(String s:medicalHistory)
		{
			System.out.println(s);
		}
	}
	
	
}

interface MedicalRecord
{
	void addRecord();
	void viewRecords();
}

class InPatient extends Patient
{
	private int noOfDay;
	private double roomRent;
	private double medications;
	private double consultationFee;
	
	public InPatient(int patientId,String name,int age,String diagnosis,int noOfDay,double roomRent,double medications,double consultationFee)
	{
		super(patientId,name,age,diagnosis);
		this.noOfDay=noOfDay;
		this.roomRent=roomRent;
		this.medications=medications;
		this.consultationFee=consultationFee;
	}
	
	public void calculateBill()
	{
		System.out.println("total bill:"+((noOfDay*roomRent)+medications+consultationFee));
	}
}

class OutPatient extends Patient
{
	private double consultationFee;
	private double medications;
	
	public OutPatient(int patientId,String name,int age,String diagnosis,double consultationFee,double medications)
	{
		super(patientId,name,age,diagnosis);
		this.medications=medications;
		this.consultationFee=consultationFee;
	}
	
	public void calculateBill()
	{
		System.out.println("total bill:"+(medications+consultationFee));
	}
	
}
	
public class HospitalPatientManagement
{
	public static void main(String[] args)
	{
		ArrayList<Patient> patients=new ArrayList<>();
		
		patients.add(new InPatient(1,"ramesh",30,"viral fever",3,1500,5000,2000));
		patients.add(new OutPatient(1,"suresh",35,"cold",500,500));
		(patients.get(0)).addRecord("severe cold");
		(patients.get(1)).addRecord("cough");
		for(Patient p:patients)
		{
			p.viewRecords();
			p.getPatientDetails();
			p.calculateBill();
			System.out.println();
		}
		
	}
}