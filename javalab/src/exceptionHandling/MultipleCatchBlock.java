package exceptionHandling;

public class MultipleCatchBlock {

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
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
