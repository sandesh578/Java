package webTechExam;
import java.util.Scanner;
public class LowertoUpper_AndReverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=scan.next().charAt(0);
		try 
		{
		if(ch>=65&&ch<=90)
		{
			char c=(char)(ch+32);
			System.out.println("Lowercase of "+ch+" is:"+c);
		}
		else if(ch>=97&&ch<=122)
		{
			char c=(char)(ch-32);
			System.out.println("Uppercase of "+ch+" is:"+c);
		}
		else
		{
			throw new Exception("You cant enter blank character");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		scan.close();

	}

}
