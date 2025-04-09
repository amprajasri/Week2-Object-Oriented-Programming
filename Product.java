public class Product
{
	private static int discount=10;
	private String productName;
	private final int productID;
	private int quantity;
	private int price;
	
	public Product(int productID,String productName, int quantity,int price)
	{
		
		this.productID=productID;
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
	}
	
	public void display()
	{
		
			System.out.println("product ID:"+productID);	
			System.out.println("product name:"+productName);	
			System.out.println("quantity:"+quantity);
		    System.out.println("price:"+price);
			System.out.println("discount%:"+discount);
			
	}
	
	public static void updateDiscount()
	{
		discount+=5;
	}
	
	public static void main(String[] args)
	{
		Product p1=new Product(1,"fan",3,1200);
		Product p2=new Product(2,"AC",1,40000);
		updateDiscount();
		System.out.println("p1 is object of the class:"+(p1 instanceof Product));
		System.out.println("p2 is object of the class:"+(p2 instanceof Product));
		if(p1 instanceof Product) p1.display();
		if(p2 instanceof Product) p2.display();

	}
}
