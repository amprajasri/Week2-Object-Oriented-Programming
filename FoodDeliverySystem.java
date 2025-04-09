import java.util.ArrayList;

interface Discountable
{
	void applyDiscount();
	void getDiscountDetails();
}

abstract class FoodItem implements Discountable
{
	protected String itemName;
	protected double price;
	protected int quantity;
	
	public FoodItem(String itemName,double price,int quantity)
	{
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}
	abstract void calculateTotalPrice();
	
	public void getItemDetails()
	{
		System.out.println("item name:"+itemName);
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
		System.out.println();
	}
}

class VegItem extends FoodItem
{
	private double discount=2;
	private double discountAmt=0;
	
	public VegItem(String itemName,double price,int quantity)
	{
		super(itemName,price,quantity);
	}
	
	public void calculateTotalPrice()
	{
		price=(price*(double)quantity)-discountAmt;
	}
	
	public void applyDiscount()
	{
		discountAmt=(price*(double)quantity)*(discount/100.0);
	}
	
	public void getDiscountDetails()
	{
		System.out.println("discount amount:"+discountAmt);
	}
	
	
}

class NonVegItem extends FoodItem
{
	private double discount=5;
	private double discountAmt=0;
	
	public NonVegItem(String itemName,double price,int quantity)
	{
		super(itemName,price,quantity);
	}
	
	public void calculateTotalPrice()
	{
		price=(price*(double)quantity+50)-discountAmt;
	}
	
	public void applyDiscount()
	{
		discountAmt=(price*(double)quantity)*(discount/100.0);
	}
	
	public void getDiscountDetails()
	{
		System.out.println("discount amount:"+discountAmt);
	}
}


class  FoodDeliverySystem
{
	public static void main(String[] args)
	{
		ArrayList <FoodItem> list=new ArrayList<>();
		list.add(new VegItem("dosa",50,3));
		list.add(new NonVegItem("chicken roll",100,2));
		
		for(FoodItem l:list)
		{
			l.applyDiscount();
			l.getDiscountDetails();
			l.calculateTotalPrice();
			l.getItemDetails();
			
		}
	}
}