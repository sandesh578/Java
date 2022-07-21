import java.util.Scanner;
public class lcmof_twonum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		int min=(n1<n2)?n1:n2;
		int hcf=0;
		for(int i=1;i<=min;i++)
		{
			if(n1%i==0&&n2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("LCM of "+n1+" and "+n2+" is:"+((n1*n2)/hcf));
        scanner.close();
	}

}
