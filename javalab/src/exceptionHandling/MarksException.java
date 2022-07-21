package exceptionHandling;

public class MarksException {

	public static void main(String[] args) {
		int mark=10;
		try{
			if(mark>100)
			{
				throw new Exception("marks cannot be greater than 100");
			}
			else if(mark<0)
			{
				throw new Exception("marks cannot be less than 0");
			}
			else
			{
				System.out.println(mark);
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}
