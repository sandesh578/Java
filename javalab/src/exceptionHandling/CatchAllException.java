package exceptionHandling;

public class CatchAllException {

	public static void main(String[] args) {
		int arr[]= {0,2,3,10};
		int res;
		try
		{
			res=arr[3]/arr[1];
			System.out.println("Result is:"+res);
			System.out.println(arr[5]);
		}
        catch(ArithmeticException e)
		{
        	System.out.println(e);
		}
		//catches all types of exception and it should be written at last
		//as it is the grandparent of ArithmeticExceptionClass otherwise it shows error
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
