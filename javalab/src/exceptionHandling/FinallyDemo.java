package exceptionHandling;

public class FinallyDemo {
    public static void meth() throws Exception
    {
    	try
    	{
    	 throw new Exception();	
    	}
    	finally
		{
			System.out.println("Finally I m here");
		}
    }
	public static void main(String[] args) {
		try {
			meth();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
