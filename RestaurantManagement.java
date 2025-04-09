class Person
{
	private String name;
	private int id;
	
	public Person(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void displayInfo()
	{
		System.out.println("name:"+name);
		System.out.println("id:"+id);
	}
}

interface Worker
{
	public void performDuties();
}

class Chef extends Person implements Worker
{
	public Chef(String name,int id)
	{
		super(name,id);
	}
	@Override
	public void performDuties()
	{
			System.out.println("chef cooks food");
	}
}

class Waiter extends Person implements Worker
{
	public Waiter(String name,int id)
	{
		super(name,id);
	}
	@Override
	public void performDuties()
	{
		System.out.println("waiter servers food");
	}
}

public class RestaurantManagement
{
	public static void main(String[] args)
	{
		Chef c=new Chef("ramu",10);
		Waiter w=new Waiter("somu",25);
		c.displayInfo();
		c.performDuties();
		w.displayInfo();
		w.performDuties();
	}
}