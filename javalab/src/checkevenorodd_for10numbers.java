import java.util.Scanner;
public class checkevenorodd_for10numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int count=0,count1=0;
		System.out.println("Enter 10 numbers:");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0)
			{
				count=count+1;
			}
			else
			{
				count1=count1+1;
			}
		}
		System.out.println("TOtal even numbers are:"+count);
		System.out.println("TOtal odd numbers are:"+count);
		sc.close();

	}

}
