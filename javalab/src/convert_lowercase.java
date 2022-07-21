import java.util.Scanner;
public class convert_lowercase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scanner.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				ch[i]+=32;
			}
		}
		System.out.println("Lowercase of "+str+" is:");
		System.out.println(String.valueOf(ch));
		
		//System.out.println("Lowercase of "+str+" is:"+str.toLowerCase());
		scanner.close();

	}

}
