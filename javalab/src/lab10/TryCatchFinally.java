package lab10;
import java.util.Scanner;
public class TryCatchFinally {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.next();
		try
		{
			System.out.println("Enter a position from which you want to extract character:");
			int n=scan.nextInt();
			System.out.println(str.charAt(n));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
        finally
        {
        	System.out.println("Finally block");
        }
		scan.close();
	}

}
