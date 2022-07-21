package output;

public class Output {
    public void output(int a,int b,int res,char c)
    {
    	switch(c)
		{
		 case '+':
			 System.out.println("Sum of "+a+" and "+b+" is:"+res);
			 break;
		 case '-':
			 System.out.println("Difference of "+a+" and "+b+" is:"+res);
			 break;
		 case '*':
			 System.out.println("Product of "+a+" and "+b+" is:"+res);
			 break;
		 case '/':
			 System.out.println("Division of "+a+" and "+b+" is:"+res);
			 break;
		default:
			System.out.println("Invalid Input");
		}
    }
}
