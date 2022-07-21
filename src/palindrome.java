import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of data to print:");
		int n=scanner.nextInt();
		int[] num=new int[n];
		num[0]=1;
		num[1]=1;
		for(int i=2;i<n;i++)
		{
			num[i]=num[i-1]+num[i-2];
		}
        System.out.print("Palindrome numbers are:");
        for(int i=0;i<n;i++)
		{
          System.out.print("\n"+num[i]);
		}
        scanner.close();
	}

}
