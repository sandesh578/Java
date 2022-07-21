package webTechExam;
import java.util.Scanner; 
public class PasswordValidator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password:");
		String str=sc.next();
		char ch[]=new char[str.length()];
		ch=str.toCharArray();
		int intcount=0;
		if(str.length()>=6)
		{
			for(int i=0;i<str.length();i++)	
			{
				if(ch[i]>=48&&ch[i]<=57)
				{
					intcount+=1;
				}
				else if(ch[i]>=97&&ch[i]<=122)
				{
					System.out.println("Invalid Password");
					break;
				}
			}
			if(intcount>=3)
			{
				System.out.println("Password is valid");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid Password");
		}
		sc.close();

	}

}
