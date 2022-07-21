package lab10;
@SuppressWarnings("serial")
class CheckArgumnetException extends Exception{
	public String toString()
	{
		return "Arguments less than 4 are not allowed.";
	}
}
public class ArgumentCheckExceptionHandling {
    public static void check(String[] args) throws CheckArgumnetException
    {
    	if(args.length<4)
    	{
    		throw new CheckArgumnetException();
    	}
    	else
    	{
    		int square=0;
    		for(int i=0;i<args.length;i++)
    		{
    			square+=Math.pow(Integer.parseInt(args[i]),2);
    		}
    		System.out.println("Square of inputs is:"+square);
    	}
    }
	public static void main(String[] args) {
		try {
			check(args);
		}
		catch(CheckArgumnetException e)
		{
			System.out.println(e);
		}

	}

}
