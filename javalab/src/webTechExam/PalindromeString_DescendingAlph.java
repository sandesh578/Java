package webTechExam;
import java.util.Arrays;
import java.util.Scanner;
public class PalindromeString_DescendingAlph {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println(str+" is a palindrome string");
		}
		else
		{
			System.out.println(str+" is not a palindrome string");
		}
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		System.out.print("Descending order of alphabets of string "+str+" is:");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		scan.close();

	}

}
