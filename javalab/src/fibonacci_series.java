import java.util.Scanner;
public class fibonacci_series {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=scanner.nextInt();
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		int third;
		for(int i=2;i<=n;i++)
		{
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
		scanner.close();

	}

}
