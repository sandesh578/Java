import java.util.Scanner;
public class convert_touppercase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scanner.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=97&&ch[i]<=122)
			{
				ch[i]-=32;
			}
		}
		System.out.println("Uppercase of "+str+" is:");
		System.out.println(String.valueOf(ch));
		//System.out.println("Lowercase of "+str+" is:"+str.toUpperCase());
		scanner.close();

	}

}
