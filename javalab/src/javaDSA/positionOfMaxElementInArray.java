package javaDSA;
import java.util.Scanner;
public class positionOfMaxElementInArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int max,pos=0;
		System.out.println("Enter "+n+" elements to an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
        max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				pos=i;
				max=arr[i];
			}
		}

		System.out.println("The position of maximum element i.e "+max+" in an array is:"+pos);
      scan.close();
	}

}
