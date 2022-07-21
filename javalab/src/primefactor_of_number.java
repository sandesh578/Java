import java.util.Scanner;
public class primefactor_of_number {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scanner.nextInt();
		System.out.println("Prime factors of "+n+" are:");
		while(n%2==0)
		{
			System.out.println(2+" ");
			n=n/2;
		}
        for(int i=2;i<n;i++)
        {
        	while(n%i==0)
        	{
        		System.out.println(i);
        		n=n/i;
        	}
        }
        if(n>2)
        {
        	System.out.println(n);
        }
		
		scanner.close();

	}

}
