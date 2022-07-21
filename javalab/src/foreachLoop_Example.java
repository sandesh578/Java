import java.util.Scanner;
public class foreachLoop_Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the nelements to an array:");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Elements in an array are:");
        for(int i:arr)
        {
        	System.out.println(i);
        }
	}

}
