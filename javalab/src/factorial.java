import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scanner.nextInt();
		int fact=1;
		/*for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}*/
		int i=n;
		while(i>0)
		{
			fact=fact*i;
			i--;
		}
		System.out.println("Factorial of "+n+" is: "+fact);
		scanner.close();

	}

}
