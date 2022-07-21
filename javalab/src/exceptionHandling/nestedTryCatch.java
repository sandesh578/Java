package exceptionHandling;

public class nestedTryCatch {

	public static void main(String[] args) {
		int arr[]= {0,2,3,10};
		int res;
		try
		{
			try {
			res=arr[3]/arr[1];
			System.out.println("Result is:"+res);
			}
			catch(ArithmeticException e)
			{
	        	System.out.println(e);
			}
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
