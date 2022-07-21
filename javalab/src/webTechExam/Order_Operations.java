package webTechExam;
import java.util.Scanner;
class Order{
	String cust_name;
	long cust_no;
	int qty_ordered;
	double unit_price;
	double total_price;
	Scanner sc=new Scanner(System.in);
	public void get()
	{
		System.out.println("Enter customer name:");
		cust_name=sc.nextLine();
		System.out.println("Enter customer no:");
		cust_no=sc.nextInt();
		System.out.println("Enter quantity ordered:");
		qty_ordered=sc.nextInt();
		System.out.println("Enter unit price:");
		unit_price=sc.nextDouble();
	}
	public void computeprice()
	{
		total_price=qty_ordered*unit_price;
	}
	public void display()
	{
		System.out.println("Customer details:");
		System.out.println("Customer name:"+cust_name);
		System.out.println("Customer no:"+cust_no);
		System.out.println("Quantity Ordered:"+qty_ordered);
		System.out.println("Unit Price:"+unit_price);
		System.out.println("Total Price Before Shipping:"+total_price);
	}
}
class shippingOrder extends Order{
	double shipping_charge;
	@Override
	public void computeprice()
	{
		System.out.println("Enter shipping charge:");
		shipping_charge=sc.nextDouble();
		total_price=total_price+shipping_charge;
		System.out.println("Total Price After Shipping:"+total_price);
	}
}
public class Order_Operations {

	public static void main(String[] args) {
		Order o=new Order();
		o.get();
        o.computeprice();
        o.display();
		shippingOrder s=new shippingOrder();
        s.computeprice();
	}

}
