import java.util.Scanner;
public class printprimenumberbetweenrange {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the starting range:");
		int ran1=scanner.nextInt();
		System.out.println("Enter the ending range:");
		int ran2=scanner.nextInt();
		int count;
		System.out.println("Prime numbers from "+ran1+" to "+ran2+" are:");
		for(int i=ran1;i<=ran2;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		scanner.close();

	}

}
