class Animal
{
	private String name;
	private int age;
	
	public Animal(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void makeSound()
	{
		System.out.println("Animal sound");
	}
}

class Dog extends Animal
{
	public Dog(String name,int age)
	{
		super(name,age);
	}
	@Override
	public void makeSound()
	{
		super.makeSound();
		System.out.println("bow bow!!");
	}
}

class 	Cat extends Animal
{
	public Cat(String name,int age)
	{
		super(name,age);
	}
	@Override
	public void makeSound()
	{
		super.makeSound();
		System.out.println("meow meow!!");
	}
}

class Bird extends Animal

{
	public 	Bird(String name,int age)
	{
		super(name,age);
	}
	@Override
	public void makeSound()
	{
		super.makeSound();
		System.out.println("chup chup!!");
	}
}

public class AnimalHierarchy
{
	public static void main(String[] args)
	{
		Animal a=new Animal("animal",10);
		Dog d=new Dog("Dog",12);
		Cat c=new Cat("Cat",8);
		Bird b=new Bird("bird",5);
		a.makeSound();
		b.makeSound();
		c.makeSound();
		d.makeSound();
	}
}