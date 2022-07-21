package lab10;
import java.util.Scanner;
@SuppressWarnings("serial")
class NegativeNumberException extends Exception{
	public String toString()
	{
		return "Negative numbers are not allowed";
	}
}
public class CheckNegativeNumException {
	public static void ProcessInput(int n) throws NegativeNumberException
	{
		if(n<0)
		{
			throw new NegativeNumberException();
		}
		else
		{
			System.out.println("Number is:"+(double)n);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		try
		{
		  ProcessInput(n);
		}
		catch(NegativeNumberException e)
		{
			System.out.println(e);
		}
       scan.close();
	}

}
