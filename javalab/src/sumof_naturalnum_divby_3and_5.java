import java.util.Scanner;
public class sumof_naturalnum_divby_3and_5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a lower limit:");
		int l=scanner.nextInt();
		System.out.println("Enter a upper limit:");
		int u=scanner.nextInt();
		System.out.println("Numbers are:");
		for(int i=l;i<=u;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println(i);
			}
		}
		scanner.close();

	}

}
