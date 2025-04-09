abstract class Product implements Taxable
{
	private int productId;
	private String name;
	private int price;
	private int tax;
	private int discount;
	abstract void calculateDiscount();
	
	public Product(int productId,String name,int price,int tax)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.tax=tax;
	}
	
	
	public void display()
	{
		System.out.println("id:"+productId);
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("tax:"+tax);
		System.out.println("discount:"+discount);
	}
	
	public int getTaxDetails()
	{
		return tax;
	}
	
	public int calculateTax()
	{
		return tax=(tax/100)*price;
	}
	
	public void updateDiscount(int discount)
	{
		this.discount=discount;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void updatePrice()
	{
		price=(price+calculateTax()-discount);
	}
	
}

interface Taxable
{
  int calculateTax();
  int getTaxDetails();
}

class Electronics extends Product
{
   private int discount=20;
   
   public Electronics(int productId,String name,int price,int tax)
   {
		super(productId,name,price,tax);
   }
   
    public  void calculateDiscount()
   {
		super.updateDiscount(super.getPrice()*(discount/100));
   }
   

}



class Clothing extends Product
{

	private int discount=10;
	 public Clothing(int productId,String name,int price,int tax)
   {
		super(productId,name,price,tax);
   }
   
  public  void calculateDiscount()
   {
		super.updateDiscount(super.getPrice()*(discount/100));
   }
}

class Groceries extends Product
{
	
	private int discount=5;
	public Groceries(int productId,String name,int price,int tax)
   {
		super(productId,name,price,tax);
   }
    public  void calculateDiscount()
   {
		super.updateDiscount(super.getPrice()*(discount/100));
   }
   
}


public class ECommerce
{
	public static void main(String[] args)
	{
		Product products[]=new Product[5];
		products[0]=new Electronics(12,"TV",50000,10);
		products[1]=new Electronics(15,"AC",450000,10);
		products[2]=new Clothing(121,"shirt",1000,5);
		products[3]=new Groceries(212,"channa",50,2);
		products[4]=new Groceries(223,"moong",69,2);
		
		for(Product p: products)
		{
			
			p.calculateDiscount();
			p.updatePrice();
			p.display();
		}
		
	}
}