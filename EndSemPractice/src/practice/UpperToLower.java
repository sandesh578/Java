package practice;

import java.util.Scanner;
@SuppressWarnings("serial")
class BlankInputException extends Exception{
	public String toString()
	{
		return "Input cannot be left Blank";
	}
}
public class UpperToLower {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputStr=scan.next();
		
		String str="";
		try {
			if(inputStr.length()<=1)
			{
				throw new BlankInputException();
			}
			else
			{
				for(int i=0;i<inputStr.length();i++)
				{
					if(inputStr.charAt(i)>=65&&inputStr.charAt(i)<=90)
					{
						str+=String.valueOf(inputStr.charAt(i)).toLowerCase();
					}
					else
					{
						str+=String.valueOf(inputStr.charAt(i)).toUpperCase();
					}
				}
			}
			System.out.println("The string after processing is:"+str);
		}
		catch(BlankInputException e)
		{
			System.out.println(e);
		}
		
		scan.close();

	}

}
