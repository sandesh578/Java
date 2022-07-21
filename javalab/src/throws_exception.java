
public class throws_exception {
    public static void throwexcep() throws NullPointerException  {
    	
    		System.out.println("Input has Null value");
    		throw new NullPointerException("Check the string format");

    }
	public static void main(String[] args) {
		try {
			String str="";
			if(str.length()==0)
			{
				throwexcep();
			}
			else
			{
				System.out.println("String length is:"+str.length());
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("We are finally at final block");
		}

	}

}
