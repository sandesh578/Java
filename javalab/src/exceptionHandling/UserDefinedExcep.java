package exceptionHandling;

class NegativeDimensionException extends Exception{
	@Override
	public String toString()
	{
		return "Dimensions cannot be negative";
	}
}
public class UserDefinedExcep {
    public static int area(int l,int b) throws NegativeDimensionException
    {
    	if(l<0||b<0)
    	{
    		throw new NegativeDimensionException();
    	}
    	return l*b;
    }
	public static void main(String[] args) {
		
       try
       {
    	   int r=area(-10,7);
    	   System.out.println("Area is:"+r);
       }
       catch(NegativeDimensionException e)
       {
    	   System.out.println(e);
       }
	}

}
