import java.util.Scanner;
public class try_catch_exception {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scanner.next();
		try {
		 
			System.out.println("Division of a and b is:"+Integer.parseInt(str));
			
		}
		catch(NumberFormatException x)
		{
			System.out.println("String not in appropriate format.");
		}
		finally
		{
			System.out.println("We are in final block");
		}
		scanner.close();

	}

}
