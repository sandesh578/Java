import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=scanner.nextInt();
		int rem;
		int sum=0;
		int num=a;
		while(a!=0)
		{
			rem=a%10;
			sum=sum+rem*rem*rem;
			a=a/10;
		}
        if(sum==num)
        {
        	System.out.println(num+" is a Armstrong number");
        }
        else
        {
        	System.out.println(num+" is not a Armstrong number");
        }
        scanner.close();
	}

}
