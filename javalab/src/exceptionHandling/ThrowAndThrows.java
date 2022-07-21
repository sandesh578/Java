package exceptionHandling;
//throw is used for throwing
//throws is used for defining
//throws is used for checked exception
public class ThrowAndThrows {
    public static int area(int l,int b) throws Exception
    {
    	if(l<0||b<0)
    	{
    		throw new Exception("length and breadth cannot be negetive.");
    	}
    	return l*b;
    }
    public static void method() throws Exception
    {
    	int r=area(-10,5);
    	System.out.println("Area is:"+r);
    }
	public static void main(String[] args) {
	try {
       method();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
