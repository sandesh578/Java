package exceptionHandling;

public class TwoExceptionTest {

	public static void main(String[] args) {
		try
		{
			int arr[]=new int[5];
			arr[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
      System.out.println("rest of the code...");
	}

}
