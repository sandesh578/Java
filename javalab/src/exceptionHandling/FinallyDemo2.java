package exceptionHandling;

public class FinallyDemo2 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally I m here");
		}

	}

}
