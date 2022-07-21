import java.util.Scanner;
public class hcf {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int hcf=1;
		int max=(a>b)?a:b;
		for(int i=1;i<=max;i++)
		{
			if(a%i==0&&b%i==0)
			{
				hcf=i;
			}
		}
		/*for(int i=1;i<=a||i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				hcf=i;
			}
		}*/
		System.out.println("HCF of "+a+" and "+b+" is: "+hcf);
		scanner.close();

	}

}
