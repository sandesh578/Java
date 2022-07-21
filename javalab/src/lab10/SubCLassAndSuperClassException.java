package lab10;
import java.util.Scanner;
public class SubCLassAndSuperClassException {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		
		try
		{
			System.out.println("Enter two numbers:");
			a=scan.nextInt();
			b=scan.nextInt();
			c=a/b;
			System.out.println("Result is:"+c);
		}
        catch(ArithmeticException e)
		{
        	System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		scan.close();
	}

}
