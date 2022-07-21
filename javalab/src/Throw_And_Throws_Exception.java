import java.util.Scanner;
public class Throw_And_Throws_Exception {
    static int divide(int a,int b) throws ArithmeticException
    {
    	if(b==0)
    	{
    		throw new ArithmeticException("Division By Zero");
    	}
    	else
    	{
    		return a/b;
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
	    System.out.println(divide(a,b));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();

	}

}
