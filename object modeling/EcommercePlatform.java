import java.util.ArrayList;

class Customer
{
	private String name;
	
	public Customer(String name)
	{
		this.name=name;
	}
	
	public void addProduct(Order o,Product p)
	{
		
		o.addProduct(p);
	}
	
	public void bill(Order o)
	{
		o.calculatetotalPrice();
		o.displayList();
		o.displayPrice();
	}
	

	
}

class Product
{
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name,double price,int quantity)
	{
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	
	
	public void getProductDetails()
	{
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println(" quantity:"+quantity);
	}
}

class Order
{
	private int orderNo;
	private ArrayList<Product> products;
	private double totalPrice=0;
	
	public Order(int orderNo)
	{
		this.orderNo=orderNo;
		products=new ArrayList<> ();
	}
	
	public void addProduct(Product p)
	{
		products.add(p);
	}
	
	public void calculatetotalPrice()
	{
		int sum=0;
		for(Product p:products)
		{
			sum+=p.getPrice()*p.getQuantity();
		}
		totalPrice=sum;
	}
	
	public void displayPrice()
	{
		System.out.println("total price:"+totalPrice);
	}
	
	public void displayList()
	{
		for(Product p:products)
		{
			p.getProductDetails();
		}
	}
}

public class EcommercePlatform
{
	public static void main(String[] args)
	{
		Customer c1=new Customer("mukunda");
		Order o1=new Order(1);
		Product p1=new Product("milk",32,2);
		Product p2=new Product("curd",50,3);
		c1.addProduct(o1,p1);
		c1.addProduct(o1,p2);
		c1.bill(o1);
	}
}