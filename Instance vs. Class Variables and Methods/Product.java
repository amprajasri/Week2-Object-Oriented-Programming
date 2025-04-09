public class Product
{
	private String productName;
	private float price; 
	private static int totalProducts=0 ;
	
	public static void main(String[] args)
	{
		Product p1=new Product("apple",250);
		Product p2=new Product("orange",100);
		Product p3=new Product("banana",50);
		p1.displayProductDetails();
		p2.displayProductDetails();
		p3.displayProductDetails();
		displayTotalProducts();
	}
	
	public Product(String productName, float price)
	{
		this.productName=productName;
		this.price=price;
		totalProducts++;
	
	}
	public void displayProductDetails()
	{
		System.out.println("product name:"+productName);
		System.out.println("product price:"+price);
	}
	
	public static void displayTotalProducts()
	{
		System.out.println("total products:"+totalProducts);
	}
}