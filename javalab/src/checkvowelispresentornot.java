import java.util.Scanner;
public class checkvowelispresentornot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scanner.nextLine();
		String temp=str.toLowerCase();
		char[] ch=new char[str.length()];
		ch=temp.toCharArray();
		int flag=0;
		for(int i=0;i<temp.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("Vowels are present");
		}
		else
		{
			System.out.println("Vowels are not present");
		}
		scanner.close();
		

	}

}
