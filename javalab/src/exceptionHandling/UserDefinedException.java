package exceptionHandling;

class MinBalanceException extends Exception{
	public String toString()
	{
		return "Minimum balance should be 5000,try again with small balance";
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
      try
      {
       throw new MinBalanceException();
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
	}

}
