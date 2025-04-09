import java.util.ArrayList;
class Hospital
{
	private String name;
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	
	public Hospital(String name)
	{
		this.name=name;
		doctors=new ArrayList<>();
		patients=new ArrayList<>();
	}
	
	public void addDoctor(Doctor d)
	{
		doctors.add(d);
	}
	
	public void addPatient(Patient p)
	{
		patients.add(p);
	}
	
	public void displayHospitalDetails()
	{
		System.out.println("hospital name:"+name);
		System.out.println();
		System.out.println("doctor names");
		for(Doctor d:doctors)
		{
			d.display();
		}
		System.out.println();
		System.out.println("patient names");
		for(Patient p:patients)
		{
			p.display();
		}
	}
	
}

class Doctor
{
	private String name;
	private String specilization;
	private ArrayList<Patient> patients;
	
	public Doctor(String name,String specilization)
	{
		this.name=name;
		this.specilization=specilization;
		patients=new ArrayList<>();	
	}
	
	public void consult(Patient p)
	{
		System.out.println("the doctor "+name+" treated patient "+p.getPatient());
		if(!(patients.contains(p)))
		patients.add(p);
		
		p.addDoctor(this);
	}
	
	public void display()
	{
		System.out.println("doctor name:"+name);
		System.out.println("specialization:"+specilization);
	}
	
	public String getDoctor()
	{
		return name;
	}
	
	public void addPatient(Patient p)
	{
		if(!patients.contains(p))
		patients.add(p);
	}
	
	public void displayPatientDetails()
	{
		System.out.println("patients treated by the doctor "+name+":");
		for(Patient p:patients)
		{
			p.display();
		}
		System.out.println();
		
	}
}

class Patient
{
	private String name;
	private String disease;
	private ArrayList<Doctor> doctors;
	
	public Patient(String name,String disease)
	{
		this.name=name;
		this.disease=disease;
		doctors=new ArrayList<>();	
	}
	
	public void consult(Doctor d)
	{
		System.out.println("the doctor "+d.getDoctor()+" treated patient "+name);
		if(!(doctors.contains(d)))
		doctors.add(d);
		d.addPatient(this);
	}
	
	public void addDoctor(Doctor d)
	{
		if(!doctors.contains(d))
		doctors.add(d);
	}
	public String getPatient()
	{
			return name;
	}
	
	public void display()
	{
		System.out.println("patient name:"+name);
		System.out.println("disease:"+disease);
	}
	
	public void displayDoctorDetails()
	{
		System.out.println("doctors patient "+name+" consulted are:");
		for(Doctor d:doctors)
		{
			d.display();
		}
		
	}
}

public class HospitalDoctorsPatients
{
	public static void main(String args[])
	{
		Hospital h=new Hospital("kims");
		Doctor d1=new Doctor("varun","pulmonologies");
		Doctor d2=new Doctor("priyanka","cardiologies");
		Patient p1=new Patient("rahul","caugh");
		Patient p2=new Patient("maaya","BP");
		h.addDoctor(d1);
		h.addDoctor(d2);
		h.addPatient(p1);
		h.addPatient(p2);
		d1.consult(p1);
		d1.consult(p2);
		p2.consult(d2);
		p2.consult(d2);
		h.displayHospitalDetails();
		System.out.println();
		d1.displayPatientDetails();
		System.out.println();
		d2.displayPatientDetails();
		System.out.println();
		p1.displayDoctorDetails();
		System.out.println();
		p2.displayDoctorDetails();
		
		
		
	}
}

