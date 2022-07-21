package input;
import java.util.Scanner;
public class Input {
	Scanner scan=new Scanner(System.in);
	public int inputNum1()
	{
		System.out.println("Enter a number:");
		int a=scan.nextInt();
        return a;
	}
	public int inputNum2()
	{
		System.out.println("Enter another number:");
		int b=scan.nextInt();
		return b;
	}

	
}
