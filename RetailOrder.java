class Order
{
	private int orderId;
	private String orderDate;
	
	public Order(int orderId,String orderDate)
	{
		this.orderId=orderId;
		this.orderDate=orderDate;
	}
	
	public String getOrderStatus()
	{
		return "order placed";
	}
	
	public void display()
	{
		System.out.println("orderId:"+orderId);
		System.out.println("date:"+orderDate);
	}
}

class ShippingOrder extends Order
{
	private int trackingNumber;
	
	public ShippingOrder(int orderId,String orderDate,int trackingNumber)
	{
		super(orderId,orderDate);
		this.trackingNumber=trackingNumber;
	}
	@Override
	public String getOrderStatus()
	{
		return "order shipped";
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("tracking Number:"+trackingNumber);
	}
	
}

class DeliveredOrder extends ShippingOrder
{
	private String deliveryDate;
	
	public DeliveredOrder(int orderId,String orderDate,int trackingNumber,String deliveryDate)
	{
		super(orderId,orderDate,trackingNumber);
		this.deliveryDate=deliveryDate;
	}
	@Override
	public String getOrderStatus()
	{
		return "order delivered";
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("delivery Date:"+deliveryDate);
	}
} 

public class RetailOrder
{
	public static void main(String[] args)
	{
		Order o=new Order(1,"12-8-25");
		System.out.println("status:"+o.getOrderStatus());
		o.display();
		ShippingOrder s=new ShippingOrder(1,"12-8-25",125);
		System.out.println("status:"+s.getOrderStatus());
		s.display();
		DeliveredOrder d=new DeliveredOrder(1,"12-3-25",125,"19-3-25");
		System.out.println("status:"+d.getOrderStatus());
		d.display();
	}
}