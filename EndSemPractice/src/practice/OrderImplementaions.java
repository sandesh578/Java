package practice;

import java.util.Scanner;
class Order{
	String cust_name;
	int cust_no;
	int qty_ordered;
	double unit_price;
	double total_price;
	public void setCustName(String name)
	{
		this.cust_name=name;
	}
	public void setCustNo(int no)
	{
		this.cust_no=no;
	}
	public void setQtyOrdered(int qty)
	{
		this.qty_ordered=qty;
	}
	public void setUnitPrice(double price)
	{
		this.unit_price=price;
	}
	public String getCustName()
	{
		return this.cust_name;
	}
	public int getQtyOrdered()
	{
		return this.qty_ordered;
	}
	public int getCustNo()
	{
		return this.cust_no;
	}
	public double getUnitPrice()
	{
		return this.unit_price;
	}
	public void computePrice()
	{
		total_price=qty_ordered*unit_price;
	}
	public void display()
	{
		System.out.println("Total Price is:"+total_price);
	}
}
class ShippedOrder extends Order{
	double ShippingCharge;
	double handlingCharge=10.0;
	public ShippedOrder(double ShippingCharge)
	{
		this.ShippingCharge=ShippingCharge;
	}
	public void computePrice()
	{
		total_price+=ShippingCharge+handlingCharge;
	}
	public void display()
	{
		System.out.println("Shipping charge is:"+ShippingCharge);
		System.out.println("Handling charge is:"+handlingCharge);
		System.out.println("Total Price is:"+total_price);
	}
}
public class OrderImplementaions {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Order order=new Order();
		order.setCustName("Sandesh Parajuli");
		order.setCustNo(1593);
		order.setQtyOrdered(13);
		order.setUnitPrice(122.0);
		order.computePrice();
		order.display();
		ShippedOrder obj2=new ShippedOrder(22000);
		obj2.computePrice();
		System.out.println("Customer Name is:"+order.getCustName());
		System.out.println("Customer Number is:"+order.getCustNo());
		System.out.println("Quantity ordered is:"+order.getQtyOrdered());
		System.out.println("Quantity ordered is:"+order.getUnitPrice());
		obj2.display();
		scan.close();

	}

}
