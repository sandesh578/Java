package array;
import java.util.Scanner;

public class RotateArrayoneByOne {
	
	public static void RotateAnArrayByOne(int []arr) {
		int n=arr.length;
		int last=arr[n-1];
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		System.out.println("Elements in an array after rotation are:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1,flag=0;
		System.out.println("Enter the size of one array:");
		n1=scan.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter "+n1+" elements to an array");
		for(int i=0;i<n1;i++) {
			arr1[i]=scan.nextInt();
		}
		
//		 System.out.println("Enter the number of times to rotate an array:");
		 RotateAnArrayByOne(arr1);
		
		scan.close();

	}

}
