import java.util.Scanner;
public class reversestring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scanner.next();
		char[] temp=new char[str.length()]; 
		for(int i=0;i<str.length();i++)
		{
			temp[i]=str.charAt(i);
		}
		System.out.println("Reverse of "+str+" is:");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(temp[i]);
		}
		
//		StringBuilder sb=new StringBuilder(str);
//		sb.reverse();
//		System.out.println(sb.toString());
		
//		char[] ch=str.toCharArray();
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			System.out.print(ch[i]);
//		}
		scanner.close();

	}

}
