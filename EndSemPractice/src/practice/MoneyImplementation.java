package practice;

import java.util.Scanner;
class Money{
	int rupee;
	int paisa;
	public Money(int rupee,int paisa)
	{
		this.rupee=rupee;
		this.paisa=paisa;
	}
	public void addition()
	{
		System.out.println("Sum of "+rupee+" rupee "+paisa+" paisa is: "+(paisa+(rupee*100))+" paisa.");
	}
	public void substraction()
	{
		System.out.println("Sum of "+rupee+" rupee "+paisa+" paisa is: "+(paisa-(rupee*100))+" paisa.");
	}
}
public class MoneyImplementation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Money obj=new Money(2,500);
		obj.addition();
		obj.substraction();
		scan.close();

	}

}
