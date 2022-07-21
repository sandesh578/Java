package array;
import java.util.Scanner;

public class CheckIfArrayIsSorted {
	public static Boolean CheckForSorted(int arr[]) {
		Boolean flag=true;
		for(int i=1;i<arr.length;i++) {
			if((arr[i]-arr[i-1])<=0) {
				flag=false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		Boolean flag=CheckForSorted(arr);
		if(flag) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Array is not sorted");
		}
			
		scan.close();

	}

}
