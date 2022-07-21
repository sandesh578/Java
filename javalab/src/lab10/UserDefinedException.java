package lab10;
import java.util.Scanner;
@SuppressWarnings("serial")
class HrsException extends Exception{
	public String toString()
	{
		return "Exception Encountered!!\nHours cannot be greater than 24 or less than zero.";
	}
}
class MinException extends Exception{
	public String toString()
	{
		return "Exception Encountered!!\nMinutes cannot be greater than 60 or less than zero.";
	}
}
class SecException extends Exception{
	public String toString()
	{
		return "Exception Encountered!!\nSeconds cannot be greater than 60 or less than zero.";
	}
}
class Time{
	int hr,min,sec;
	public Time(int hr,int min,int sec) 
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	public void check() throws HrsException,MinException,SecException
	{
		if(hr>24||hr<0)
		{
			throw new HrsException();
		}
		else
		{
			System.out.println("Hour is:"+hr);
		}
		if(min>60||min<0)
		{
			throw new MinException();
		}
		else
		{
			System.out.println("Minutes is:"+min);
		}
		if(sec>60||sec<0)
		{
			throw new SecException();
		}
		else
		{
			System.out.println("Seconds is:"+sec);
		}
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter time in hour,minutes and sec:");
		int hr=scan.nextInt();
		int min=scan.nextInt();
		int sec=scan.nextInt();
		try
		{
		 Time t=new Time(hr,min,sec);
		 t.check();
		}
        catch(HrsException e)
		{
        	System.out.println(e);
		}
		catch(MinException e)
		{
        	System.out.println(e);
		}
		catch(SecException e)
		{
			System.out.println(e);
		}
		scan.close();
	}

}
