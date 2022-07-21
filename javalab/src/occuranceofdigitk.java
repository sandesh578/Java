import java.util.Scanner;
public class occuranceofdigitk {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scanner.nextInt();
		System.out.println("Enter a digit to check occurance:");
		int k=scanner.nextInt();
		int count=0;
		while(n!=0)
		{
			if(n%10==k)
			{
				count=count+1;
			}
			n=n/10;
		}
		System.out.println("No of occurance of "+k+" is "+count);
		scanner.close();
		

	}

}
